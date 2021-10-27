package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqPh;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_PH", schema="gfs")
public class FpcLiqPh extends FpcDatabaseObject implements GTOLiqPh, Serializable {

	@Column(name = "PH_AUTHOR")
	private String phAuthor;

	@Column(name = "CREATED_USER")
	private String phCreatedUser;

	@Column(name = "QC_DATE")
	private Date phQcDate;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer phRecordTypeId;

	@Column(name = "PK")
	private Integer phPk;

	@Column(name = "CREATED_DATE")
	private Date phCreatedDate;

	@Column(name = "PH_COMMENT")
	private String phComment;

	@Column(name = "QC_USER")
	private String phQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SVC_CODE")
	private String phSvcCode;

	@Column(name = "RUN_NUMBER")
	private String phRunNumber;

	@Column(name = "PH_FIELD_TEMP")
	private Double phFieldTemp;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "PH_FIELD_DATE")
	private Date phFieldAcqDate;

	@Column(name = "PH_CONF")
	private Double phConf;

	@Column(name = "REQUEST_ID_VEND")
	private String phRequestIdVend;

	@Column(name = "PH_TEMP")
	private Double phTempDegassed;

	@Column(name = "UPDATED_DATE")
	private Date phUpdatedDate;

	@Column(name = "PH_VALUE_Q")
	private String phDegassedValueQ;

	@Column(name = "PH_DATE")
	private Date phAcqDate;

	@Column(name = "UPDATED_USER")
	private String phUpdatedUser;

	@Column(name = "PH_FIELD_VALUE")
	private Double phFieldValue;

	@Column(name = "FK_PH_FIELD_TEMP_UNITS_ID")
	private Integer phFieldTempUnitsId;

	@Column(name = "FK_LAB_ID")
	private String phLab;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer phConfTypeId;

	@Column(name = "PH_VALUE")
	private Double phDegassedValue;

	@Column(name = "SAMPLE_ID_VEND")
	private String phSampleIdVend;

	@Column(name = "PH_FIELD_VALUE_Q")
	private String phFieldValueQ;

	@Column(name = "FK_METHOD_ID")
	private Integer phMethodId;

	@Column(name = "FK_PH_FIELD_METHOD_ID")
	private Integer phFieldMethodId;

	@Column(name = "FK_PH_TEMP_UNITS_ID")
	private Integer phTempDegassedUnitsId;

	@Transient
	private Double phFieldT;

	@Transient
	private String waterPhLab;

	@Transient
	private Double phValue;

	@Transient
	private Double waterPhFieldT;

	@Transient
	private String waterPhQc;

	@Transient
	private String waterPhAuthor;

	@Transient
	private Integer waterPhFieldMethod;

	@Transient
	private Integer phMethod;

	@Transient
	private String phQc;

	@Transient
	private Double waterPhT;

	@Transient
	private Double waterPhConf;

	@Transient
	private Date waterPhDate;

	@Transient
	private Double phT;

	@Transient
	private Integer phFieldMethod;

	@Transient
	private Integer waterPhMethod;

	@Transient
	private Date phDate;

	@Transient
	private Double waterPhValue;

	@Transient
	private String waterPhComment;

	@Transient
	private Double waterPhFieldValue;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_PH;
	}
}
