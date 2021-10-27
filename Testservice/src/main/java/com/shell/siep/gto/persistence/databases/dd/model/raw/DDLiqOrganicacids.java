package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqOrganicacids;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_ORGANICACIDS")
public class DDLiqOrganicacids extends DDDatabaseObject implements GTOLiqOrganicacids, Serializable {

	@Column(name = "OA_FORM")
	private Double oaForm;

	@Column(name = "OA_COMMENT")
	private String oaComment;

	@Column(name = "OA_VAL")
	private Double oaVal;

	@Column(name = "OA_VAL_Q")
	private String oaValQ;

	@Column(name = "UPDATED_DATE")
	private Date oaUpdatedDate;

	@Column(name = "QC_USER")
	private String oaQcUser;

	@Column(name = "IQM_CODE")
	private String oaIqmCode;

	@Column(name = "OA_SUC")
	private Double oaSuc;

	@Column(name = "OA_N_VAL")
	private Double oaNVal;

	@Column(name = "OA_OXAL_Q")
	private String oaOxalQ;

	@Column(name = "OA_BUTY")
	private Double oaButy;

	@Column(name = "OA_GLYOXYLIC_ACID")
	private Double oaGlyoxylicAcid;

	@Column(name = "OA_CITRIC")
	private Double oaCitric;

	@Column(name = "OA_N_VAL_Q")
	private String oaNValQ;

	@Column(name = "REQUEST_ID_VEND")
	private String oaRequestIdVend;

	@Column(name = "OA_N_BUTY_Q")
	private String oaNButyQ;

	@Column(name = "OA_CITRIC_Q")
	private String oaCitricQ;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer oaRecordTypeId;

	@Column(name = "OA_MALON_Q")
	private String oaMalonQ;

	@Column(name = "OA_N_HEX")
	private Double oaNHex;

	@Column(name = "OA_ISO_HEX_Q")
	private String oaIsoHexQ;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "QC_DATE")
	private Date oaQcDate;

	@Column(name = "OA_HEP_Q")
	private String oaHepQ;

	@Column(name = "OA_ISO_HEX")
	private Double oaIsoHex;

	@Column(name = "OA_HEX")
	private Double oaHex;

	@Column(name = "OA_HEP")
	private Double oaHep;

	@Column(name = "FK_METHOD_ID")
	private Integer oaMethodId;

	@Column(name = "OA_ACE_Q")
	private String oaAceQ;

	@Column(name = "OA_GLYOXYLIC_OA_Q")
	private String oaGlyoxylicQ;

	@Column(name = "OA_ISO_BUTY")
	private Double oaIsoButy;

	@Column(name = "CREATED_DATE")
	private Date oaCreatedDate;

	@Column(name = "OA_DATE")
	private Date oaAcqDate;

	@Column(name = "OA_ISO_VAL_Q")
	private String oaIsoValQ;

	@Column(name = "SAMPLE_ID_VEND")
	private String oaSampleIdVend;

	@Column(name = "OA_ISO_VAL")
	private Double oaIsoVal;

	@Column(name = "OA_N_HEX_Q")
	private String oaNHexQ;

	@Column(name = "OA_BUTY_Q")
	private String oaButyQ;

	@Column(name = "OA_N_BUTY")
	private Double oaNButy;

	@Column(name = "OA_FORM_Q")
	private String oaFormQ;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "CREATED_USER")
	private String oaCreatedUser;

	@Column(name = "OA_GLYC_Q")
	private String oaGlycQ;

	@Column(name = "OA_MALON")
	private Double oaMalon;

	@Column(name = "FK_LAB_ID")
	private Integer oaLab;

	@Column(name = "FK_UNITS_ID")
	private Integer oaUnitsId;

	@Column(name = "SVC_CODE")
	private String oaSvcCode;

	@Column(name = "OA_SUC_Q")
	private String oaSucQ;

	@Column(name = "OA_HEX_Q")
	private String oaHexQ;

	@Column(name = "OA_ISO_BUTY_Q")
	private String oaIsoButyQ;

	@Column(name = "OA_ACE")
	private Double oaAce;

	@Column(name = "OA_GLYC")
	private Double oaGlyc;

	@Column(name = "UPDATED_USER")
	private String oaUpdatedUser;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer oaConfTypeId;

	@Column(name = "OA_OXAL")
	private Double oaOxal;

	@Column(name = "OA_PRO_Q")
	private String oaProQ;

	@Column(name = "OA_PRO")
	private Double oaPro;

	@Column(name = "RUN_NUMBER")
	private Integer oaRunNumber;

	@Column(name = "PK")
	private Integer oaPk;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_ORGANIC_ACIDS;
	}
}
