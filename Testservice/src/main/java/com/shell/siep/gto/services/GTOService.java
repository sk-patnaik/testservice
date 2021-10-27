package com.shell.siep.gto.services;

import com.shell.siep.gto.persistence.datasource.UserContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class GTOService {

    private static final Logger logger = LoggerFactory.getLogger(GTOService.class);

    protected String getCurrentUsername() {
        return UserContextHolder.getUserContext();
    }

    protected List<String> collectIdsFromFutures(List<Future<List<Object[]>>> futures) {
        List<String> wellIds = new ArrayList<>();

        for (Future<List<Object[]>> future : futures) {
            try {
                List<Object[]> objs = future.get();

                for (Object[] obj : objs) {
                    wellIds.add((String) obj[0]);
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("InterruptedException getting sample Names", e);

            } catch (ExecutionException e) {
                logger.error("ExecutionException getting sample Names", e);
            }
        }
        return wellIds;
    }

}
