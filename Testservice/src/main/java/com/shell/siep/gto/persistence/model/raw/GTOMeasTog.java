package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOMeasTog extends GTOAnalysisData {
	public String getTogQcUser();
	public void setTogQcUser(String togQcUser);
	public String getTogUpdatedUser();
	public void setTogUpdatedUser(String togUpdatedUser);
	public String getWaterTogComment();
	public void setWaterTogComment(String waterTogComment);
	public Double getTogConf();
	public void setTogConf(Double togConf);
	public Date getTogDate();
	public void setTogDate(Date togDate);
	public Integer getTogUnits();
	public void setTogUnits(Integer togUnits);
	public Integer getTogMethod();
	public void setTogMethod(Integer togMethod);
	public Integer getWaterTogMethod();
	public void setWaterTogMethod(Integer waterTogMethod);
	public String getWaterTogQc();
	public void setWaterTogQc(String waterTogQc);
	public String getTogCreatedUser();
	public void setTogCreatedUser(String togCreatedUser);
	public Date getWaterTogDate();
	public void setWaterTogDate(Date waterTogDate);
	public Double getWaterTogConf();
	public void setWaterTogConf(Double waterTogConf);
	public String getTogLab();
	public void setTogLab(String togLab);
	public Date getTogCreatedDate();
	public void setTogCreatedDate(Date togCreatedDate);
	public Double getWaterTogValue();
	public void setWaterTogValue(Double waterTogValue);
	public String getTogComment();
	public void setTogComment(String togComment);
	public String getWaterTogLab();
	public void setWaterTogLab(String waterTogLab);
	public Double getTogValue();
	public void setTogValue(Double togValue);
	public String getRequestId();
	public void setRequestId(String requestId);
	public String getWaterTogAuthor();
	public void setWaterTogAuthor(String waterTogAuthor);
	public String getTogSampleIdVend();
	public void setTogSampleIdVend(String togSampleIdVend);
	public String getTogRequestIdVend();
	public void setTogRequestIdVend(String togRequestIdVend);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public String getTogQc();
	public void setTogQc(String togQc);
	public String getTogRunNumber();
	public void setTogRunNumber(String togRunNumber);
	public String getTogSvcCode();
	public void setTogSvcCode(String togSvcCode);
	public Date getTogUpdatedDate();
	public void setTogUpdatedDate(Date togUpdatedDate);
	public Date getTogQcDate();
	public void setTogQcDate(Date togQcDate);
	public Integer getWaterTogUnits();
	public void setWaterTogUnits(Integer waterTogUnits);
	public String getTogAuthor();
	public void setTogAuthor(String togAuthor);
}
