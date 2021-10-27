package com.shell.siep.gto.persistence.repository.maps;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOWell;
import com.shell.siep.gto.persistence.repository.GTOWellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GTOWellRepositories {

    private final Map<String, GTOWellRepository<GTOWell, String>> wellsRepositoryMap = new HashMap<>();

    @Autowired
    public GTOWellRepositories(@Autowired Map<String, GTOWellRepository<? extends GTOWell, String>> repositoryMap) {
        for(Map.Entry<String, GTOWellRepository<? extends GTOWell, String>> entry : repositoryMap.entrySet()) {
            for(Database db :Database.values()) {
                if(entry.getKey().toLowerCase().startsWith(db.getCode().toLowerCase())) {
                    wellsRepositoryMap.put(db.getCode(), (GTOWellRepository<GTOWell, String>) entry.getValue());
                    break;
                }
            }
        }
    }


    @Bean
    @Qualifier("GTO")
    public Map<String, GTOWellRepository<GTOWell, String>> getWellRepositories() {
        return wellsRepositoryMap;
    }
}
