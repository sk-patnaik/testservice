package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqConRes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_CON_RES", schema="gfs")
public class FpcLiqConRes extends FpcDatabaseObject implements GTOLiqConRes, Serializable {

	@Column(name = "FK_PT_CON_TEMP_UNITS_ID")
	private Integer crConTempUnitsId;

	@Column(name = "SAMPLE_ID_VEND")
	private String crSampleIdVend;

	@Column(name = "PT_DATE")
	private Date crAcqDate;

	@Column(name = "CREATED_DATE")
	private Date crCreatedDate;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer crConfTypeId;

	@Column(name = "FK_PT_RES_METHOD_ID")
	private Integer crResMethodId;

	@Column(name = "PT_RES_Q")
	private String crResQ;

	@Column(name = "QC_DATE")
	private Date crQcDate;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer crRecordTypeId;

	@Column(name = "PT_RES")
	private Double crRes;

	@Column(name = "PT_AUTHOR")
	private String crAuthor;

	@Column(name = "PT_COMMENT")
	private String crComment;

	@Column(name = "PK")
	private Integer crPk;

	@Column(name = "PT_CON")
	private Double crCon;

	@Column(name = "PT_CON_Q")
	private String crConQ;

	@Column(name = "SVC_CODE")
	private String crSvcCode;

	@Column(name = "RUN_NUMBER")
	private String crRunNumber;

	@Column(name = "UPDATED_DATE")
	private Date crUpdatedDate;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "FK_PT_RES_UNITS_ID")
	private Integer crResUnitsId;

	@Column(name = "FK_PT_CON_UNITS_ID")
	private Integer crConUnitsId;

	@Column(name = "UPDATED_USER")
	private String crUpdatedUser;

	@Column(name = "PT_RES_TEMP")
	private Double crResTemp;

	@Column(name = "FK_PT_CON_METHOD_ID")
	private Integer crConMethodId;

	@Column(name = "QC_USER")
	private String crQcUser;

	@Column(name = "REQUEST_ID_VEND")
	private String crRequestIdVend;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "PT_CON_TEMP")
	private Double crConTemp;

	@Column(name = "FK_LAB_ID")
	private Integer crLab;

	@Column(name = "FK_PT_RES_TEMP_UNITS_ID")
	private Integer crResTempUnitsId;

	@Column(name = "CREATED_USER")
	private String crCreatedUser;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_CONDUCTIVITY;
	}
}
