package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTORockRoc extends GTOAnalysisData {
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getRocIqmCode();
	public void setRocIqmCode(String rocIqmCode);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getRocRunNumber();
	public void setRocRunNumber(String rocRunNumber);
	public String getRocAuthor();
	public void setRocAuthor(String rocAuthor);
	public String getRocQcUser();
	public void setRocQcUser(String rocQcUser);
	public String getRocJobId();
	public void setRocJobId(String rocJobId);
	public Date getRocQcDate();
	public void setRocQcDate(Date rocQcDate);
	public String getRocComments();
	public void setRocComments(String rocComments);
	public String getRocQc();
	public void setRocQc(String rocQc);
	public Date getRocAcqDate();
	public void setRocAcqDate(Date rocAcqDate);
	public Date getRocLastUpdate();
	public void setRocLastUpdate(Date rocLastUpdate);
	public String getRocMethod();
	public void setRocMethod(String rocMethod);
	public Double getRocConf();
	public void setRocConf(Double rocConf);
	public String getRocLab();
	public void setRocLab(String rocLab);
	public String getRocSampleIdVend();
	public void setRocSampleIdVend(String rocSampleIdVend);
	public String getRocSvcCode();
	public void setRocSvcCode(String rocSvcCode);
	public Double getRoc();
	public void setRoc(Double roc);
}
