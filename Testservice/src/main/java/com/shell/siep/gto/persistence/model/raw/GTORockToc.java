package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTORockToc extends GTOAnalysisData {
    public String getTocRunNumber();
    public void setTocRunNumber(String tocRunNumber);
    public Double getTocCarbonate();
    public void setTocCarbonate(Double tocCarbonate);
    public Date getTocLastUpdate();
    public void setTocLastUpdate(Date tocLastUpdate);
    public String getSampleId();
    public void setSampleId(String sampleId);
    public Double getTocConf();
    public void setTocConf(Double tocConf);
    public String getTocLab();
    public void setTocLab(String tocLab);
    public Double getToc();
    public void setToc(Double toc);
    public String getTocSvcCode();
    public void setTocSvcCode(String tocSvcCode);
    public Integer getTocPfUnits();
    public void setTocPfUnits(Integer tocPfUnits);
    public String getRequestId();
    public void setRequestId(String requestId);
    public String getTocSampleIdVend();
    public void setTocSampleIdVend(String tocSampleIdVend);
    public String getTocIqmCode();
    public void setTocIqmCode(String tocIqmCode);
    public Date getTocQcDate();
    public void setTocQcDate(Date tocQcDate);
    public Double getTocRal();
    public void setTocRal(Double tocRal);
    public String getTocJobId();
    public void setTocJobId(String tocJobId);
    public String getTocQc();
    public void setTocQc(String tocQc);
    public String getTocQcUser();
    public void setTocQcUser(String tocQcUser);
    public String getTocMethod();
    public void setTocMethod(String tocMethod);
    public String getTocAuthor();
    public void setTocAuthor(String tocAuthor);
    public String getTocComments();
    public void setTocComments(String tocComments);
    public Date getTocAcqDate();
    public void setTocAcqDate(Date tocAcqDate);
    public Integer getTocUom();
    public void setTocUom(Integer tocUom);
    public Integer getTocRecordType();
    public void setTocRecordType(Integer tocRecordType);
    public Integer getTocConfType();
    public void setTocConfType(Integer tocConfType);
    public Integer getTocPrep();
    public void setTocPrep(Integer tocPrep);
    public Integer getTocMethodNew();
    public void setTocMethodNew(Integer tocMethodNew);

}
