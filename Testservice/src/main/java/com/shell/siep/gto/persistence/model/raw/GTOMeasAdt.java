package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOMeasAdt extends GTOAnalysisData {
	public String getAdtUnits();
	public void setAdtUnits(String adtUnits);
	public String getAdtRequestIdVend();
	public void setAdtRequestIdVend(String adtRequestIdVend);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getAdtRunNumber();
	public void setAdtRunNumber(String adtRunNumber);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public Date getAdtDate();
	public void setAdtDate(Date adtDate);
	public String getAdtTempUnits();
	public void setAdtTempUnits(String adtTempUnits);
	public String getAdtSvcCode();
	public void setAdtSvcCode(String adtSvcCode);
	public Date getAdtCreatedDate();
	public void setAdtCreatedDate(Date adtCreatedDate);
	public String getAdtMethod();
	public void setAdtMethod(String adtMethod);
	public Double getAdtValue();
	public void setAdtValue(Double adtValue);
	public String getAdtIqmFlag();
	public void setAdtIqmFlag(String adtIqmFlag);
	public Double getAdtTemp();
	public void setAdtTemp(Double adtTemp);
	public String getAdtQcUser();
	public void setAdtQcUser(String adtQcUser);
	public String getAdtCreatedUser();
	public void setAdtCreatedUser(String adtCreatedUser);
	public String getAdtQual();
	public void setAdtQual(String adtQual);
	public String getAdtUpdatedUser();
	public void setAdtUpdatedUser(String adtUpdatedUser);
	public String getAdtLabref();
	public void setAdtLabref(String adtLabref);
	public String getAdtQcFlag();
	public void setAdtQcFlag(String adtQcFlag);
	public String getAdtComments();
	public void setAdtComments(String adtComments);
	public Date getAdtQcDate();
	public void setAdtQcDate(Date adtQcDate);
	public String getAdtLabrefPage();
	public void setAdtLabrefPage(String adtLabrefPage);
	public Date getAdtUpdatedDate();
	public void setAdtUpdatedDate(Date adtUpdatedDate);
	public String getAdtSampleIdVendor();
	public void setAdtSampleIdVendor(String adtSampleIdVendor);
	public Integer getAdtOpid();
	public void setAdtOpid(Integer adtOpid);
}
