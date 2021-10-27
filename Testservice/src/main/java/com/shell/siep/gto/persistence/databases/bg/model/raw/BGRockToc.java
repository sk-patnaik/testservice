package com.shell.siep.gto.persistence.databases.bg.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.bg.model.BGDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTORockToc;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ROCK_TOC")
public class BGRockToc extends BGDatabaseObject implements GTORockToc, Serializable {

	@Column(name = "RUN_NUMBER")
	private String tocRunNumber;

	@Column(name = "TOC_CARBONATE")
	private Double tocCarbonate;

	@Column(name = "LAST_UPDATE")
	private Date tocLastUpdate;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "TOC_CONF")
	private Double tocConf;

	@Column(name = "TOC_LAB")
	private String tocLab;

	@Column(name = "TOC_VALUE")
	private Double toc;

	@Column(name = "SVC_CODE")
	private String tocSvcCode;

	@Column(name = "PF_UNITS")
	private Integer tocPfUnits;

	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SAMPLE_ID_VEND")
	private String tocSampleIdVend;

	@Column(name = "IQM_CODE")
	private String tocIqmCode;

	@Column(name = "QC_DATE")
	private Date tocQcDate;

	@Column(name = "TOC_RAL")
	private Double tocRal;

	@Column(name = "JOB_ID")
	private String tocJobId;

	@Column(name = "TOC_QC")
	private String tocQc;

	@Column(name = "QC_USER")
	private String tocQcUser;

	@Column(name = "TOC_METHOD")
	private String tocMethod;

	@Column(name = "TOC_AUTHOR")
	private String tocAuthor;

	@Column(name = "TOC_COMMENT")
	private String tocComments;

	@Column(name = "TOC_DATE")
	private Date tocAcqDate;

	@Transient
	private Integer tocUom;

	@Transient
	private Integer tocRecordType;

	@Transient
	private Integer tocConfType;

	@Transient
	private Integer tocPrep;

	@Transient
	private Integer tocMethodNew;

	@Override
	public String getName() {
		return AnalysisConstants.ROCK_TOC;
	}
}
