package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcXmdgcNaph;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_XMDGC_NAPH", schema="gfs")
public class FpcGcXmdgcNaph extends FpcDatabaseObject implements GTOGcXmdgcNaph, Serializable {

	@Column(name = "GM_COMMENT")
	private String xnComments;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "XN_DATE")
	private Date xnAcqDate;

	@Column(name = "XN_DATE", insertable = false, updatable = false)
	private Date xnDate;

	@Column(name = "XN_TMN1")
	private Double xnTmn1;

	@Column(name = "XN_TMN2")
	private Double xnTmn2;

	@Column(name = "XN_TMN3")
	private Double xnTmn3;

	@Column(name = "QC_DATE")
	private Date xnQcDate;

	@Column(name = "QC_USER")
	private String xnQcUser;

	@Column(name = "XN_METHOD")
	private String xnMethod;

	@Column(name = "XN_DMN5")
	private Double xnDmn5;

	@Column(name = "XN_DMN4")
	private Double xnDmn4;

	@Column(name = "XN_DMN7")
	private Double xnDmn7;

	@Column(name = "XN_DMN6")
	private Double xnDmn6;

	@Column(name = "XN_DMN9")
	private Double xnDmn9;

	@Column(name = "XN_DMN8")
	private Double xnDmn8;

	@Column(name = "XN_DMN1")
	private Double xnDmn1;

	@Column(name = "XN_DMN3")
	private Double xnDmn3;

	@Column(name = "XN_DMN2")
	private Double xnDmn2;

	@Column(name = "SVC_CODE")
	private String xnSvcCode;

	@Column(name = "GM_AUTHOR")
	private String xnAuthor;

	@Column(name = "LAST_UPDATE")
	private Date xnLastUpdate;

	@Column(name = "JOB_ID")
	private String xnJobId;

	@Column(name = "XN_DATA_TYPE")
	private String xnDataType;

	@Column(name = "XN_MN1")
	private Double xnMn1;

	@Column(name = "XN_MN2")
	private Double xnMn2;

	@Column(name = "RUN_NUMBER")
	private String xnRunNumber;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SAMPLE_ID_VEND")
	private String xnSampleIdVend;

	@Column(name = "IQM_CODE")
	private String xnIqmCode;

	@Column(name = "XN_LAB")
	private String xnLab;

	@Column(name = "GM_QC")
	private String xnQc;


	@Override
	public String getName() {
		 return AnalysisConstants.GC_XMDGC_NAPH;
	}
}
