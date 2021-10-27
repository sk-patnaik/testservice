package com.shell.siep.gto.vo.response;

public class AnalysisResponse {
    private String db;
    private String sampleId;
    private String requestId;
    private String analysisName;
    private Object analysisData;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getAnalysisName() {
        return analysisName;
    }

    public void setAnalysisName(String analysisName) {
        this.analysisName = analysisName;
    }

    public Object getAnalysisData() {
        return analysisData;
    }

    public void setAnalysisData(Object analysisData) {
        this.analysisData = analysisData;
    }
}
