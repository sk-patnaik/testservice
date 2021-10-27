package com.shell.siep.gto.persistence.databases.bg.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.bg.model.BGDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOChromdataBlob;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_CHROMDATA_BLOB")
public class BGChromdataBlob extends BGDatabaseObject implements GTOChromdataBlob, Serializable {

	@Column(name = "SAMPLE_ID_VEND")
	private String chromdataLabNum;

	@Column(name = "LAST_UPDATE")
	private Date chromdataLastUpdate;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SAMPLE_ID_VEND", insertable = false, updatable = false)
	private String chromdataSampleIdVend;

	@Column(name = "CD_DATE")
	private Date chromdataJobDate;

	@Column(name = "SVC_CODE")
	private String chromdataSvcCode;

	@Column(name = "QC_DATE")
	private Date chromdataQcDate;

	@Column(name = "RUN_NUMBER")
	private String chromdataRunNumber;

	@Column(name = "CD_DATA_TYPE")
	private String chromdataType;

	@Column(name = "JOB_ID")
	private String chromdataJobId;

	@Column(name = "QC_USER")
	private String chromdataQcUser;

	@Column(name = "CD_LAB")
	private String chromdataLab;

	@Column(name = "CD_COMMENT")
	private String chromdataComment;

	@Column(name = "CD_VERSION")
	private Integer chromdataVersion;

	@Column(name = "CD_METHOD")
	private String chromdataMethod;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer chromdataRecordId;

	@Column(name = "CD_QC")
	private String chromdataQc;

	@Column(name = "CD_AUTHOR")
	private String chromdataAuthor;

	@Column(name = "IQM_CODE")
	private String chromdataIqmCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Transient
	private Date chromdataCreatedDate;

	@Transient
	private Date chromdataLastUpdated;

	@Transient
	private String chromdataCreatedUser;

	@Transient
	private String chromdataRequestIdVend;

	@Transient
	private String chromdataComments;

	@Transient
	private String chromdataUpdatedUser;


	@Override
	public String getName() {
		return AnalysisConstants.CHROMATOGRAMS;
	}
}
