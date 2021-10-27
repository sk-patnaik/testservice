package com.shell.siep.gto.persistence.databases.bg.model;

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
@Table(name="FPC_SAMPLES")
public class BGSample extends BGDatabaseObject implements GTOSample, Serializable {

	@Column(name = "SH_TVD_TOP_M")
	private Double shTvdTop;

	@Column(name = "SH_COMMENT")
	private String shComment;

	@Column(name = "SH_FORM_BOT")
	private String shFormBot;

	@Column(name = "WELL_ID", insertable = false, updatable = false)
	private String shWellId;

	@Column(name = "SH_RSVR")
	private String shRsvr;

	@Column(name = "SH_LITHOLOGY")
	private String shLith;

	@Column(name = "PARENT")
	private String shParent;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SH_AGE_YOUNG_MY")
	private String shAgeYoungMy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "fk_sample_sub_type_id", referencedColumnName = "TYPE_ID")
	private BGSampleType sampleType;

	@Column(name = "SH_UOM_ORIG")
	private String shUomOrig;

	@Column(name = "SH_FORM")
	private String shForm;

	@Column(name = "SH_ORIG")
	private String shOrig;

	@Column(name = "SH_AGE_YOUNG_MY", insertable = false, updatable = false)
	private String shAgeOldMy;

	@Column(name = "SH_TVD_BOT_M")
	private Double shTvdBot;

	@Column(name = "SH_COMMENT_STRAT")
	private String shCommentStrat;

	@Column(name = "SH_TVD_REF")
	private String shTvdRef;

	@Column(name = "SH_SAMPLE_SUB_TYPE")
	private String shSampleSubType;

	@Column(name = "SH_ORIG_DESC")
	private String shOrigDesc;

	@Column(name = "EXT_SAMPLE_VENDOR")
	private String extSampleVendor;

	@Column(name = "SH_TREATMENT_DESC")
	private String shTreatmentDesc;

	@Column(name = "SH_FRACTION_DESC")
	private String shFractionDesc;

	@Column(name = "SH_SAMPLE_TYPE_DESC")
	private String shSampleTypeDesc;

	@Column(name = "SH_DEPTH_BOT_M")
	private Double shDepthBot;

	@Column(name = "SH_CDATE")
	private Date shCdate;

	@Column(name = "SH_AGE_YOUNG")
	private String shAgeYoung;

	@Column(name = "SH_AGE_OLD")
	private String shAgeOld;

	@Column(name = "SH_TREATMENT")
	private String shTreatment;

	@Column(name = "SAMPLE_ID_EXT")
	private String sampleIdExt;

	@Column(name = "SH_DEPTH_TOP_M")
	private Double shDepthTop;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "SAMPLE_ID", referencedColumnName = "SAMPLE_ID")
	private List<BGSample> samples;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "WELL_ID", referencedColumnName = "WELL_ID")
	private BGWell well;

	@Transient
	private Double shCollTemp;

	@Transient
	private String sampleQc;

	@Transient
	private Date sampleQcDate;

	@Transient
	private String shTempUnits;

	@Transient
	private Integer sampleIdGdb;

	@Transient
	private Date shSdateField;

	@Transient
	private Date shCreatedDate;

	@Transient
	private String shGrp;

	@Transient
	private Double shCollVol;

	@Transient
	private String sampleQcUser;

	@Transient
	private String shPresUnits;

	@Transient
	private String shRsvrTempUnits;

	@Transient
	private String shCreatedUser;

	@Transient
	private String sampleIqmCode;

	@Transient
	private String shContainerId;

	@Transient
	private String shTemperatureUnits;

	@Transient
	private String shAge;

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
	private Double shRsvrPres;

	@Transient
	private Integer sampleCountryId;

	@Transient
	private Date shSdateLab;

	@Transient
	private String shMbr;

	@Transient
	private String shCollPresUnits;

	@Transient
	private Double shCollPres;

	@Transient
	private String shAppearReceived;

	@Transient
	private String shColl;

	@Transient
	private String shContainerType;

	@Transient
	private String shAgeBot;

	@Transient
	private String shRsvrPresUnits;

	@Transient
	private String sampleIdStorage;

	@Transient
	private String shAuthor;

	@Transient
	private String shUpdatedUser;

	@Transient
	private Integer shFluidType;

	@Transient
	private Double shRsvrTemp;

	@Transient
	private Double shTemp;

	@Transient
	private Integer shCollVolUnits;

	@Transient
	private Date shUpdatedDate;

	@Transient
	private String shCollTempUnits;

	@Transient
	private String sampleIdGm;

	@Transient
	private String shAppearField;

	@Transient
	private Double shProdVol;

	@Transient
	private Integer shGasUnitsId;

	@Transient
	private String sampleIdSam;

	@Transient
	private Integer shReportCount;

	@Transient
	private Date shRdate;

	@Transient
	private String shCtime;

	@Transient
	private Date shLastUpdate;

	@Transient
	private String shCompletion;

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
