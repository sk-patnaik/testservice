package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOOilBase extends GTOAnalysisData {
	public Double getBaseConf();
	public void setBaseConf(Double baseConf);
	public Date getBaseAcqDate();
	public void setBaseAcqDate(Date baseAcqDate);
	public String getBaseMethod();
	public void setBaseMethod(String baseMethod);
	public String getBaseHtQcUser();
	public void setBaseHtQcUser(String baseHtQcUser);
	public String getBaseComments();
	public void setBaseComments(String baseComments);
	public Date getBaseHtQcDate();
	public void setBaseHtQcDate(Date baseHtQcDate);
	public String getBaseLab();
	public void setBaseLab(String baseLab);
	public String getBaseRunNumber();
	public void setBaseRunNumber(String baseRunNumber);
	public String getBaseSampleIdVend();
	public void setBaseSampleIdVend(String baseSampleIdVend);
	public String getBaseSvcCode();
	public void setBaseSvcCode(String baseSvcCode);
	public String getBaseUnits();
	public void setBaseUnits(String baseUnits);
	public String getBaseHtIqmCode();
	public void setBaseHtIqmCode(String baseHtIqmCode);
	public String getBaseValueQualifier();
	public void setBaseValueQualifier(String baseValueQualifier);
	public String getBaseQc();
	public void setBaseQc(String baseQc);
	public String getBaseAuthor();
	public void setBaseAuthor(String baseAuthor);
	public Date getBaseLastUpdate();
	public void setBaseLastUpdate(Date baseLastUpdate);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public Double getBaseValue();
	public void setBaseValue(Double baseValue);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getBaseJobId();
	public void setBaseJobId(String baseJobId);
	public String getBaseRequestIdVend();
	public void setBaseRequestIdVend(String baseRequestIdVend);
	public String getBaseQcFlag();
	public void setBaseQcFlag(String baseQcFlag);
	public Date getBaseQcDate();
	public void setBaseQcDate(Date baseQcDate);
	public String getBaseIqmCode();
	public void setBaseIqmCode(String baseIqmCode);
	public String getBaseQcUser();
	public void setBaseQcUser(String baseQcUser);
}
