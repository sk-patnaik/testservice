package com.shell.siep.gto.persistence.databases.tellus.model;

import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.persistence.model.GTOWell;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name="FPC_WELLS")
public class TellusWells extends TellusDatabaseObject implements GTOWell, Serializable {

    @Column(name = "WH_COMMENTS")
    private String whComments;

    @Column(name = "WH_SPUD_DATE")
    private String whSpudDate;

    @Column(name = "UWBI")
    private String whUwbi;

    @Column(name = "WH_FIELD")
    private String whField;

    @Column(name = "WH_TD_M")
    private Double whTd;

    @Column(name = "WH_DEPTH_REF")
    private String whDepthRef;

    @Column(name = "WH_PROVINCE")
    private String whProvince;

    @Column(name = "WH_COMMENTS", insertable = false, updatable = false)
    private String whWellComments;

    @Column(name = "WH_PROSPECT")
    private String whProspect;

    @Column(name = "WH_WATER_DEPTH_M")
    private Double whWaterDepth;

    @Column(name = "WELL_NAME")
    private String wellName;

    @Column(name = "WH_BASIN")
    private String whBasin;

    @Column(name = "WH_LONG")
    private Double whLong;

    @Column(name = "WH_BLOCK")
    private String whBlock;

    @Column(name = "WH_SITETYPE")
    private String whSitetype;

    @Id
    @Column(name = "WELL_ID")
    private String wellId;

    @Column(name = "WH_COMP_DATE")
    private String whCompDate;

    @Column(name = "WH_OPERATOR")
    private String whOperator;

    @Column(name = "WH_ALT_WELL_NAME")
    private String whAltWellName;

    @Column(name = "WH_LAT")
    private Double whLat;

    @Column(name = "WH_LEASE")
    private String whLease;

    @ManyToOne
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
    private TellusCountry country;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "WELL_ID")
    private List<TellusSample> samples;

    @Transient
    private Long wellIdIhs;

    @Transient
    private Double whDepthTvd;

    @Transient
    private Integer whSpudYear;

    @Transient
    private String whCoordSys;

    @Column(name = "COUNTRY_ID", insertable=false, updatable=false)
    private Integer whCountryId;

    @Transient
    private String whBlockBh;

    @Transient
    private String whCounty;

    @Transient
    private String wellIdCds;

    @Transient
    private String whUom;

    @Transient
    private String whArea;

    @Transient
    private Double whDepthMd;

    @Transient
    private Double whDrElev;

    @Transient
    private String whAreaBh;

    @Transient
    private String whCurrentStatus;

    @Transient
    private String whFormationAtTd;

    @Transient
    private Integer whReportCount;

    @Transient
    private String whOnshoreOrOffshore;

    @Transient
    private Double whLatIhs;

    @Transient
    private Double whBhLatCds;

    @Transient
    private String whBhCoordSysIhs;

    @Transient
    private String wellQc;

    @Transient
    private Double whBhLon;

    @Transient
    private Integer wellAnalyses;

    @Transient
    private String whResponsibleOrg;

    @Transient
    private Double whLongCds;

    @Transient
    private String wellQcUser;

    @Transient
    private String whFormationFluid;

    @Transient
    private Date whFormationFluidDate;

    @Transient
    private String whCoordSysCds;

    @Transient
    private String whFluid;

    @Transient
    private String whCurrentPurpose;

    @Transient
    private String wellIdApi;

    @Transient
    private Double whBhLongCds;

    @Transient
    private String whCoordSysIhs;

    @Transient
    private Double whGrndEl;

    @Transient
    private String whSubBasin;

    @Transient
    private String wellNameIhs;

    @Transient
    private String wellIdHid;

    @Transient
    private String whRigName;

    @Transient
    private Date whCurrentStatusDate;

    @Transient
    private Date wellQcDate;

    @Transient
    private Double whLongIhs;

    @Transient
    private String whPadPlatformName;

    @Transient
    private String whLicenseNo;

    @Transient
    private Double whBhLat;

    @Transient
    private Date whFluidDate;

    @Transient
    private Integer wellPnc;

    @Transient
    private Integer wellSamples;

    @Transient
    private Double whBhLatIhs;

    @Transient
    private String whProducingFormation;

    @Transient
    private String wellNameCds;

    @Transient
    private String whWellNbr;

    @Transient
    private String wellIqmCode;

    @Transient
    private Double whBhLongIhs;

    @Transient
    private String whCompletionStatus;

    @Transient
    private String whBhCoordSysCds;

    @Transient
    private Double whLatCds;

    @Transient
    private Date whFracDate;

    @Transient
    private Double whLonSurf;

    @Transient
    private Integer whRefElevM;

    @Transient
    private String wellLicenseNo;

    @Transient
    private String wellSpudDate;

    @Transient
    private Integer whPnc;

    @Transient
    private String wellCompDate;

    @Transient
    private String wellIdUwbi;

    @Transient
    private Double whWaterMd;

    @Transient
    private Date whLastUpdate;

    @Transient
    private Double whWaterTvd;

    @Transient
    private String wellIdUwbiSrc;

    @Transient
    private String whFieldCommon;

    @Transient
    private Double whLatSurf;

    @Transient
    private Date whProdStartDate;

    @Transient
    private String whNbr;

    @Transient
    private String whAreablockSurf;

    @Transient
    private String whCoordDatum;

    @Transient
    private String whAreablockBh;

    @Transient
    private Double whTdMd;

    @Transient
    private String whDatumCds;

    @Transient
    private Double whLatSam;

    @Transient
    private String wellNameGeomark;

    @Transient
    private Double whLongGdb;

    @Transient
    private Double whLatGeomark;

    @Transient
    private String wellNameUsgs;

    @Transient
    private String whIdFpc;

    @Transient
    private String wellNameRobertson;

    @Transient
    private String whNameFpc;

    @Transient
    private String whDatumIhs;

    @Transient
    private Double whLongSam;

    @Transient
    private Double whLongGeomark;

    @Transient
    private String wellNameSam;

    @Transient
    private String wellNameGdb;

    @Transient
    private Double whLongUsgs;

    @Transient
    private Double whLatGdb;

    @Transient
    private String rlocWellId;

    @Transient
    private String wellNameVen;

    @Transient
    private Integer locType;

    @Transient
    private Double whLongRobertson;

    @Transient
    private Double whLatUsgs;

    @Transient
    private Double whLatRobertson;

    @Override
    public List<GTOSample> getSamples() {
        return  (List<GTOSample>) (Object) samples;
    }
}



