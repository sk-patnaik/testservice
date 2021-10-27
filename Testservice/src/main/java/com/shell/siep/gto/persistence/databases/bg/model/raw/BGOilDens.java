package com.shell.siep.gto.persistence.databases.bg.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.bg.model.BGDatabaseObject;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilDens;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_DENS")
public class BGOilDens extends BGDatabaseObject implements GTOOilDens, Serializable {

	@Column(name = "DENS_METHOD")
	private String densMethod;

	@Column(name = "DENS_TEMP")
	private Double densTemp;

	@Column(name = "JOB_ID")
	private String densJobId;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "DENS_VALUE_QUALIFIER")
	private String densValueQualifier;

	@Column(name = "DENS_VALUE")
	private Double densApi;

	@Column(name = "DENS_LAB")
	private String densLab;

	@Column(name = "DENS_QC")
	private String densQc;

	@Column(name = "DENS_DENSITY")
	private Double densDensity;

	@Column(name = "QC_DATE")
	private Date densQcDate;

	@Column(name = "DENS_TEMP_UNITS")
	private String densTempUnits;

	@Column(name = "DENS_SP_GR")
	private Double densSpGr;

	@Column(name = "LAST_UPDATE")
	private Date densLastUpdate;

	@Column(name = "SVC_CODE")
	private String densSvcCode;

	@Column(name = "RUN_NUMBER")
	private String densRunNumber;

	@Column(name = "SAMPLE_ID_VEND")
	private String densSampleIdVend;

	@Column(name = "QC_USER")
	private String densQcUser;

	@Column(name = "IQM_CODE")
	private String densIqmCode;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "DENS_AUTHOR")
	private String densAuthor;

	@Column(name = "DENS_VALUE", insertable = false, updatable = false)
	private Double api;

	@Column(name = "DENS_CONF")
	private Double densConf;

	@Column(name = "DENS_DATE")
	private Date densAcqDate;

	@Column(name = "DENS_COMMENT")
	private String densComments;

	@Override
	public String getName() {
		return AnalysisConstants.PHYSICAL_PROPERTIES_DENSITY;
	}
}
