package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilWax;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_WAX")
public class DDOilWax extends DDDatabaseObject implements GTOOilWax, Serializable {

	@Column(name = "WAX_COMMENT")
	private String waxComment;

	@Column(name = "LAST_UPDATE")
	private Date waxLastUpdate;

	@Column(name = "WAX_METHOD")
	private String waxMethod;

	@Column(name = "WAX_DATE")
	private Date waxAcqDate;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "JOB_ID")
	private String waxJobId;

	@Column(name = "WAX_AUTHOR")
	private String waxAuthor;

	@Column(name = "QC_USER")
	private String waxHtQcUser;

	@Column(name = "SAMPLE_ID_VEND")
	private String waxSampleIdVend;

	@Column(name = "QC_DATE")
	private Date waxHtQcDate;

	@Column(name = "WAX_QC")
	private String waxQc;

	@Column(name = "WAX_VALUE")
	private Double waxValue;

	@Column(name = "WAX_LAB")
	private String waxLab;

	@Column(name = "IQM_CODE")
	private String waxHtIqmCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "RUN_NUMBER")
	private String waxRunNumber;

	@Column(name = "WAX_VALUE_QUALIFIER")
	private String waxValueQualifier;

	@Column(name = "WAX_DATE", insertable = false, updatable = false)
	private Date waxDate;

	@Column(name = "WAX_CONF")
	private Double waxConf;

	@Column(name = "SVC_CODE")
	private String waxSvcCode;

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
