package com.shell.siep.gto.services;

import java.util.*;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import com.shell.siep.gto.persistence.databases.sgs.repository.SGSSampleRepository;
import com.shell.siep.gto.persistence.datasource.UserContextHolder;
import com.shell.siep.gto.services.extractors.SampleFromIdExtractor;
import com.shell.siep.gto.services.extractors.SampleFromSampleIdExtractor;
import com.shell.siep.gto.services.extractors.SampleFromWellIdExtractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StopWatch;

import com.shell.siep.gto.exceptions.GTOServiceException;
import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.persistence.model.GTOSampleType;
import com.shell.siep.gto.persistence.repository.GTOSampleRepository;
import com.shell.siep.gto.persistence.repository.GTOSampleTypeRepository;

import javassist.NotFoundException;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


@Service
public class SampleService extends GTOService {

    private static final Logger logger = LoggerFactory.getLogger(SampleService.class);
    public static final String INTERRUPTED_EXCEPTION_GETTING_SAMPLE_NAMES = "InterruptedException getting sample Names";
    public static final String EXECUTION_EXCEPTION_GETTING_SAMPLE_NAMES = "ExecutionException getting sample Names";

    private final Map<String, GTOSampleRepository<GTOSample, String>> sampleRepositoryMap;
    private final Map<String, GTOSampleTypeRepository<GTOSampleType>> sampleTypeRepositoryMap;
    private final CountryService countryService;

    public SampleService(@Qualifier("GTO") Map<String, GTOSampleRepository<GTOSample, String>> sampleRepositoryMap,
                         @Qualifier("GTO") Map<String, GTOSampleTypeRepository<GTOSampleType>> sampleTypeRepositoryMap,
                         CountryService countryService) {
        this.sampleRepositoryMap = sampleRepositoryMap;
        this.sampleTypeRepositoryMap = sampleTypeRepositoryMap;
        this.countryService = countryService;
    }

    /**
     * Returns a sample
     * @param sampleId  SampleId requested
     * @param db        Database to get sample from
     * @return GTOFpcSamples
     * @throws NotFoundException
     */
    public GTOSample getSample(String sampleId, String db) throws NotFoundException {
        logger.debug("Getting sample [Database: {}] [SampleId: {}]", db, sampleId);

        Optional<GTOSample> i = sampleRepositoryMap.get(db).findById(sampleId);

        if (i.isEmpty()) {
            throw new NotFoundException("Sample " + sampleId + " not found in " + db + " database");
        }
        logger.debug("Found sample [Database: {}] [SampleId: {}]   ", db, sampleId);

        return i.get();
    }

    public List<String> getExistingSampleIds(List<String> dbs, List<String> countries, List<String> wellIds, List<String> sampleIds) {
        logger.debug("Getting Existing SampleIds From SampleIds [Databases: {}] [Countries: {}] [WellIds: {}] [SampleIds: {}]",
                dbs, countries, wellIds, sampleIds);

        var stopWatch = new StopWatch();
        stopWatch.start();

        final ExecutorService pool = Executors.newFixedThreadPool(dbs.size());
        CompletionService<List<GTOSample>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<GTOSample>>> futures = new ArrayList<>();
        String currentUser = getCurrentUsername();

        for (String db : dbs) {
            if(sampleRepositoryMap.containsKey(db)) {


                futures.add(cs.submit(() -> {
                    UserContextHolder.setUserContext(currentUser);

                    return sampleRepositoryMap.get(db).findAll((root, query, criteriaBuilder) -> {
                        query.distinct(true);
                        return criteriaBuilder.and(getPredicates(db, countries, wellIds, sampleIds, root));
                    });
                }));
            }
        }

        List<String> existingWellIds = collectSampleIdsFromSampleFutures(futures);

        pool.shutdownNow();
        stopWatch.stop();
        logger.debug("Returning WellIds [Count: {}] [Time: {}] [Databases: {}] [WellIds: {}]", existingWellIds.size(),
                stopWatch.getTotalTimeSeconds(), dbs, wellIds);

        return existingWellIds;
    }


