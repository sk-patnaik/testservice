package com.shell.siep.gto.persistence.config;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.datasource.EntityManagerFactoryHolder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@ConditionalOnProperty(
        value = "datasource.tellus.enabled",
        havingValue = "true",
        matchIfMissing = false
)
@EnableJpaRepositories(
        basePackages = "com.shell.siep.gto.persistence.databases.tellus",
        entityManagerFactoryRef = "tellusEntityManager",
        transactionManagerRef = "tellusTransactionManager"
)

public class TellusConfig extends GTOConfig {
    private final Environment env;
    private final EntityManagerFactoryHolder entityManagerFactoryHolder;

    @Value("${datasource.tellus.username}")
    private String username;

    @Value("${datasource.tellus.password}")
    private String password;

    @Value("${datasource.tellus.url}")
    private String url;

    public TellusConfig(Environment env, EntityManagerFactoryHolder entityManagerFactoryHolder) {
        this.env = env;
        this.entityManagerFactoryHolder = entityManagerFactoryHolder;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean tellusEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(tellusDataSource());
        em.setPackagesToScan("com.shell.siep.gto.persistence.databases.tellus.model");
        populateEntityManager(em, env);
        entityManagerFactoryHolder.setEntityManagerFactory(Database.TELLUS.getCode(), em);
        return em;
    }

    @Bean
    public DataSource tellusDataSource() {
        return createDataSource(url, env.getProperty(JDBC_DRIVER_CLASS_NAME), username, password, null);
    }

    @Bean
    public PlatformTransactionManager tellusTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(tellusEntityManager().getObject());
        return transactionManager;
    }

    public Database getDatabase() {
        return Database.TELLUS;
    }


}

