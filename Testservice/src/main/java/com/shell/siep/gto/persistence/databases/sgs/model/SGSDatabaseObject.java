package com.shell.siep.gto.persistence.databases.sgs.model;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTODatabaseObject;

public abstract class SGSDatabaseObject implements GTODatabaseObject {

	@Override
	public Database getDatabase() {
		 return Database.SGS;
	}
}
