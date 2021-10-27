package com.shell.siep.gto.persistence.repository.maps;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOSampleType;
import com.shell.siep.gto.persistence.repository.GTOSampleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GTOSampleTypeRepositories {

    private final Map<String, GTOSampleTypeRepository<GTOSampleType>> sampleTypeRepositoryMap = new HashMap<>();

    @Autowired
    public GTOSampleTypeRepositories(@Autowired Map<String, GTOSampleTypeRepository<? extends GTOSampleType>> repositoryMap) {
        for(Map.Entry<String, GTOSampleTypeRepository<? extends GTOSampleType>> entry : repositoryMap.entrySet()) {
            for(Database db :Database.values()) {
                if(entry.getKey().toLowerCase().startsWith(db.getCode().toLowerCase())) {
                    sampleTypeRepositoryMap.put(db.getCode(), (GTOSampleTypeRepository<GTOSampleType>) entry.getValue());
                    break;
                }
            }
        }
    }

    @Bean
    @Qualifier("GTO")
    public Map<String, GTOSampleTypeRepository<GTOSampleType>> getSampleTypeRepositories() {
        return sampleTypeRepositoryMap;
    }
}
