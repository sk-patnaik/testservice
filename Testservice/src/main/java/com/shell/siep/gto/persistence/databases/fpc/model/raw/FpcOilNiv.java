package com.shell.siep.gto.persistence.databases.fpc.model.raw;


import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilNiv;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_NIV", schema="gfs")
public class FpcOilNiv extends FpcDatabaseObject implements GTOOilNiv, Serializable {

	@Column(name = "SAMPLE_ID_VEND")
	private String nivSampleIdVend;

	@Column(name = "V_VALUE")
	private Double v;

	@Column(name = "JOB_ID")
	private String nivJobId;

	@Column(name = "NI_VALUE_QUALIFIER")
	private String niValueQualifier;

	@Column(name = "NI_VALUE")
	private Double ni;

	@Column(name = "V_VALUE", insertable = false, updatable = false)
	private Double va;

	@Column(name = "RUN_NUMBER")
	private String nivRunNumber;

	@Column(name = "LAST_UPDATE")
	private Date nivLastUpdate;

	@Column(name = "V_Q")
	private String vQ;

	@Column(name = "NIV_LAB")
	private String nivLab;

	@Column(name = "NI_Q")
	private String niQ;

	@Column(name = "NI_CONF")
	private Double niConf;

	@Column(name = "V_VALUE_QUALIFIER")
	private String vValueQualifier;

	@Column(name = "IQM_CODE")
	private String nivIqmCode;

	@Column(name = "SVC_CODE")
	private String nivSvcCode;

	@Column(name = "QC_USER")
	private String nivQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "QC_DATE")
	private Date nivQcDate;

	@Column(name = "NIV_QC")
	private String nivQc;

	@Column(name = "NIV_DATE")
	private Date nivAcqDate;

	@Column(name = "NIV_AUTHOR")
	private String nivAuthor;

	@Column(name = "NIV_COMMENT")
	private String nivComments;

	@Column(name = "NIV_METHOD")
	private String nivMethod;

	@Column(name = "V_CONF")
	private Double vConf;

	@Override
	public String getName() {
		return AnalysisConstants.ELEMENTAL_NICKEL_VANADIUM;
	}
}
