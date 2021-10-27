package com.shell.siep.gto.commons;

import com.shell.siep.gto.persistence.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Startup {

    private static final Logger logger = LoggerFactory.getLogger(Startup.class);

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        logger.info("Start up  Properties");
        logger.info("User: {}", System.getProperties().getProperty("user.name"));
        logger.info("Active Databases: {}", Database.getActiveDatabases());
    }

}

