package com.shell.siep.gto.persistence.model.pigi;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.io.Serializable;
import java.util.Date;

public interface GTOPigiBaseInfo extends GTOAnalysisData, Serializable {

    String getSampleVendor();
    Date getCollectionDate();
    String getBasinName();
    String getWellName();
    Double getLat();
    Double getLong();
    Double getTopDepth();
    Double getBaseDepth();
    Double getDerrickFloorElev();
    Double getWaterDepth();
    Double getTopDepthTVD();
    Double getBaseDepthTVD();
    String getSampleType();
    String getFormationTop();
    String getFormationBottom();
    String getLithology();
    String getCountry();
}
