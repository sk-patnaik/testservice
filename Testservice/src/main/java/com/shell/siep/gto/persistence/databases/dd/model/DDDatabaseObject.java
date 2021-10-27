package com.shell.siep.gto.persistence.databases.dd.model;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTODatabaseObject;

public abstract class DDDatabaseObject implements GTODatabaseObject {

	@Override
	public Database getDatabase() {
		 return Database.DD;
	}
}
