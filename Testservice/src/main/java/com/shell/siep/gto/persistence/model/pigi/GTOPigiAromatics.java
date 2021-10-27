package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.io.Serializable;
import java.util.Date;

public interface GTOPigiAromatics extends GTOAnalysisData, Serializable {
    Double getMaNaph();
    Double getCad();
    Double getDmn15();
    Double getDbt();
    Double getBp();
    Double getMbp4();
    Double getMbp2();
    Double getMbp3();
    Double getBiphen2e();
    Double getBiphen3e();
    Double getBiphen4e();
    Double getDmn2627();
    Date getMaAcqDate();
    Double getMdbt23();
    Double getMdbt1();
    Double getMdbt4();
    Double getMn2();
    Double getMn1();
    String getMaLab();
    Double getPdp();
    Double getMp1();
    Double getMp2();
    Double getMp3();
    Double getMp9();
    Double getMaIstdConc();
    Double getRetene();


}
