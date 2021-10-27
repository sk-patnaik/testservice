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
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ConditionalOnProperty(
        value = "datasource.dd.enabled",
        havingValue = "true",
        matchIfMissing = false
)
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.shell.siep.gto.persistence.databases.dd",
        entityManagerFactoryRef = "ddEntityManager",
        transactionManagerRef = "ddTransactionManager"
)

public class DDConfig extends GTOConfig {

    private final Environment env;
    private final EntityManagerFactoryHolder entityManagerFactoryHolder;

    @Value("${datasource.dd.username}")
    private String username;

    @Value("${datasource.dd.password}")
    private String password;

    @Value("${datasource.dd.url}")
    private String url;

    public DDConfig(Environment env, EntityManagerFactoryHolder entityManagerFactoryHolder) {
        this.env = env;
        this.entityManagerFactoryHolder = entityManagerFactoryHolder;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean ddEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(ddDataSource());
        em.setPackagesToScan("com.shell.siep.gto.persistence.databases.dd.model");
        populateEntityManager(em, env);
        entityManagerFactoryHolder.setEntityManagerFactory(Database.DD.getCode(), em);
        return em;
    }

    @Bean
    public DataSource ddDataSource() {
        return createDataSource(url, env.getProperty(JDBC_DRIVER_CLASS_NAME), username, password, null);
    }

    @Bean
    public PlatformTransactionManager ddTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(ddEntityManager().getObject());
        return transactionManager;
    }

    public Database getDatabase() {
        return Database.DD;
    }

}

