package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOOilDens extends GTOAnalysisData {
	public String getDensMethod();
	public void setDensMethod(String densMethod);
	public Double getDensTemp();
	public void setDensTemp(Double densTemp);
	public String getDensJobId();
	public void setDensJobId(String densJobId);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getDensValueQualifier();
	public void setDensValueQualifier(String densValueQualifier);
	public Double getDensApi();
	public void setDensApi(Double densApi);
	public String getDensLab();
	public void setDensLab(String densLab);
	public String getDensQc();
	public void setDensQc(String densQc);
	public Double getDensDensity();
	public void setDensDensity(Double densDensity);
	public Date getDensQcDate();
	public void setDensQcDate(Date densQcDate);
	public String getDensTempUnits();
	public void setDensTempUnits(String densTempUnits);
	public Double getDensSpGr();
	public void setDensSpGr(Double densSpGr);
	public Date getDensLastUpdate();
	public void setDensLastUpdate(Date densLastUpdate);
	public String getDensSvcCode();
	public void setDensSvcCode(String densSvcCode);
	public String getDensRunNumber();
	public void setDensRunNumber(String densRunNumber);
	public String getDensSampleIdVend();
	public void setDensSampleIdVend(String densSampleIdVend);
	public String getDensQcUser();
	public void setDensQcUser(String densQcUser);
	public String getDensIqmCode();
	public void setDensIqmCode(String densIqmCode);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getDensAuthor();
	public void setDensAuthor(String densAuthor);
	public Double getApi();
	public void setApi(Double api);
	public Double getDensConf();
	public void setDensConf(Double densConf);
	public Date getDensAcqDate();
	public void setDensAcqDate(Date densAcqDate);
	public String getDensComments();
	public void setDensComments(String densComments);
	public String getName();
}
