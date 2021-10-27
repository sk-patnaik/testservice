package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.io.Serializable;

public interface GTOPigiTriAromatic extends GTOAnalysisData, Serializable {

    Double getTaC2820r();
    Double getTaC2620s();
    Double getTaC2620rC2720s();
    Double getTaC21();
    Double getTaC20();
    Double getTaC2920r();

}