    /**
     * Returns a list of sample ids from a partial sample id
     * @param partial Partial SampleId
     * @param dbs        Database to get sample ids from
     * @return GTOFpcSamples
     * @throws NotFoundException
     */
    public List<String> getSampleIdsFromPartialSampleId(String partial, List<String> dbs) {
        logger.debug("Getting SampleIds from Partial SampleId [User: {}] [Databases: {}] [SampleId: {}]",
                getCurrentUsername(), dbs, partial);

        var stopWatch = new StopWatch();
        stopWatch.start();

        final ExecutorService pool = Executors.newFixedThreadPool(dbs.size());
        CompletionService<List<Object[]>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<Object[]>>> futures = new ArrayList<>();
        String currentUser = getCurrentUsername();

        for (String db : dbs) {
            futures.add(cs.submit(() -> {
                UserContextHolder.setUserContext(currentUser);
                return sampleRepositoryMap.get(db).findSampleId(partial.toUpperCase());
            }));
        }

        List<String> wellIds = collectIdsFromFutures(futures);

        pool.shutdownNow();
        stopWatch.stop();
        logger.debug("Returning SampleIds [User: {}] [Count: {}] [Time: {}] [Databases: {}] [SampleId: {}]",
                currentUser, wellIds.size(), stopWatch.getTotalTimeSeconds(), dbs, partial);

        return wellIds;
    }

    /**
     * Gets a List of Sample Ids
     * @param dbs       Database to get Samples Ids from
     * @param wellIds   WellIds to get Samples from
     * @return List of Sample Ids
     * @throws GTOServiceException
     */
    public List<String> getSampleIdsFromWellIds(List<String> dbs, List<String> wellIds) {

        logger.debug("Getting Sample Names [User: {}] [Databases: {}] [Wells: {}]", getCurrentUsername(), wellIds, dbs);
        var stopWatch = new StopWatch();
        stopWatch.start();

        final ExecutorService pool = Executors.newFixedThreadPool(dbs.size());
        CompletionService<List<Object[]>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<Object[]>>> futures = new ArrayList<>();

        List<String> upperWells = wellIds.stream().map(String::toUpperCase).collect(Collectors.toList());
        String currentUser = getCurrentUsername();
        for (String db : dbs) {
            if(sampleRepositoryMap.containsKey(db)) {
                futures.add(cs.submit(() -> {
                    UserContextHolder.setUserContext(currentUser);
                    return sampleRepositoryMap.get(db).findNamesByWellIds(upperWells);
                }));
            }
        }

        List<String> sampleIds = collectIdsFromFutures(futures);

        pool.shutdownNow();
        stopWatch.stop();
        logger.debug("Returning Sample Names [User: {}] [Count: {}] [Time: {} seconds] [Databases: {}] [Wells: {}]",
                currentUser, sampleIds.size(), stopWatch.getTotalTimeSeconds(), wellIds, dbs);

        return sampleIds;
    }

    /**
     * Gets a List of Samples From WellIds
     * @param dbs       Database to get Samples from
     * @param wellIds   WellIds to get Samples from
     * @return List of Samples
     * @throws GTOServiceException
     */
    public List<GTOSample> getSamplesFromWellIds(List<String> dbs, List<String> wellIds, List<String> sampleTypes, Pageable pageable) {
        SampleFromIdExtractor extractor = new SampleFromWellIdExtractor();
        return extractor.getSamplesFromIds(dbs, wellIds, sampleTypes, sampleRepositoryMap, pageable);
    }

    /**
     * Gets a List of Samples From WellIds
     * @param dbs       Database to get Samples from
     * @param sampleIds SampleIds to get Samples from
     * @param sampleTypes
     * @return List of Samples
     * @throws GTOServiceException
     */
    public List<GTOSample> getSamplesFromSampleIds(List<String> dbs, List<String> sampleIds, List<String> sampleTypes, Pageable pageable) {
        SampleFromIdExtractor extractor = new SampleFromSampleIdExtractor();
        return extractor.getSamplesFromIds(dbs, sampleIds, sampleTypes, sampleRepositoryMap, pageable);
    }

    /**
     * Gets a List of Sample Ids
     * @param dbs       Database to get Samples Ids from
     * @param countries Country Names to get Samples from
     * @return List of Sample Ids
     * @throws GTOServiceException
     */
    public List<String> getSamplesIdsFromCountries(List<String> dbs, List<String> countries) {
        logger.debug("Getting Sample Names [User: {}] [Databases: {}] [Countries: {}] ", getCurrentUsername(), dbs, countries);
        var stopWatch = new StopWatch();
        stopWatch.start();

        final ExecutorService pool = Executors.newFixedThreadPool(dbs.size());
        CompletionService<List<Object[]>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<Object[]>>> futures = new ArrayList<>();
        countries.replaceAll(String::toUpperCase);
        String currentUser = getCurrentUsername();
        for (String db : dbs) {
            if(sampleRepositoryMap.containsKey(db)) {
                futures.add(cs.submit(() -> {
                    UserContextHolder.setUserContext(currentUser);
                    return sampleRepositoryMap.get(db).findNamesByCountries(countries);
                }));
            }
        }

        List<String> sampleIds = collectIdsFromFutures(futures);

        pool.shutdownNow();
        stopWatch.stop();

        logger.debug("Returning Sample Names [User: {}] [Count: {}] [Time: {} seconds] [Databases: {}] [Countries: {}] ",
                currentUser, sampleIds.size(), stopWatch.getTotalTimeSeconds(), dbs, countries);

        return sampleIds;
    }

