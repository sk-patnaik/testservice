package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
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
@Table(name="WTC_MEAS_CNT", schema="sgs_data")
public class SGSMeasCnt extends SGSDatabaseObject implements GTOOilCnt, Serializable {

	@Column(name = "CNT_METHOD")
	private String cntMethod;

	@Column(name = "RUN_NUMBER")
	private String cntRunNumber;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "UPDATED_DATE")
	private Date cntLastUpdate;

	@Column(name = "UPDATED_USER")
	private String cntUpdatedUser;

	@Column(name = "CNT_COMMENT")
	private String cntComments;

	@Column(name = "JOB_ID")
	private String cntJobId;

	@Column(name = "QC_DATE")
	private Date cntQcDate;

	@Column(name = "CNT_NAME")
	private String cntName;

	@Column(name = "CNT_DATE")
	private Date cntAcqDate;

	@Column(name = "SVC_CODE")
	private String cntSvcCode;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "QC_USER")
	private String cntQcUser;

	@Column(name = "SAMPLE_ID_VEND")
	private String cntSampleIdVend;

	@Column(name = "CNT_QC")
	private String cntQc;

	@Column(name = "CNT_AUTHOR")
	private String cntAuthor;

	@Column(name = "CNT_VALUE")
	private Double cntPct;

	@Column(name = "CNT_LAB")
	private String cntLab;

	@Column(name = "REQUEST_ID_VEND")
	private String cntRequestIdVendor;

	@Transient
	private String cntValueQualifier;

	@Transient
	private String cntIqmCode;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_CONTAMINANT;
	}
}
