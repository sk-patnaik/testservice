package com.shell.siep.gto.persistence.model;

import java.io.Serializable;
import java.util.Objects;

public class GTOAnalysisKey implements Serializable {

	private String requestId;
	private String sampleId;


	public GTOAnalysisKey() {}
	public GTOAnalysisKey(String requestId, String sampleId) {
		this.requestId = requestId;
		this.sampleId = sampleId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSampleId() {
		return sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GTOAnalysisKey that = (GTOAnalysisKey) o;
		return Objects.equals(requestId, that.requestId) &&
				Objects.equals(sampleId, that.sampleId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, sampleId);
	}
}
