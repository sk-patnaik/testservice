package com.shell.siep.gto.persistence.databases.fpc.model;

import com.shell.siep.gto.persistence.model.GTOSample;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="FPC_SAMPLES", schema="gfs")
public class FpcSample extends FpcDatabaseObject implements GTOSample, Serializable {

	@Column(name = "SH_COLL_TEMP")
	private Double shCollTemp;

	@Column(name = "SH_RSVR")
	private String shRsvr;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SAMPLE_QC")
	private String sampleQc;

	@Column(name = "SH_FORM")
	private String shForm;

	@Column(name = "QC_DATE")
	private Date sampleQcDate;

	@Column(name = "SH_TEMP_UNITS")
	private String shTempUnits;

	@Column(name = "SAMPLE_ID_GDB")
	private Integer sampleIdGdb;

	@Column(name = "SH_TVD_REF")
	private String shTvdRef;

	@Column(name = "SH_SDATE_FIELD")
	private Date shSdateField;

	@Column(name = "SH_ORIG_DESC")
	private String shOrigDesc;

	@Column(name = "CREATED_DATE")
	private Date shCreatedDate;

	@Column(name = "SH_GRP")
	private String shGrp;

	@Column(name = "SH_COLL_VOL")
	private Double shCollVol;

	@Column(name = "QC_USER")
	private String sampleQcUser;

	@Column(name = "SH_PRES_UNITS")
	private String shPresUnits;

	@Column(name = "FK_TREATMENT_ID")
	private String shTreatment;

	@Column(name = "FK_RSVR_TEMP_UNITS_ID")
	private String shRsvrTempUnits;

	@Column(name = "CREATED_USER")
	private String shCreatedUser;

	@Column(name = "IQM_CODE")
	private String sampleIqmCode;

	@Column(name = "SAMPLE_ID_EXT")
	private String sampleIdExt;

	@Column(name = "SH_CONTAINER_ID")
	private String shContainerId;

	@Column(name = "SH_TVD_TOP_M")
	private Double shTvdTop;

	@Column(name = "SH_TEMP_UNITS", insertable = false, updatable = false)
	private String shTemperatureUnits;

	@Column(name = "SH_COMMENT")
	private String shComment;

	@Column(name = "SH_AGE")
	private String shAge;

	@Column(name = "SH_VEND_JOB_ID")
	private String shVendJobId;

