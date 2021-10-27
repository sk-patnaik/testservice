package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOOilNitrogen extends GTOAnalysisData {
	public Double getNitroConf();
	public void setNitroConf(Double nitroConf);
	public String getNitroSampleIdVend();
	public void setNitroSampleIdVend(String nitroSampleIdVend);
	public Date getNitroAcqDate();
	public void setNitroAcqDate(Date nitroAcqDate);
	public String getNitroQcUser();
	public void setNitroQcUser(String nitroQcUser);
	public String getNitroComments();
	public void setNitroComments(String nitroComments);
	public String getNitroMethod();
	public void setNitroMethod(String nitroMethod);
	public String getNitroJobId();
	public void setNitroJobId(String nitroJobId);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getNitroValueQualifier();
	public void setNitroValueQualifier(String nitroValueQualifier);
	public String getNitroQc();
	public void setNitroQc(String nitroQc);
	public String getNitroRunNumber();
	public void setNitroRunNumber(String nitroRunNumber);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getNitroIqmCode();
	public void setNitroIqmCode(String nitroIqmCode);
	public String getNitroAuthor();
	public void setNitroAuthor(String nitroAuthor);
	public Double getNitroValue();
	public void setNitroValue(Double nitroValue);
	public Date getNitroLastUpdate();
	public void setNitroLastUpdate(Date nitroLastUpdate);
	public String getNitroSvcCode();
	public void setNitroSvcCode(String nitroSvcCode);
	public Date getNitroQcDate();
	public void setNitroQcDate(Date nitroQcDate);
	public String getNitroLab();
	public void setNitroLab(String nitroLab);
	public String getNitroRequestIdVend();
	public void setNitroRequestIdVend(String nitroRequestIdVend);
}
