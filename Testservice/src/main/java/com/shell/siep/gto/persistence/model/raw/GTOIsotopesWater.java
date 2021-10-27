package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOIsotopesWater extends GTOAnalysisData {
	public String getDWLab();
	public void setDWLab(String dWLab);
	public String getDWQc();
	public void setDWQc(String dWQc);
	public Double getDWOxy();
	public void setDWOxy(Double dWOxy);
	public Double getDWSulf();
	public void setDWSulf(Double dWSulf);
	public String getDWComment();
	public void setDWComment(String dWComment);
	public Double getDWStrConf();
	public void setDWStrConf(Double dWStrConf);
	public String getDWAuthor();
	public void setDWAuthor(String dWAuthor);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getDWJobId();
	public void setDWJobId(String dWJobId);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public Double getDWDue();
	public void setDWDue(Double dWDue);
	public Double getDWCar();
	public void setDWCar(Double dWCar);
	public Date getDWAcqDate();
	public void setDWAcqDate(Date dWAcqDate);
	public Integer getDWMethodId();
	public void setDWMethodId(Integer dWMethodId);
	public String getDWSvcCode();
	public void setDWSvcCode(String dWSvcCode);
	public String getDWDataType();
	public void setDWDataType(String dWDataType);
	public Date getDWDate();
	public void setDWDate(Date dWDate);
	public Double getDWBor();
	public void setDWBor(Double dWBor);
	public Double getDWStr();
	public void setDWStr(Double dWStr);
	public Date getDWLastUpdate();
	public void setDWLastUpdate(Date dWLastUpdate);
	public String getDWRunNumber();
	public void setDWRunNumber(String dWRunNumber);
	public String getDWSampleIdVend();
	public void setDWSampleIdVend(String dWSampleIdVend);
}
