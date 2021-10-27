package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
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
@Table(name="FPC_ROCK_TOC", schema="gfs")
public class FpcRockToc extends FpcDatabaseObject implements GTORockToc, Serializable {

	@Column(name = "LAST_UPDATE")
	private Date tocLastUpdate;

	@Column(name = "TOC_VALUE")
	private Double toc;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "FK_UNITS_ID")
	private Integer tocUom;

	@Column(name = "RUN_NUMBER")
	private String tocRunNumber;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer tocRecordType;

	@Column(name = "IQM_CODE")
	private String tocIqmCode;

	@Column(name = "QC_DATE")
	private Date tocQcDate;

	@Column(name = "JOB_ID")
	private String tocJobId;

	@Column(name = "QC_USER")
	private String tocQcUser;

	@Column(name = "TOC_METHOD")
	private String tocMethod;

	@Column(name = "TOC_AUTHOR")
	private String tocAuthor;

	@Column(name = "TOC_LAB")
	private String tocLab;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer tocConfType;

	@Column(name = "SVC_CODE")
	private String tocSvcCode;

	@Column(name = "FK_DATATYPE_ID")
	private Integer tocPrep;

	@Column(name = "TOC_QC")
	private String tocQc;

	@Column(name = "TOC_CARBONATE")
	private Double tocCarbonate;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "TOC_CONF")
	private Double tocConf;

	@Column(name = "PF_UNITS")
	private Integer tocPfUnits;

	@Column(name = "SAMPLE_ID_VEND")
	private String tocSampleIdVend;

	@Column(name = "TOC_RAL")
	private Double tocRal;

	@Column(name = "FK_METHOD_ID")
	private Integer tocMethodNew;

	@Column(name = "TOC_COMMENT")
	private String tocComments;

	@Column(name = "TOC_DATE")
	private Date tocAcqDate;

	public String getName() {
		return AnalysisConstants.ROCK_TOC;
	}
}
