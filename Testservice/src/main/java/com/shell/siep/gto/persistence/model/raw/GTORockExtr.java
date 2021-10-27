package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTORockExtr extends GTOAnalysisData {
	public String getExRunNumber();
	public void setExRunNumber(String exRunNumber);
	public Integer getExSampleIdVend();
	public void setExSampleIdVend(Integer exSampleIdVend);
	public String getExQc();
	public void setExQc(String exQc);
	public String getExQcUser();
	public void setExQcUser(String exQcUser);
	public Double getExExWt();
	public void setExExWt(Double exExWt);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getExMethod();
	public void setExMethod(String exMethod);
	public String getExSvcCode();
	public void setExSvcCode(String exSvcCode);
	public Date getExQcDate();
	public void setExQcDate(Date exQcDate);
	public Date getExLastUpdate();
	public void setExLastUpdate(Date exLastUpdate);
	public Double getExRockWt();
	public void setExRockWt(Double exRockWt);
	public String getExIqmCode();
	public void setExIqmCode(String exIqmCode);
	public String getExAuthor();
	public void setExAuthor(String exAuthor);
	public String getExLab();
	public void setExLab(String exLab);
	public String getExJobId();
	public void setExJobId(String exJobId);
	public Double getExExPct();
	public void setExExPct(Double exExPct);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getExComments();
	public void setExComments(String exComments);
	public Date getExAcqDate();
	public void setExAcqDate(Date exAcqDate);
}
