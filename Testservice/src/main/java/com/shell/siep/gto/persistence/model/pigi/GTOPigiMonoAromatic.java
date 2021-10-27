package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.io.Serializable;

public interface GTOPigiMonoAromatic extends GTOAnalysisData, Serializable {
    Double getMaC27V20s();
    Double getMaC27I20s();
    Double getMaC28I20rC28V20r();
    Double getMaC29Ii20r();
    Double getMaC29I20rC29V20r();
    Double getMaC29I20sC29V20s();
    Double getMaC27I20rC27V20r();
    Double getMaC28I20s();
}
