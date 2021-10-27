package com.shell.siep.gto.persistence.repository.maps;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOCountry;
import com.shell.siep.gto.persistence.repository.GTOCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GTOCountryRepositories {

    private final Map<String, GTOCountryRepository<GTOCountry>> countryRepositoryMap = new HashMap<>();

    @Autowired
    public GTOCountryRepositories(@Autowired Map<String, GTOCountryRepository<? extends GTOCountry>> repositoryMap) {
        for(Map.Entry<String, GTOCountryRepository<? extends GTOCountry>> entry : repositoryMap.entrySet()) {
            for(Database db :Database.values()) {
                if(entry.getKey().toLowerCase().startsWith(db.getCode().toLowerCase())) {
                    countryRepositoryMap.put(db.getCode(), (GTOCountryRepository<GTOCountry>) entry.getValue());
                    break;
                }
            }
        }
    }

    @Bean
    @Qualifier("GTO")
    public Map<String, GTOCountryRepository<GTOCountry>> getCountryRepositories() {
        return countryRepositoryMap;
    }
}
