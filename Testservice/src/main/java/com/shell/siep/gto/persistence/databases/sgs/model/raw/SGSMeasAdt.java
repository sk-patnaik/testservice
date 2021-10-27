package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOMeasAdt;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_ADT", schema="sgs_data")
public class SGSMeasAdt extends SGSDatabaseObject implements GTOMeasAdt, Serializable {

	@Column(name = "ADT_UNITS")
	private String adtUnits;

	@Column(name = "REQUEST_ID_VEND")
	private String adtRequestIdVend;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "RUN_NUMBER")
	private String adtRunNumber;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "ADT_DATE")
	private Date adtDate;

	@Column(name = "ADT_TEMP_UNITS")
	private String adtTempUnits;

	@Column(name = "SVC_CODE")
	private String adtSvcCode;

	@Column(name = "CREATED_DATE")
	private Date adtCreatedDate;

	@Column(name = "ADT_METHOD")
	private String adtMethod;

	@Column(name = "ADT_VALUE")
	private Double adtValue;

	@Column(name = "IQM_FLAG")
	private String adtIqmFlag;

	@Column(name = "ADT_TEMP")
	private Double adtTemp;

	@Column(name = "QC_USER")
	private String adtQcUser;

	@Column(name = "CREATED_USER")
	private String adtCreatedUser;

	@Column(name = "ADT_QUAL")
	private String adtQual;

	@Column(name = "UPDATED_USER")
	private String adtUpdatedUser;

	@Column(name = "ADT_LABREF")
	private String adtLabref;

	@Column(name = "QC_FLAG")
	private String adtQcFlag;

	@Column(name = "ADT_COMMENTS")
	private String adtComments;

	@Column(name = "QC_DATE")
	private Date adtQcDate;

	@Column(name = "ADT_LABREF_PAGE")
	private String adtLabrefPage;

	@Column(name = "UPDATED_DATE")
	private Date adtUpdatedDate;

	@Column(name = "SAMPLE_ID_VENDOR")
	private String adtSampleIdVendor;

	@Column(name = "ADT_OPID")
	private Integer adtOpid;


	@Override
	public String getName() {
		 return AnalysisConstants.ASPHALTENE_DISPERSION;
	}
}
