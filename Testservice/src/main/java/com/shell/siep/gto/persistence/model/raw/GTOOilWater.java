package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOOilWater extends GTOAnalysisData {
	public Date getH2oQcDate();
	public void setH2oQcDate(Date h2oQcDate);
	public Double getH2oConf();
	public void setH2oConf(Double h2oConf);
	public String getH2oIqmCode();
	public void setH2oIqmCode(String h2oIqmCode);
	public String getH2oValueQualifier();
	public void setH2oValueQualifier(String h2oValueQualifier);
	public String getH2oLab();
	public void setH2oLab(String h2oLab);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getH2oComments();
	public void setH2oComments(String h2oComments);
	public Double getH2oValue();
	public void setH2oValue(Double h2oValue);
	public String getH2oSampleIdVend();
	public void setH2oSampleIdVend(String h2oSampleIdVend);
	public String getH2oQc();
	public void setH2oQc(String h2oQc);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getH2oAuthor();
	public void setH2oAuthor(String h2oAuthor);
	public String getH2oMethod();
	public void setH2oMethod(String h2oMethod);
	public Date getH2oAcqDate();
	public void setH2oAcqDate(Date h2oAcqDate);
	public String getH2oSvcCode();
	public void setH2oSvcCode(String h2oSvcCode);
	public String getH2oQcUser();
	public void setH2oQcUser(String h2oQcUser);
	public String getH2oJobId();
	public void setH2oJobId(String h2oJobId);
	public String getH2oRunNumber();
	public void setH2oRunNumber(String h2oRunNumber);
	public Date getH2oLastUpdate();
	public void setH2oLastUpdate(Date h2oLastUpdate);
	public Integer getH2oUnits();
	public void setH2oUnits(Integer h2oUnits);
}
