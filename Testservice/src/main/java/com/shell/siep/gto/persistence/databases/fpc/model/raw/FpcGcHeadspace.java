package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcHeadspace;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_HEADSPACE", schema="gfs")
public class FpcGcHeadspace extends FpcDatabaseObject implements GTOGcHeadspace, Serializable {

	@Column(name = "HS_C3")
	private Integer hsC3;

	@Column(name = "HS_C2")
	private Integer hsC2;

	@Column(name = "HS_C1")
	private Integer hsC1;

	@Column(name = "HS_CO")
	private Integer hsCo;

	@Column(name = "HS_H2")
	private Integer hsH2;

	@Column(name = "HS_N2")
	private Integer hsN2;

	@Column(name = "QC_DATE")
	private Date hsQcDate;

	@Column(name = "HS_O2")
	private Integer hsO2;

	@Column(name = "HS_AIRSP_ML")
	private Integer hsAirSpMl;

	@Column(name = "HS_QC")
	private String hsQc;

	@Column(name = "SAMPLE_ID_VEND")
	private String hsSampleIdVend;

	@Column(name = "QC_USER")
	private String hsQcUser;

	@Column(name = "HS_AR")
	private Integer hsAr;

	@Column(name = "IQM_CODE")
	private String hsIqmCode;

	@Column(name = "JOB_ID")
	private String hsJobId;

	@Column(name = "HS_METHOD")
	private String hsMethod;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "HS_DATE")
	private Date hsAcqDate;

	@Column(name = "HS_AIR_H2O_ML")
	private Integer hsAirH2oMl;

	@Column(name = "HS_NC4")
	private Integer hsNc4;

	@Column(name = "HS_NC5")
	private Integer hsNc5;

	@Column(name = "HS_COMMENT")
	private String hsComment;

	@Column(name = "HS_VOL_CTGS_ML")
	private Integer hsVolCtgsMl;

	@Column(name = "HS_LAB")
	private String hsLab;

	@Column(name = "HS_C5_C7")
	private Integer hsC5C7;

	@Column(name = "HS_AUTHOR")
	private String hsAuthor;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "HS_C6PLS")
	private Integer hsC6pls;

	@Column(name = "HS_AR_OS")
	private Integer hsArOs;

	@Column(name = "HS_IC4")
	private Integer hsIc4;

	@Column(name = "HS_IC5")
	private Integer hsIc5;

	@Column(name = "SVC_CODE")
	private String hsSvcCode;

	@Column(name = "HS_DATA_TYPE")
	private String hsDataType;

	@Column(name = "HS_C5PLS")
	private Integer hsC5pls;

	@Column(name = "HS_DATE", insertable = false, updatable = false)
	private Date hsDate;

	@Column(name = "RUN_NUMBER")
	private String hsRunNumber;

	@Column(name = "HS_UC3")
	private Integer hsUc3;

	@Column(name = "HS_UC2")
	private Integer hsUc2;

	@Column(name = "HS_CO2")
	private Integer hsCo2;

	@Override
	public String getName() {
		return AnalysisConstants.GC_HEADSPACE;
	}

}
