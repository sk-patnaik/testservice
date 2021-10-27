package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
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
@Table(name="FPC_CHROMDATA_BLOB", schema="sgs_data")
public class SGSChromdataBlob extends SGSDatabaseObject implements GTOChromdataBlob, Serializable {

	@Column(name = "SAMPLE_ID_VEND")
	private String chromdataLabNum;

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

	@Column(name = "CREATED_DATE")
	private Date chromdataCreatedDate;

	@Column(name = "RUN_NUMBER")
	private String chromdataRunNumber;

	@Column(name = "UPDATED_DATE")
	private Date chromdataLastUpdated;

	@Column(name = "CD_DATA_TYPE")
	private String chromdataType;

	@Column(name = "CREATED_USER")
	private String chromdataCreatedUser;

	@Column(name = "JOB_ID")
	private String chromdataJobId;

	@Column(name = "QC_USER")
	private String chromdataQcUser;

	@Column(name = "REQUEST_ID_VEND")
	private String chromdataRequestIdVend;

	@Column(name = "CD_LAB")
	private String chromdataLab;

	@Column(name = "CD_COMMENT")
	private String chromdataComments;

	@Column(name = "CD_VERSION")
	private Integer chromdataVersion;

	@Column(name = "CD_METHOD")
	private String chromdataMethod;

	@Column(name = "CD_QC")
	private String chromdataQc;

	@Column(name = "CD_AUTHOR")
	private String chromdataAuthor;

	@Column(name = "IQM_CODE")
	private String chromdataIqmCode;

	@Column(name = "UPDATED_USER")
	private String chromdataUpdatedUser;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Transient
	private Date chromdataLastUpdate;

	@Transient
	private String chromdataComment;

	@Transient
	private Integer chromdataRecordId;

	@Override
	public String getName() {
		return AnalysisConstants.CHROMATOGRAMS;
	}
}
