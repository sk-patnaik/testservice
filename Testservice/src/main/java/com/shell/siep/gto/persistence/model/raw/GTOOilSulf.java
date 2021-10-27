package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOOilSulf extends GTOAnalysisData {
	public Date getSulfLastUpdate();
	public void setSulfLastUpdate(Date sulfLastUpdate);
	public String getSulfQc();
	public void setSulfQc(String sulfQc);
	public String getSulfComments();
	public void setSulfComments(String sulfComments);
	public Double getSul();
	public void setSul(Double sul);
	public String getSulfJobId();
	public void setSulfJobId(String sulfJobId);
	public String getSulfRunNumber();
	public void setSulfRunNumber(String sulfRunNumber);
	public Double getSulfConf();
	public void setSulfConf(Double sulfConf);
	public String getSulfMethod();
	public void setSulfMethod(String sulfMethod);
	public String getSulfValueQualifier();
	public void setSulfValueQualifier(String sulfValueQualifier);
	public String getSulfSvcCode();
	public void setSulfSvcCode(String sulfSvcCode);
	public Date getSulfAcqDate();
	public void setSulfAcqDate(Date sulfAcqDate);
	public Double getSulfValue();
	public void setSulfValue(Double sulfValue);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getSulfQcUser();
	public void setSulfQcUser(String sulfQcUser);
	public String getSulfIqmCode();
	public void setSulfIqmCode(String sulfIqmCode);
	public String getSulfAuthor();
	public void setSulfAuthor(String sulfAuthor);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getSulfLab();
	public void setSulfLab(String sulfLab);
	public String getSulfSampleIdVend();
	public void setSulfSampleIdVend(String sulfSampleIdVend);
	public Date getSulfQcDate();
	public void setSulfQcDate(Date sulfQcDate);
	public Double getSulfideValue();
	public void setSulfideValue(Double sulfideValue);
	public String getSulfRequestIdVend();
	public void setSulfRequestIdVend(String sulfRequestIdVend);
	public Integer getSulfUnits();
	public void setSulfUnits(Integer sulfUnits);
	public String getSulfQualifier();
	public void setSulfQualifier(String sulfQualifier);
	public String getSulfUpdatedUser();
	public void setSulfUpdatedUser(String sulfUpdatedUser);
	public Integer getSulfideUnits();
	public void setSulfideUnits(Integer sulfideUnits);
	public String getSulfideQualifier();
	public void setSulfideQualifier(String sulfideQualifier);
}
