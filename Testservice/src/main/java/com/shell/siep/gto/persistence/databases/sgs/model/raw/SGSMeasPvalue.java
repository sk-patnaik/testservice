package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOMeasPvalue;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_PVALUE", schema="sgs_data")
public class SGSMeasPvalue extends SGSDatabaseObject implements GTOMeasPvalue, Serializable {

	@Column(name = "UPDATED_DATE")
	private Date pvLastUpdate;

	@Column(name = "RUN_NUMBER")
	private String pvRunNumber;

	@Column(name = "PV_COMMENT")
	private String pvComment;

	@Column(name = "PV_LOWER")
	private Double pvLower;

	@Column(name = "PV_TEMP_UNITS")
	private String pvTempUnits;

	@Column(name = "CREATED_USER")
	private String pvCreatedUser;

	@Column(name = "PV_UPPER")
	private Double pvUpper;

	@Column(name = "PV_UPPER_QUAL")
	private String pvUpperQual;

	@Column(name = "SAMPLE_ID_VEND")
	private String pvSampleIdVend;

	@Column(name = "PV_AUTHOR")
	private String pvAuthor;

	@Column(name = "PV_LABREF")
	private String pvLabref;

	@Column(name = "UPDATED_USER")
	private String pvUpdatedUser;

	@Column(name = "REQUEST_ID_VEND")
	private String pvRequestIdVend;

	@Column(name = "CREATED_DATE")
	private Date pvCreatedDate;

	@Column(name = "PV_LAB")
	private String pvLab;

	@Column(name = "PV_METHOD")
	private String pvMethod;

	@Column(name = "PV_LABREF_PAGE")
	private String pvLabrefPage;

	@Column(name = "PV_LOWER_QUAL")
	private String pvLowerQual;

	@Column(name = "PV_TYPE")
	private String pvType;

	@Column(name = "SVC_CODE")
	private String pvSvcCode;

	@Column(name = "PV_DATE")
	private Date pvDate;

	@Column(name = "QC_FLAG")
	private String pvQcFlag;

	@Column(name = "QC_DATE")
	private Date pvQcDate;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "PV_UNITS")
	private String pvUnits;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "PV_TEMP")
	private Integer pvTemp;

	@Column(name = "QC_USER")
	private String pvQcUser;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_PVALUE;
	}
}
