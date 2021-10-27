package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
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
@Table(name="WTC_MEAS_SULF", schema="sgs_data")
public class SGSMeasSulf extends SGSDatabaseObject implements GTOOilSulf, Serializable {

	@Column(name = "UPDATED_DATE")
	private Date sulfLastUpdate;

	@Column(name = "SULFIDE_VALUE")
	private Double sulfideValue;

	@Column(name = "SULF_QC")
	private String sulfQc;

	@Column(name = "SULF_COMMENT")
	private String sulfComments;

	@Column(name = "SULF_VALUE")
	private Double sul;

	@Column(name = "REQUEST_ID_VEND")
	private String sulfRequestIdVend;

	@Column(name = "SULF_UNITS")
	private Integer sulfUnits;

	@Column(name = "SULF_QUALIFIER")
	private String sulfQualifier;

	@Column(name = "JOB_ID")
	private String sulfJobId;

	@Column(name = "RUN_NUMBER")
	private String sulfRunNumber;

	@Column(name = "SULF_CONF")
	private Double sulfConf;

	@Column(name = "SULF_METHOD")
	private String sulfMethod;

	@Column(name = "SVC_CODE")
	private String sulfSvcCode;

	@Column(name = "SULF_DATE")
	private Date sulfAcqDate;

	@Column(name = "SULF_VALUE", insertable = false, updatable = false)
	private Double sulfValue;

	@Column(name = "UPDATED_USER")
	private String sulfUpdatedUser;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SULFIDE_UNITS")
	private Integer sulfideUnits;

	@Column(name = "QC_USER")
	private String sulfQcUser;

	@Column(name = "SULFIDE_QUALIFIER")
	private String sulfideQualifier;

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
	private String sulfValueQualifier;

	@Transient
	private String sulfIqmCode;

	@Override
	public String getName() {
		return AnalysisConstants.ELEMENTAL_SULFUR;
	}
}
