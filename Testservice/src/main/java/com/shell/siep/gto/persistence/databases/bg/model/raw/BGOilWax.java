package com.shell.siep.gto.persistence.databases.bg.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.bg.model.BGDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisData;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_WAX")
public class BGOilWax extends BGDatabaseObject implements GTOAnalysisData, Serializable {

	@Column(name = "WAX_VALUE")
	private Double waxValue;

	@Column(name = "WAX_LAB")
	private String waxLab;

	@Column(name = "IQM_CODE")
	private String waxHtIqmCode;

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

	@Column(name = "LAST_UPDATE")
	private Date waxLastUpdate;

	@Column(name = "WAX_METHOD")
	private String waxMethod;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "QC_USER")
	private String waxHtQcUser;

	@Column(name = "SAMPLE_ID_VEND")
	private String waxSampleIdVend;

	@Column(name = "WAX_DATE", insertable = false, updatable = false)
	private Date waxAcqDate;

	@Column(name = "RUN_NUMBER")
	private String waxRunNumber;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SVC_CODE")
	private String waxSvcCode;

	@Column(name = "WAX_VALUE_QUALIFIER")
	private String waxValueQualifier;

	@Column(name = "QC_DATE")
	private Date waxHtQcDate;

	@Column(name = "WAX_QC")
	private String waxQc;

	@Transient
	private Integer waxTemp;

	@Transient
	private Date waxQcDate;

	@Transient
	private String waxIqmCode;

	@Transient
	private String waxLabrefPage;

	@Transient
	private String waxQual;

	@Transient
	private String waxLabref;

	@Transient
	private String waxTempUnits;

	@Transient
	private String waxCreatedUser;

	@Transient
	private String waxQcUser;

	@Transient
	private String waxUpdatedUser;

	@Transient
	private Date waxCreatedDate;

	@Override
	public String getName() {
		return AnalysisConstants.OIL_WAX_CONTENT;
	}
}
