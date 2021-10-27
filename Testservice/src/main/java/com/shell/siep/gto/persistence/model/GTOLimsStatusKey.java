package com.shell.siep.gto.persistence.model;

import java.io.Serializable;

public class GTOLimsStatusKey implements Serializable {

	private String measRequest;
	private String measSampleId;


	public GTOLimsStatusKey() {}
	public GTOLimsStatusKey(String measRequest, String measSampleId) {
		this.measRequest = measRequest;
		this.measSampleId = measSampleId;
	}

	public String getMeasRequest() {
		return measRequest;
	}

	public void setMeasRequest(String measRequest) {
		this.measRequest = measRequest;
	}

	public String getMeasSampleId() {
		return measSampleId;
	}

	public void setMeasSampleId(String measSampleId) {
		this.measSampleId = measSampleId;
	}
}
