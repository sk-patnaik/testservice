package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisData;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_SULF", schema="gfs")
public class FpcOilSulf extends FpcDatabaseObject implements GTOAnalysisData, Serializable {

	@Column(name = "SULF_VALUE")
	private Double sul;

	@Column(name = "SULF_METHOD")
	private String sulfMethod;

	@Column(name = "SULF_VALUE_QUALIFIER")
	private String sulfValueQualifier;

	@Column(name = "IQM_CODE")
	private String sulfIqmCode;

	@Column(name = "SULF_LAB")
	private String sulfLab;

	@Column(name = "LAST_UPDATE")
	private Date sulfLastUpdate;

	@Column(name = "SULF_CONF")
	private Double sulfConf;

	@Column(name = "QC_USER")
	private String sulfQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "QC_DATE")
	private Date sulfQcDate;

	@Column(name = "SULF_QC")
	private String sulfQc;

	@Column(name = "RUN_NUMBER")
	private String sulfRunNumber;

	@Column(name = "SVC_CODE")
	private String sulfSvcCode;

	@Column(name = "SULF_DATE")
	private Date sulfAcqDate;

	@Column(name = "SULF_VALUE", insertable = false, updatable = false)
	private Double sulfValue;

	@Column(name = "SULF_AUTHOR")
	private String sulfAuthor;

	@Column(name = "SULF_COMMENT")
	private String sulfComments;

	@Column(name = "JOB_ID")
	private String sulfJobId;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SAMPLE_ID_VEND")
	private String sulfSampleIdVend;

	@Transient
	private Double sulfideValue;

	@Transient
	private String sulfRequestIdVend;

	@Transient
	private Integer sulfUnits;

	@Transient
	private String sulfQualifier;

	@Transient
	private String sulfUpdatedUser;

	@Transient
	private Integer sulfideUnits;

	@Transient
	private String sulfideQualifier;

	@Override
	public String getName() {
		return AnalysisConstants.ELEMENTAL_SULFUR;
	}
}
