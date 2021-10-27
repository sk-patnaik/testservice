package com.shell.siep.gto.persistence.repository.maps;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.persistence.repository.GTOSampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GTOSampleRepositories {

    private final Map<String, GTOSampleRepository<GTOSample, String>> sampleRepositoryMap = new HashMap<>();

    @Autowired
    public GTOSampleRepositories(@Autowired Map<String, GTOSampleRepository<? extends GTOSample, String>> repositoryMap) {
        for(Map.Entry<String, GTOSampleRepository<? extends GTOSample, String>> entry : repositoryMap.entrySet()) {
            for(Database db :Database.values()) {
                if(entry.getKey().toLowerCase().startsWith(db.getCode().toLowerCase())) {
                    sampleRepositoryMap.put(db.getCode(), (GTOSampleRepository<GTOSample, String>)entry.getValue());
                    break;
                }
            }
        }
    }

    @Bean
    @Qualifier("GTO")
    public Map<String, GTOSampleRepository<GTOSample, String>> getSampleRepositories() {
        return sampleRepositoryMap;
    }
}
