package com.shell.siep.gto.persistence.databases.bg.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.bg.model.BGDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilSulf;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_SULF")
public class BGOilSulf extends BGDatabaseObject implements GTOOilSulf, Serializable {

	@Column(name = "LAST_UPDATE")
	private Date sulfLastUpdate;

	@Column(name = "SULF_QC")
	private String sulfQc;

	@Column(name = "SULF_COMMENT")
	private String sulfComments;

	@Column(name = "SULF_VALUE")
	private Double sul;

	@Column(name = "JOB_ID")
	private String sulfJobId;

	@Column(name = "RUN_NUMBER")
	private String sulfRunNumber;

	@Column(name = "SULF_CONF")
	private Double sulfConf;

	@Column(name = "SULF_METHOD")
	private String sulfMethod;

	@Column(name = "SULF_VALUE_QUALIFIER")
	private String sulfValueQualifier;

	@Column(name = "SVC_CODE")
	private String sulfSvcCode;

	@Column(name = "SULF_DATE")
	private Date sulfAcqDate;

	@Column(name = "SULF_VALUE", insertable = false, updatable = false)
	private Double sulfValue;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "QC_USER")
	private String sulfQcUser;

	@Column(name = "IQM_CODE")
	private String sulfIqmCode;

	@Column(name = "SULF_AUTHOR")
	private String sulfAuthor;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SULF_LAB")
	private String sulfLab;

	@Column(name = "SAMPLE_ID_VEND")
	private String sulfSampleIdVend;

	@Column(name = "QC_DATE")
	private Date sulfQcDate;

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
