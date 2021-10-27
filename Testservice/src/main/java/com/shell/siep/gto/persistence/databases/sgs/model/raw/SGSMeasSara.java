package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilSara;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_SARA", schema="sgs_data")
public class SGSMeasSara extends SGSDatabaseObject implements GTOOilSara, Serializable {

	@Column(name = "UPDATED_DATE")
	private Date saraUpdatedDate;

	@Column(name = "SARA_TOP_TIME")
	private Double saraTopTime;

	@Column(name = "SARA_RESIN_TOP")
	private Double saraResinTop;

	@Column(name = "SARA_METHOD")
	private String saraMethod;

	@Column(name = "QC_USER")
	private String saraQcUser;

	@Column(name = "CREATED_DATE")
	private Date saraCreatedDate;

	@Column(name = "SARA_COMMENT")
	private String saraComments;

	@Column(name = "SARA_RESIDUE_WT")
	private Double saraResidueWt;

	@Column(name = "SARA_NSO_MG")
	private Double saraNsoMg;

	@Column(name = "SARA_QC")
	private String saraQc;

	@Column(name = "IQM_FLAG")
	private String saraIqmFlag;

	@Column(name = "SARA_AUTHOR")
	private String saraAuthor;

	@Column(name = "SARA_ARO_MG")
	private Double saraAroMg;

	@Column(name = "SARA_SAT_MG")
	private Double saraSatMg;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SARA_CONF")
	private Double saraConf;

	@Column(name = "JOB_ID")
	private String saraJobId;

	@Column(name = "SARA_NSO_WHO")
	private Double saraNsoWho;

	@Column(name = "SARA_TOP_RAT")
	private Double saraTopRat;

	@Column(name = "SARA_ASPH_MG")
	private Double saraAsphMg;

	@Column(name = "SARA_ASPH_WHO")
	private Double saraAsphWho;

	@Column(name = "SARA_RESIDUE_PCT")
	private Double saraResidualPct;

	@Column(name = "CREATED_USER")
	private String saraCreatedUser;

	@Column(name = "QC_FLAG")
	private String saraQcFlag;

	@Column(name = "QC_DATE")
	private Date saraQcDate;

	@Column(name = "SARA_PRECIP_TIME")
	private Double saraPrecipTime;

	@Column(name = "SARA_ASPH_PCT")
	private Double saraAsphPct;

	@Column(name = "SARA_ARO_PCT")
	private Double saraAroPct;

	@Column(name = "SAMPLE_ID_VEND")
	private String saraSampleIdVend;

	@Column(name = "SVC_CODE")
	private String saraSvcCode;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SARA_LAB")
	private String saraLab;

	@Column(name = "SARA_DATE")
	private Date saraAcqDate;

	@Column(name = "SARA_ASPH_TOP")
	private Double saraAsphTop;

	@Column(name = "SARA_SAT_PCT")
	private Double saraSatPct;

	@Column(name = "SARA_TOP_PCT")
	private Double saraTopPct;

	@Column(name = "SARA_OIL_PCT")
	private Double saraOilPct;

	@Column(name = "UPDATED_USER")
	private String saraUpdatedUser;

	@Column(name = "RUN_NUMBER")
	private String saraRunNumber;

	@Column(name = "SARA_NSO_PCT")
	private Double saraNsoPct;

	@Column(name = "SARA_SAMP_MG")
	private Double saraSampMg;

	@Column(name = "SARA_RESIN_TOP", insertable = false, updatable = false)
	private Double saraNsoTop;

	@Transient
	private Double saraNs0Top;

	@Transient
	private Date saraLastUpdate;

	@Transient
	private String saraIqmCode;

	@Transient
	private Double saraResinWho;


	@Override
	public String getName() {
		 return AnalysisConstants.SARA;
	}
}
