package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilBase;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_BASE", schema="sgs_data")
public class SGSMeasBase extends SGSDatabaseObject implements GTOOilBase, Serializable {

	@Column(name = "BASE_CONF")
	private Double baseConf;

	@Column(name = "JOB_ID")
	private String baseJobId;

	@Column(name = "RUN_NUMBER")
	private String baseRunNumber;

	@Column(name = "BASE_DATE")
	private Date baseAcqDate;

	@Column(name = "REQUEST_ID_VEND")
	private String baseRequestIdVend;

	@Column(name = "BASE_METHOD")
	private String baseMethod;

	@Column(name = "SAMPLE_ID_VEND")
	private String baseSampleIdVend;

	@Column(name = "SVC_CODE")
	private String baseSvcCode;

	@Column(name = "QC_FLAG")
	private String baseQcFlag;

	@Column(name = "QC_DATE")
	private Date baseQcDate;

	@Column(name = "BASE_COMMENT")
	private String baseComments;

	@Column(name = "BASE_QC")
	private String baseQc;

	@Column(name = "IQM_CODE")
	private String baseIqmCode;

	@Column(name = "BASE_AUTHOR")
	private String baseAuthor;

	@Column(name = "BASE_UNITS")
	private String baseUnits;

	@Column(name = "UPDATED_DATE")
	private Date baseLastUpdate;

	@Column(name = "QC_USER")
	private String baseQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "BASE_LAB")
	private String baseLab;

	@Column(name = "BASE_VALUE_QUALIFIER")
	private String baseValueQualifier;

	@Column(name = "BASE_VALUE")
	private Double baseValue;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Transient
	private String baseHtQcUser;

	@Transient
	private Date baseHtQcDate;

	@Transient
	private String baseHtIqmCode;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_BASE;
	}
}
