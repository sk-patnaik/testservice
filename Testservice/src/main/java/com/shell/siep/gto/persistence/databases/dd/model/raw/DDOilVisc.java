package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilVisc;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_VISC")
public class DDOilVisc extends DDDatabaseObject implements GTOOilVisc, Serializable {

	@Column(name = "JOB_ID")
	private String viscJobId;

	@Column(name = "RUN_NUMBER")
	private String viscRunNumber;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "VISC_VALUE_QUALIFIER")
	private String viscValueQualifier;

	@Column(name = "VISC_CONF")
	private Double viscConf;

	@Column(name = "VISC_METHOD")
	private String viscMethod;

	@Column(name = "VISC_AUTHOR")
	private String viscAuthor;

	@Column(name = "IQM_CODE")
	private String viscIqmCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "VISC_TEMPERATURE")
	private Integer viscTemperature;

	@Column(name = "VISC_LAB")
	private String viscLab;

	@Column(name = "VISC_QC")
	private String viscQc;

	@Column(name = "SVC_CODE")
	private String viscSvcCode;

	@Column(name = "VISC_COMMENT")
	private String viscComments;

	@Column(name = "LAST_UPDATE")
	private Date viscLastUpdate;

	@Column(name = "QC_DATE")
	private Date viscQcDate;

	@Column(name = "VISC_VALUE")
	private Double viscValue;

	@Column(name = "SAMPLE_ID_VEND")
	private String viscSampleIdVend;

	@Column(name = "QC_USER")
	private String viscQcUser;

	@Column(name = "VISC_UNITS")
	private String viscUnits;

	@Column(name = "VISC_DATE")
	private Date viscAcqDate;

	@Transient
	private String viscRequestId;

	@Transient
	private Date viscDate;

	@Transient
	private String viscQual;

	@Transient
	private String viscTempUnits;

	@Transient
	private String viscQcFlag;

	@Transient
	private Integer viscOpid;

	@Transient
	private String viscLabpage;

	@Transient
	private String viscCreatedUser;

	@Transient
	private Date viscUpdatedDate;

	@Transient
	private String viscLabref;

	@Transient
	private Date viscCreatedDate;

	@Transient
	private String viscUpdatedUser;

	@Transient
	private String viscRequestIdVend;

	@Override
	public String getName() {
		return AnalysisConstants.PHYSICAL_PROPERTIES_VISCOSITY;
	}

}
