package com.shell.siep.gto.persistence.databases.sgs.model;

import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.persistence.model.GTOWell;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Getter
@Setter
@Entity
@Table(name="WTC_REF_WELL", schema="sgs_data")
public class SGSWell extends SGSDatabaseObject implements GTOWell, Serializable {

	@Column(name = "WH_TD_TVD_M")
	private Double whDepthTvd;

	@Column(name = "WH_SPUD_YEAR")
	private Integer whSpudYear;

	@Column(name = "WH_FRAC_DATE")
	private Date whFracDate;

	@Column(name = "WH_COMMENTS")
	private String whComments;

	@Column(name = "WH_FIELD")
	private String whField;

	@Column(name = "REPORT_COUNT")
	private Integer whReportCount;

	@Column(name = "WH_COORD_SYS")
	private String whCoordSys;

	@Column(name = "WH_LON_SURF")
	private Double whLonSurf;

	@Column(name = "WH_REF_ELEV_M")
	private Integer whRefElevM;

	@Column(name = "WH_GRND_ELEV_M")
	private Double whGrndEl;

	@Column(name = "WH_SUB_BASIN")
	private String whSubBasin;

	@Column(name = "WH_PROSPECT")
	private String whProspect;

	@Column(name = "COUNTRY_ID", insertable=false, updatable=false)
	private Integer whCountryId;

	@Column(name = "REVIEWED_USER")
	private String wellQcUser;

	@Column(name = "WH_LON_BH")
	private Double whLong;

	@Column(name = "WH_LICENSE_NO")
	private String wellLicenseNo;

	@Column(name = "WH_SPUD_DATE")
	private String wellSpudDate;

	@Column(name = "WH_COMP_DATE_D")
	private String whCompDate;

	@Column(name = "WH_ALT_WELL_NAME")
	private String whAltWellName;

	@Column(name = "WH_PNC")
	private Integer whPnc;

	@Column(name = "WH_COMP_DATE")
	private String wellCompDate;

	@Column(name = "WH_LEASE")
	private String whLease;

	@Column(name = "UWBI")
	private String wellIdUwbi;

	@Column(name = "WH_WATER_MD_M")
	private Double whWaterMd;

	@Column(name = "WH_COUNTY")
	private String whCounty;

	@Column(name = "WH_SPUD_DATE_D")
	private String whSpudDate;

	@Column(name = "WH_LAT_BH")
	private Double whLat;

	@Column(name = "REVIEWED_DATE")
	private Date wellQcDate;

	@Column(name = "UPDATED_DATE")
	private Date whLastUpdate;

	@Column(name = "WH_UOM")
	private String whUom;

	@Column(name = "WH_REF_DATUM")
	private String whDepthRef;

	@Column(name = "WH_PROVINCE")
	private String whProvince;

	@Column(name = "WH_TD_MD_M")
	private Double whDepthMd;

	@Column(name = "WH_WATER_TVD_M")
	private Double whWaterTvd;

	@Column(name = "UWBI_SRC")
	private String wellIdUwbiSrc;

	@Column(name = "WELL_NAME")
	private String wellName;

	@Column(name = "WH_BASIN")
	private String whBasin;

	@Column(name = "WH_FIELD_COMMON")
	private String whFieldCommon;

	@Column(name = "WH_LAT_SURF")
	private Double whLatSurf;

	@Column(name = "WH_PROD_START_DATE")
	private Date whProdStartDate;

	@Column(name = "WH_DR_ELEV_M")
	private Double whDrElev;

	@Column(name = "WH_SITETYPE")
	private String whSitetype;

	@Column(name = "WH_WELL_NBR")
	private String whNbr;

	@Id
	@Column(name = "WELL_ID")
	private String wellId;

	@Column(name = "WH_OPERATOR")
	private String whOperator;

	@Column(name = "WH_AREABLOCK_SURF")
	private String whAreablockSurf;

	@Column(name = "WH_COORD_DATUM")
	private String whCoordDatum;

	@Column(name = "REVIEWED")
	private String wellQc;

	@Column(name = "WH_AREABLOCK_BH")
	private String whAreablockBh;

	@Column(name = "WH_TD_MD_M", insertable = false, updatable = false)
	private Double whTdMd;

	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
	private SGSCountry country;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "WELL_ID")
	private List<SGSSample> samples;

	@Transient
	private Long wellIdIhs;

	@Transient
	private Double whTd;

	@Transient
	private Double whWaterDepth;

	@Transient
	private String whBlockBh;

	@Transient
	private String wellIdCds;

	@Transient
	private String whArea;

	@Transient
	private String whBlock;

	@Transient
	private String whAreaBh;

	@Transient
	private String whCurrentStatus;

	@Transient
	private String whFormationAtTd;

	@Transient
	private String whOnshoreOrOffshore;

	@Transient
	private Double whLatIhs;

	@Transient
	private Double whBhLatCds;

	@Transient
	private String whBhCoordSysIhs;

	@Transient
	private Double whBhLon;

	@Transient
	private Integer wellAnalyses;

	@Transient
	private String whResponsibleOrg;

	@Transient
	private Double whLongCds;

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
	private String wellNameIhs;

	@Transient
	private String wellIdHid;

	@Transient
	private String whRigName;

	@Transient
	private Date whCurrentStatusDate;

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
