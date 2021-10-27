package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOMeasTog;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_TOG", schema="sgs_data")
public class SGSMeasTog extends SGSDatabaseObject implements GTOMeasTog, Serializable {

	@Column(name = "QC_USER")
	private String togQcUser;

	@Column(name = "UPDATED_USER")
	private String togUpdatedUser;

	@Column(name = "TOG_COMMENT")
	private String waterTogComment;

	@Column(name = "TOG_CONF")
	private Double togConf;

	@Column(name = "TOG_DATE")
	private Date togDate;

	@Column(name = "TOG_UNITS")
	private Integer togUnits;

	@Column(name = "TOG_METHOD")
	private Integer togMethod;

	@Column(name = "TOG_METHOD", insertable = false, updatable = false)
	private Integer waterTogMethod;

	@Column(name = "TOG_QC")
	private String waterTogQc;

	@Column(name = "CREATED_USER")
	private String togCreatedUser;

	@Column(name = "TOG_DATE", insertable = false, updatable = false)
	private Date waterTogDate;

	@Column(name = "TOG_CONF", insertable = false, updatable = false)
	private Double waterTogConf;

	@Column(name = "TOG_LAB")
	private String togLab;

	@Column(name = "CREATED_DATE")
	private Date togCreatedDate;

	@Column(name = "TOG_VALUE")
	private Double waterTogValue;

	@Column(name = "TOG_COMMENT", insertable = false, updatable = false)
	private String togComment;

	@Column(name = "TOG_LAB", insertable = false, updatable = false)
	private String waterTogLab;

	@Column(name = "TOG_VALUE", insertable = false, updatable = false)
	private Double togValue;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "TOG_AUTHOR")
	private String waterTogAuthor;

	@Column(name = "SAMPLE_ID_VEND")
	private String togSampleIdVend;

	@Column(name = "REQUEST_ID_VEND")
	private String togRequestIdVend;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "TOG_QC", insertable = false, updatable = false)
	private String togQc;

	@Column(name = "RUN_NUMBER")
	private String togRunNumber;

	@Column(name = "SVC_CODE")
	private String togSvcCode;

	@Column(name = "UPDATED_DATE")
	private Date togUpdatedDate;

	@Column(name = "QC_DATE")
	private Date togQcDate;

	@Column(name = "TOG_UNITS", insertable = false, updatable = false)
	private Integer waterTogUnits;

	@Column(name = "TOG_AUTHOR", insertable = false, updatable = false)
	private String togAuthor;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_TOG;
	}
}
