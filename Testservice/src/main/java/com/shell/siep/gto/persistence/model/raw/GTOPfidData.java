package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTODatabaseObject;

public interface GTOPfidData extends GTODatabaseObject {
	public String getPfidDataJobId();
	public void setPfidDataJobId(String pfidDataJobId);
	public Double getPfidDataHydroCbnWt();
	public void setPfidDataHydroCbnWt(Double pfidDataHydroCbnWt);
	public Integer getPfidDataTemperature();
	public void setPfidDataTemperature(Integer pfidDataTemperature);
}
