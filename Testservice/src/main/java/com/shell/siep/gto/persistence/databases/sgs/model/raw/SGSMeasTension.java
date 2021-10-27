package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOMeasTension;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_TENSION", schema="sgs_data")
public class SGSMeasTension extends SGSDatabaseObject implements GTOMeasTension, Serializable {

	@Column(name = "TENS_LABREF")
	private String tensLabref;

	@Column(name = "TENS_OPID")
	private Integer tensOpid;

	@Column(name = "TENS_LABPAGE")
	private String tensLabpage;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "QC_USER")
	private String tensQcUser;

	@Column(name = "TENS_METHOD")
	private String tensMethod;

	@Column(name = "TENS_LAB")
	private String tensLab;

	@Column(name = "SAMPLE_ID_VEND")
	private String tensSampleIdVend;

	@Column(name = "UPDATED_USER")
	private String tensUpdatedUser;

	@Column(name = "TENS_VALUE")
	private Double tensValue;

	@Column(name = "TENS_TEMP")
	private Double tensTemp;

	@Column(name = "CREATED_DATE")
	private String tensCreatedDate;

	@Column(name = "TENS_AUTHOR")
	private String tensAuthor;

	@Column(name = "TENS_TEMP_UNITS")
	private String tensTempUnits;

	@Column(name = "QC_FLAG")
	private String tensQcFlag;

	@Column(name = "RUN_NUMBER")
	private String tensRunNumber;

	@Column(name = "QC_DATE")
	private Date tensQcDate;

	@Column(name = "UPDATED_DATE")
	private Date tensUpdatedDate;

	@Column(name = "TENS_QUAL")
	private String tensQual;

	@Column(name = "REQUEST_ID_VEND")
	private String tensRequestIdVendor;

	@Column(name = "CREATED_USER")
	private String tensCreatedUser;

	@Column(name = "SVC_CODE")
	private String tensSvcCode;

	@Column(name = "JOB_ID")
	private String tensJobId;

	@Column(name = "TENS_DATE")
	private Date tensAcqDate;

	@Column(name = "TENS_UNITS")
	private String tensUnits;

	@Column(name = "TENS_COMMENTS")
	private String tensComments;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_TENSION;
	}
}
