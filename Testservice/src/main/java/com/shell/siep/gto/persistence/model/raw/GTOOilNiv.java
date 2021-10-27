package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOOilNiv extends GTOAnalysisData {
	public String getNivSampleIdVend();
	public void setNivSampleIdVend(String nivSampleIdVend);
	public Double getV();
	public void setV(Double v);
	public String getNivQcUser();
	public void setNivQcUser(String nivQcUser);
	public String getNivLab();
	public void setNivLab(String nivLab);
	public String getNiQ();
	public void setNiQ(String niQ);
	public Double getNiConf();
	public void setNiConf(Double niConf);
	public String getNivQc();
	public void setNivQc(String nivQc);
	public Date getNivAcqDate();
	public void setNivAcqDate(Date nivAcqDate);
	public String getNivJobId();
	public void setNivJobId(String nivJobId);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getNivAuthor();
	public void setNivAuthor(String nivAuthor);
	public String getNivComments();
	public void setNivComments(String nivComments);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getNivIqmCode();
	public void setNivIqmCode(String nivIqmCode);
	public String getNivMethod();
	public void setNivMethod(String nivMethod);
	public String getNiValueQualifier();
	public void setNiValueQualifier(String niValueQualifier);
	public Double getNi();
	public void setNi(Double ni);
	public Double getVa();
	public void setVa(Double va);
	public String getNivRunNumber();
	public void setNivRunNumber(String nivRunNumber);
	public Date getNivLastUpdate();
	public void setNivLastUpdate(Date nivLastUpdate);
	public String getNivSvcCode();
	public void setNivSvcCode(String nivSvcCode);
	public Double getVConf();
	public void setVConf(Double vConf);
	public Date getNivQcDate();
	public void setNivQcDate(Date nivQcDate);
	public String getVQ();
	public void setVQ(String vQ);
}
