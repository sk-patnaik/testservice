package com.shell.siep.gto.pigi.service;

import com.shell.siep.gto.security.pojos.AuthKeyRequestBean;

import java.util.List;

public class AnalysisRequest extends AuthKeyRequestBean {

    public AnalysisRequest() {
    }

    public AnalysisRequest(List<String> databases, List<String> sampleIds, List<String> analysisNames) {
        this.databases = databases;
        this.sampleIds = sampleIds;
        this.analysisNames = analysisNames;
    }

    private List<String> databases;
    private List<String> sampleIds;
    private List<String> analysisNames;

    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    public List<String> getSampleIds() {
        return sampleIds;
    }

    public void setSampleIds(List<String> sampleIds) {
        this.sampleIds = sampleIds;
    }

    public List<String> getAnalysisNames() {
        return analysisNames;
    }

    public void setAnalysisNames(List<String> analysisNames) {
        this.analysisNames = analysisNames;
    }
}
