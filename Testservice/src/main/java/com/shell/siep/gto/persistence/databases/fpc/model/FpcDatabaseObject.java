package com.shell.siep.gto.persistence.databases.fpc.model;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTODatabaseObject;

public abstract class FpcDatabaseObject implements GTODatabaseObject {

	@Override
	public Database getDatabase() {
		 return Database.FPC;
	}
}
