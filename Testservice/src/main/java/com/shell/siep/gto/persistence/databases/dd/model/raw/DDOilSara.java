package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilSara;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_SARA")
public class DDOilSara extends DDDatabaseObject implements GTOOilSara, Serializable {

	@Column(name = "SARA_RESIN_TOP")
	private Double saraResinTop;

	@Column(name = "SARA_COMMENT")
	private String saraComments;

	@Column(name = "SARA_NSO_MG")
	private Double saraNsoMg;

	@Column(name = "SARA_ARO_MG")
	private Double saraAroMg;

	@Column(name = "SARA_TOP_RAT")
	private Double saraTopRat;

	@Column(name = "SARA_ASPH_PCT")
	private Double saraAsphPct;

	@Column(name = "SAMPLE_ID_VEND")
	private String saraSampleIdVend;

	@Column(name = "QC_USER")
	private String saraQcUser;

	@Column(name = "SARA_RESIN_TOP", insertable = false, updatable = false)
	private Double saraNs0Top;

	@Column(name = "QC_DATE")
	private Date saraQcDate;

	@Column(name = "SARA_ARO_PCT")
	private Double saraAroPct;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SARA_DATE")
	private Date saraAcqDate;

	@Column(name = "LAST_UPDATE")
	private Date saraLastUpdate;

	@Column(name = "SARA_QC")
	private String saraQc;

	@Column(name = "SARA_CONF")
	private Double saraConf;

	@Column(name = "JOB_ID")
	private String saraJobId;

	@Column(name = "SARA_ASPH_MG")
	private Double saraAsphMg;

	@Column(name = "SARA_LAB")
	private String saraLab;

	@Column(name = "SARA_NSO_PCT")
	private Double saraNsoPct;

	@Column(name = "SARA_METHOD")
	private String saraMethod;

	@Column(name = "SARA_AUTHOR")
	private String saraAuthor;

	@Column(name = "SARA_SAT_MG")
	private Double saraSatMg;

	@Column(name = "SARA_RESIN_WHO")
	private Double saraNsoWho;

	@Column(name = "SARA_ASPH_WHO")
	private Double saraAsphWho;

	@Column(name = "SVC_CODE")
	private String saraSvcCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SARA_ASPH_TOP")
	private Double saraAsphTop;

	@Column(name = "SARA_SAT_PCT")
	private Double saraSatPct;

	@Column(name = "IQM_CODE")
	private String saraIqmCode;

	@Column(name = "RUN_NUMBER")
	private String saraRunNumber;

	@Column(name = "SARA_RESIN_WHO", insertable = false, updatable = false)
	private Double saraResinWho;

	@Column(name = "SARA_SAMP_MG")
	private Double saraSampMg;

	@Transient
	private Date saraUpdatedDate;

	@Transient
	private Double saraTopTime;

	@Transient
	private Date saraCreatedDate;

	@Transient
	private Double saraResidueWt;

	@Transient
	private String saraIqmFlag;

	@Transient
	private Double saraResidualPct;

	@Transient
	private String saraCreatedUser;

	@Transient
	private String saraQcFlag;

	@Transient
	private Double saraPrecipTime;

	@Transient
	private Double saraTopPct;

	@Transient
	private Double saraOilPct;

	@Transient
	private String saraUpdatedUser;

	@Transient
	private Double saraNsoTop;


	@Override
	public String getName() {
		 return AnalysisConstants.GROSS_COMPOSITION_SARA;
	}
}
