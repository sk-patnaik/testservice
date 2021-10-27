package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqAlkalinity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_ALKALINITY", schema="gfs")
public class FpcLiqAlkalinity extends FpcDatabaseObject implements GTOLiqAlkalinity, Serializable {

	@Column(name = "SVC_CODE")
	private String alkSvcCode;

	@Column(name = "RUN_NUMBER")
	private String alkRunNumber;

	@Column(name = "ALK_PHENO")
	private Double alkPheno;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer alkRecordTypeId;

	@Column(name = "ALK_ALKALINITY")
	private Double alkAlkalinity;

	@Column(name = "ALK_PHENO_Q")
	private String alkPhenoQ;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "ALK_ORGANIC_ACID_Q")
	private String alkOrganicAcidQ;

	@Column(name = "FK_ALK_CO3_UNITS_ID")
	private Integer alkCo3UnitsId;

	@Column(name = "ALK_ALKALINITY_Q")
	private String alkAlkalinityQ;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "ALK_CO3")
	private Double alkCo3;

	@Column(name = "FK_ALK_ACID_UNITS_ID")
	private Integer alkAcidUnitsId;

	@Column(name = "CREATED_DATE")
	private Date alkCreatedDate;

	@Column(name = "ALK_HCO3_Q")
	private String alkHco3Q;

	@Column(name = "CREATED_USER")
	private String alkCreatedUser;

	@Column(name = "ALK_ORGANIC_ACID")
	private Double alkOrganicAcid;

	@Column(name = "FK_ALK_CARB_METHOD_ID")
	private Integer alkCarbMethodId;

	@Column(name = "ALK_CARB_Q")
	private String alkCarbQ;

	@Column(name = "FK_ALK_CARB_UNITS_ID")
	private Integer alkCarbUnitsId;

	@Column(name = "FK_ALK_TOT_UNITS_ID")
	private Integer alkTotUnitsId;

	@Column(name = "REQUEST_ID_VEND")
	private String alkRequestIdVend;

	@Column(name = "SAMPLE_ID_VEND")
	private String alkSampleIdVend;

	@Column(name = "FK_ALK_METHOD_ID")
	private Integer alkMethodId;

	@Column(name = "ALK_CARBONIC")
	private Double alkCarbonic;

	@Column(name = "ALK_CARBONIC_Q")
	private String alkCarbonicQ;

	@Column(name = "ALK_CARBONATE")
	private Double alkCarbonate;

	@Column(name = "UPDATED_USER")
	private String alkUpdatedUser;

	@Column(name = "FK_LAB_ID")
	private Integer alkLab;

	@Column(name = "UPDATED_DATE")
	private Date alkUpdatedDate;

	@Column(name = "FK_ALK_HCO3_UNITS_ID")
	private Integer alkHco3UnitsId;

	@Column(name = "ALK_AUTHOR")
	private String alkAuthor;

	@Column(name = "ALK_COMMENT")
	private String alkComment;

	@Column(name = "QC_DATE")
	private Date alkQcDate;

	@Column(name = "PK")
	private Integer alkPk;

	@Column(name = "ALK_HCO3")
	private Double alkHco3;

	@Column(name = "ALK_DATE")
	private Date alkAcqDate;

	@Column(name = "ALK_OH")
	private Double alkOh;

	@Column(name = "FK_ALK_CARBONIC_UNITS_ID")
	private Integer alkCarbonicUnitsId;

	@Column(name = "QC_USER")
	private String alkQcUser;

	@Column(name = "ALK_OH_Q")
	private String alkOhQ;

	@Column(name = "FK_ALK_PHENO_UNITS_ID")
	private Integer alkPhenoUnitsId;

	@Column(name = "ALK_CO3_Q")
	private String alkCo3Q;

	@Column(name = "FK_ALK_OH_UNITS_ID")
	private Integer alkOhUnitsId;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer alkConfTypeId;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_ALKALINITY;
	}
}
