package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqTds;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_TDS")
public class DDLiqTds extends DDDatabaseObject implements GTOLiqTds, Serializable {

	@Column(name = "FK_TDS_METHOD_ID")
	private Integer tdsMethodId;

	@Column(name = "TDS_VALUE")
	private Double tdsValue;

	@Column(name = "FK_TSS_METHOD_ID")
	private Integer tssMethodId;

	@Column(name = "CREATED_DATE")
	private Date tdsCreatedDate;

	@Column(name = "VSS_VALUE")
	private Double vssValue;

	@Column(name = "TSS_CONF")
	private Double tssConf;

	@Column(name = "FK_TDS_TEMP_UNITS_ID")
	private Integer tdsTempUnitsId;

	@Column(name = "TSS_VALUE")
	private Double tssValue;

	@Column(name = "FK_VSS_UNITS_ID")
	private Integer vssUnitsId;

	@Column(name = "FK_TSS_UNITS_ID")
	private Integer tssUnitsId;

	@Column(name = "FK_TSS_TEMP_UNITS_ID")
	private Integer tssTempUnitsId;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer tdsConfTypeId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "FK_TDS_CALC_UNITS_ID")
	private Integer tdsCalcUnitsId;

	@Column(name = "TDS_TEMP")
	private Double tdsTemp;

	@Column(name = "TSS_TEMP")
	private Double tssTemp;

	@Column(name = "TDS_COMMENT")
	private String tdsComment;

	@Column(name = "FK_VSS_METHOD_ID")
	private Integer vssMethodId;

	@Column(name = "REQUEST_ID_VEND")
	private String tdsRequestIdVend;

	@Column(name = "SVC_CODE")
	private String tdsSvcCode;

	@Column(name = "FK_TDS_UNITS_ID")
	private Integer tdsUnitsId;

	@Column(name = "FK_VSS_TEMP_UNITS_ID")
	private Integer vssTempUnitsId;

	@Column(name = "TDS_CONF")
	private Double tdsConf;

	@Column(name = "UPDATED_DATE")
	private Date tdsUpdatedDate;

	@Column(name = "RUN_NUMBER")
	private String tdsRunNumber;

	@Column(name = "TDS_Q")
	private String tdsQ;

	@Column(name = "VSS_TEMP")
	private Double vssTemp;

	@Column(name = "VSS_Q")
	private String vssQ;

	@Column(name = "UPDATED_USER")
	private String tdsUpdatedUser;

	@Column(name = "PK")
	private Integer tdsPk;

	@Column(name = "TDS_CALC")
	private Double tdsCalc;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "TSS_Q")
	private String tssQ;

	@Column(name = "TDS_AUTHOR")
	private String tdsAuthor;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer tdsRecordTypeId;

	@Column(name = "QC_USER")
	private String tdsQcUser;

	@Column(name = "QC_DATE")
	private Date tdsQcDate;

	@Column(name = "SAMPLE_ID_VEND")
	private String tdsSampleIdVend;

	@Column(name = "TDS_DATE")
	private Date tdsAcqDate;

	@Column(name = "FK_LAB_ID")
	private String tdsLab;

	@Column(name = "VSS_CONF")
	private Double vssConf;

	@Column(name = "CREATED_USER")
	private String tdsCreatedUser;

	@Transient
	private String waterVssQc;

	@Transient
	private Double waterVssConf;

	@Transient
	private Integer waterTdsUnits;

	@Transient
	private Integer tdsUnits;

	@Transient
	private Date tdsDate;

	@Transient
	private String waterTdsAuthor;

	@Transient
	private Double waterTdsValue;

	@Transient
	private Date waterTdsDate;

	@Transient
	private String tssQc;

	@Transient
	private Double waterTdsConf;

	@Transient
	private String tdsQc;

	@Transient
	private Integer waterTdsMethod;

	@Transient
	private Integer tdsMethod;

	@Transient
	private String vssQc;

	@Transient
	private Double waterTssValue;

	@Transient
	private Double waterTssConf;

	@Transient
	private Double waterVssValue;

	@Transient
	private String waterTdsComment;

	@Transient
	private String waterTdsQc;

	@Transient
	private String waterTssQc;

	@Transient
	private String waterTdsLab;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_SOLIDS;
	}
}
