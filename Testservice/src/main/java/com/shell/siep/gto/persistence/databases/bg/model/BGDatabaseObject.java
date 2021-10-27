package com.shell.siep.gto.persistence.databases.bg.model;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTODatabaseObject;

public abstract class BGDatabaseObject implements GTODatabaseObject {

	@Override
	public Database getDatabase() {
		 return Database.BG;
	}
}
