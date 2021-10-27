package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.io.Serializable;
import java.util.Date;

public interface GTOPigiPyrolysis extends GTOAnalysisData, Serializable {

    Double getFreeGas();
    Double getDistillableHC();
    Double getProlizableHC();
    Double getOrganicCO2();
    Integer getTmax();
    String getLaboratory();
    Date getAcquisitionDate();
    Double getHydrogen();
    Double getCarbon();
    Double getNitrogen();
    Double getSulphur();
    Double getOxygen();
}
