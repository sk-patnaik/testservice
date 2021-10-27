package com.shell.siep.gto.persistence.databases.tellus.model;

import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.persistence.model.GTOSampleType;
import com.shell.siep.gto.persistence.model.GTOWell;
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
public class TellusSample extends TellusDatabaseObject implements GTOSample, Serializable {

    @Transient
    private String shChronstart;

    @Transient
    private String shAddlComment;

    @Transient
    private String shFracType;

    @Transient
    private String sampleGroup;

    @Transient
    private String shStratComment;

    @Transient
    private Double shChronendMy;

    @Transient
    private String shFracLabel;

    @Column(name = "WELL_ID", insertable = false, updatable = false)
    private String shWellId;

    @Transient
    private String shFracDesc;

    @Transient
    private String extSampleVendor;

    @Transient
    private String shCharSiteId;

    @Id
    @Column(name = "SAMPLE_ID")
    private String sampleId;

    @Transient
    private Double shDepthBot;

    @Transient
    private String shLithstart;

    @Transient
    private List<TellusSample> fpcSamples;

    @Transient
    private Double shChronstartMy;

    @Transient
    private String shChronend;

    @Transient
    private String shSampleDescription;

    @Transient
    private String shLithDesc;

    @Transient
    private String shVendorComment;

    @Transient
    private String sampleIdExt;

    @Transient
    private Double shDepthTop;

    @Transient
    private String smpUomOrig;

    @Transient
    private String shLithend;

    @Transient
    private Double shTvdTop;

    @Transient
    private String shComment;

    @Transient
    private String shFormBot;

    @Transient
    private String shRsvr;

    @Transient
    private String shLith;

    @Transient
    private String shParent;

    @Transient
    private String shAgeYoungMy;

    @Transient
    private transient GTOSampleType sampleType;

    @Transient
    private String shUomOrig;

    @Transient
    private String shForm;

    @Transient
    private String shOrig;

    @Transient
    private String shAgeOldMy;

    @Transient
    private Double shTvdBot;

    @Transient
    private String shCommentStrat;

    @Transient
    private String shTvdRef;

    @Transient
    private String shSampleSubType;

    @Transient
    private String shOrigDesc;

    @Transient
    private String shTreatmentDesc;

    @Transient
    private String shFractionDesc;

    @Transient
    private String shSampleTypeDesc;

    @Transient
    private Date shCdate;

    @Transient
    private String shAgeYoung;

    @Transient
    private String shAgeOld;

    @Transient
    private String shTreatment;

    @Transient
    private String xrefSampleType;

    @Transient
    private String xrefSampleGroup;

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
    public GTOSampleType getSampleType() {
        return null;
    }

    @Override
    public List<GTOSample> getSamples() {
        return (List<GTOSample>) (Object) fpcSamples;
    }

    @Override
    public GTOWell getWell() {
        return null;
    }
}


