package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOVrHeader extends GTOAnalysisData {
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getVrHistogram();
	public void setVrHistogram(String vrHistogram);
	public Double getVrMin();
	public void setVrMin(Double vrMin);
	public Double getVrMax();
	public void setVrMax(Double vrMax);
	public Date getVrLastUpdate();
	public void setVrLastUpdate(Date vrLastUpdate);
	public Integer getVrNrOb();
	public void setVrNrOb(Integer vrNrOb);
	public Double getVrInterval();
	public void setVrInterval(Double vrInterval);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getVrIqmCode();
	public void setVrIqmCode(String vrIqmCode);
	public String getVrMeth();
	public void setVrMeth(String vrMeth);
	public Double getVrTai();
	public void setVrTai(Double vrTai);
	public Date getVrQcDate();
	public void setVrQcDate(Date vrQcDate);
	public String getVrRunNumber();
	public void setVrRunNumber(String vrRunNumber);
	public String getVrLabNum();
	public void setVrLabNum(String vrLabNum);
	public Double getVrMean();
	public void setVrMean(Double vrMean);
	public String getVrQual();
	public void setVrQual(String vrQual);
	public String getVrSvcCode();
	public void setVrSvcCode(String vrSvcCode);
	public String getVrJobId();
	public void setVrJobId(String vrJobId);
	public String getVrComments();
	public void setVrComments(String vrComments);
	public String getVrQcUser();
	public void setVrQcUser(String vrQcUser);
	public Date getVrJobDate();
	public void setVrJobDate(Date vrJobDate);
	public Double getVrSt();
	public void setVrSt(Double vrSt);
	public String getVrQc();
	public void setVrQc(String vrQc);
	public String getVrJobVendor();
	public void setVrJobVendor(String vrJobVendor);
	public String getVrMaceral();
	public void setVrMaceral(String vrMaceral);
}
