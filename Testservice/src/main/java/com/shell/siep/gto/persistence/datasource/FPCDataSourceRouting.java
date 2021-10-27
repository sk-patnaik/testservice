package com.shell.siep.gto.persistence.datasource;

import com.shell.siep.gto.persistence.config.FPCConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class FPCDataSourceRouting extends AbstractRoutingDataSource {

    @Autowired
    private FPCConfig fpcConfig;

    @Override
    protected Object determineCurrentLookupKey() {
        return UserContextHolder.getUserContext();
    }

    public void initDataSource(DataSource defaultDataSource) {
        this.setTargetDataSources(new HashMap<>());
        this.setDefaultTargetDataSource(defaultDataSource);
    }

    public void checkDataSource(String username) {
        Map<Object, Object> fpcDataSourceMap = fpcConfig.getDataSourceMap();
        fpcDataSourceMap.computeIfAbsent(username, k -> fpcConfig.createNewDataSource(username));
        setTargetDataSources(fpcDataSourceMap);
        afterPropertiesSet();
    }
}
