package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOLiqOilinwater extends GTOAnalysisData {
	public Integer getOiwUnitsId();
	public void setOiwUnitsId(Integer oiwUnitsId);
	public String getOiwCreatedUser();
	public void setOiwCreatedUser(String oiwCreatedUser);
	public Date getOiwCreatedDate();
	public void setOiwCreatedDate(Date oiwCreatedDate);
	public String getOiwAroQ();
	public void setOiwAroQ(String oiwAroQ);
	public String getOiwRunNumber();
	public void setOiwRunNumber(String oiwRunNumber);
	public Integer getOiwLab();
	public void setOiwLab(Integer oiwLab);
	public Integer getOiwPk();
	public void setOiwPk(Integer oiwPk);
	public Integer getOiwAroUnitsId();
	public void setOiwAroUnitsId(Integer oiwAroUnitsId);
	public Date getOiwAcqDate();
	public void setOiwAcqDate(Date oiwAcqDate);
	public Integer getOiwMethodId();
	public void setOiwMethodId(Integer oiwMethodId);
	public String getOiwSampleIdVend();
	public void setOiwSampleIdVend(String oiwSampleIdVend);
	public Integer getOiwRecordTypeId();
	public void setOiwRecordTypeId(Integer oiwRecordTypeId);
	public Date getOiwUpdatedDate();
	public void setOiwUpdatedDate(Date oiwUpdatedDate);
	public String getOiwSvcCode();
	public void setOiwSvcCode(String oiwSvcCode);
	public Date getOiwQcDate();
	public void setOiwQcDate(Date oiwQcDate);
	public String getOiwValueQ();
	public void setOiwValueQ(String oiwValueQ);
	public String getOiwQcUser();
	public void setOiwQcUser(String oiwQcUser);
	public String getOiwRequestIdVend();
	public void setOiwRequestIdVend(String oiwRequestIdVend);
	public String getOiwComment();
	public void setOiwComment(String oiwComment);
	public Double getOiwAro();
	public void setOiwAro(Double oiwAro);
	public Double getOiwValue();
	public void setOiwValue(Double oiwValue);
	public String getRequestId();
	public void setRequestId(String requestId);
	public Integer getOiwConfTypeId();
	public void setOiwConfTypeId(Integer oiwConfTypeId);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getOiwUpdatedUser();
	public void setOiwUpdatedUser(String oiwUpdatedUser);
}
