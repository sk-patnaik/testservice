package com.shell.siep.gto.pigi.service;

import java.util.List;
import java.util.Map;

public class AnalysisResponse {
    private String status;
    private List<Map<String, String>> data;
    private Map<String, String> error;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Map<String, String>> getData() {
        return data;
    }

    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }

    public Map<String, String> getError() {
        return error;
    }

    public void setError(Map<String, String> error) {
        this.error = error;
    }
}
