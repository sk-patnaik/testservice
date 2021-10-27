package com.shell.siep.gto.persistence.repository.maps;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOLimsStatus;
import com.shell.siep.gto.persistence.repository.GTOFpcLimsStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GTOLimsStatusRepositories {

    private final Map<String, GTOFpcLimsStatusRepository<GTOLimsStatus>> limsStatusRepositoryMap = new HashMap<>();

    @Autowired
    public GTOLimsStatusRepositories(@Autowired Map<String, GTOFpcLimsStatusRepository<? extends GTOLimsStatus>> repositoryMap) {
        for(Map.Entry<String, GTOFpcLimsStatusRepository<? extends GTOLimsStatus>> entry : repositoryMap.entrySet()) {
            for(Database db :Database.values()) {
                if(entry.getKey().toLowerCase().startsWith(db.getCode().toLowerCase())) {
                    limsStatusRepositoryMap.put(db.getCode(), (GTOFpcLimsStatusRepository<GTOLimsStatus>) entry.getValue());
                    break;
                }
            }
        }
    }

    @Bean
    @Qualifier("GTO")
    public Map<String, GTOFpcLimsStatusRepository<GTOLimsStatus>> getLimsStatusRepositories() {
        return limsStatusRepositoryMap;
    }
}
