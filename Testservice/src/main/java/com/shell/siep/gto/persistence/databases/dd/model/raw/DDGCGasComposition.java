package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGasComposition;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GAS_COMPOSITION")
public class DDGCGasComposition extends DDDatabaseObject implements GTOGasComposition, Serializable {

	@Column(name = "LAST_UPDATE")
	private Date gasLastUpdate;

	@Column(name = "GAS_DATE")
	private Date gasAcqDate;

	@Column(name = "GAS_RIG_UNIT")
	private String gasRigUnit;

	@Column(name = "GAS_AUTHOR")
	private String gasAuthor;

	@Column(name = "GAS_N2")
	private Double gasN2;

	@Column(name = "GAS_CONF")
	private Double gasConf;

	@Column(name = "GAS_2MB")
	private Double gasIc5;

	@Column(name = "GAS_2MPR")
	private Double gasIc4;

	@Column(name = "GAS_HE")
	private Double gasHe;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer gasRecordType;

	@Column(name = "GAS_H2")
	private Double gasH2;

	@Column(name = "GAS_QC")
	private String gasQc;

	@Column(name = "GAS_O2")
	private Double gasO2;

	@Column(name = "GAS_H2S")
	private Double gasH2s;

	@Column(name = "GAS_O2AR")
	private Double gasO2ar;

	@Column(name = "GAS_CO")
	private Double gasCo;

	@Column(name = "GAS_NC3")
	private Double gasC3;

	@Column(name = "GAS_NC2")
	private Double gasC2;

	@Column(name = "GAS_NC1")
	private Double gasC1;

	@Column(name = "GAS_BZ")
	private Double gasBz;

	@Column(name = "GAS_AR")
	private Double gasAr;

	@Column(name = "GAS_UC3")
	private Double c3Unsat;

	@Column(name = "JOB_ID")
	private String gasJobId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "GAS_COMMENT")
	private String gasComments;

	@Column(name = "FK_UNITS_ID")
	private Integer gasUom;

	@Column(name = "QC_USER")
	private String gasQcUser;

	@Column(name = "GAS_TOL")
	private Double gasTol;

	@Column(name = "GAS_CO2")
	private Double gasCo2;

	@Column(name = "GAS_UC2")
	private Double c2Unsat;

	@Column(name = "GAS_BTU")
	private Integer gasBtu;

	@Column(name = "GAS_SO2")
	private Double gasSo2;

	@Column(name = "FK_METHOD_ID")
	private String gasMethod;

	@Column(name = "GAS_UC5")
	private Double c5Unsat;

	@Column(name = "GAS_BAR")
	private Double gasBar;

	@Column(name = "GAS_TOTAL_CONCENTRATION")
	private Double gasTotalConcentration;

	@Column(name = "GAS_AIR")
	private Double gasAir;

	@Column(name = "QC_DATE")
	private Date gasQcDate;

	@Column(name = "FK_DATATYPE_ID")
	private Integer gasType;

	@Column(name = "RUN_NUMBER")
	private String gasRunNumber;

	@Column(name = "GAS_NC5_PLUS")
	private Double gasNc5Plus;

	@Column(name = "GAS_NC6_PLUS")
	private Double gasC6plus;

	@Column(name = "SAMPLE_ID_VEND")
	private String gasSampleIdVend;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "GAS_NEOC5")
	private Double gasNeoc5;

	@Column(name = "FK_GAS_UNITS_ID")
	private Integer gasTotalConcUnits;

	@Column(name = "GAS_NC5")
	private Double gasNc5;

	@Column(name = "GAS_NC4")
	private Double gasNc4;

	@Column(name = "SVC_CODE")
	private String gasSvcCode;

	@Column(name = "GAS_METHOD")
	private String gasMethodOld;

	@Column(name = "GAS_UC4")
	private Double c4Unsat;

	@Column(name = "GAS_LAB")
	private String gasLab;

	@Column(name = "GAS_TEMP")
	private Double gasTemp;

	@Column(name = "GAS_SP_GR")
	private Double gasSpGr;

	@Column(name = "IQM_CODE")
	private String gasIqmCode;

	@Transient
	private Integer gasUnitsId;

	@Transient
	private Integer gasMethodId;

	@Transient
	private Integer gasTotalConcUnitsId;

	@Transient
	private Double gasC10Plus;

	@Transient
	private Double gasC12;

	@Transient
	private Double gasC11;

	@Transient
	private Double gasC10;

	@Transient
	private String gasUnits;

	@Transient
	private Double gasC2Plus;

	@Transient
	private String gasSiteId;

	@Transient
	private String gasOwner;

	@Transient
	private Double gasC12Plus;

	@Transient
	private Double gasNc7Plus;

	@Transient
	private Double gasC13Plus;

	@Transient
	private Double gasC8;

	@Transient
	private Double gasC7;

	@Transient
	private Double gasC9;

	@Override
	public String getName() {
		return AnalysisConstants.GC_GAS_COMPOSITION;
	}

}
