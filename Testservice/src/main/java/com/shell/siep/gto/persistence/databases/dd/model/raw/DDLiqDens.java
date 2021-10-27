package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqDens;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_DENS")
public class DDLiqDens extends DDDatabaseObject implements GTOLiqDens, Serializable {

	@Column(name = "PT_DENSITY")
	private Double dnDensity;

	@Column(name = "QC_USER")
	private String dnQcUser;

	@Column(name = "RUN_NUMBER")
	private String dnRunNumber;

	@Column(name = "SVC_CODE")
	private String dnSvcCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "PT_SG_TEMP")
	private Double dnSgTemp;

	@Column(name = "QC_DATE")
	private Date dnQcDate;

	@Column(name = "PT_DENSITY_Q")
	private String dnConQ;

	@Column(name = "UPDATED_USER")
	private String dnUpdatedUser;

	@Column(name = "UPDATED_DATE")
	private Date dnUpdatedDate;

	@Column(name = "FK_METHOD_ID")
	private Integer dnMethodId;

	@Column(name = "CREATED_DATE")
	private Date dnCreatedDate;

	@Column(name = "PT_DENS_TEMP")
	private Double dnDensTemp;

	@Column(name = "CREATED_USER")
	private String dnCreatedUser;

	@Column(name = "FK_PT_DENS_TEMP_UNITS_ID")
	private Integer dnDensTempUnitsId;

	@Column(name = "REQUEST_ID_VEND")
	private String dnRequestIdVend;

	@Column(name = "PT_SG")
	private Double dnSg;

	@Column(name = "PK")
	private Integer dnPk;

	@Column(name = "FK_PT_DENS_UNITS_ID")
	private Integer dnDensUnitsId;

	@Column(name = "PT_AUTHOR")
	private String dnAuthor;

	@Column(name = "SAMPLE_ID_VEND")
	private String dnSampleIdVend;

	@Column(name = "FK_LAB_ID")
	private Integer dnLab;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer dnRecordTypeId;

	@Column(name = "FK_PT_SG_TEMP_UNITS_ID")
	private Integer dnSgTempUnitsId;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer dnConfTypeId;

	@Column(name = "PT_DATE")
	private Date dnAcqDate;

	@Column(name = "PT_COMMENT")
	private String dnComment;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_DENSITY;
	}
}
