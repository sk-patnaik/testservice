package com.shell.siep.gto.persistence.databases.bg.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.bg.model.BGDatabaseObject;
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
@Table(name="FPC_OIL_WATER")
public class BGOilWater extends BGDatabaseObject implements GTOOilWater, Serializable {

	@Column(name = "QC_DATE")
	private Date h2oQcDate;

	@Column(name = "H2O_CONF")
	private Double h2oConf;

	@Column(name = "IQM_CODE")
	private String h2oIqmCode;

	@Column(name = "H2O_VALUE_QUALIFIER")
	private String h2oValueQualifier;

	@Column(name = "H2O_LAB")
	private String h2oLab;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "H2O_COMMENT")
	private String h2oComments;

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

	@Column(name = "RUN_NUMBER")
	private String h2oRunNumber;

	@Column(name = "LAST_UPDATE")
	private Date h2oLastUpdate;

	@Transient
	private Integer h2oUnits;

	@Override
	public String getName() {
		return AnalysisConstants.OIL_WATER_CONTENT;
	}

}
