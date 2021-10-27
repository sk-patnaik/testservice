package com.shell.siep.gto.services.paginated;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.databases.bg.model.BGSample;
import com.shell.siep.gto.persistence.databases.dd.model.DDSample;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcSample;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSSample;
import com.shell.siep.gto.persistence.datasource.EntityManagerFactoryHolder;
import com.shell.siep.gto.persistence.datasource.UserContextHolder;
import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.persistence.repository.GTOSampleRepository;
import com.shell.siep.gto.services.GTOService;
import com.shell.siep.gto.vo.request.PageableSamplesRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;
import java.util.concurrent.*;

@Service
public class PaginatedSampleSearch extends GTOService {

    private static final Logger logger = LoggerFactory.getLogger(PaginatedSampleSearch.class);
    private static final String DELIMITER = "|";
    public static final String SAMPLE_ID = "sampleId";

    private final Map<String, GTOSampleRepository<GTOSample, String>> sampleRepositoryMap;
    private final EntityManagerFactoryHolder entityManagerFactoryHolder;

    public PaginatedSampleSearch(@Qualifier("GTO") Map<String, GTOSampleRepository<GTOSample, String>> sampleRepositoryMap,
                                 EntityManagerFactoryHolder entityManagerFactoryHolder) {
        this.sampleRepositoryMap = sampleRepositoryMap;
        this.entityManagerFactoryHolder = entityManagerFactoryHolder;
    }

    public PaginatedRecordWrapper getSamples(PageableSamplesRequest request) {
        logger.info("Getting samples. [User: {}] {}", getCurrentUsername(), request);

        if (StringUtils.isEmpty(request.getSortColumn())) {
            request.setSortColumn(SAMPLE_ID);
        }

        List<GTOSample> paginatedSamples = new ArrayList<>();
        PaginatedRecordWrapper paginatedRecordWrapper = new PaginatedRecordWrapper();
        final ExecutorService pool = Executors.newFixedThreadPool(request.getDatabases().size());
        CompletionService<Map<String, Object>> cs = new ExecutorCompletionService<>(pool);
        List<Future<Map<String, Object>>> futures = new ArrayList<>();

        for (String db : request.getDatabases()) {
            futures.add(cs.submit(() ->
                    getSampleIdsAndSortColumn(request, db)
            ));
        }

        Map<String, Object> masterMap = collectSampleSearchObjectMapFromFutures(futures);
        pool.shutdownNow();

        if (masterMap.size() > 0) {
            Map<String, Object> sortedMap = new LinkedHashMap<>();
            Optional<Sort.Order> sortOrder = request.getPageable().getSort().stream().findFirst();
            if(sortOrder.isPresent()){
                sortedMap = sort(sortOrder.get(), masterMap);
            }
            ArrayList<String> sortedSampleIdList = new ArrayList<>(sortedMap.keySet());

            // masterList will contain the a page of sampleIds in order
            List<String> masterSampleIdList = new ArrayList<>();

            Map<String, List<String>> paginatedDbSampleIdMap = getDatabaseIdMap(request.getPageable(), sortedSampleIdList,
                    masterSampleIdList);

            paginatedSamples =  getGtoSamples(paginatedDbSampleIdMap, masterSampleIdList, sampleRepositoryMap);
        }
        paginatedRecordWrapper.setTotalRecords(masterMap.size());
        paginatedRecordWrapper.setRecords(paginatedSamples);
        return paginatedRecordWrapper;
    }

    private Map<String, Object> getSampleIdsAndSortColumn(PageableSamplesRequest request, String db) {
        UserContextHolder.setUserContext(getCurrentUsername());

        EntityManager em = entityManagerFactoryHolder.getEntityManagerFactory(db).getNativeEntityManagerFactory()
                .createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = cb.createTupleQuery();

        Root<? extends GTOSample> root = getRoot(query, db);
        query.select(cb.tuple(root.get(SAMPLE_ID), root.get(request.getSortColumn())));
        query.where(getMultiDBQuery(request, cb, root));

        TypedQuery<Tuple> typedQuery = em.createQuery(query).setHint("org.hibernate.fetchSize", 100000);
        List<Tuple> sampleIdsSortObjects = typedQuery.getResultList();

        // Convert Tuple to map and add the database name to the SampleId so we know which database to get the sample back from later
        Map<String, Object> resultsMap = new TreeMap<>();
        for (Tuple sampleIdsSortObject : sampleIdsSortObjects) {
            resultsMap.put(sampleIdsSortObject.get(0) + DELIMITER + db, sampleIdsSortObject.get(1));
        }

        return resultsMap;
    }

