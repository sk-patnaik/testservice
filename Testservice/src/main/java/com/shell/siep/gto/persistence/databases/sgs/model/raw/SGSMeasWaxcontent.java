package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilWax;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_WAXCONTENT", schema="sgs_data")
public class SGSMeasWaxcontent extends SGSDatabaseObject implements GTOOilWax, Serializable {

	@Column(name = "WAX_TEMP")
	private Integer waxTemp;

	@Column(name = "WAX_VALUE")
	private Double waxValue;

	@Column(name = "QC_DATE")
	private Date waxQcDate;

	@Column(name = "WAX_LAB")
	private String waxLab;

	@Column(name = "IQM_CODE")
	private String waxIqmCode;

	@Column(name = "WAX_LABREF_PAGE")
	private String waxLabrefPage;

	@Column(name = "WAX_QUAL")
	private String waxQual;

	@Column(name = "JOB_ID")
	private String waxJobId;

	@Column(name = "WAX_AUTHOR")
	private String waxAuthor;

	@Column(name = "WAX_DATE")
	private Date waxDate;

	@Column(name = "WAX_COMMENT")
	private String waxComment;

	@Column(name = "WAX_CONF")
	private Double waxConf;

	@Column(name = "UPDATED_DATE")
	private Date waxLastUpdate;

	@Column(name = "WAX_METHOD")
	private String waxMethod;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SAMPLE_ID_VEND")
	private String waxSampleIdVend;

	@Column(name = "WAX_LABREF")
	private String waxLabref;

	@Column(name = "RUN_NUMBER")
	private String waxRunNumber;

	@Column(name = "WAX_TEMP_UNITS")
	private String waxTempUnits;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SVC_CODE")
	private String waxSvcCode;

	@Column(name = "CREATED_USER")
	private String waxCreatedUser;

	@Column(name = "QC_USER")
	private String waxQcUser;

	@Column(name = "WAX_QC")
	private String waxQc;

	@Column(name = "UPDATED_USER")
	private String waxUpdatedUser;

	@Column(name = "CREATED_DATE")
	private Date waxCreatedDate;

	@Transient
	private String waxHtIqmCode;

	@Transient
	private String waxHtQcUser;

	@Transient
	private Date waxAcqDate;

	@Transient
	private String waxValueQualifier;

	@Transient
	private Date waxHtQcDate;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_WAX_CONTENT;
	}
}
