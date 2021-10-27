package com.shell.siep.gto.persistence.model;

public interface GTOAnalysisData extends GTODatabaseObject {
    String getName();
    String getRequestId();
    void setRequestId(String requestId);
    String getSampleId();
    void setSampleId(String sampleId);
}
