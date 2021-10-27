package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTORockRoc;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ROCK_ROC")
public class DDRockRoc extends DDDatabaseObject implements GTORockRoc, Serializable {

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "IQM_CODE")
	private String rocIqmCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "RUN_NUMBER")
	private String rocRunNumber;

	@Column(name = "ROC_AUTHOR")
	private String rocAuthor;

	@Column(name = "QC_USER")
	private String rocQcUser;

	@Column(name = "JOB_ID")
	private String rocJobId;

	@Column(name = "QC_DATE")
	private Date rocQcDate;

	@Column(name = "ROC_COMMENT")
	private String rocComments;

	@Column(name = "ROC_QC")
	private String rocQc;

	@Column(name = "ROC_DATE")
	private Date rocAcqDate;

	@Column(name = "LAST_UPDATE")
	private Date rocLastUpdate;

	@Column(name = "ROC_METHOD")
	private String rocMethod;

	@Column(name = "ROC_CONF")
	private Double rocConf;

	@Column(name = "ROC_LAB")
	private String rocLab;

	@Column(name = "SAMPLE_ID_VEND")
	private String rocSampleIdVend;

	@Column(name = "SVC_CODE")
	private String rocSvcCode;

	@Column(name = "ROC_VALUE")
	private Double roc;


	@Override
	public String getName() {
		 return AnalysisConstants.ROCK_ROC;
	}
}
