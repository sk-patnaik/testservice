package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.io.Serializable;
import java.util.Date;

public interface GTOPigiExtract extends GTOAnalysisData, Serializable {

    Double getExExWt();
    String getExMethod();
    Double getExRockWt();
    String getExLab();
    Double getExExPct();
    Date getExAcqDate();
    Double getGrossWlt();
    Double getAro();
    Double getHetero();
    Double getAsp();
    Double getRest();
    Double getSat();
}
