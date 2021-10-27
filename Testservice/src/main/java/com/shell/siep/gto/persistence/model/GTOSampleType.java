package com.shell.siep.gto.persistence.model;


public interface GTOSampleType extends GTODatabaseObject {
    String getSampleType();
	Integer getTypeId();
	Integer getTypeLevel();
	String getParent();
	Boolean getAvail();
}
