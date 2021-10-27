package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilTan;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_TAN", schema="sgs_data")
public class SGSMeasTan extends SGSDatabaseObject implements GTOOilTan, Serializable {

	@Column(name = "TAN_DATE")
	private Date tanAcqDate;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SVC_CODE")
	private String tanSvcCode;

	@Column(name = "TAN_VALUE")
	private Double tanValue;

	@Column(name = "TAN_LAB")
	private String tanLab;

	@Column(name = "TAN_AUTHOR")
	private String tanAuthor;

	@Column(name = "QC_DATE")
	private Date tanQcDate;

	@Column(name = "RUN_NUMBER")
	private String tanRunNumber;

	@Column(name = "UPDATED_DATE")
	private Date tanLastUpdate;

	@Column(name = "TAN_METHOD")
	private String tanMethod;

	@Column(name = "TAN_VALUE_QUAL")
	private String tanValueQual;

	@Column(name = "QC_USER")
	private String tanQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "REQUEST_ID_VEND")
	private String tanRequestIdVend;

	@Column(name = "TAN_UNITS")
	private String tanUnits;

	@Column(name = "JOB_ID")
	private String tanJobId;

	@Column(name = "SAMPLE_ID_VEND")
	private String tanSampleIdVend;

	@Column(name = "TAN_CONF")
	private Double tanConf;

	@Column(name = "TAN_QC")
	private String tanQc;

	@Column(name = "TAN_COMMENT")
	private String tanComments;

	@Transient
	private String tanIqmCode;

	@Transient
	private String tanValueQualifier;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_ACID;
	}
}
