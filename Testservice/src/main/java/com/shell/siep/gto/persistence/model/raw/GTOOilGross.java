package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOOilGross extends GTOAnalysisData {
	public Double getHetero();
	public void setHetero(Double hetero);
	public Double getGrossWlt();
	public void setGrossWlt(Double grossWlt);
	public String getGrossJobId();
	public void setGrossJobId(String grossJobId);
	public String getGrossQc();
	public void setGrossQc(String grossQc);
	public String getGrossRunNumber();
	public void setGrossRunNumber(String grossRunNumber);
	public Date getGrossQcDate();
	public void setGrossQcDate(Date grossQcDate);
	public String getGrossMethod();
	public void setGrossMethod(String grossMethod);
	public Double getRest();
	public void setRest(Double rest);
	public String getGrossSampleIdVend();
	public void setGrossSampleIdVend(String grossSampleIdVend);
	public String getGrossQcUser();
	public void setGrossQcUser(String grossQcUser);
	public Date getGrossAcqDate();
	public void setGrossAcqDate(Date grossAcqDate);
	public String getGrossComments();
	public void setGrossComments(String grossComments);
	public Double getGrossConf();
	public void setGrossConf(Double grossConf);
	public String getGrossIqmCode();
	public void setGrossIqmCode(String grossIqmCode);
	public String getGrossLab();
	public void setGrossLab(String grossLab);
	public Date getGrossLastUpdate();
	public void setGrossLastUpdate(Date grossLastUpdate);
	public String getGrossAuthor();
	public void setGrossAuthor(String grossAuthor);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getGrossSvcCode();
	public void setGrossSvcCode(String grossSvcCode);
	public Double getAro();
	public void setAro(Double aro);
	public Double getAsp();
	public void setAsp(Double asp);
	public Double getSat();
	public void setSat(Double sat);
}
