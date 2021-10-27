package com.shell.siep.gto.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.shell.siep.gto.persistence.databases.bg.repository.BGCountryRepository;
import com.shell.siep.gto.persistence.databases.dd.repository.DDCountryRepository;
import com.shell.siep.gto.persistence.databases.fpc.repository.FpcCountryRepository;
import com.shell.siep.gto.persistence.databases.sgs.repository.SGSCountryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOCountry;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CountryServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(CountryServiceTest.class);


    @Autowired
    private CountryService countryService;

    @Test
    public void testGetCountriesSGS() {
        testGetCountries(Database.SGS);
    }

    @Test
    public void testGetCountriesDD() {
        testGetCountries(Database.DD);
    }

    @Test
    public void testGetCountriesFpc() {
        testGetCountries(Database.FPC);
    }

    @Test
    public void testGetCountriesBG() {
        testGetCountries(Database.BG);
    }

    private void testGetCountries(Database database) {
        if(Database.getActiveDatabases().contains(database)) {
            Map<String, List<GTOCountry>> found = countryService.getAll(Collections.singletonList(database.getCode()));

            assert (found != null && found.size() == 1);
            assert (found.get(database.getCode()).size() > 1);

            for (GTOCountry country : found.get(database.getCode())) {
                assert (country.getDatabase() == database);
            }
        }
    }

    @Test
    public void testGetAllCountryNames() {
        Map<String, List<String>> countryNames = countryService.getAllCountryNamesFromAllDatabases();

        assert(countryNames.keySet().size() == Database.getActiveDatabases().size());

        for(List<String> countries : countryNames.values()) {
            assert(!countries.isEmpty());
        }
    }

    @Test
    public void testGetCountriesAll() {
        List<String> countries = new ArrayList<>();
        countries.add(Database.FPC.getCode());
        countries.add(Database.BG.getCode());
        countries.add(Database.SGS.getCode());
        countries.add(Database.DD.getCode());

        Map<String, List<GTOCountry>> found = null;
        found = countryService.getAll(countries);

        assert(found != null && found.size() == Database.getActiveDatabases().size());

        if(Database.getActiveDatabases().contains(Database.FPC)) {
            assert (found.get(Database.FPC.getCode()).size() > 1);
        }

        if(Database.getActiveDatabases().contains(Database.BG)) {
            assert (found.get(Database.BG.getCode()).size() > 1);
        }

        if(Database.getActiveDatabases().contains(Database.SGS)) {
            assert (found.get(Database.SGS.getCode()).size() > 1);
        }

        if(Database.getActiveDatabases().contains(Database.DD)) {
            assert (found.get(Database.DD.getCode()).size() > 1);
        }

        if(Database.getActiveDatabases().contains(Database.FPC)) {
            for (GTOCountry country : found.get(Database.FPC.getCode())) {
                assert (country.getDatabase() == Database.FPC);
            }
        }

        if(Database.getActiveDatabases().contains(Database.BG)) {
            for (GTOCountry country : found.get(Database.BG.getCode())) {
                assert (country.getDatabase() == Database.BG);
            }
        }

        if(Database.getActiveDatabases().contains(Database.SGS)) {
            for (GTOCountry country : found.get(Database.SGS.getCode())) {
                assert (country.getDatabase() == Database.SGS);
            }
        }

        if(Database.getActiveDatabases().contains(Database.DD)) {
            for (GTOCountry country : found.get(Database.DD.getCode())) {
                assert (country.getDatabase() == Database.DD);
            }
        }
    }
}
