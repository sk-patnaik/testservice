package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilPourpoint;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_POURPOINT", schema="gfs")
public class FpcOilPourpoint extends FpcDatabaseObject implements GTOOilPourpoint, Serializable {

	@Column(name = "LAST_UPDATE")
	private Date ppLastUpdate;

	@Column(name = "PP_CONF")
	private Double ppConf;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "PP_METHOD")
	private String ppMethod;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "PP_DATE")
	private Date ppAcqDate;

	@Column(name = "PP_LAB")
	private String ppLab;

	@Column(name = "QC_USER")
	private String ppQcUser;

	@Column(name = "PP_COMMENT")
	private String ppComments;

	@Column(name = "PP_QC")
	private String ppQc;

	@Column(name = "PP_VALUE_QUALIFIER")
	private String ppValueQualifier;

	@Column(name = "PP_VALUE")
	private Double ppValue;

	@Column(name = "SVC_CODE")
	private String ppSvcCode;

	@Column(name = "RUN_NUMBER")
	private String ppRunNumber;

	@Column(name = "PP_AUTHOR")
	private String ppAuthor;

	@Column(name = "PP_UNITS")
	private String ppUnits;

	@Column(name = "QC_DATE")
	private Date ppQcDate;

	@Column(name = "JOB_ID")
	private String ppJobId;

	@Column(name = "IQM_CODE")
	private String ppIqmCode;

	@Column(name = "SAMPLE_ID_VEND")
	private String ppSampleIdVend;

	@Transient
	private Date ppUpdatedDate;

	@Transient
	private String ppRequestId;

	@Transient
	private String ppCreatedUser;

	@Transient
	private String ppUpperQual;

	@Transient
	private String ppType;

	@Transient
	private String ppUpdatedUser;

	@Transient
	private String ppLabref;

	@Transient
	private String ppLabrefPage;

	@Transient
	private String ppLowerQual;

	@Transient
	private String ppComment;

	@Transient
	private String ppOpid;

	@Transient
	private Double ppUpper;

	@Transient
	private Double ppLower;

	@Transient
	private Date ppCreatedDate;

	@Transient
	private String ppQual;

	@Transient
	private String ppRequestIdVend;

	@Transient
	private String ppQcFlag;

	@Override
	public String getName() {
		return AnalysisConstants.PHYSICAL_PROPERTIES_POURPOINT;
	}
}
