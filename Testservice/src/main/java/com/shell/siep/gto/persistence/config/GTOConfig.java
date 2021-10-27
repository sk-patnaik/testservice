package com.shell.siep.gto.persistence.config;

import com.shell.siep.gto.persistence.Database;
import oracle.jdbc.OracleConnection;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Properties;

public abstract class GTOConfig {

    protected static final String JDBC_DRIVER_CLASS_NAME = "jdbc.driverClassName";

    public abstract Database getDatabase();

    protected void populateEntityManager(LocalContainerEntityManagerFactoryBean em, Environment env) {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);
    }

    protected DataSource createDataSource(String url, String driver, String username, String password, String user) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        if (user != null) {
            Properties props = new Properties();
            props.put(OracleConnection.CONNECTION_PROPERTY_THIN_VSESSION_OSUSER, user);
            dataSource.setConnectionProperties(props);
        }

        return dataSource;
    }
}