    private Predicate[] getMultiDBQuery(PageableSamplesRequest request, CriteriaBuilder cb, Root<? extends GTOSample> root) {
        List<Predicate> predicates = new ArrayList<>();
        List<String> wellIds = request.getWellIds();
        List<String> sampleIds = request.getSampleIds();
        List<String> countries = request.getCountries();

        if (!CollectionUtils.isEmpty(countries)) {
            predicates.add(root.join("well").join("country").get("countryName").in(countries));
        }

        if (wellIds != null && !wellIds.isEmpty()) {
            predicates.add(root.get("shWellId").in(wellIds));
        }

        if (sampleIds != null && !sampleIds.isEmpty()) {
            predicates.add(root.get(SAMPLE_ID).in(sampleIds));
        }

        if (!CollectionUtils.isEmpty(request.getSampleTypes())) {
            predicates.add(root.get("sampleType").in(sampleIds));
            predicates.add(root.join("sampleType").get("parent").in(request.getSampleTypes()));
        }

        if (!StringUtils.isEmpty(request.getSearchColumn())) {
            predicates.add(cb.like(root.get(request.getSearchColumn()), "%" + request.getSearchValue() + "%"));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }

    private static Map<String, Object> collectSampleSearchObjectMapFromFutures(List<Future<Map<String, Object>>> futures) {

        Map<String, Object> masterMap = new TreeMap<>();
        for (Future<Map<String, Object>> future : futures) {

            try {
                masterMap.putAll(future.get());

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("InterruptedException getting sample Id Tuples", e);

            } catch (ExecutionException e) {
                logger.error("ExecutionException getting sample Id Tuples", e);
            }
        }
        return masterMap;
    }

    private Map<String, Object> sort(Sort.Order sort, Map<String, Object> masterMap) {

        Object value = getObject(masterMap);
        final Map<String, Object> finalSortedMap = new LinkedHashMap<>();

        if (value == null) {
            return finalSortedMap;

        } else if (value instanceof Integer) {
            Map<String, Integer> castMasterMap = new HashMap<>();
            masterMap.forEach((k, v) -> castMasterMap.put(k, (Integer) v));
            Map<String, Integer> castSortedMap = sortMapBasedOnSortObject(castMasterMap, sort.isAscending());
            castSortedMap.forEach(finalSortedMap::put);

        } else if (value instanceof Double) {
            Map<String, Double> castMasterMap = new HashMap<>();
            masterMap.forEach((k, v) -> castMasterMap.put(k, (Double) v));
            Map<String, Double> castSortedMap = sortMapBasedOnSortObject(castMasterMap, sort.isAscending());
            castSortedMap.forEach(finalSortedMap::put);

        } else if (value instanceof String) {
            Map<String, String> castMasterMap = new HashMap<>();
            masterMap.forEach((k, v) -> castMasterMap.put(k, (String) v));
            Map<String, String> castSortedMap = sortMapBasedOnSortObject(castMasterMap, sort.isAscending());
            castSortedMap.forEach(finalSortedMap::put);

        } else if (value instanceof Date) {
            Map<String, Date> castMasterMap = new HashMap<>();
            masterMap.forEach((k, v) -> castMasterMap.put(k, (Date) v));
            Map<String, Date> castSortedMap = sortMapBasedOnSortObject(castMasterMap, sort.isAscending());
            castSortedMap.forEach(finalSortedMap::put);
        }

        return finalSortedMap;
    }

    private Object getObject(Map<String, Object> masterMap) {
        for (Object o : masterMap.values()) {
            if (o != null) {
                return o;
            }
        }
        return null;
    }

    private static Map<String, List<String>> getDatabaseIdMap(Pageable pageable, List<String> idsSorted, List<String> masterIdList) {
        Map<String, List<String>> dbLists = new HashMap<>();

        int pageNumber = pageable.getPageNumber();
        int pageSize = pageable.getPageSize();
        int startingPoint = pageNumber * pageSize - pageSize;

        if (idsSorted.size() >= startingPoint) {

            for (int x = startingPoint; x < startingPoint + pageSize; x++) {
                if (x < idsSorted.size()) {
                    String fullSampleId = idsSorted.get(x);
                    String sampleId = fullSampleId.substring(0, fullSampleId.indexOf(DELIMITER));
                    String db = fullSampleId.substring(fullSampleId.indexOf(DELIMITER) + 1);

                    if (!masterIdList.contains(sampleId)) {
                        masterIdList.add(sampleId);
                    }

                    dbLists.computeIfAbsent(db, k -> new ArrayList<>());
                    dbLists.get(db).add(sampleId);
                }
            }
        }
        return dbLists;
    }

    private List<GTOSample> getGtoSamples(Map<String, List<String>> paginatedDbSampleIdMap, List<String> masterSampleIdList,
                                          Map<String, GTOSampleRepository<GTOSample, String>> sampleRepositoryMap) {

        final ExecutorService pool = Executors.newFixedThreadPool(paginatedDbSampleIdMap.size());
        CompletionService<List<GTOSample>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<GTOSample>>> futures = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : paginatedDbSampleIdMap.entrySet()) {
            futures.add(cs.submit(() ->
                    sampleRepositoryMap.get(entry.getKey()).findSamplesBySampleIds(entry.getValue())
            ));
        }

        Map<String, List<GTOSample>> samplesLists = collectSamplesFromFutures(futures);
        List<GTOSample> returnSamples = new ArrayList<>();

        for (String sampleId : masterSampleIdList) {
            for (List<GTOSample> dbSamples : samplesLists.values()) {
                for (GTOSample sample : dbSamples) {
                    if (sample.getSampleId().equals(sampleId)) {
                        returnSamples.add(sample);
                    }
                }
            }
        }

        return returnSamples;
    }

