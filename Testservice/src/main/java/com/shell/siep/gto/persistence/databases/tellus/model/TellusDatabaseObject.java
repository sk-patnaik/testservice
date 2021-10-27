package com.shell.siep.gto.persistence.databases.tellus.model;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTODatabaseObject;

public abstract class TellusDatabaseObject implements GTODatabaseObject {

	@Override
	public Database getDatabase() {
		 return Database.TELLUS;
	}
}
