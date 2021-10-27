package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;
import java.io.Serializable;
import java.util.Date;

public interface GTOPigiIsotopeParameters extends GTOAnalysisData, Serializable {
    Double getDcOOil();
    Double  getDcONso();
    Double  getDcOSat();
    Double  getDcOAro();
    Double  getDcOAsph();
    Double  getDdOWho();
    Double  getDsOWho();
    String getLab();
    Date getDoAcqDate();
    Double getDcRKer();
    Double getDcRCalcite();
    Double getDoRCalcite();
    Double getCsiaNc1();
    Double getCsiaNc2();
    Double getCsiaNc3();
    Double getCsiaNc4();
    Double getCsiaIc4();
    Double getDnGN2();
    Double getDdGNc1();
    Double getDsGH2s();
    Double getDcGCo2();
}
