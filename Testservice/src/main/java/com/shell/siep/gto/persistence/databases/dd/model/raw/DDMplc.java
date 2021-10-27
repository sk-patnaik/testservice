package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOMplc;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MPLC")
public class DDMplc extends DDDatabaseObject implements GTOMplc, Serializable {

	@Column(name = "MPLC_LAB")
	private String mplcLab;

	@Column(name = "MPLC_DATE")
	private Date mplcAcqDate;

	@Column(name = "TOP_ARO_SENT")
	private Double mplcTopAroSent;

	@Column(name = "WO_INTAKE")
	private Double mplcWoIntake;

	@Column(name = "MPLC_COMMENT")
	private String mplcComment;

	@Column(name = "MPLC_AUTHOR")
	private String mplcAuthor;

	@Column(name = "UPDATED_DATE")
	private Date mplcUpdatedDate;

	@Column(name = "UPDATED_USER")
	private String mplcUpdatedUser;

	@Column(name = "WO_SAT")
	private Double mplcWoSat;

	@Column(name = "WO_ARO")
	private Double mplcWoAro;

	@Column(name = "QC_DATE")
	private Date mplcQcDate;

	@Column(name = "SAMPLE_ID_VEND")
	private String mplcSampleIdVend;

	@Column(name = "QC_USER")
	private String mplcQcUser;

	@Column(name = "ISTD_NC21_PPM")
	private Double mplcIstdNc21Ppm;

	@Column(name = "WO_PDP")
	private Double mplcWoPdp;

	@Column(name = "IQM_CODE")
	private String mplcIqmCode;

	@Column(name = "ISTD_CHOL_PPM")
	private Double mplcIstdCholPpm;

	@Column(name = "JOB_ID")
	private String mplcJobId;

	@Column(name = "WO_DN")
	private Double mplcWoDn;

	@Column(name = "QC_FLAG")
	private String mplcQcFlag;

	@Column(name = "MPLC_DATE", insertable = false, updatable = false)
	private Date mplcDate;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "RUN_NUMBER")
	private String mplcRunNumber;

	@Column(name = "TOP_SAT_SENT")
	private Double mplcTopSatSent;

	@Column(name = "MPLC_METHOD")
	private String mplcMethod;

	@Column(name = "TOP_SAT_ORG")
	private Double mplcTopSatOrg;

	@Column(name = "TOP_INTAKE")
	private Double mplcTopIntake;

	@Column(name = "CREATED_USER")
	private String mplcCreatedUser;

	@Column(name = "TOP_ARO_ORG")
	private Double mplcTopAroOrg;

	@Column(name = "CREATED_DATE")
	private Date mplcCreatedDate;

	@Column(name = "SVC_CODE")
	private String mplcSvcCode;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Override
	public String getName() {
		return AnalysisConstants.MPLC;
	}

}
