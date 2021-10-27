package com.shell.siep.gto.persistence.databases.dd.model.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.DDCountry;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="FPC_WELLS")
public class DDPigiWell implements Serializable {

	@Column(name = "WH_CURRENT_STATUS")
	private String whCurrentStatus;

	@Column(name = "WH_FORMATION_AT_TD")
	private String whFormationAtTd;

	@Column(name = "REPORT_COUNT")
	private Integer whReportCount;

	@Column(name = "WH_ONSHORE_OR_OFFSHORE")
	private String whOnshoreOrOffshore;

	@Column(name = "WH_LAT_IHS")
	private Double whLatIhs;

	@Column(name = "WH_BH_LAT_CDS")
	private Double whBhLatCds;

    @Column(name = "COUNTRY_ID", insertable=false, updatable=false)
	private Integer whCountryId;

	@Column(name = "WH_BH_COORD_SYS_IHS")
	private String whBhCoordSysIhs;

	@Column(name = "WH_COMP_DATE")
	private String whCompDate;

	@Column(name = "WH_DEPTH_REF")
	private String whDepthRef;

	@Column(name = "WH_DEPTH_MD")
	private Double whDepthMd;

	@Column(name = "WH_BLOCK")
	private String whBlock;

	@Column(name = "WH_DR_ELEV_M")
	private Double whDrElev;

	@Column(name = "FK_SITE_TYPE_ID")
	private String whSitetype;

	@Id
	@Column(name = "WELL_ID")
	private String wellId;

	@Column(name = "WH_AREA_BH")
	private String whAreaBh;

	@Column(name = "WELL_QC")
	private String wellQc;

	@Column(name = "WH_BH_LON")
	private Double whBhLon;

	@Column(name = "WH_TOTAL_TVD_M")
	private Double whDepthTvd;

	@Column(name = "WH_SPUD_YEAR")
	private Integer whSpudYear;

	@Column(name = "ANALYSES")
	private Integer wellAnalyses;

	@Column(name = "WH_COMMENTS")
	private String whComments;

	@Column(name = "WH_COORD_SYS")
	private String whCoordSys;

	@Column(name = "WH_RESPONSIBLE_ORG")
	private String whResponsibleOrg;

	@Column(name = "WH_LON_CDS")
	private Double whLongCds;

	@Column(name = "QC_USER")
	private String wellQcUser;

	@Column(name = "WH_FORMATION_FLUID")
	private String whFormationFluid;

	@Column(name = "WH_FORMATION_FLUID_DATE")
	private Date whFormationFluidDate;

	@Column(name = "WH_LAT")
	private Double whLat;

	@Column(name = "WH_COORD_SYS_CDS")
	private String whCoordSysCds;

	@Column(name = "WELL_ID_CDS")
	private String wellIdCds;

	@Column(name = "WH_FLUID")
	private String whFluid;

	@Column(name = "WH_PROVINCE")
	private String whProvince;

	@Column(name = "WH_CURRENT_PURPOSE")
	private String whCurrentPurpose;

	@Column(name = "WELL_ID_API")
	private String wellIdApi;

	@Column(name = "WELL_ID_IHS")
	private Long wellIdIhs;

	@Column(name = "WH_BH_LON_CDS")
	private Double whBhLongCds;

	@Column(name = "WH_FIELD")
	private String whField;

	@Column(name = "WH_COORD_SYS_IHS")
	private String whCoordSysIhs;

	@Column(name = "WH_TD_M")
	private Double whTd;

	@Column(name = "WH_GRND_EL_M")
	private Double whGrndEl;

	@Column(name = "WH_SUB_BASIN")
	private String whSubBasin;

	@Column(name = "WELL_NAME_IHS")
	private String wellNameIhs;

	@Column(name = "WELL_ID_HID")
	private String wellIdHid;

	@Column(name = "WH_PROSPECT")
	private String whProspect;

	@Column(name = "WH_ALT_WELL_NAME")
	private String whAltWellName;

	@Column(name = "WH_RIG_NAME")
	private String whRigName;

	@Column(name = "WH_COUNTY")
	private String whCounty;

	@Column(name = "WH_CURRENT_STATUS_DATE")
	private Date whCurrentStatusDate;

	@Column(name = "QC_DATE")
	private Date wellQcDate;

	@Column(name = "WH_UOM")
	private String whUom;

	@Column(name = "WH_LONG_IHS")
	private Double whLongIhs;

	@Column(name = "WH_AREA")
	private String whArea;

	@Column(name = "WH_PAD_PLATFORM_NAME")
	private String whPadPlatformName;

	@Column(name = "WH_LICENSE_NO")
	private String whLicenseNo;

	@Column(name = "WH_BH_LAT")
	private Double whBhLat;

	@Column(name = "WH_FLUID_DATE")
	private Date whFluidDate;

	@Column(name = "PNC")
	private Integer wellPnc;

	@Column(name = "SAMPLES")
	private Integer wellSamples;

	@Column(name = "WH_BH_LAT_IHS")
	private Double whBhLatIhs;

	@Column(name = "WH_PRODUCING_FORMATION")
	private String whProducingFormation;

	@Column(name = "WELL_NAME_CDS")
	private String wellNameCds;

	@Column(name = "WH_WATER_DEPTH_M")
	private Double whWaterDepth;

	@Column(name = "WH_BLOCK_BH")
	private String whBlockBh;

	@Column(name = "WH_WELL_NBR")
	private String whWellNbr;

	@Column(name = "IQM_CODE")
	private String wellIqmCode;

	@Column(name = "WH_LEASE")
	private String whLease;

	@Column(name = "WH_BH_LONG_IHS")
	private Double whBhLongIhs;

	@Column(name = "WH_SPUD_DATE")
	private String whSpudDate;

	@Column(name = "WH_COMPLETION_STATUS")
	private String whCompletionStatus;

	@Column(name = "WH_BH_COORD_SYS_CDS")
	private String whBhCoordSysCds;

	@Column(name = "WELL_NAME")
	private String wellName;

	@Column(name = "WH_BASIN")
	private String whBasin;

	@Column(name = "WH_LAT_CDS")
	private Double whLatCds;

	@Column(name = "WH_LONG")
	private Double whLong;

	@Column(name = "WH_OPERATOR")
	private String whOperator;

	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
	private DDCountry country;

}
