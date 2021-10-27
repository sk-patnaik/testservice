package com.shell.siep.gto.persistence.datasource;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EntityManagerFactoryHolder {

    private static Map<String, LocalContainerEntityManagerFactoryBean> localContainerEntityManagerFactoryBeanMap = new HashMap<>();

    public void setEntityManagerFactory(String database, LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        localContainerEntityManagerFactoryBeanMap.put(database, entityManagerFactory);
    }

    public LocalContainerEntityManagerFactoryBean getEntityManagerFactory(String database) {
        return localContainerEntityManagerFactoryBeanMap.get(database);
    }
}
