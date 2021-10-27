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
        value = "datasource.sgs.enabled",
        havingValue = "true",
        matchIfMissing = false
)
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.shell.siep.gto.persistence.databases.sgs",
        entityManagerFactoryRef = "sgsEntityManager",
        transactionManagerRef = "sgsTransactionManager"
)

public class SGSConfig extends GTOConfig {

    private final Environment env;
    private final EntityManagerFactoryHolder entityManagerFactoryHolder;

    @Value("${datasource.sgs.url}")
    private String url;

    @Value("${datasource.sgs.username}")
    private String username;

    @Value("${datasource.sgs.password}")
    private String password;

    public SGSConfig(Environment env, EntityManagerFactoryHolder entityManagerFactoryHolder) {
        this.env = env;
        this.entityManagerFactoryHolder = entityManagerFactoryHolder;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean sgsEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(sgsDataSource());
        em.setPackagesToScan("com.shell.siep.gto.persistence.databases.sgs.model");
        populateEntityManager(em, env);
        entityManagerFactoryHolder.setEntityManagerFactory(Database.SGS.getCode(), em);
        return em;
    }

    @Bean
    public DataSource sgsDataSource() {
        return createDataSource(url, env.getProperty(JDBC_DRIVER_CLASS_NAME), username, password, null);
    }

    @Bean
    public PlatformTransactionManager sgsTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(sgsEntityManager().getObject());
        return transactionManager;
    }


    public Database getDatabase() {
        return Database.SGS;
    }


}

