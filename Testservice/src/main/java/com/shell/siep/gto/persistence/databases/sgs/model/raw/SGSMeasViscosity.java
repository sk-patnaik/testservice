package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilVisc;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_VISCOSITY", schema="sgs_data")
public class SGSMeasViscosity extends SGSDatabaseObject implements GTOOilVisc, Serializable {

	@Column(name = "JOB_ID")
	private String viscJobId;

	@Column(name = "VISC_COMMENTS")
	private String viscComments;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "VISC_DATE")
	private Date viscDate;

	@Column(name = "VISC_QUAL")
	private String viscQual;

	@Column(name = "VISC_TEMP")
	private Integer viscTemperature;

	@Column(name = "VISC_LAB")
	private String viscLab;

	@Column(name = "QC_DATE")
	private Date viscQcDate;

	@Column(name = "RUN_NUMBER")
	private String viscRunNumber;

	@Column(name = "VISC_TEMP_UNITS")
	private String viscTempUnits;

	@Column(name = "QC_FLAG")
	private String viscQcFlag;

	@Column(name = "VISC_METHOD")
	private String viscMethod;

	@Column(name = "VISC_VALUE")
	private Double viscValue;

	@Column(name = "VISC_AUTHOR")
	private String viscAuthor;

	@Column(name = "SAMPLE_ID_VEND")
	private String viscSampleIdVend;

	@Column(name = "QC_USER")
	private String viscQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SAMPLE_ID_VEND", insertable = false, updatable = false)
	private Integer viscOpid;

	@Column(name = "VISC_LABPAGE")
	private String viscLabpage;

	@Column(name = "CREATED_USER")
	private String viscCreatedUser;

	@Column(name = "UPDATED_DATE")
	private Date viscUpdatedDate;

	@Column(name = "SVC_CODE")
	private String viscSvcCode;

	@Column(name = "VISC_UNITS")
	private String viscUnits;

	@Column(name = "VISC_LABREF")
	private String viscLabref;

	@Column(name = "CREATED_DATE")
	private Date viscCreatedDate;

	@Column(name = "UPDATED_USER")
	private String viscUpdatedUser;

	@Column(name = "REQUEST_ID_VEND")
	private String viscRequestIdVend;

	@Transient
	private Double viscConf;

	@Transient
	private Date viscLastUpdate;

	@Transient
	private String viscRequest;

	@Transient
	private String viscQc;

	@Transient
	private String viscValueQualifier;

	@Transient
	private String viscIqmCode;

	@Transient
	private Date viscAcqDate;

	@Override
	public String getName() {
		return AnalysisConstants.PHYSICAL_PROPERTIES_VISCOSITY;
	}

}
