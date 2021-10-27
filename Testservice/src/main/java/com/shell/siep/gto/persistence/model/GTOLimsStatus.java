package com.shell.siep.gto.persistence.model;

import java.util.Date;

public interface GTOLimsStatus extends GTODatabaseObject {
	String getMeasRequest();
	void setMeasRequest(String measRequest);
	Date getMeasLastUpdate();
	void setMeasLastUpdate(Date measLastUpdate);
	String getStat();
	void setStat(String stat);
	String getMeasSampleId();
	void setMeasSampleId(String measSampleId);
}
