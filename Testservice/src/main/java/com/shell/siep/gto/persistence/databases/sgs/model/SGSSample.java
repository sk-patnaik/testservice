package com.shell.siep.gto.persistence.databases.sgs.model;

import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.persistence.model.GTOSampleType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="WTC_REF_SAMPLE", schema="sgs_data")
public class SGSSample extends SGSDatabaseObject implements GTOSample, Serializable {

	@Column(name = "UPDATED_USER")
	private String shUpdatedUser;

	@Column(name = "SH_TVD_TOP_M")
	private Double shTvdTop;

	@Column(name = "SH_TEMP")
	private Double shRsvrTemp;

	@Column(name = "SAMPLE_ID_IMSA")
	private String sampleIdImsa;

	@Column(name = "SH_COMMENT")
	private String shComment;

	@Column(name = "WELL_ID", insertable = false, updatable = false)
	private String shWellId;

	@Column(name = "SH_COL_TEMP")
	private Double shCollTemp;

	@Column(name = "SH_AGE")
	private String shAge;

	@Column(name = "PARENT_ID")
	private String shParent;

	@Column(name = "SH_COL_PRES_UNITS")
	private String shCollPresUnits;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SH_COL_PRES")
	private Double shCollPres;

	@Column(name = "SH_SAMPLE_TYPE")
	private String shSampleType;

	@Column(name = "SH_COLL")
	private String shColl;

	// this is a char.   Should work
	@Column(name = "REVIEWED")
	private String sampleQc;

	@Column(name = "SH_APPEAR")
	private String shAppear;

	@Column(name = "SH_COL_TEMP_UNITS")
	private String shCollTempUnits;

	@Column(name = "SH_UOM_ORIG")
	private String shUomOrig;

	@Column(name = "SH_SDATE")
	private Date shSdate;

	@Column(name = "SH_VOL_UNITS")
	private String shVolUnits;

	@Column(name = "SH_VOL_PROD_UNITS")
	private String shVolProdUnits;

	@Column(name = "SH_FORM")
	private String shForm;

	@Column(name = "SH_VOL_REC")
	private Double shVolRec;

	@Column(name = "SH_NAME")
	private String sampleName;

	@Column(name = "REVIEWED_DATE")
	private Date sampleQcDate;

	@Column(name = "SH_TVD_BOT_M")
	private Double shTvdBot;

	@Column(name = "SH_MD_REF")
	private String shMdRef;

	@Column(name = "SH_FOCAL_PT")
	private String shFocalPoint;

	@Column(name = "SH_TVD_REF")
	private String shTvdRef;

	@Column(name = "SH_SAMPLE_SUBTYPE")
	private String shSampleSubType;

	@Column(name = "SH_ORIG_DESC")
	private String shOrigDesc;

	@Column(name = "SH_VOL_PROD")
	private Double shVolProd;

	@Column(name = "CREATED_DATE")
	private Date shCreatedDate;

	@Column(name = "SH_TREATMENT_DESC")
	private String shTreatmentDesc;

	@Column(name = "REVIEWED_USER")
	private String sampleQcUser;

	@Column(name = "SH_MD_BOT_M")
	private Double shDepthBot;

	@Column(name = "SAMPLE_ID_OP")
	private String sampleIdOp;

	@Column(name = "SH_RSVR_ID")
	private String shRsvrId;

	@Column(name = "SAMPLE_ID_SAM")
	private String sampleIdSam;

	@Column(name = "REPORT_COUNT")
	private Integer shReportCount;

	@Column(name = "SH_CDATE")
	private Date shCdate;

	@Column(name = "SH_RDATE")
	private Date shRdate;

	@Column(name = "SAMPLE_ID_FPC")
	private String sampleIdFpc;

	@Column(name = "SH_PRES_UNITS")
	private String shRsvrPresUnits;

	@Column(name = "SH_TREATMENT")
	private String shTreatment;

	@Column(name = "SH_TEMP_UNITS")
	private String shRsvrTempUnits;

	@Column(name = "SAMPLE_ID_STORAGE")
	private String sampleIdStorage;

	@Column(name = "CREATED_USER")
	private String shCreatedUser;

	@Column(name = "SAMPLE_ID_AMS")
	private String sampleIdAms;

	@Column(name = "SH_ORIGIN")
	private String shSamplingPoint;

	@Column(name = "SAMPLE_ID_EXT")
	private String sampleIdExt;

	@Column(name = "SH_MD_TOP_M")
	private Double shDepthTop;

	@Column(name = "SH_CTIME")
	private String shCtime;

	@Column(name = "SH_PRES")
	private Double shRsvrPres;

	@Column(name = "UPDATED_DATE")
	private Date shLastUpdate;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "WELL_ID", referencedColumnName = "WELL_ID")
	private SGSWell well;

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "SAMPLE_ID", referencedColumnName = "SAMPLE_ID")
	private List<SGSSample> samples;

	@Transient
	private String shFormBot;

	@Transient
	private String shRsvr;

	@Transient
	private String shLith;

	@Transient
	private String shAgeYoungMy;

	@Transient
	private String shOrig;

	@Transient
	private String shAgeOldMy;

	@Transient
	private String shCommentStrat;

	@Transient
	private String extSampleVendor;

	@Transient
	private String shFractionDesc;

	@Transient
	private String shSampleTypeDesc;

	@Transient
	private String shAgeYoung;

	@Transient
	private String shAgeOld;

	@Transient
	private String shTempUnits;

	@Transient
	private Integer sampleIdGdb;

	@Transient
	private Date shSdateField;

	@Transient
	private String shGrp;

	@Transient
	private Double shCollVol;

	@Transient
	private String shPresUnits;

	@Transient
	private String sampleIqmCode;

	@Transient
	private String shContainerId;

	@Transient
	private String shTemperatureUnits;

	@Transient
	private String shVendJobId;

	@Transient
	private Double shPres;

	@Transient
	private Double shTemperature;

	@Transient
	private Double shGasUnits;

	@Transient
	private String shFocalPt;

	@Transient
	private Integer shProdVolUnits;

	@Transient
	private Integer sampleCountryId;

	@Transient
	private Date shSdateLab;

	@Transient
	private String shMbr;

	@Transient
	private String shAppearReceived;

	@Transient
	private String shContainerType;

	@Transient
	private String shAgeBot;

	@Transient
	private String shAuthor;

	@Transient
	private Integer shFluidType;

	@Transient
	private Double shTemp;

	@Transient
	private Integer shCollVolUnits;

	@Transient
	private Date shUpdatedDate;

	@Transient
	private String sampleIdGm;

	@Transient
	private String shAppearField;

	@Transient
	private Double shProdVol;

	@Transient
	private Integer shGasUnitsId;

	@Transient
	private String shCompletion;

	@Override
	public GTOSampleType getSampleType() {
	    SGSSampleType sampleType = new SGSSampleType();
	    sampleType.setParent(shSampleType);
		sampleType.setSampleType(shSampleSubType);
		return sampleType;
	}

	@Override
	public List<GTOSample> getSamples() {
		return (List<GTOSample>) (Object) samples;
	}

}
