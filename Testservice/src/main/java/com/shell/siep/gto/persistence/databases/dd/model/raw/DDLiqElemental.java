package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqElemental;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_ELEMENTAL")
public class DDLiqElemental extends DDDatabaseObject implements GTOLiqElemental, Serializable {

	@Column(name = "IE_NO3")
	private Double elNo3;

	@Column(name = "IE_TH_Q")
	private String elThQ;

	@Column(name = "IE_SE_Q")
	private String elSeQ;

	@Column(name = "IE_NH34")
	private Double elNh34;

	@Column(name = "IE_RB_Q")
	private String elRbQ;

	@Column(name = "IE_TI_Q")
	private String elTiQ;

	@Column(name = "IE_HF_Q")
	private String elHfQ;

	@Column(name = "IE_LA_Q")
	private String elLaQ;

	@Column(name = "IE_B")
	private Double elB;

	@Column(name = "IE_C")
	private Double elC;

	@Column(name = "IE_F")
	private Double elF;

	@Column(name = "IE_I")
	private Double elI;

	@Column(name = "IE_K")
	private Double elK;

	@Column(name = "IE_P")
	private Double elP;

	@Column(name = "IE_S")
	private Double elS;

	@Column(name = "IE_U")
	private Double elU;

	@Column(name = "IE_V")
	private Double elV;

	@Column(name = "IE_W")
	private Double elW;

	@Column(name = "IE_Y")
	private Double elY;

	@Column(name = "IE_BE_Q")
	private String elBeQ;

	@Column(name = "IE_CU_Q")
	private String elCuQ;

	@Column(name = "IE_CD_Q")
	private String elCdQ;

	@Column(name = "IE_BR_Q")
	private String elBrQ;

	@Column(name = "IE_BA_Q")
	private String elBaQ;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer elConfTypeId;

	@Column(name = "FK_LAB_ID")
	private Integer elLab;

	@Column(name = "IE_K_Q")
	private String elKQ;

	@Column(name = "IE_IR")
	private Double elIr;

	@Column(name = "IE_IN")
	private Double elIn;

	@Column(name = "IE_HF")
	private Double elHf;

	@Column(name = "IE_HG")
	private Double elHg;

	@Column(name = "IE_GA")
	private Double elGa;

	@Column(name = "IE_GE")
	private Double elGe;

	@Column(name = "IE_ANION_METHOD_SPECIFICATION")
	private Integer elAnionMethodSpecification;

	@Column(name = "IE_FE")
	private Double elFe;

	@Column(name = "IE_NITRITE")
	private Double elNitrite;

	@Column(name = "IE_CL")
	private Double elCl;

	@Column(name = "IE_CO")
	private Double elCo;

	@Column(name = "IE_CR")
	private Double elCr;

	@Column(name = "IE_CU")
	private Double elCu;

	@Column(name = "IE_CA")
	private Double elCa;

	@Column(name = "IE_CD")
	private Double elCd;

	@Column(name = "IE_BR")
	private Double elBr;

	@Column(name = "IE_BA")
	private Double elBa;

	@Column(name = "IE_BE")
	private Double elBe;

	@Column(name = "IE_BI")
	private Double elBi;

	@Column(name = "IE_AL")
	private Double elAl;

	@Column(name = "IE_AS")
	private Double elAs;

	@Column(name = "IE_AU")
	private Double elAu;

	@Column(name = "IE_AG")
	private Double elAg;

	@Column(name = "FK_IE_CATIONS_METHOD_ID")
	private Integer elCationsMethodId;

	@Column(name = "FK_IE_ANIONS_METHOD_ID")
	private Integer elAnionsMethodId;

	@Column(name = "IE_GA_Q")
	private String elGaQ;

	@Column(name = "IE_I_Q")
	private String elIQ;

	@Column(name = "IE_SI_Q")
	private String elSiQ;

	@Column(name = "IE_ANIONS_COMMENT")
	private String elAnionsComment;

	@Column(name = "IE_TL_Q")
	private String elTlQ;

	@Column(name = "IE_ZR")
	private Double elZr;

	@Column(name = "IE_ZN")
	private Double elZn;

	@Column(name = "IE_TL")
	private Double elTl;

	@Column(name = "IE_TA")
	private Double elTa;

	@Column(name = "IE_TE")
	private Double elTe;

	@Column(name = "IE_TH")
	private Double elTh;

	@Column(name = "IE_TI")
	private Double elTi;

	@Column(name = "IE_SN")
	private Double elSn;

	@Column(name = "IE_SR")
	private Double elSr;

	@Column(name = "IE_SB")
	private Double elSb;

	@Column(name = "IE_SE")
	private Double elSe;

	@Column(name = "IE_SI")
	private Double elSi;

	@Column(name = "IE_RU")
	private Double elRu;

	@Column(name = "IE_RB")
	private Double elRb;

	@Column(name = "IE_RE")
	private Double elRe;

	@Column(name = "IE_RH")
	private Double elRh;

	@Column(name = "PK")
	private Integer elPk;

	@Column(name = "IE_PT")
	private Double elPt;

	@Column(name = "IE_PB")
	private Double elPb;

	@Column(name = "IE_PD")
	private Double elPd;

	@Column(name = "IE_NI")
	private Double elNi;

	@Column(name = "IE_NA")
	private Double elNa;

	@Column(name = "IE_NB")
	private Double elNb;

