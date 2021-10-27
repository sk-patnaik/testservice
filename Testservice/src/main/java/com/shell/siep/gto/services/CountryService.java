package com.shell.siep.gto.services;

import java.util.*;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.shell.siep.gto.persistence.datasource.UserContextHolder;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shell.siep.gto.exceptions.GTOServiceException;
import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOCountry;
import com.shell.siep.gto.persistence.repository.GTOCountryRepository;

@Service
public class CountryService extends GTOService {

    private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

    private final Map<String, GTOCountryRepository<GTOCountry>> countryRepositoryMap;
    private static Map<String, Map<String, Integer>> countryIdMap = new HashMap<>();

    public CountryService(@Qualifier("GTO") Map<String, GTOCountryRepository<GTOCountry>> countryRepositoryMap) {
        this.countryRepositoryMap = countryRepositoryMap;
    }

    /**
     * Returns all the countries in a database
     *
     * @param dbs List of dbs to get countries from
     * @return Map with a key of the database and the value is a list of all the countries in that database
     * @throws GTOServiceException
     */
    public Map<String, List<GTOCountry>> getAll(List<String> dbs) {
        logger.debug("Getting all countries. [Databases: {}]", dbs);
        Map<String, List<GTOCountry>> map = new HashMap<>();
        final ExecutorService pool = Executors.newFixedThreadPool(dbs.size());
        CompletionService<Iterable<GTOCountry>> cs = new ExecutorCompletionService<>(pool);

        List<Future<Iterable<GTOCountry>>> futures = new ArrayList<>();
        String currentUser = getCurrentUsername();
        for (String db : dbs) {
            if(countryRepositoryMap.containsKey(db)) {

                futures.add(cs.submit(() -> {
                    UserContextHolder.setUserContext(currentUser);
                    return countryRepositoryMap.get(db).findAll();
                }));

                map.put(db, new ArrayList<>());
            }
        }

        return getCountriesFromFutures(map, futures, pool);
    }

    /**
     * Returns all the country names from all databases
     *
     * @return Map with a key of all the databases and the value is a list of all the country names in that database
     * @throws GTOServiceException
     */
    public Map<String, List<String>> getAllCountryNamesFromAllDatabases() {

        Map<String, List<String>> countryMap= new HashMap<>();

            List<String> dbs = new ArrayList<>();

            for(Database database : Database.values()) {
                dbs.add(database.getCode());
            }

           Map<String, List<GTOCountry>> m = getAll(dbs);
           for(Map.Entry<String, List<GTOCountry>> entry : m.entrySet()) {
               for(GTOCountry country : entry.getValue()) {
                   if(!countryMap.containsKey(entry.getKey())) {
                       countryMap.put(entry.getKey(), new ArrayList<>());
                   }
                   countryMap.get(entry.getKey()).add(country.getCountryName());
               }
           }

        return countryMap;
    }

    public List<Integer> getCountryIds(List<String> countries, String db) {
        List<Integer> countryIds = new ArrayList<>();

        if(!countryIdMap.containsKey(db)) {
            countryIdMap.put(db, new HashMap<>());
        }

        for(String country: countries) {
            if(!countryIdMap.get(db).containsKey(country)) {

                try {
                    Integer countryId = getCountryId(db, country);
                    countryIds.add(countryId);
                    countryIdMap.get(db).put(country, countryId);

                } catch (NotFoundException e) {
                    logger.error("Country: {} not found in db: {}", country, db);
                }

            } else {
                countryIds.add(countryIdMap.get(db).get(country));
            }
        }

        return countryIds;
    }

    private Integer getCountryId(String db, String country) throws NotFoundException {
        logger.debug("Getting CountryId [Database: {}] [Country: {}]", db, country);

        List<GTOCountry> i = countryRepositoryMap.get(db).findAllByCountryName(country);

        if (i.isEmpty()) {
            throw new NotFoundException("Country " + country + " not found in " + db + " database");
        }

        return i.get(0).getCountryId();
    }

    private Map<String, List<GTOCountry>> getCountriesFromFutures(Map<String, List<GTOCountry>> map,
                List<Future<Iterable<GTOCountry>>> futures, ExecutorService pool) {

        for (Future<Iterable<GTOCountry>> future : futures) {
            try {
                Iterable<GTOCountry> countries = future.get();
                countries.forEach(country -> map.get(country.getDatabase().getCode()).add(country));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("InterruptedException getting Country Names", e);

            } catch (ExecutionException e) {
                logger.error("ExecutionException getting Country Names", e);
            }
        }

        pool.shutdownNow();
        return map;
    }

}

