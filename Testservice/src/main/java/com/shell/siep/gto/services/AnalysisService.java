package com.shell.siep.gto.services;

import com.shell.siep.gto.persistence.datasource.UserContextHolder;
import com.shell.siep.gto.exceptions.GTOServiceException;
import com.shell.siep.gto.persistence.model.GTOLimsStatus;
import com.shell.siep.gto.persistence.model.GTOAnalysisData;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import com.shell.siep.gto.persistence.repository.GTOFpcLimsStatusRepository;
import com.shell.siep.gto.vo.request.AnalysisRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StopWatch;

import java.util.*;
import java.util.concurrent.*;

@Service
public class AnalysisService extends GTOService {

    private static final Logger logger = LoggerFactory.getLogger(AnalysisService.class);

    private final Map<String, GTOFpcLimsStatusRepository<GTOLimsStatus>> limsStatusRepositoryMap;
    private final Map<String, Map<String, GTOAnalysisRepository<GTOAnalysisData>>> analysisRepositories;

    @Value("${analysis.sampleId.batchSize}")
    private int maxBatchCount;

    public AnalysisService(@Qualifier("GTO") Map<String, GTOFpcLimsStatusRepository<GTOLimsStatus>> limsStatusRepositoryMap,
                           @Qualifier("AnalysisRepositories") Map<String, Map<String, GTOAnalysisRepository<GTOAnalysisData>>> analysisRepositories) {
        this.limsStatusRepositoryMap = limsStatusRepositoryMap;
        this.analysisRepositories = analysisRepositories;
    }

    public List<Object> getAnalysisData(AnalysisRequest request) {
        logger.debug("Getting analysis data [Databases: {}] [SampleIds: {}] [Analysis Names: {}]", request.getDatabases(),
                        request.getSampleIds(), request.getAnalysisNames());

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        //doing this in case they ask for more than 1000 sampleIds. (sigh)  It happened.
        List<List<String>> sampleIdBatches = getBatches(request.getSampleIds(), maxBatchCount);

        final ExecutorService pool = Executors.newFixedThreadPool(request.getDatabases().size() * sampleIdBatches.size());
        CompletionService<List<GTOAnalysisData>> cs = new ExecutorCompletionService<>(pool);
        List<Future<List<GTOAnalysisData>>> futures = new ArrayList<>();

        String currentUser = getCurrentUsername();
        for(String analysisName : request.getAnalysisNames()) {
            if(analysisRepositories.containsKey(analysisName)) {

                Map<String, GTOAnalysisRepository<GTOAnalysisData>> analysisRepositoryMap =
                        analysisRepositories.get(analysisName);

                for (String db : request.getDatabases()) {
                    if(analysisRepositoryMap.containsKey(db)) {
                        for(List<String> batch : sampleIdBatches) {

                            futures.add(cs.submit(() -> {
                                UserContextHolder.setUserContext(currentUser);
                                return analysisRepositoryMap.get(db).findAllBySampleIdIn(batch);
                            }));
                        }
                    }
                }
            }
        }

        List<Object> responses = collectAnalysisFutures(futures);
        pool.shutdownNow();
        stopWatch.stop();

        logger.debug("Getting analysis data [Count: {}] [Time: {}] [Databases: {}] [SampleIds: {}] [Analysis Names: {}]",
                responses.size(), stopWatch.getTotalTimeSeconds(), request.getDatabases(), request.getSampleIds(),
                request.getAnalysisNames());

        return responses;
    }

    private List<Object> collectAnalysisFutures(List<Future<List<GTOAnalysisData>>> futures) {
        List<Object> responses = new ArrayList<>();

        for (Future<List<GTOAnalysisData>> future : futures) {

            try {
                List<GTOAnalysisData> analysisData = future.get();

                if(!CollectionUtils.isEmpty(analysisData)) {
                    for(GTOAnalysisData data: analysisData) {
                        responses.add(data);
                    }
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("InterruptedException getting sample Names", e);

            } catch (ExecutionException e) {
                logger.error("ExecutionException getting sample Names", e);
            }
        }

        return responses;
    }

    public List<GTOLimsStatus> getStatus(String db, String sampleId) throws GTOServiceException {
        logger.debug("Getting LimsStatus. [Database: {}] [SampleId: {}]", db, sampleId);

        List<GTOLimsStatus> limsStatuses;

        if(limsStatusRepositoryMap.containsKey(db)) {
            limsStatuses = limsStatusRepositoryMap.get(db).findAllByMeasSampleId(sampleId);
        } else {
            throw new GTOServiceException("Trying to get Status from a database that is not connected");
        }

        return limsStatuses;
    }

    private static List<List<String>> getBatches(List<String> collection, int batchSize){
        int i = 0;
        List<List<String>> batches = new ArrayList<>();

        while(i < collection.size()){
            int nextInc = Math.min(collection.size()-i, batchSize);
            List<String> batch = collection.subList(i, i + nextInc);
            batches.add(batch);
            i = i + nextInc;
        }

        return batches;
    }
}
