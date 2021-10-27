package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTORockExtr;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ROCK_EXTR")
public class DDRockExtr extends DDDatabaseObject implements GTORockExtr, Serializable {

	@Column(name = "RUN_NUMBER")
	private String exRunNumber;

	@Column(name = "SAMPLE_ID_VEND")
	private Integer exSampleIdVend;

	@Column(name = "EX_QC")
	private String exQc;

	@Column(name = "QC_USER")
	private String exQcUser;

	@Column(name = "EX_EX_WT")
	private Double exExWt;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "EX_METHOD")
	private String exMethod;

	@Column(name = "SVC_CODE")
	private String exSvcCode;

	@Column(name = "QC_DATE")
	private Date exQcDate;

	@Column(name = "LAST_UPDATE")
	private Date exLastUpdate;

	@Column(name = "EX_ROCK_WT")
	private Double exRockWt;

	@Column(name = "IQM_CODE")
	private String exIqmCode;

	@Column(name = "EX_AUTHOR")
	private String exAuthor;

	@Column(name = "EX_LAB")
	private String exLab;

	@Column(name = "JOB_ID")
	private String exJobId;

	@Column(name = "EX_EX_PCT")
	private Double exExPct;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "EX_COMMENT")
	private String exComments;

	@Column(name = "EX_DATE")
	private Date exAcqDate;


	@Override
	public String getName() {
		 return AnalysisConstants.ROCK_EXTRACTION;
	}
}
