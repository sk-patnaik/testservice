package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilWater;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_WATERCONTENT", schema="sgs_data")
public class SGSMeasWatercontent extends SGSDatabaseObject implements GTOOilWater, Serializable {

	@Column(name = "H2O_UNITS")
	private Integer h2oUnits;

	@Column(name = "QC_DATE")
	private Date h2oQcDate;

	@Column(name = "H2O_CONF")
	private Double h2oConf;

	@Column(name = "H2O_LAB")
	private String h2oLab;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "H2O_COMMENT")
	private String h2oComments;

	@Column(name = "H2O_BSW_EMULSION")
	private Double h2oBswEmulsion;

	@Column(name = "H2O_BSW_SOLIDS")
	private Double h2oBswSolids;

	@Column(name = "H2O_VALUE")
	private Double h2oValue;

	@Column(name = "SAMPLE_ID_VEND")
	private String h2oSampleIdVend;

	@Column(name = "H2O_QC")
	private String h2oQc;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "H2O_AUTHOR")
	private String h2oAuthor;

	@Column(name = "H2O_METHOD")
	private String h2oMethod;

	@Column(name = "H2O_DATE")
	private Date h2oAcqDate;

	@Column(name = "SVC_CODE")
	private String h2oSvcCode;

	@Column(name = "QC_USER")
	private String h2oQcUser;

	@Column(name = "JOB_ID")
	private String h2oJobId;

	@Column(name = "H2O_Q")
	private String h2oQ;

	@Column(name = "RUN_NUMBER")
	private String h2oRunNumber;

	@Column(name = "REQUEST_ID_VEND")
	private String h2oRequestIdVend;

	@Column(name = "UPDATED_DATE")
	private Date h2oLastUpdate;

	@Transient
	private String h2oIqmCode;

	@Transient
	private String h2oValueQualifier;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_WATER_CONTENT;
	}
}
