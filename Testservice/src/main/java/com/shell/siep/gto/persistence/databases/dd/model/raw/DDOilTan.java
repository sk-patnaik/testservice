package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilTan;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_TAN")
public class DDOilTan extends DDDatabaseObject implements GTOOilTan, Serializable {

	@Column(name = "TAN_AUTHOR")
	private String tanAuthor;

	@Column(name = "RUN_NUMBER")
	private String tanRunNumber;

	@Column(name = "IQM_CODE")
	private String tanIqmCode;

	@Column(name = "TAN_COMMENT")
	private String tanComments;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "TAN_VALUE")
	private Double tanValue;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "JOB_ID")
	private String tanJobId;

	@Column(name = "SVC_CODE")
	private String tanSvcCode;

	@Column(name = "TAN_LAB")
	private String tanLab;

	@Column(name = "TAN_VALUE_QUALIFIER")
	private String tanValueQualifier;

	@Column(name = "QC_DATE")
	private Date tanQcDate;

	@Column(name = "LAST_UPDATE")
	private Date tanLastUpdate;

	@Column(name = "TAN_METHOD")
	private String tanMethod;

	@Column(name = "QC_USER")
	private String tanQcUser;

	@Column(name = "TAN_UNITS")
	private String tanUnits;

	@Column(name = "SAMPLE_ID_VEND")
	private String tanSampleIdVend;

	@Column(name = "TAN_CONF")
	private Double tanConf;

	@Column(name = "TAN_DATE")
	private Date tanAcqDate;

	@Column(name = "TAN_QC")
	private String tanQc;

	@Transient
	private String tanValueQual;

	@Transient
	private String tanRequestIdVend;


	@Override
	public String getName() {
		 return AnalysisConstants.OIL_TAN;
	}
}
