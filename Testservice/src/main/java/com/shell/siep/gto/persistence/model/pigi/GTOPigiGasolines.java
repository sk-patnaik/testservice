package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.io.Serializable;
import java.util.Date;

public interface GTOPigiGasolines extends GTOAnalysisData, Serializable {
    Double getX24dmp();
    Double getX223tmp();
    String getSampleId();
    Double getTol();
    Double getX2mh();
    Double getX3ep();
    Double getC5();
    Double getC6();
    Double getC7();
    Double getCh();
    Double getCp();
    Double getX3mh();
    Double getX3mp();
    String getG7Lab();
    Double getEcp();
    Double getX23dmb();
    Double getBenz();
    String getRequestId();
    Date getG7Date();
    Double getX22dmb();
    Double getX22dmp();
    Double getIc5();
    Double getIc4();
    Double getX11dmcp();
    Double getX1c3dmcp();
    Double getX1t3dmcp();
    Double getG7IstdConc();
    Double getX33dmp();
    Double getX1t2dmcp();
    Double getMch();
    Double getG7Istd();
    Double getMch1c2dmcp();
}
