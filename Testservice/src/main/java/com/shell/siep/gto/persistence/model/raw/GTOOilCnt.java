package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOOilCnt extends GTOAnalysisData {
    public String getCntMethod();
    public void setCntMethod(String cntMethod);
    public String getCntValueQualifier();
    public void setCntValueQualifier(String cntValueQualifier);
    public String getCntRunNumber();
    public void setCntRunNumber(String cntRunNumber);
    public String getRequestId();
    public void setRequestId(String requestId);
    public Date getCntLastUpdate();
    public void setCntLastUpdate(Date cntLastUpdate);
    public String getCntComments();
    public void setCntComments(String cntComments);
    public String getCntJobId();
    public void setCntJobId(String cntJobId);
    public Date getCntQcDate();
    public void setCntQcDate(Date cntQcDate);
    public String getCntName();
    public void setCntName(String cntName);
    public Date getCntAcqDate();
    public void setCntAcqDate(Date cntAcqDate);
    public String getCntSvcCode();
    public void setCntSvcCode(String cntSvcCode);
    public String getSampleId();
    public void setSampleId(String sampleId);
    public String getCntIqmCode();
    public void setCntIqmCode(String cntIqmCode);
    public String getCntQcUser();
    public void setCntQcUser(String cntQcUser);
    public String getCntSampleIdVend();
    public void setCntSampleIdVend(String cntSampleIdVend);
    public String getCntQc();
    public void setCntQc(String cntQc);
    public String getCntAuthor();
    public void setCntAuthor(String cntAuthor);
    public Double getCntPct();
    public void setCntPct(Double cntPct);
    public String getCntLab();
    public void setCntLab(String cntLab);
    public String getCntUpdatedUser();
    public void setCntUpdatedUser(String cntUpdatedUser);
    public String getCntRequestIdVendor();
    public void setCntRequestIdVendor(String cntRequestIdVendor);
}

