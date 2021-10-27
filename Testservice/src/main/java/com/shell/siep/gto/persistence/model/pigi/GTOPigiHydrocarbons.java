package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;
import java.io.Serializable;

public interface GTOPigiHydrocarbons extends GTOAnalysisData, Serializable {
    Double getCo2AirFreeMol();
    Double getNitrogenAirFreeMol();
    Double getH2sAirFreeMol();
    Double getHydrogenAirFreeMol();
    Double getHeAirFreeMol();
    Double getMethaneAirFreeMol();
    Double getEthaneAirFreeMol();
    Double getPropainAirFreeMol();
    Double getIsoButaneAirFreeMol();
    Double getNormalButaneAirFreeMol();
    Double getC5FractionAirFreeMol();
    Double getIsoPentaneAirFreeMol();
    Double getNormalPentaneAirFreeMol();
    Double getC6FractionAirFreeMol();
    Double getSpecificGravity();
    Double getNickel();
    Double getVanadium();
    Double getSulphur();
    Double getWaxContent();
}
