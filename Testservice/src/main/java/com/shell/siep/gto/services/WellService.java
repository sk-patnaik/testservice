package com.shell.siep.gto.services;

import java.util.*;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.datasource.UserContextHolder;
import com.shell.siep.gto.persistence.vo.WellLatLong;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StopWatch;

import com.shell.siep.gto.exceptions.GTOServiceException;
import com.shell.siep.gto.persistence.model.GTOWell;
import com.shell.siep.gto.persistence.repository.GTOWellRepository;

import javassist.NotFoundException;

import javax.persistence.criteria.*;

@Service
public class WellService extends GTOService{

    private static final Logger logger = LoggerFactory.getLogger(WellService.class);
    public static final String SAMPLES = "samples";

    private final Map<String, GTOWellRepository<GTOWell, String>> wellRepositoryMap;
    private final CountryService countryService;

    public WellService(@Qualifier("GTO") Map<String, GTOWellRepository<GTOWell, String>> wellRepositoryMap,
                       CountryService countryService) {
        this.wellRepositoryMap = wellRepositoryMap;
        this.countryService = countryService;
    }

    /**
     * Returns a Well
     * @param wellId    WellId requested
     * @param db        Database to get sample from
     * @return GTOFpcSamples
     * @throws NotFoundException
     */
    public GTOWell getWell(String wellId, String db) throws NotFoundException {
        logger.debug("Getting well [Database: {}] [WellId: {}]", db, wellId);

        Optional<GTOWell> i = wellRepositoryMap.get(db).findById(wellId);

        if (i.isEmpty()) {
            throw new NotFoundException("Well " + wellId + " not found in " + db + " database");
        }

        logger.debug("Found well [Database: {}] [WellId: {}]", db, wellId);
        return i.get();
    }

    /**
     * Gets a List of Well Ids
     * @param dbs       Database to get Well Ids from
     * @param countries Countries to get Well Ids from
     * @return List of Well Ids
     * @throws GTOServiceException
     */
    public List<String> getWellIdsFromCountries(List<String> dbs, List<String> countries) {
        logger.debug("Getting WellIds [Databases: {}] [Countries: {}]", dbs, countries);
        var stopWatch = new StopWatch();
        stopWatch.start();

        final ExecutorService pool = Executors.newFixedThreadPool(dbs.size());
        CompletionService<List<Object[]>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<Object[]>>> futures = new ArrayList<>();
        List<String> upperCountries = countries.stream().map(String::toUpperCase).collect(Collectors.toList());
        String currentUser = getCurrentUsername();
        for (String db : dbs) {
            if(wellRepositoryMap.containsKey(db)) {
                futures.add(cs.submit(() -> {
                    UserContextHolder.setUserContext(currentUser);
                    return wellRepositoryMap.get(db).findIdsFromCountries(upperCountries);
                }));
            }


        }

        List<String> wellIds = collectIdsFromFutures(futures);

        pool.shutdownNow();
        stopWatch.stop();
        logger.debug("Returning WellIds [Count: {}] [Time: {}] [Databases: {}] [Countries: {}]", wellIds.size(),
                stopWatch.getTotalTimeSeconds(), dbs, countries);

        return wellIds;
    }



    public List<WellLatLong> getWellIdsWithLatLong(List<String> dbs, List<String> countries, List<String> wellIds,
                                                   List<String> sampleIds, List<String> sampleTypes) {

        logger.debug("Getting WellIds with Lat and Long [Databases: {}] [Countries: {}] [WellIds: {}] [SampleIds: {}] [SampleTypes: {}]",
                dbs, countries, wellIds, sampleIds, sampleTypes);

        var stopWatch = new StopWatch();
        stopWatch.start();


        final ExecutorService pool = Executors.newFixedThreadPool(dbs.size());
        CompletionService<List<GTOWell>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<GTOWell>>> futures = new ArrayList<>();
        String currentUser = getCurrentUsername();
        for (String db : dbs) {
            if(wellRepositoryMap.containsKey(db)) {
                List<Integer> countryIds = countryService.getCountryIds(countries, db);

                if(!CollectionUtils.isEmpty(countries) && CollectionUtils.isEmpty(countryIds)) {
                    logger.info("Country not found. [Database: {}] [Countries: {}]", db, countries);

                } else {
                    futures.add(cs.submit(() -> {
                        UserContextHolder.setUserContext(currentUser);
                        return wellRepositoryMap.get(db).findAll((root, query, criteriaBuilder) -> {
                            criteriaBuilder.isEmpty(root.get(SAMPLES));
                            query.distinct(true);
                            return criteriaBuilder.and(getPredicates(countryIds, wellIds, sampleIds, sampleTypes, db, root));
                        });
                    }));
                }
            }
        }

        List<WellLatLong> wellLatLongs = collectWellIdsWithLatLongFromFutures(futures);

        pool.shutdownNow();
        stopWatch.stop();

        logger.debug("Getting WellIds with Lat and Long [Count: {}] [Time: {}] [Databases: {}] [Countries: {}] " +
                        "[WellIds: {}] [SampleIds: {}] [SampleTypes: {}]",
                wellLatLongs.size(), stopWatch.getTotalTimeSeconds(), dbs, countries, wellIds, sampleIds, sampleTypes);

        return wellLatLongs;
    }