    private static Map<String, List<GTOSample>> collectSamplesFromFutures(List<Future<List<GTOSample>>> futures) {

        Map<String, List<GTOSample>> samplesLists = new HashMap<>();

        for (Future<List<GTOSample>> future : futures) {

            try {
                Iterable<GTOSample> samples = future.get();
                for (GTOSample sample : samples) {
                    if (!samplesLists.containsKey(sample.getDatabase().getCode())) {
                        samplesLists.put(sample.getDatabase().getCode(), new ArrayList<>());
                    }
                    samplesLists.get(sample.getDatabase().getCode()).add(sample);
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("InterruptedException getting samples", e);

            } catch (ExecutionException e) {
                logger.error("ExecutionException getting samples", e);
            }
        }
        return samplesLists;
    }

    private static <K, V extends Comparable<V>> Map<K, V> sortMapBasedOnSortObject(final Map<K, V> map, boolean ascending) {

        Comparator<K> valueComparator = (k1, k2) -> {
            if (map.get(k1) == null) {
                return ascending ? 1 : -1;
            }
            if (map.get(k2) == null) {
                return ascending ? -1 : 1;
            }
            int comp = map.get(k1).compareTo(map.get(k2));
            int resultValue = ascending ? comp : comp * -1;
            return comp == 0 ? 1 : resultValue;
        };

        Map<K, V> sorted = new TreeMap<>(valueComparator);
        sorted.putAll(map);
        return sorted;
    }

    private Root<? extends GTOSample> getRoot(CriteriaQuery<Tuple> query, String db) {
        if (db.equals(Database.DD.getCode())) {
            return query.from(DDSample.class);
        } else if (db.equals(Database.SGS.getCode())) {
            return query.from(SGSSample.class);
        } else if (db.equals(Database.BG.getCode())) {
            return query.from(BGSample.class);
        }

        return query.from(FpcSample.class);
    }
}
