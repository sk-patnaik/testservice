package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOIsotopesGas;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ISOTOPES_GAS", schema="gfs")
public class FpcIsotopesGas extends FpcDatabaseObject implements GTOIsotopesGas, Serializable {

	@Column(name = "DD_NC17_Q")
	private String ddGNc17Q;

	@Column(name = "D_G_QC")
	private String dGQc;

	@Column(name = "DC_G_GAS")
	private Double dcGGas;

	@Column(name = "DO_G_CO2")
	private Double doGCo2;

	@Column(name = "DC_NC1_Q")
	private String csiaNc1Q;

	@Column(name = "DD_G_NC2_Q")
	private String ddGNc2Q;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "DC_ETHENE_Q")
	private String csiaEtheneQ;

	@Column(name = "DC_NC15_Q")
	private String csiaNc15Q;

	@Column(name = "D_G_DATA_TYPE")
	private String dGDataType;

	@Column(name = "DC_NC28_Q")
	private String csiaNc28Q;

	@Column(name = "DD_NC29_Q")
	private String ddGNc29Q;

	@Column(name = "DD_NC16_Q")
	private String ddGNc16Q;

	@Column(name = "DN_G_N2_Q")
	private String dnGN2Q;

	@Column(name = "DC_G_PH")
	private Double csiaPh;

	@Column(name = "DC_G_PR")
	private Double csiaPr;

	@Column(name = "DC_NC14_Q")
	private String csiaNc14Q;

	@Column(name = "DC_NC27_Q")
	private String csiaNc27Q;

	@Column(name = "DD_NC15_Q")
	private String ddGNc15Q;

	@Column(name = "DD_G_NC1_Q")
	private String ddGNc1Q;

	@Column(name = "DD_NC28_Q")
	private String ddGNc28Q;

	@Column(name = "DS_G_H2S_Q")
	private String dsGH2sQ;

	@Column(name = "DC_IC13_Q")
	private String csiaIc13Q;

	@Column(name = "DC_NC4_Q")
	private String csiaNc4Q;

	@Column(name = "RUN_NUMBER")
	private String dGRunNumber;

	@Column(name = "DC_IC14_Q")
	private String csiaIc14Q;

	@Column(name = "DD_G_NC4_Q")
	private String ddGNc4Q;

	@Column(name = "D_G_LAB")
	private String dGLab;

	@Column(name = "DC_NC13_Q")
	private String csiaNc13Q;

	@Column(name = "DD_NC14_Q")
	private String ddGNc14Q;

	@Column(name = "DC_NC26_Q")
	private String csiaNc26Q;

	@Column(name = "DD_NC27_Q")
	private String ddGNc27Q;

	@Column(name = "DC_NC2_Q")
	private String csiaNc2Q;

	@Column(name = "DD_G_NC3_Q")
	private String ddGNc3Q;

	@Column(name = "DC_NC3_Q")
	private String csiaNc3Q;

	@Column(name = "DC_NC25_Q")
	private String csiaNc25Q;

	@Column(name = "DC_NC12_Q")
	private String csiaNc12Q;

	@Column(name = "DD_NC26_Q")
	private String ddGNc26Q;

	@Column(name = "D_G_AUTHOR")
	private String dGAuthor;

	@Column(name = "DD_NC13_Q")
	private String ddGNc13Q;

	@Column(name = "D_G_METHOD")
	private String dGMethod;

	@Column(name = "DC_PR_Q")
	private String csiaPrQ;

	@Column(name = "DD_G_NC6_Q")
	private String ddGNc6Q;

	@Column(name = "DC_NC11_Q")
	private String csiaNc11Q;

	@Column(name = "DD_NC30_Q")
	private String ddGNc30Q;

	@Column(name = "DD_G_IC4")
	private Double ddGIc4;

	@Column(name = "DC_NC24_Q")
	private String csiaNc24Q;

	@Column(name = "DD_G_IC5")
	private Double ddGIc5;

	@Column(name = "DC_NC23_Q")
	private String csiaNc23Q;

	@Column(name = "DC_NC10_Q")
	private String csiaNc10Q;

	@Column(name = "DD_G_NC5_Q")
	private String ddGNc5Q;

	@Column(name = "DD_NC19_Q")
	private String ddGNc19Q;

	@Column(name = "DD_G_IC5_Q")
	private String ddGIc5Q;

	@Column(name = "DO_G_CO_Q")
	private String doGCoQ;

	@Column(name = "DD_G_GAS")
	private Double ddGGas;

	@Column(name = "DC_PROPENE_Q")
	private String csiaPropeneQ;

	@Column(name = "DC_NC21_Q")
	private String csiaNc21Q;

	@Column(name = "DD_NC8_Q")
	private String ddGNc8Q;

	@Column(name = "DC_G_PROPENE")
	private Double csiaPropene;

	@Column(name = "DC_NC35_Q")
	private String csiaNc35Q;

	@Column(name = "DC_NC22_Q")
	private String csiaNc22Q;

	@Column(name = "DC_G_NC2")
	private Double csiaNc2;

	@Column(name = "DC_G_NC3")
	private Double csiaNc3;

	@Column(name = "DC_G_NC1")
	private Double csiaNc1;

	@Column(name = "DC_G_NC8")
	private Double csiaNc8;

	@Column(name = "DC_G_NC9")
	private Double csiaNc9;

	@Column(name = "DC_G_NC6")
	private Double csiaNc6;

	@Column(name = "DC_G_NC7")
	private Double csiaNc7;

	@Column(name = "DC_G_NC4")
	private Double csiaNc4;

	@Column(name = "DC_G_NC5")
	private Double csiaNc5;

	@Column(name = "DD_NC18_Q")
	private String ddGNc18Q;

	@Column(name = "QC_USER")
	private String dGHtQcUser;

	@Column(name = "DD_G_IC4_Q")
	private String ddGIc4Q;

	@Column(name = "DC_NC20_Q")
	private String csiaNc20Q;

	@Column(name = "DC_NC34_Q")
	private String csiaNc34Q;

	@Column(name = "DO_G_CO2_Q")
	private String doGCo2Q;

	@Column(name = "DD_G_H2S")
	private Double ddGH2s;

	@Column(name = "DC_G_CO2")
	private Double dcGCo2;

	@Column(name = "DC_G_CO_Q")
	private String dcGCoQ;

	@Column(name = "DC_G_CO")
	private Double dcGCo;

	@Column(name = "QC_DATE")
	private Date dGHtQcDate;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer dGRecordType;

	@Column(name = "FK_DATATYPE_ID")
	private Integer dGCalibration;

	@Column(name = "DC_NC32_Q")
	private String csiaNc32Q;

	@Column(name = "DD_NC21_Q")
	private String ddGNc21Q;

	@Column(name = "DC_NC33_Q")
	private String csiaNc33Q;

	@Column(name = "FK_METHOD_ID")
	private Integer dGMethodNew;

	@Column(name = "DD_NC34_Q")
	private String ddGNc34Q;

	@Column(name = "SVC_CODE")
	private String dGSvcCode;

	@Column(name = "JOB_ID")
	private String dGJobId;

	@Column(name = "DD_NC9_Q")
	private String ddGNc9Q;

	@Column(name = "DC_NC31_Q")
	private String csiaNc31Q;

	@Column(name = "DC_G_CO2_Q")
	private String dcGCo2Q;

	@Column(name = "DD_NC33_Q")
	private String ddGNc33Q;

	@Column(name = "DD_NC20_Q")
	private String ddGNc20Q;

	@Column(name = "DD_G_NC4")
	private Double ddGNc4;

	@Column(name = "DD_G_NC5")
	private Double ddGNc5;

	@Column(name = "DD_G_NC6")
	private Double ddGNc6;

	@Column(name = "DD_G_NC8")
	private Double ddGNc8;

	@Column(name = "DD_G_NC9")
	private Double ddGNc9;

	@Column(name = "DD_G_NC1")
	private Double ddGNc1;

	@Column(name = "DD_G_NC2")
	private Double ddGNc2;

	@Column(name = "DD_G_NC3")
	private Double ddGNc3;

	@Column(name = "DC_NC9_Q")
	private String csiaNc9Q;

	@Column(name = "DC_NC30_Q")
	private String csiaNc30Q;

	@Column(name = "DS_G_H2S")
	private Double dsGH2s;

	@Column(name = "DD_NC32_Q")
	private String ddGNc32Q;

	@Column(name = "DD_G_H2_Q")
	private String ddGH2Q;

	@Column(name = "DC_G_NC29")
	private Double csiaNc29;

	@Column(name = "DC_G_NC28")
	private Double csiaNc28;

	@Column(name = "DC_G_NC27")
	private Double csiaNc27;

	@Column(name = "DC_G_NC26")
	private Double csiaNc26;

	@Column(name = "DC_G_NC21")
	private Double csiaNc21;

	@Column(name = "DC_G_NC20")
	private Double csiaNc20;

	@Column(name = "DC_G_NC25")
	private Double csiaNc25;

	@Column(name = "DC_G_NC24")
	private Double csiaNc24;

	@Column(name = "DC_G_NC23")
	private Double csiaNc23;

	@Column(name = "DC_G_NC22")
	private Double csiaNc22;

	@Column(name = "DC_G_NC32")
	private Double csiaNc32;

	@Column(name = "DC_G_NC31")
	private Double csiaNc31;

	@Column(name = "DC_G_NC30")
	private Double csiaNc30;

	@Column(name = "DC_G_NC35")
	private Double csiaNc35;

	@Column(name = "DC_G_NC34")
	private Double csiaNc34;

	@Column(name = "DC_G_NC33")
	private Double csiaNc33;

	@Column(name = "DC_G_NC18")
	private Double csiaNc18;

	@Column(name = "DC_G_NC17")
	private Double csiaNc17;

	@Column(name = "DC_G_NC16")
	private Double csiaNc16;

	@Column(name = "DC_G_NC15")
	private Double csiaNc15;

	@Column(name = "DC_G_NC19")
	private Double csiaNc19;

	@Column(name = "DC_G_NC10")
	private Double csiaNc10;

	@Column(name = "DC_G_NC14")
	private Double csiaNc14;

	@Column(name = "DC_G_NC13")
	private Double csiaNc13;

	@Column(name = "DC_G_NC12")
	private Double csiaNc12;

	@Column(name = "DC_G_NC11")
	private Double csiaNc11;

	@Column(name = "LAST_UPDATE")
	private Date dGLastUpdate;

	@Column(name = "DC_G_IC18")
	private Double csiaIc18;

	@Column(name = "DC_G_IC13")
	private Double csiaIc13;

	@Column(name = "DC_G_IC15")
	private Double csiaIc15;

	@Column(name = "DC_G_IC14")
	private Double csiaIc14;

	@Column(name = "DC_G_IC16")
	private Double csiaIc16;

	@Column(name = "DC_G_IC5")
	private Double csiaIc5;

	@Column(name = "DC_G_IC4")
	private Double csiaIc4;

	@Column(name = "FK_UNITS_ID")
	private Integer dGUom;

	@Column(name = "DD_NC31_Q")
	private String ddGNc31Q;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "DC_NC19_Q")
	private String csiaNc19Q;

	@Column(name = "DC_G_ETHENE")
	private Double csiaEthene;

	@Column(name = "DC_NEOC5_Q")
	private String csiaNeoc5Q;

	@Column(name = "DD_G_NC33")
	private Double ddGNc33;

	@Column(name = "DD_G_NC34")
	private Double ddGNc34;

	@Column(name = "DD_G_NC35")
	private Double ddGNc35;

	@Column(name = "DD_G_NC30")
	private Double ddGNc30;

	@Column(name = "DD_G_NC31")
	private Double ddGNc31;

	@Column(name = "DD_G_NC32")
	private Double ddGNc32;

	@Column(name = "DD_G_NC26")
	private Double ddGNc26;

	@Column(name = "DD_G_NC27")
	private Double ddGNc27;

	@Column(name = "DD_G_NC28")
	private Double ddGNc28;

	@Column(name = "DD_G_NC29")
	private Double ddGNc29;

	@Column(name = "DD_G_GAS_Q")
	private String ddGGasQ;

	@Column(name = "DD_G_NC22")
	private Double ddGNc22;

	@Column(name = "DD_G_NC23")
	private Double ddGNc23;

	@Column(name = "DD_G_NC24")
	private Double ddGNc24;

	@Column(name = "DD_G_NC25")
	private Double ddGNc25;

	@Column(name = "DD_G_NC20")
	private Double ddGNc20;

	@Column(name = "DD_G_NC21")
	private Double ddGNc21;

	@Column(name = "DD_G_NC19")
	private Double ddGNc19;

	@Column(name = "DD_G_NC15")
	private Double ddGNc15;

	@Column(name = "DD_G_NC16")
	private Double ddGNc16;

	@Column(name = "DD_G_NC17")
	private Double ddGNc17;

	@Column(name = "DD_G_NC18")
	private Double ddGNc18;

	@Column(name = "DD_G_NC11")
	private Double ddGNc11;

	@Column(name = "DD_G_NC12")
	private Double ddGNc12;

	@Column(name = "DD_G_NC13")
	private Double ddGNc13;

	@Column(name = "DD_G_NC14")
	private Double ddGNc14;

	@Column(name = "DD_G_NC10")
	private Double ddGNc10;

	@Column(name = "DC_IC16_Q")
	private String csiaIc16Q;

	@Column(name = "CONC_C1")
	private Double csiaConcC1;

	@Column(name = "DC_NC6_Q")
	private String csiaNc6Q;

	@Column(name = "DD_G_H2")
	private Double ddGH2;

	@Column(name = "DD_NC25_Q")
	private String ddGNc25Q;

	@Column(name = "DD_NC12_Q")
	private String ddGNc12Q;

	@Column(name = "DC_PH_Q")
	private String csiaPhQ;

	@Column(name = "DC_IC15_Q")
	private String csiaIc15Q;

	@Column(name = "DC_NC5_Q")
	private String csiaNc5Q;

	@Column(name = "DD_NC11_Q")
	private String ddGNc11Q;

	@Column(name = "DC_NC18_Q")
	private String csiaNc18Q;

	@Column(name = "DC_CONC_C1_Q")
	private String csiaConcC1Q;

	@Column(name = "DD_NC24_Q")
	private String ddGNc24Q;

	@Column(name = "DC_IC5_Q")
	private String csiaIc5Q;

	@Column(name = "DD_NC10_Q")
	private String ddGNc10Q;

	@Column(name = "SAMPLE_ID_VEND")
	private String dGSampleIdVend;

	@Column(name = "DC_NC8_Q")
	private String csiaNc8Q;

	@Column(name = "DD_NC23_Q")
	private String ddGNc23Q;

	@Column(name = "DC_IC18_Q")
	private String csiaIc18Q;

	@Column(name = "DC_NC17_Q")
	private String csiaNc17Q;

	@Column(name = "D_G_DATE")
	private Date dGAcqDate;

	@Column(name = "DN_G_N2")
	private Double dnGN2;

	@Column(name = "D_G_COMMENT")
	private String dGComments;

	@Column(name = "IQM_CODE")
	private String dGHtIqmCode;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer dGCalibConf;

	@Column(name = "DD_NC22_Q")
	private String ddGNc22Q;

	@Column(name = "DC_NC16_Q")
	private String csiaNc16Q;

	@Column(name = "DC_IC4_Q")
	private String csiaIc4Q;

	@Column(name = "DC_NC7_Q")
	private String csiaNc7Q;

	@Column(name = "DC_NC29_Q")
	private String csiaNc29Q;

	@Column(name = "DD_NC35_Q")
	private String ddGNc35Q;

	@Column(name = "DD_G_H2S_Q")
	private String ddGH2sQ;

	@Column(name = "DC_G_NEOC5")
	private Double csiaNeoc5;

	@Transient
	private Double ddGCh4;

	@Transient
	private Double csiaNc36;

	@Transient
	private String doComments;

	@Transient
	private String dGOwner;

	@Transient
	private String ddComments;

	@Override
	public String getName() {
		return AnalysisConstants.ISOTOPES_COMPOUNT_SPECIFIC;
	}

}