	@Column(name = "IE_ZN_Q")
	private String elZnQ;

	@Column(name = "IE_MG")
	private Double elMg;

	@Column(name = "IE_MN")
	private Double elMn;

	@Column(name = "IE_MO")
	private Double elMo;

	@Column(name = "IE_LI")
	private Double elLi;

	@Column(name = "IE_LA")
	private Double elLa;

	@Column(name = "IE_CL_Q")
	private String elClQ;

	@Column(name = "IE_BI_Q")
	private String elBiQ;

	@Column(name = "IQM_CODE")
	private String elIqmCode;

	@Column(name = "IE_HG_Q")
	private String elHgQ;

	@Column(name = "IE_CATION_METHOD_SPECIFICATION")
	private String elCationMethodSpecification;

	@Column(name = "IE_RU_Q")
	private String elRuQ;

	@Column(name = "IE_AS_Q")
	private String elAsQ;

	@Column(name = "IE_NI_Q")
	private String elNiQ;

	@Column(name = "IE_Y_Q")
	private String elYQ;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "IE_RE_Q")
	private String elReQ;

	@Column(name = "IE_GE_Q")
	private String elGeQ;

	@Column(name = "IE_AU_Q")
	private String elAuQ;

	@Column(name = "IE_MG_Q")
	private String elMgQ;

	@Column(name = "IE_PD_Q")
	private String elPdQ;

	@Column(name = "IE_ZR_Q")
	private String elZrQ;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer elRecordTypeId;

	@Column(name = "IE_CO_Q")
	private String elCoQ;

	@Column(name = "IE_V_Q")
	private String elVQ;

	@Column(name = "RUN_NUMBER")
	private String elRunNumber;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "IE_NH34_Q")
	private String elNh34Q;

	@Column(name = "IE_CATIONS_COMMENT")
	private String elCationsComment;

	@Column(name = "IE_LI_Q")
	private String elLiQ;

	@Column(name = "IE_W_Q")
	private String elWQ;

	@Column(name = "IE_T_SULFIDE_Q")
	private String elTSulfideQ;

	@Column(name = "IE_F_Q")
	private String elFQ;

	@Column(name = "IE_SN_Q")
	private String elSnQ;

	@Column(name = "IE_T_SULFIDE")
	private Double elTSulfide;

	@Column(name = "FK_IE_CATIONS_UNITS_ID")
	private Integer elCationsUnitsId;

	@Column(name = "IE_IR_Q")
	private String elIrQ;

	@Column(name = "IE_TA_Q")
	private String elTaQ;

	@Column(name = "IE_NITRITE_Q")
	private String elNitriteQ;

	@Column(name = "IE_RH_Q")
	private String elRhQ;

	@Column(name = "IE_FE_Q")
	private String elFeQ;

	@Column(name = "IE_PB_Q")
	private String elPbQ;

	@Column(name = "IE_IN_Q")
	private String elInQ;

	@Column(name = "IE_C_Q")
	private String elCQ;

	@Column(name = "IE_AG_Q")
	private String elAgQ;

	@Column(name = "IE_NO3_Q")
	private String elNo3Q;

	@Column(name = "REQUEST_ID_VEND")
	private String elRequestIdVend;

	@Column(name = "IE_PT_Q")
	private String elPtQ;

	@Column(name = "IE_U_Q")
	private String elUQ;

	@Column(name = "SVC_CODE")
	private String elSvcCode;

	@Column(name = "IE_NB_Q")
	private String elNbQ;

	@Column(name = "CREATED_DATE")
	private Date elCreatedDate;

	@Column(name = "SAMPLE_ID_VEND")
	private String elSampleIdVend;

	@Column(name = "IE_SR_Q")
	private String elSrQ;

	@Column(name = "IE_AUTHOR")
	private String elAuthor;

	@Column(name = "IE_DATE")
	private Date elAcqDate;

	@Column(name = "IE_SO4_Q")
	private String elSo4Q;

	@Column(name = "FK_IE_ANIONS_UNITS_ID")
	private Integer elAnionsUnitsId;

	@Column(name = "IE_S_Q")
	private String elSQ;

	@Column(name = "IE_B_Q")
	private String elBQ;

	@Column(name = "QC_DATE")
	private Date elQcDate;

	@Column(name = "IE_TE_Q")
	private String elTeQ;

	@Column(name = "IE_SO4")
	private Double elSo4;

	@Column(name = "IE_SB_Q")
	private String elSbQ;

	@Column(name = "IE_PO4")
	private Double elPo4;

	@Column(name = "IE_MN_Q")
	private String elMnQ;

	@Column(name = "IE_PO4_Q")
	private String elPo4Q;

	@Column(name = "UPDATED_USER")
	private String elUpdatedUser;

	@Column(name = "QC_USER")
	private String elQcUser;

	@Column(name = "IE_CR_Q")
	private String elCrQ;

	@Column(name = "IE_NA_Q")
	private String elNaQ;

	@Column(name = "IE_CA_Q")
	private String elCaQ;

	@Column(name = "IE_MO_Q")
	private String elMoQ;

	@Column(name = "CREATED_USER")
	private String elCreatedUser;

	@Column(name = "IE_AL_Q")
	private String elAlQ;

	@Column(name = "UPDATED_DATE")
	private Date elUpdatedDate;

	@Column(name = "IE_P_Q")
	private String elPQ;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_ELEMENTAL;
	}
}
