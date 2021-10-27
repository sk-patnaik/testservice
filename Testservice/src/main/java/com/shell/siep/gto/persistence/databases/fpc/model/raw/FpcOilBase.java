package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
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
@Table(name="FPC_OIL_BASE", schema="gfs")
public class FpcOilBase extends FpcDatabaseObject implements GTOOilBase, Serializable {

	@Column(name = "BASE_CONF")
	private Double baseConf;

	@Column(name = "BASE_DATE")
	private Date baseAcqDate;

	@Column(name = "BASE_METHOD")
	private String baseMethod;

	@Column(name = "QC_USER")
	private String baseHtQcUser;

	@Column(name = "BASE_COMMENT")
	private String baseComments;

	@Column(name = "QC_DATE")
	private Date baseHtQcDate;

	@Column(name = "BASE_LAB")
	private String baseLab;

	@Column(name = "RUN_NUMBER")
	private String baseRunNumber;

	@Column(name = "SAMPLE_ID_VEND")
	private String baseSampleIdVend;

	@Column(name = "SVC_CODE")
	private String baseSvcCode;

	@Column(name = "BASE_UNITS")
	private String baseUnits;

	@Column(name = "IQM_CODE")
	private String baseHtIqmCode;

	@Column(name = "BASE_VALUE_QUALIFIER")
	private String baseValueQualifier;

	@Column(name = "BASE_QC")
	private String baseQc;

	@Column(name = "BASE_AUTHOR")
	private String baseAuthor;

	@Column(name = "LAST_UPDATE")
	private Date baseLastUpdate;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "BASE_VALUE")
	private Double baseValue;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "JOB_ID")
	private String baseJobId;

	@Transient
	private String baseRequestIdVend;

	@Transient
	private String baseQcFlag;

	@Transient
	private Date baseQcDate;

	@Transient
	private String baseIqmCode;

	@Transient
	private String baseQcUser;


	@Override
	public String getName() {
		 return AnalysisConstants.OIL_BASE;
	}
}
