package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
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
@Table(name="WTC_MEAS_PH", schema="sgs_data")
public class SGSMeasPh extends SGSDatabaseObject implements GTOLiqPh, Serializable {

	@Column(name = "PH_AUTHOR")
	private String phAuthor;

	@Column(name = "SAMPLE_ID_VEND")
	private String phSampleIdVend;

	@Column(name = "PH_FIELD_T")
	private Double phFieldT;

	@Column(name = "PH_LAB")
	private String waterPhLab;

	@Column(name = "CREATED_USER")
	private String phCreatedUser;

	@Column(name = "QC_DATE")
	private Date phQcDate;

	@Column(name = "PH_VALUE")
	private Double phValue;

	@Column(name = "PH_FIELD_T", insertable = false, updatable = false)
	private Double waterPhFieldT;

	@Column(name = "UPDATED_DATE")
	private Date phUpdatedDate;

	@Column(name = "PH_QC")
	private String waterPhQc;

	@Column(name = "PH_AUTHOR", insertable = false, updatable = false)
	private String waterPhAuthor;

	@Column(name = "PH_FIELD_METHOD")
	private Integer waterPhFieldMethod;

	@Column(name = "PH_METHOD")
	private Integer phMethod;

	@Column(name = "PH_QC", insertable = false, updatable = false)
	private String phQc;

	@Column(name = "CREATED_DATE")
	private Date phCreatedDate;

	@Column(name = "PH_T")
	private Double waterPhT;

	@Column(name = "PH_CONF")
	private Double waterPhConf;

	@Column(name = "PH_DATE")
	private Date waterPhDate;

	@Column(name = "UPDATED_USER")
	private String phUpdatedUser;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "PH_T", insertable = false, updatable = false)
	private Double phT;

	@Column(name = "PH_FIELD_VALUE")
	private Double phFieldValue;

	@Column(name = "PH_COMMENT")
	private String phComment;

	@Column(name = "PH_FIELD_METHOD", insertable = false, updatable = false)
	private Integer phFieldMethod;

	@Column(name = "PH_METHOD", insertable = false, updatable = false)
	private Integer waterPhMethod;

	@Column(name = "PH_CONF", insertable = false, updatable = false)
	private Double phConf;

	@Column(name = "PH_DATE", insertable = false, updatable = false)
	private Date phDate;

	@Column(name = "PH_VALUE", insertable = false, updatable = false)
	private Double waterPhValue;

	@Column(name = "PH_COMMENT", insertable = false, updatable = false)
	private String waterPhComment;

	@Column(name = "REQUEST_ID_VEND")
	private String phRequestIdVend;

	@Column(name = "QC_USER")
	private String phQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "PH_LAB", insertable = false, updatable = false)
	private String phLab;

	@Column(name = "SVC_CODE")
	private String phSvcCode;

	@Column(name = "PH_FIELD_VALUE", insertable = false, updatable = false)
	private Double waterPhFieldValue;

	@Column(name = "RUN_NUMBER")
	private String phRunNumber;

	@Transient
	private Integer phRecordTypeId;

	@Transient
	private Integer phPk;

	@Transient
	private Double phFieldTemp;

	@Transient
	private Date phFieldAcqDate;

	@Transient
	private Double phTempDegassed;

	@Transient
	private String phDegassedValueQ;

	@Transient
	private Date phAcqDate;

	@Transient
	private Integer phFieldTempUnitsId;

	@Transient
	private Integer phConfTypeId;

	@Transient
	private Double phDegassedValue;

	@Transient
	private String phFieldValueQ;

	@Transient
	private Integer phMethodId;

	@Transient
	private Integer phFieldMethodId;

	@Transient
	private Integer phTempDegassedUnitsId;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_PH;
	}
}
