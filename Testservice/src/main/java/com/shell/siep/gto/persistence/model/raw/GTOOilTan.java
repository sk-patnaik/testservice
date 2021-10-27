package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOOilTan extends GTOAnalysisData {
	public String getTanAuthor();
	public void setTanAuthor(String tanAuthor);
	public String getTanRunNumber();
	public void setTanRunNumber(String tanRunNumber);
	public String getTanIqmCode();
	public void setTanIqmCode(String tanIqmCode);
	public String getTanComments();
	public void setTanComments(String tanComments);
	public String getRequestId();
	public void setRequestId(String requestId);
	public Double getTanValue();
	public void setTanValue(Double tanValue);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getTanJobId();
	public void setTanJobId(String tanJobId);
	public String getTanSvcCode();
	public void setTanSvcCode(String tanSvcCode);
	public String getTanLab();
	public void setTanLab(String tanLab);
	public String getTanValueQualifier();
	public void setTanValueQualifier(String tanValueQualifier);
	public Date getTanQcDate();
	public void setTanQcDate(Date tanQcDate);
	public Date getTanLastUpdate();
	public void setTanLastUpdate(Date tanLastUpdate);
	public String getTanMethod();
	public void setTanMethod(String tanMethod);
	public String getTanQcUser();
	public void setTanQcUser(String tanQcUser);
	public String getTanUnits();
	public void setTanUnits(String tanUnits);
	public String getTanSampleIdVend();
	public void setTanSampleIdVend(String tanSampleIdVend);
	public Double getTanConf();
	public void setTanConf(Double tanConf);
	public Date getTanAcqDate();
	public void setTanAcqDate(Date tanAcqDate);
	public String getTanQc();
	public void setTanQc(String tanQc);
	public String getTanValueQual();
	public void setTanValueQual(String tanValueQual);
	public String getTanRequestIdVend();
	public void setTanRequestIdVend(String tanRequestIdVend);
}