	@Column(name = "SH_PRES")
	private Double shPres;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "fk_sample_sub_type_id", referencedColumnName = "TYPE_ID")
	private FpcSampleType sampleType;

	@Column(name = "SH_TEMP")
	private Double shTemperature;

	@Column(name = "SH_GAS_UNITS")
	private Double shGasUnits;

	@Column(name = "SH_TVD_BOT_M")
	private Double shTvdBot;

	@Column(name = "SH_FOCAL_PT")
	private String shFocalPt;

	@Column(name = "FK_PROD_VOL_UNITS_ID")
	private Integer shProdVolUnits;

	@Column(name = "EXT_SAMPLE_VENDOR")
	private String extSampleVendor;

	@Column(name = "SH_DEPTH_BOT_M")
	private Double shDepthBot;

	@Column(name = "SH_CDATE")
	private Date shCdate;

	@Column(name = "SH_DEPTH_TOP_M")
	private Double shDepthTop;

	@Column(name = "SH_RSVR_PRES")
	private Double shRsvrPres;

	@Column(name = "COUNTRY_ID")
	private Integer sampleCountryId;

	@Column(name = "SH_SDATE_LAB")
	private Date shSdateLab;

	@Column(name = "SH_FORM_BOT")
	private String shFormBot;

	@Column(name = "WELL_ID", insertable = false, updatable = false)
	private String shWellId;

	@Column(name = "SH_MBR")
	private String shMbr;

	@Column(name = "SH_LITHOLOGY")
	private String shLith;

	@Column(name = "PARENT")
	private String shParent;

	@Column(name = "FK_COLL_PRES_UNITS_ID")
	private String shCollPresUnits;

	@Column(name = "SH_COLL_PRES")
	private Double shCollPres;

	@Column(name = "SH_APPEAR_RECEIVED")
	private String shAppearReceived;

	@Column(name = "SH_COLL")
	private String shColl;

	@Column(name = "SH_CONTAINER_TYPE")
	private String shContainerType;

	@Column(name = "FK_ORIGIN_ID")
	private String shOrig;

	@Column(name = "FK_SAMPLE_SUB_TYPE_ID")
	private String shSampleSubType;

	@Column(name = "SH_TREATMENT_DESC")
	private String shTreatmentDesc;

	@Column(name = "SH_AGE_BOT")
	private String shAgeBot;

	@Column(name = "FK_RSVR_PRES_UNITS_ID")
	private String shRsvrPresUnits;

	@Column(name = "SAMPLE_ID_STORAGE")
	private String sampleIdStorage;

	@Column(name = "SH_AUTHOR")
	private String shAuthor;

	@Column(name = "UPDATED_USER")
	private String shUpdatedUser;

	@Column(name = "FK_FLUID_TYPE_ID")
	private Integer shFluidType;

	@Column(name = "SH_RSVR_TEMP")
	private Double shRsvrTemp;

	@Column(name = "SH_TEMP", insertable = false, updatable = false)
	private Double shTemp;

	@Column(name = "FK_COLL_VOL_UNITS_ID")
	private Integer shCollVolUnits;

	@Column(name = "UPDATED_DATE")
	private Date shUpdatedDate;

	@Column(name = "FK_COLL_TEMP_UNITS_ID")
	private String shCollTempUnits;

	@Column(name = "SAMPLE_ID_GM")
	private String sampleIdGm;

	@Column(name = "SH_UOM_ORIG")
	private String shUomOrig;

	@Column(name = "SH_APPEAR_FIELD")
	private String shAppearField;

	@Column(name = "SH_PROD_VOL")
	private Double shProdVol;

	@Column(name = "FK_GAS_UNITS_ID")
	private Integer shGasUnitsId;

	@Column(name = "SAMPLE_ID_SAM")
	private String sampleIdSam;

	@Column(name = "REPORT_COUNT")
	private Integer shReportCount;

	@Column(name = "SH_RDATE")
	private Date shRdate;

	@Column(name = "SH_CTIME")
	private String shCtime;

	@Column(name = "SH_LAST_UPDATE")
	private Date shLastUpdate;

	@Column(name = "SH_COMPLETION")
	private String shCompletion;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "WELL_ID", referencedColumnName = "WELL_ID")
	private FpcWell well;

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "SAMPLE_ID", referencedColumnName = "SAMPLE_ID")
	private List<FpcSample> samples;

	@Transient
	private String shAgeYoungMy;

	@Transient
	private String shAgeOldMy;

	@Transient
	private String shCommentStrat;

	@Transient
	private String shFractionDesc;

	@Transient
	private String shSampleTypeDesc;

	@Transient
	private String shAgeYoung;

	@Transient
	private String shAgeOld;

	@Transient
	private String sampleIdImsa;

	@Transient
	private String shAppear;

	@Transient
	private Date shSdate;

	@Transient
	private String shVolUnits;

	@Transient
	private String shVolProdUnits;

	@Transient
	private Double shVolRec;

	@Transient
	private String sampleName;

	@Transient
	private String shMdRef;

	@Transient
	private String shFocalPoint;

	@Transient
	private Double shVolProd;

	@Transient
	private String sampleIdOp;

	@Transient
	private String shRsvrId;

	@Transient
	private String sampleIdFpc;

	@Transient
	private String sampleIdAms;

	@Transient
	private String shSamplingPoint;

	@Override
	public List<GTOSample> getSamples() {
		return (List<GTOSample>) (Object) samples;
	}

}
