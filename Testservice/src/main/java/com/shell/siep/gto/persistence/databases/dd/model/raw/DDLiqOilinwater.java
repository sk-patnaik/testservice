package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqOilinwater;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_OILINWATER")
public class DDLiqOilinwater extends DDDatabaseObject implements GTOLiqOilinwater, Serializable {

	@Column(name = "FK_OIW_UNITS_ID")
	private Integer oiwUnitsId;

	@Column(name = "CREATED_USER")
	private String oiwCreatedUser;

	@Column(name = "CREATED_DATE")
	private Date oiwCreatedDate;

	@Column(name = "OIW_ARO_Q")
	private String oiwAroQ;

	@Column(name = "RUN_NUMBER")
	private String oiwRunNumber;

	@Column(name = "FK_LAB_ID")
	private Integer oiwLab;

	@Column(name = "PK")
	private Integer oiwPk;

	@Column(name = "FK_OIW_ARO_UNITS_ID")
	private Integer oiwAroUnitsId;

	@Column(name = "OIW_DATE")
	private Date oiwAcqDate;

	@Column(name = "FK_METHOD_ID")
	private Integer oiwMethodId;

	@Column(name = "SAMPLE_ID_VEND")
	private String oiwSampleIdVend;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer oiwRecordTypeId;

	@Column(name = "UPDATED_DATE")
	private Date oiwUpdatedDate;

	@Column(name = "SVC_CODE")
	private String oiwSvcCode;

	@Column(name = "QC_DATE")
	private Date oiwQcDate;

	@Column(name = "OIW_VALUE_Q")
	private String oiwValueQ;

	@Column(name = "QC_USER")
	private String oiwQcUser;

	@Column(name = "REQUEST_ID_VEND")
	private String oiwRequestIdVend;

	@Column(name = "OIW_COMMENT")
	private String oiwComment;

	@Column(name = "OIW_ARO")
	private Double oiwAro;

	@Column(name = "OIW_VALUE")
	private Double oiwValue;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer oiwConfTypeId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "UPDATED_USER")
	private String oiwUpdatedUser;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_OIL_IN_WATER;
	}
}
