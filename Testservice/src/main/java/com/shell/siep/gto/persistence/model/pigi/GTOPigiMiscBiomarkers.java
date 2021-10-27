package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.io.Serializable;

public interface GTOPigiMiscBiomarkers extends GTOAnalysisData, Serializable {

    Double getDrimane();
    Double getBeyerane();
    Double getKaurane();
    Double getHdrimane();
    Double getRdrimane1();
    Double getRdrimane2();
    Double getDiamantane1m();
    Double getDiamantane4m();
    Double getDiamantane3m();
    Double getDiamantane();
    Double getBicadR();
    Double getBicadW();
    Double getBicadT();
    Double getIpimarane();
    Double getNtcyclane();
    Double getBcarot();
}