    private Predicate[] getPredicates(List<Integer> countryIds, List<String> wellIds, List<String> sampleIds,
                                      List<String> sampleTypes, String db, Root<GTOWell> root) {

        List<Predicate> predicates = new ArrayList<>();

        if(countryIds != null && !countryIds.isEmpty()) {
            predicates.add(root.get("whCountryId").in(countryIds));
        }

        if(wellIds != null && !wellIds.isEmpty()) {
            predicates.add(root.get("wellId").in(wellIds));
        }

        if(sampleIds != null && !sampleIds.isEmpty()) {
            predicates.add(root.join(SAMPLES).get("sampleId").in(sampleIds));
        }

        if(sampleTypes != null && !sampleTypes.isEmpty()) {
            if(db.equals(Database.SGS.getCode())) {
                predicates.add(root.join(SAMPLES).get("shSampleType").in(sampleTypes));
            } else {
                predicates.add(root.join(SAMPLES).get("sampleType").get("parent").in(sampleTypes));
            }
        }

        predicates.add(root.get("whLat").isNotNull());
        predicates.add(root.get("whLong").isNotNull());
        return predicates.toArray(new Predicate[predicates.size()]);
    }

    public List<String> getWellIdsFromPartialWellId(String partialWellId, List<String> dbs) {
        logger.debug("Getting WellIds Partial WellId [Databases: {}] [WellId: {}]", dbs, partialWellId);

        final ExecutorService pool = Executors.newFixedThreadPool(dbs.size());
        CompletionService<List<Object[]>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<Object[]>>> futures = new ArrayList<>();
        String currentUser = getCurrentUsername();

        for (String db : dbs) {
            if(wellRepositoryMap.containsKey(db)) {
                futures.add(cs.submit(() -> {
                    UserContextHolder.setUserContext(currentUser);
                    return wellRepositoryMap.get(db).findWellId(partialWellId.toUpperCase());
                }));
            }
        }

        List<String> wellIds = collectIdsFromFutures(futures);
        pool.shutdownNow();

        logger.debug("Returning WellIds [Count: {}] [Databases: {}] [WellId: {}]", wellIds.size(), dbs, partialWellId);
        return wellIds;
    }

    public List<String> getExistingWellIds(List<String> dbs, List<String> countries, List<String> wellIds) {
        logger.debug("Getting Existing WellIds From WellIds [Databases: {}] [Countries: {}] [WellIds: {}]",
                dbs, countries, wellIds);

        final ExecutorService executorService = Executors.newFixedThreadPool(dbs.size());
        CompletionService<List<Object[]>> completionService = new ExecutorCompletionService<>(executorService);
        List<Future<List<Object[]>>> futures = new ArrayList<>();
        String currentUser = getCurrentUsername();

        for (String db : dbs) {
            if(wellRepositoryMap.containsKey(db)) {
                futures.add(completionService.submit(() -> {
                    UserContextHolder.setUserContext(currentUser);

                    if(!CollectionUtils.isEmpty(countries)) {
                        List<String> upperCountries = countries.stream().map(String::toUpperCase).collect(Collectors.toList());
                        return wellRepositoryMap.get(db).findExistingIds(upperCountries, wellIds);
                    } else {
                        return wellRepositoryMap.get(db).findExistingIds(wellIds);
                    }
                }));
            }
        }

        List<String> existingWellIds = collectIdsFromFutures(futures);
        executorService.shutdownNow();

        logger.debug("Returning WellIds [Count: {}] [Databases: {}] [WellIds: {}]", existingWellIds.size(), dbs, wellIds);
        return existingWellIds;
    }

    private List<WellLatLong> collectWellIdsWithLatLongFromFutures(List<Future<List<GTOWell>>> futures) {
        List<WellLatLong> wellLatLongs = new ArrayList<>();

        for (Future<List<GTOWell>> future : futures) {
            try {
                List<GTOWell> wells = future.get();

                wellLatLongs.addAll(wells.stream()
                            .map(vo -> new WellLatLong(vo.getDatabase().getCode(), vo.getWellId(), vo.getWhLat(), vo.getWhLong()))
                            .collect(Collectors.toList()));

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("InterruptedException getting sample Names", e);

            } catch (ExecutionException e) {
                logger.error("ExecutionException getting sample Names", e);
            }
        }
        return wellLatLongs;
    }


}

