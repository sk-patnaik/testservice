package com.shell.siep.gto.persistence.config;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.datasource.EntityManagerFactoryHolder;
import com.shell.siep.gto.persistence.datasource.FPCDataSourceRouting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ConditionalOnProperty(
        value = "datasource.fpc.enabled",
        havingValue = "true",
        matchIfMissing = false
)
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.shell.siep.gto.persistence.databases.fpc",
        entityManagerFactoryRef = "fpcEntityManager",
        transactionManagerRef = "fpcTransactionManager"
)
public class FPCConfig extends GTOConfig {

    private Map<Object, Object> dataSourceMap = new HashMap<>();

    private final Environment env;
    private final EntityManagerFactoryHolder entityManagerFactoryHolder;

    @Value("${datasource.fpc.url}")
    private String url;

    @Value("${datasource.fpc.username}")
    private String username;

    @Value("${datasource.fpc.password}")
    private String password;

    public FPCConfig(Environment env, EntityManagerFactoryHolder entityManagerFactoryHolder) {
        this.env = env;
        this.entityManagerFactoryHolder = entityManagerFactoryHolder;
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean fpcEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(fpcDataSource());
        em.setPackagesToScan("com.shell.siep.gto.persistence.databases.fpc.model");
        populateEntityManager(em, env);
        entityManagerFactoryHolder.setEntityManagerFactory(Database.FPC.getCode(), em);
        return em;
    }

    @Primary
    @Bean
    public DataSource fpcDataSource() {
        FPCDataSourceRouting routingDataSource = new FPCDataSourceRouting();
        DataSource defaultDataSource = createDataSource(url, env.getProperty(JDBC_DRIVER_CLASS_NAME), username, password, null);
        routingDataSource.initDataSource(defaultDataSource);
        return routingDataSource;
    }

    @Primary
    @Bean
    public PlatformTransactionManager fpcTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(fpcEntityManager().getObject());
        return transactionManager;
    }

    public DataSource createNewDataSource(String user) {
        return createDataSource(url, env.getProperty(JDBC_DRIVER_CLASS_NAME), username, password, user);
    }

    public Database getDatabase() {
        return Database.FPC;
    }

    public Map<Object, Object> getDataSourceMap() {
        return dataSourceMap;
    }

}

