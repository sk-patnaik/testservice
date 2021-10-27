package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilCnt;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_CNT", schema="gfs")
public class FpcOilCnt extends FpcDatabaseObject implements GTOOilCnt, Serializable {

	@Column(name = "CNT_COMMENT")
	private String cntComments;

	@Column(name = "CNT_DATE")
	private Date cntAcqDate;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "CNT_QC")
	private String cntQc;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "CNT_VALUE_QUALIFIER")
	private String cntValueQualifier;

	@Column(name = "LAST_UPDATE")
	private Date cntLastUpdate;

	@Column(name = "JOB_ID")
	private String cntJobId;

	@Column(name = "QC_DATE")
	private Date cntQcDate;

	@Column(name = "CNT_NAME")
	private String cntName;

	@Column(name = "SVC_CODE")
	private String cntSvcCode;

	@Column(name = "IQM_CODE")
	private String cntIqmCode;

	@Column(name = "QC_USER")
	private String cntQcUser;

	@Column(name = "CNT_LAB")
	private String cntLab;

	@Column(name = "CNT_METHOD")
	private String cntMethod;

	@Column(name = "RUN_NUMBER")
	private String cntRunNumber;

	@Column(name = "SAMPLE_ID_VEND")
	private String cntSampleIdVend;

	@Column(name = "CNT_AUTHOR")
	private String cntAuthor;

	@Column(name = "CNT_VALUE")
	private Double cntPct;

	@Transient
	private String cntUpdatedUser;

	@Transient
	private String cntRequestIdVendor;
	@Override
	public String getName() {
		return AnalysisConstants.OIL_CONTAMINATION;
	}

}
