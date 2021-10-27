package com.shell.siep.gto.services.extractors;

import com.shell.siep.gto.persistence.datasource.UserContextHolder;
import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.persistence.repository.GTOSampleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StopWatch;

import java.util.*;
import java.util.concurrent.*;

public abstract class SampleFromIdExtractor {
    private static final Logger logger = LoggerFactory.getLogger(SampleFromIdExtractor.class);


    public abstract String getObjectName();
    public abstract List<GTOSample> findByFPCIds(List<String> ids, GTOSampleRepository<GTOSample, String> repository, Pageable pageable);
    public abstract List<GTOSample> findByFPCIds(List<String> ids, List<String> types,
                                                 GTOSampleRepository<GTOSample, String> repository, Pageable pageable);


    public List<GTOSample> getSamplesFromIds(List<String> dbs, List<String> ids, List<String> sampleTypes,
                                             Map<String, GTOSampleRepository<GTOSample, String>> sampleRepositoryMap, Pageable pageable) {

        logger.debug("Getting samples [User: {}] [Databases: {}] [{}: {}]", getCurrentUsername(), dbs, getObjectName(), ids);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        final ExecutorService pool = Executors.newFixedThreadPool(dbs.size());
        CompletionService<List<GTOSample>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<GTOSample>>> futures = new ArrayList<>();
        String currentUser = getCurrentUsername();

        for (String db : dbs) {
            if(sampleRepositoryMap.containsKey(db)) {
                if(sampleTypes != null && !sampleTypes.isEmpty()) {
                    futures.add(cs.submit(() -> {
                        UserContextHolder.setUserContext(currentUser);
                        return findByFPCIds(ids, sampleTypes, sampleRepositoryMap.get(db),pageable);
                    }));
                } else {
                    futures.add(cs.submit(() ->  {
                        UserContextHolder.setUserContext(currentUser);
                        return findByFPCIds(ids, sampleRepositoryMap.get(db), pageable);
                    }));
                }
            }
        }

        List<GTOSample> samples = collectSamplesFromFutures(futures);

        stopWatch.stop();
        logger.debug("Returning Samples [User: {}] [Count: {}] [Time: {} seconds] [Databases: {}] [{}: {}] ",
                currentUser, samples.size(), stopWatch.getTotalTimeSeconds(), dbs, getObjectName(), ids);

        return samples;
    }


    private List<GTOSample> collectSamplesFromFutures(List<Future<List<GTOSample>>> futures) {
        List<GTOSample> samples = new ArrayList<>();

        for(Future<List<GTOSample>> future : futures) {
            try {
                samples.addAll(future.get());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("InterruptedException getting samples", e);

            } catch (ExecutionException e) {
                logger.error("ExecutionException getting samples", e);
            }
        }
        return samples;
    }

    private String getCurrentUsername() {
        return UserContextHolder.getUserContext();
    }


}