    /**
     * Gets a List of Available Sample Types
     * @return List of Sample Types
     * @throws GTOServiceException
     */
    public Map<String, List<String>> getSamplesTypes() {
        logger.debug("Getting Sample Types");
        var stopWatch = new StopWatch();
        stopWatch.start();

        final ExecutorService pool = Executors.newFixedThreadPool(Database.values().length);
        CompletionService<List<? extends GTOSampleType>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<? extends GTOSampleType>>> futures = new ArrayList<>();
        Map<String, List<String>> sampleTypes = new HashMap<>();
        List<String> sgsSampleTypes = new ArrayList<>();
        String currentUser = getCurrentUsername();

        for (Database db : Database.values()) {
            if(sampleRepositoryMap.containsKey(db.getCode()) && db != Database.SGS) {
                futures.add(cs.submit(() -> {
                    UserContextHolder.setUserContext(currentUser);
                    return sampleTypeRepositoryMap.get(db.getCode()).findSampleTypes();
                }));
                sampleTypes.put(db.getCode(), new ArrayList<>());
            }

            if(sampleRepositoryMap.containsKey(db.getCode()) && db == Database.SGS) {
                sgsSampleTypes = ((SGSSampleRepository) (Object) sampleRepositoryMap.get(db.getCode())).findDistinctSampleType();
                sampleTypes.put(db.getCode(), new ArrayList<>());
            }
        }

        for (Future<List<? extends GTOSampleType>> future : futures) {
            try {
                List<? extends GTOSampleType> samples = future.get();

                for ( GTOSampleType sampleType : samples) {
                    sampleTypes.get(sampleType.getDatabase().getCode()).add(sampleType.getSampleType());
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error(INTERRUPTED_EXCEPTION_GETTING_SAMPLE_NAMES, e);

            } catch (ExecutionException e) {
                logger.error(EXECUTION_EXCEPTION_GETTING_SAMPLE_NAMES, e);
            }
        }

        if(!sgsSampleTypes.isEmpty()) {
            sampleTypes.get(Database.SGS.getCode()).addAll(sgsSampleTypes);
        }

        pool.shutdownNow();
        stopWatch.stop();

        logger.debug("Returning Sample Types [User: {}] [Count: {}] [Time: {} seconds]", getCurrentUsername(),
                sampleTypes.size(), stopWatch.getTotalTimeSeconds());

        return sampleTypes;
    }

    private Predicate[] getPredicates(String db, List<String> countries, List<String> wellIds, List<String> sampleIds, Root<GTOSample> root) {

        List<Predicate> predicates = new ArrayList<>();

        if(!CollectionUtils.isEmpty(countries)) {
            List<Integer> countryIds = countryService.getCountryIds(countries, db);
            predicates.add(root.get("well").get("whCountryId").in(countryIds));
        }

        if(wellIds != null && !wellIds.isEmpty()) {
            predicates.add(root.get("shWellId").in(wellIds));
        }

        if(sampleIds != null && !sampleIds.isEmpty()) {
            predicates.add(root.get("sampleId").in(sampleIds));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }

    private List<String> collectSampleIdsFromSampleFutures(List<Future<List<GTOSample>>> futures) {
        List<String> sampleIds = new ArrayList<>();

        for (Future<List<GTOSample>> future : futures) {
            try {
                List<GTOSample> samples = future.get();

                sampleIds.addAll(samples.stream()
                        .map(GTOSample::getSampleId)
                        .collect(Collectors.toList()));

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error(INTERRUPTED_EXCEPTION_GETTING_SAMPLE_NAMES, e);

            } catch (ExecutionException e) {
                logger.error(EXECUTION_EXCEPTION_GETTING_SAMPLE_NAMES, e);
            }
        }
        return sampleIds;
    }
}
