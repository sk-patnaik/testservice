package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOPfidHeader extends GTOAnalysisData {
	public Integer getPfidDeltaT();
	public void setPfidDeltaT(Integer pfidDeltaT);
	public Date getPfidAcqDate();
	public void setPfidAcqDate(Date pfidAcqDate);
	public String getPfidQc();
	public void setPfidQc(String pfidQc);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getPfidJobVendor();
	public void setPfidJobVendor(String pfidJobVendor);
	public String getPfidHeaderQcUser();
	public void setPfidHeaderQcUser(String pfidHeaderQcUser);
	public Date getPfidHeaderQcDate();
	public void setPfidHeaderQcDate(Date pfidHeaderQcDate);
	public String getPfidSvcCode();
	public void setPfidSvcCode(String pfidSvcCode);
	public String getPfidHeaderQc();
	public void setPfidHeaderQc(String pfidHeaderQc);
	public String getRequestId();
	public void setRequestId(String requestId);
	public Date getPfidJobDate();
	public void setPfidJobDate(Date pfidJobDate);
	public Double getPfidFinWt();
	public void setPfidFinWt(Double pfidFinWt);
	public Integer getPfidUnit();
	public void setPfidUnit(Integer pfidUnit);
	public Date getPfidLastUpdate();
	public void setPfidLastUpdate(Date pfidLastUpdate);
	public String getPfidLabNum();
	public void setPfidLabNum(String pfidLabNum);
	public Double getPfidAshWt();
	public void setPfidAshWt(Double pfidAshWt);
	public String getPfidHeaderIqmCode();
	public void setPfidHeaderIqmCode(String pfidHeaderIqmCode);
	public String getPfidMeth();
	public void setPfidMeth(String pfidMeth);
	public String getPfidQcUser();
	public void setPfidQcUser(String pfidQcUser);
	public Integer getPfidStartT();
	public void setPfidStartT(Integer pfidStartT);
	public Date getPfidQcDate();
	public void setPfidQcDate(Date pfidQcDate);
	public String getPfidJobId();
	public void setPfidJobId(String pfidJobId);
	public String getPfidRunNumber();
	public void setPfidRunNumber(String pfidRunNumber);
	public Double getPfidIniWt();
	public void setPfidIniWt(Double pfidIniWt);
	public Integer getPfidPeakT();
	public void setPfidPeakT(Integer pfidPeakT);
}
