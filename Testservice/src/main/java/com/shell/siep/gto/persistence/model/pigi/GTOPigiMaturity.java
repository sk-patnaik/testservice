package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.io.Serializable;
import java.util.Date;

public interface GTOPigiMaturity extends GTOAnalysisData, Serializable {

    Double getMeanValue();
    Double getStandardDeviation();
    Integer getNrObservations();
    String getVendor();
    Date getVendorDateOfService();

}
