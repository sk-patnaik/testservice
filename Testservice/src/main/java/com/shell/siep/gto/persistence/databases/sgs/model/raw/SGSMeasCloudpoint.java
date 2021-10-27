package com.shell.siep.gto.persistence.databases.sgs.model.raw;


import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilCloudpoint;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_CLOUDPOINT", schema="sgs_data")
public class SGSMeasCloudpoint extends SGSDatabaseObject implements GTOOilCloudpoint, Serializable {

	@Column(name = "CP_LABREF_PAGE_EXT")
	private String cpLabrefPageExt;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "CP_METHOD_STD")
	private String cpMethodStd;

	@Column(name = "CP_VALUE_STD")
	private Double cpValueStd;

	@Column(name = "CREATED_DATE")
	private Date cpCreatedDate;

	@Column(name = "CP_METHOD_OTH")
	private String cpMethodOth;

	@Column(name = "CP_VALUE_OTH")
	private Double cpValueOth;

	@Column(name = "CP_CONF_EXT")
	private Double cpConfExt;

	@Column(name = "QC_USER")
	private String cpQcUser;

	@Column(name = "REQUEST_ID_VEND")
	private String cpRequestIdVend;

	@Column(name = "QC_FLAG")
	private String cpQcFlag;

	@Column(name = "CP_METHOD_EXT")
	private String cpMethodExt;

	@Column(name = "RUN_NUMBER")
	private String cpRunNumber;

	@Column(name = "CP_LABREF_EXT")
	private String cpLabrefExt;

	@Column(name = "QC_DATE")
	private Date cpQcDate;

	@Column(name = "CREATED_USER")
	private String cpCreatedUser;

	@Column(name = "CP_TEMP_UNITS")
	private String cpTempUnits;

	@Column(name = "SVC_CODE")
	private String cpSvcCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "CP_LAB")
	private String cpLab;

	@Column(name = "CP_QUAL_STD")
	private String cpQualStd;

	@Column(name = "CP_DATE")
	private Date cpAcqDate;

	@Column(name = "CP_LABREF_OTH")
	private String cpLabrefOth;

	@Column(name = "CP_QUAL_OTH")
	private String cpQualOth;

	@Column(name = "CP_CONF_STD")
	private Double cpConfStd;

	@Column(name = "CP_LABREF_STD")
	private String cpLabrefStd;

	@Column(name = "CP_CONF_OTH")
	private Double cpConfOth;

	@Column(name = "UPDATED_DATE")
	private Date cpUpdatedDate;

	@Column(name = "CP_LABREF_PAGE_STD")
	private String cpLabrefPageStd;

	@Column(name = "CP_QUAL_EXT")
	private String cpQualExt;

	@Column(name = "CP_AUTHOR")
	private String cpAuthor;

	@Column(name = "CP_LABREF_PAGE_OTH")
	private String cpLabrefPageOth;

	@Column(name = "SAMPLE_ID_VEND")
	private String cpSampleIdVend;

	@Column(name = "CP_VALUE_EXT")
	private Double cpValueExt;

	@Column(name = "CP_COMMENTS")
	private String cpComments;

	@Column(name = "UPDATED_USER")
	private String cpUpdatedUser;

	@Column(name = "IQM_FLAG")
	private String cpIqmFlag;

	@Transient
	private String cpIqmCode;

	@Override
	public String getName() {
		return AnalysisConstants.PHYSICAL_PROPERTIES_CLOUD_POINT;
	}

}
