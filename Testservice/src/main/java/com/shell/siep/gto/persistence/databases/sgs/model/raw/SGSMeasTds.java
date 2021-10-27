package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqTds;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_TDS", schema="sgs_data")
public class SGSMeasTds extends SGSDatabaseObject implements GTOLiqTds, Serializable {

	@Column(name = "TDS_COMMENT")
	private String tdsComment;

	@Column(name = "TDS_VALUE")
	private Double tdsValue;

	@Column(name = "VSS_QC")
	private String waterVssQc;

	@Column(name = "VSS_CONF")
	private Double waterVssConf;

	@Column(name = "CREATED_DATE")
	private Date tdsCreatedDate;

	@Column(name = "VSS_VALUE")
	private Double vssValue;

	@Column(name = "TDS_UNITS")
	private Integer waterTdsUnits;

	@Column(name = "REQUEST_ID_VEND")
	private String tdsRequestIdVend;

	@Column(name = "TDS_CONF")
	private Double tdsConf;

	@Column(name = "TDS_AUTHOR")
	private String tdsAuthor;

	@Column(name = "TDS_UNITS", insertable = false, updatable = false)
	private Integer tdsUnits;

	@Column(name = "TDS_DATE")
	private Date tdsDate;

	@Column(name = "QC_USER")
	private String tdsQcUser;

	@Column(name = "UPDATED_DATE")
	private Date tdsUpdatedDate;

	@Column(name = "TDS_AUTHOR", insertable = false, updatable = false)
	private String waterTdsAuthor;

	@Column(name = "TSS_CONF")
	private Double tssConf;

	@Column(name = "TDS_VALUE", insertable = false, updatable = false)
	private Double waterTdsValue;

	@Column(name = "SVC_CODE")
	private String tdsSvcCode;

	@Column(name = "RUN_NUMBER")
	private String tdsRunNumber;

	@Column(name = "TDS_DATE", insertable = false, updatable = false)
	private Date waterTdsDate;

	@Column(name = "TSS_QC")
	private String tssQc;

	@Column(name = "QC_DATE")
	private Date tdsQcDate;

	@Column(name = "UPDATED_USER")
	private String tdsUpdatedUser;

	@Column(name = "TDS_CONF", insertable = false, updatable = false)
	private Double waterTdsConf;

	@Column(name = "TDS_QC")
	private String tdsQc;

	@Column(name = "TSS_VALUE")
	private Double tssValue;

	@Column(name = "TDS_METHOD")
	private Integer waterTdsMethod;

	@Column(name = "TDS_METHOD", insertable = false, updatable = false)
	private Integer tdsMethod;

	@Column(name = "SAMPLE_ID_VEND")
	private String tdsSampleIdVend;

	@Column(name = "VSS_QC", insertable = false, updatable = false)
	private String vssQc;

	@Column(name = "TSS_VALUE", insertable = false, updatable = false)
	private Double waterTssValue;

	@Column(name = "TSS_CONF", insertable = false, updatable = false)
	private Double waterTssConf;

	@Column(name = "TDS_LAB")
	private String tdsLab;

	@Column(name = "VSS_CONF", insertable = false, updatable = false)
	private Double vssConf;

	@Column(name = "VSS_VALUE", insertable = false, updatable = false)
	private Double waterVssValue;

	@Column(name = "TDS_COMMENT", insertable = false, updatable = false)
	private String waterTdsComment;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "TDS_QC", insertable = false, updatable = false)
	private String waterTdsQc;

	@Column(name = "TSS_QC", insertable = false, updatable = false)
	private String waterTssQc;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "CREATED_USER")
	private String tdsCreatedUser;

	@Column(name = "TDS_LAB", insertable = false, updatable = false)
	private String waterTdsLab;

	@Transient
	private Integer tdsMethodId;

	@Transient
	private Integer tssMethodId;

	@Transient
	private Integer tdsTempUnitsId;

	@Transient
	private Integer vssUnitsId;

	@Transient
	private Integer tssUnitsId;

	@Transient
	private Integer tssTempUnitsId;

	@Transient
	private Integer tdsConfTypeId;

	@Transient
	private Integer tdsCalcUnitsId;

	@Transient
	private Double tdsTemp;

	@Transient
	private Double tssTemp;

	@Transient
	private Integer vssMethodId;

	@Transient
	private Integer tdsUnitsId;

	@Transient
	private Integer vssTempUnitsId;

	@Transient
	private String tdsQ;

	@Transient
	private Double vssTemp;

	@Transient
	private String vssQ;

	@Transient
	private Integer tdsPk;

	@Transient
	private Double tdsCalc;

	@Transient
	private String tssQ;

	@Transient
	private Integer tdsRecordTypeId;

	@Transient
	private Date tdsAcqDate;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_TDS;
	}
}
