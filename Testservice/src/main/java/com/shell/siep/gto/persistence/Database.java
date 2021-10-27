package com.shell.siep.gto.persistence;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

public enum Database {
	SGS("SGS", "Flow Assurance", "sgsTransactionManager", "sgsEntityManager"),
	FPC("FPC", "FPC", "fpcTransactionManager", "fpcEntityManager"),
	TELLUS("Tellus", "Tellus", "tellusTransactionManager", "tellusEntityManager"),
	BG("BG", "BG", "bgTransactionManager", "bgEntityManager"),
	DD("DD", "RWSH46DD", "ddTransactionManager", "ddEntityManager");

	private final String code;
	private final String name;
	private final String transactionManager;
	private final String entityManager;
	private boolean active = false;

	Database(String code, String name, String transactionManager, String entityManager) {
		this.code = code;
		this.name = name;
		this.transactionManager = transactionManager;
		this.entityManager = entityManager;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getTransactionManager() {
		return transactionManager;
	}

	public String getEntityManager() {
		return entityManager;
	}

	public boolean isActive() {
		return active;
	}

	void setActive(boolean status) {
		this.active = status;
	}

	public static Database getDatabase(String code) {
		for (Database db : Database.values()) {
			if (db.code.equalsIgnoreCase(code)) {
				return db;
			}
		}
		return null;
	}

	public static List<Database> getActiveDatabases(){
		return List.of(Database.values())
				.stream()
				.filter(Database :: isActive)
				.collect(Collectors.toList());
	}

	@Component
    public static class DatabaseActiveStatusInjector {
		private Environment env;

		public DatabaseActiveStatusInjector(Environment env) {
			this.env = env;
		}

        @PostConstruct
        public void setDatabaseStatusFromEnvironmentProperties() {

        	for(Database db: Database.values()) {
				db.setActive(Boolean.parseBoolean(env.getProperty("datasource."+db.getCode().toLowerCase()+".enabled")));
        	}
        }
    }
}
