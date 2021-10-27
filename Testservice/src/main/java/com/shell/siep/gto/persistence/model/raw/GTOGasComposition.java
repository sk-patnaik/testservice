package com.shell.siep.gto.persistence.model.raw;

import com.shell.siep.gto.persistence.model.GTOAnalysisData;

import java.util.Date;

public interface GTOGasComposition extends GTOAnalysisData {
	public Integer getGasUnitsId();
	public void setGasUnitsId(Integer gasUnitsId);
	public Integer getGasMethodId();
	public void setGasMethodId(Integer gasMethodId);
	public Integer getGasBtu();
	public void setGasBtu(Integer gasBtu);
	public Date getGasLastUpdate();
	public void setGasLastUpdate(Date gasLastUpdate);
	public Double getGasSo2();
	public void setGasSo2(Double gasSo2);
	public Double getC3Unsat();
	public void setC3Unsat(Double c3Unsat);
	public String getGasMethod();
	public void setGasMethod(String gasMethod);
	public String getGasSampleIdVend();
	public void setGasSampleIdVend(String gasSampleIdVend);
	public Date getGasAcqDate();
	public void setGasAcqDate(Date gasAcqDate);
	public String getGasRigUnit();
	public void setGasRigUnit(String gasRigUnit);
	public String getRequestId();
	public void setRequestId(String requestId);
	public Double getGasNeoc5();
	public void setGasNeoc5(Double gasNeoc5);
	public String getGasJobId();
	public void setGasJobId(String gasJobId);
	public Double getC5Unsat();
	public void setC5Unsat(Double c5Unsat);
	public Double getGasBar();
	public void setGasBar(Double gasBar);
	public Double getGasTotalConcentration();
	public void setGasTotalConcentration(Double gasTotalConcentration);
	public Integer getGasTotalConcUnitsId();
	public void setGasTotalConcUnitsId(Integer gasTotalConcUnitsId);
	public Double getGasNc5();
	public void setGasNc5(Double gasNc5);
	public Double getGasNc4();
	public void setGasNc4(Double gasNc4);
	public String getGasAuthor();
	public void setGasAuthor(String gasAuthor);
	public Double getGasAir();
	public void setGasAir(Double gasAir);
	public String getSampleId();
	public void setSampleId(String sampleId);
	public Date getGasQcDate();
	public void setGasQcDate(Date gasQcDate);
	public String getGasSvcCode();
	public void setGasSvcCode(String gasSvcCode);
	public Double getGasN2();
	public void setGasN2(Double gasN2);
	public Double getGasConf();
	public void setGasConf(Double gasConf);
	public Double getGasIc5();
	public void setGasIc5(Double gasIc5);
	public Double getGasIc4();
	public void setGasIc4(Double gasIc4);
	public Double getGasHe();
	public void setGasHe(Double gasHe);
	public Double getC4Unsat();
	public void setC4Unsat(Double c4Unsat);
	public Double getGasH2();
	public void setGasH2(Double gasH2);
	public String getGasComments();
	public void setGasComments(String gasComments);
	public String getGasQc();
	public void setGasQc(String gasQc);
	public Double getGasO2();
	public void setGasO2(Double gasO2);
	public String getGasQcUser();
	public void setGasQcUser(String gasQcUser);
	public String getGasRunNumber();
	public void setGasRunNumber(String gasRunNumber);
	public Double getGasNc5Plus();
	public void setGasNc5Plus(Double gasNc5Plus);
	public Double getGasTol();
	public void setGasTol(Double gasTol);
	public Double getGasCo2();
	public void setGasCo2(Double gasCo2);
	public Double getC2Unsat();
	public void setC2Unsat(Double c2Unsat);
	public String getGasLab();
	public void setGasLab(String gasLab);
	public Double getGasTemp();
	public void setGasTemp(Double gasTemp);
	public Double getGasH2s();
	public void setGasH2s(Double gasH2s);
	public Double getGasSpGr();
	public void setGasSpGr(Double gasSpGr);
	public Double getGasC6plus();
	public void setGasC6plus(Double gasC6plus);
	public Double getGasO2ar();
	public void setGasO2ar(Double gasO2ar);
	public String getGasIqmCode();
	public void setGasIqmCode(String gasIqmCode);
	public Double getGasCo();
	public void setGasCo(Double gasCo);
	public Double getGasC3();
	public void setGasC3(Double gasC3);
	public Double getGasC2();
	public void setGasC2(Double gasC2);
	public Double getGasC1();
	public void setGasC1(Double gasC1);
	public Double getGasBz();
	public void setGasBz(Double gasBz);
	public Double getGasAr();
	public void setGasAr(Double gasAr);
	public Double getGasC10Plus();
	public void setGasC10Plus(Double gasC10Plus);
	public Double getGasC12();
	public void setGasC12(Double gasC12);
	public Double getGasC11();
	public void setGasC11(Double gasC11);
	public Double getGasC10();
	public void setGasC10(Double gasC10);
	public String getGasUnits();
	public void setGasUnits(String gasUnits);
	public Double getGasC2Plus();
	public void setGasC2Plus(Double gasC2Plus);
	public String getGasSiteId();
	public void setGasSiteId(String gasSiteId);
	public String getGasOwner();
	public void setGasOwner(String gasOwner);
	public Double getGasC12Plus();
	public void setGasC12Plus(Double gasC12Plus);
	public Double getGasNc7Plus();
	public void setGasNc7Plus(Double gasNc7Plus);
	public Double getGasC13Plus();
	public void setGasC13Plus(Double gasC13Plus);
	public Double getGasC8();
	public void setGasC8(Double gasC8);
	public Double getGasC7();
	public void setGasC7(Double gasC7);
	public Double getGasC9();
	public void setGasC9(Double gasC9);
	public Integer getGasRecordType();
	public void setGasRecordType(Integer gasRecordType);
	public Integer getGasUom();
	public void setGasUom(Integer gasUom);
	public Integer getGasType();
	public void setGasType(Integer gasType);
	public Integer getGasTotalConcUnits();
	public void setGasTotalConcUnits(Integer gasTotalConcUnits);
	public String getGasMethodOld();
	public void setGasMethodOld(String gasMethodOld);
}
