package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;

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
@Table(name="WTC_MEAS_POURPOINT", schema="sgs_data")
public class SGSMeasPourpoint extends SGSDatabaseObject implements GTOOilPourpoint, Serializable {

	@Column(name = "UPDATED_DATE")
	private Date ppUpdatedDate;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "CREATED_USER")
	private String ppCreatedUser;

	@Column(name = "PP_UPPER_QUAL")
	private String ppUpperQual;

	@Column(name = "SAMPLE_ID_VEND")
	private String ppSampleIdVend;

	@Column(name = "PP_DATE")
	private Date ppAcqDate;

	@Column(name = "PP_VALUE")
	private Double ppValue;

	@Column(name = "PP_LAB")
	private String ppLab;

	@Column(name = "PP_TYPE")
	private String ppType;

	@Column(name = "PP_CONF")
	private Double ppConf;

	@Column(name = "QC_USER")
	private String ppQcUser;

	@Column(name = "UPDATED_USER")
	private String ppUpdatedUser;

	@Column(name = "SVC_CODE")
	private String ppSvcCode;

	@Column(name = "PP_LABREF")
	private String ppLabref;

	@Column(name = "PP_LABREF_PAGE")
	private String ppLabrefPage;

	@Column(name = "PP_LOWER_QUAL")
	private String ppLowerQual;

	@Column(name = "RUN_NUMBER")
	private String ppRunNumber;

	@Column(name = "PP_COMMENT")
	private String ppComment;

	@Column(name = "PP_OPID")
	private String ppOpid;

	@Column(name = "PP_AUTHOR")
	private String ppAuthor;

	@Column(name = "PP_UPPER")
	private Double ppUpper;

	@Column(name = "PP_UNITS")
	private String ppUnits;

	@Column(name = "PP_LOWER")
	private Double ppLower;

	@Column(name = "PP_METHOD")
	private String ppMethod;

	@Column(name = "CREATED_DATE")
	private Date ppCreatedDate;

	@Column(name = "PP_QUAL")
	private String ppQual;

	@Column(name = "REQUEST_ID_VEND")
	private String ppRequestIdVend;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "QC_DATE")
	private Date ppQcDate;

	@Column(name = "QC_FLAG")
	private String ppQcFlag;

	@Column(name = "JOB_ID")
	private String ppJobId;

	@Transient
	private Date ppLastUpdate;

	@Transient
	private String ppQc;

	@Transient
	private String ppValueQualifier;

	@Transient
	private String ppIqmCode;

	@Transient
	private String ppRequest;

	@Transient
	private String ppComments;

	@Override
	public String getName() {
		return AnalysisConstants.PHYSICAL_PROPERTIES_POURPOINT;
	}

}
