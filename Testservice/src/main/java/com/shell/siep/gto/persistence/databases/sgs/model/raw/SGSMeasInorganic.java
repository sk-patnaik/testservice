package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.raw.GTOOilInorganic;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="WTC_MEAS_INORGANIC", schema="sgs_data")
public class SGSMeasInorganic extends SGSDatabaseObject implements GTOOilInorganic, Serializable {

	@Column(name = "IE_NI_C")
	private Double waterIeNiC;

	@Column(name = "IE_AS_C")
	private Double ieAsC;

	@Column(name = "IE_BE_Q")
	private String ieBeQ;

	@Column(name = "IE_PO4_Q")
	private String iePo4Q;

	@Column(name = "IE_IN_C")
	private Double ieInC;

	@Column(name = "IE_BE_C")
	private Double ieBeC;

	@Column(name = "IE_IN_Q")
	private String ieInQ;

	@Column(name = "IE_CU_C")
	private Double ieCuC;

	@Column(name = "IE_PO4_C")
	private Double iePo4C;

	@Column(name = "IE_HEX_Q")
	private String ieHexQ;

	@Column(name = "IE_PRO")
	private Double iePro;

	@Column(name = "IE_HEX_C")
	private Double ieHexC;

	@Column(name = "IE_NI_Q")
	private String waterIeNiQ;

	@Column(name = "IE_AS_Q")
	private String ieAsQ;

	@Column(name = "IE_TA_Q")
	private String ieTaQ;

	@Column(name = "IE_COMMENT")
	private String waterIeComment;

	@Column(name = "IE_TA_C")
	private Double ieTaC;

	@Column(name = "IE_PO4")
	private Double iePo4;

	@Column(name = "IE_RH_Q")
	private String ieRhQ;

	@Column(name = "IE_GLYC_C")
	private Double ieGlycC;

	@Column(name = "IE_ACE")
	private Double waterIeAce;

	@Column(name = "IE_CITRIC")
	private Double ieCitric;

	@Column(name = "IE_BA_Q")
	private String ieBaQ;

	@Column(name = "QC_USER")
	private String ieQcUser;

	@Column(name = "IE_BA_C")
	private Double ieBaC;

	@Column(name = "SVC_CODE")
	private String ieSvcCode;

	@Column(name = "IE_CARB_Q")
	private String ieCarbQ;

	@Column(name = "IE_GLYC_Q")
	private String ieGlycQ;

	@Column(name = "IE_CARB_C")
	private Double ieCarbC;

	@Column(name = "IE_CARB_Q", insertable = false, updatable = false)
	private String waterIeCarbQ;

	@Column(name = "IE_COMMENT", insertable = false, updatable = false)
	private String ieComment;

	@Column(name = "IE_RH_C")
	private Double ieRhC;

	@Column(name = "IE_CARB_C", insertable = false, updatable = false)
	private Double waterIeCarbC;

	@Column(name = "IE_HCO3")
	private Double ieHco3;

	@Column(name = "IE_CD_Q")
	private String ieCdQ;

	@Column(name = "IE_APPEAR")
	private String waterIeAppear;

	@Column(name = "IE_CD_C")
	private Double ieCdC;

	@Column(name = "IE_CU_Q")
	private String ieCuQ;

	@Column(name = "IE_CARB")
	private Double waterIeCarb;

	@Column(name = "IE_HEX")
	private Double ieHex;

	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "IE_BR_Q")
	private String ieBrQ;

	@Column(name = "IE_BR_C")
	private Double ieBrC;

	@Column(name = "IE_METHOD_ACID")
	private Integer ieMethodAcid;

	@Column(name = "RUN_NUMBER")
	private String ieRunNumber;

	@Column(name = "UPDATED_DATE")
	private Date ieLastUpdate;

	@Column(name = "IE_APPEAR", insertable = false, updatable = false)
	private String ieAppear;

	@Column(name = "IE_NA_C")
	private Double waterIeNaC;

	@Column(name = "IE_FORM")
	private Double waterIeForm;

	@Column(name = "SAMPLE_ID_VEND")
	private String ieSampleIdVend;

	@Column(name = "IE_CA_Q")
	private String waterIeCaQ;

	@Column(name = "IE_PRO_C")
	private Double waterIeProC;

	@Column(name = "IE_CA_C")
	private Double waterIeCaC;

	@Column(name = "IE_PB_Q")
	private String iePbQ;

	@Column(name = "IE_BUTY_C")
	private Double ieButyC;

	@Column(name = "IE_RU_C")
	private Double ieRuC;

	@Column(name = "IE_MO_C")
	private Double waterIeMoC;

	@Column(name = "IE_MO_Q")
	private String waterIeMoQ;

	@Column(name = "IE_RU_Q")
	private String ieRuQ;

	@Column(name = "IE_BUTY_Q")
	private String ieButyQ;

	@Column(name = "IE_NA_Q")
	private String waterIeNaQ;

	@Column(name = "IE_GLYC_C", insertable = false, updatable = false)
	private Double waterIeGlycC;

	@Column(name = "IE_HG_C")
	private Double ieHgC;

	@Column(name = "IE_MALON_C")
	private Double ieMalonC;

	@Column(name = "IE_GLYC_Q", insertable = false, updatable = false)
	private String waterIeGlycQ;

	@Column(name = "IE_HG_Q")
	private String ieHgQ;

	@Column(name = "IE_MN_C")
	private Double ieMnC;

	@Column(name = "IE_MN_Q")
	private String ieMnQ;

	@Column(name = "IE_PB_C")
	private Double iePbC;

	@Column(name = "IE_FE_C")
	private Double ieFeC;

	@Column(name = "IE_CR_Q")
	private String waterIeCrQ;

	@Column(name = "IE_NO3_Q")
	private String ieNo3Q;

	@Column(name = "IE_FE_Q")
	private String ieFeQ;

	@Column(name = "IE_CR_C")
	private Double waterIeCrC;

	@Column(name = "IE_PRO_Q")
	private String waterIeProQ;

	@Column(name = "IE_P_Q")
	private String iePQ;

	@Column(name = "IE_P_C")
	private Double iePC;

	@Column(name = "IE_AG_Q")
	private String ieAgQ;

	@Column(name = "IE_AG_C")
	private Double ieAgC;

	@Column(name = "IE_NO3_C")
	private Double ieNo3C;

	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "IE_MALON_Q")
	private String ieMalonQ;

	@Column(name = "IE_VAL")
	private Double waterIeVal;

	@Column(name = "IE_HCO3_Q")
	private String ieHco3Q;

	@Column(name = "IE_HCO3_C")
	private Double ieHco3C;

	@Column(name = "IE_METHOD_ANION")
	private Integer ieMethodAnion;

	@Column(name = "IE_RE")
	private Double ieRe;

	@Column(name = "IE_RB")
	private Double ieRb;

	@Column(name = "IE_RH")
	private Double ieRh;

	@Column(name = "IE_PT")
	private Double iePt;

	@Column(name = "IE_PB")
	private Double waterIePb;

	@Column(name = "IE_QC")
	private String ieQc;

	@Column(name = "IE_SR")
	private Double ieSr;

	@Column(name = "IE_QC", insertable = false, updatable = false)
	private String waterIeQc;

	@Column(name = "IE_BUTY_C", insertable = false, updatable = false)
	private Double waterIeButyC;

	@Column(name = "IE_MG_Q")
	private String waterIeMgQ;

	@Column(name = "IE_TE")
	private Double ieTe;

	@Column(name = "IE_TH")
	private Double ieTh;

	@Column(name = "IE_TA")
	private Double ieTa;

	@Column(name = "IE_CE_C")
	private Double ieCeC;

	@Column(name = "IE_TI")
	private Double ieTi;

	@Column(name = "IE_TL")
	private Double ieTl;

	@Column(name = "IE_RU")
	private Double ieRu;

	@Column(name = "IE_PO4_Q", insertable = false, updatable = false)
	private String waterIePo4Q;

	@Column(name = "IE_MG_C")
	private Double waterIeMgC;

	@Column(name = "IE_SE")
	private Double ieSe;

	@Column(name = "IE_SB")
	private Double ieSb;

	@Column(name = "IE_BUTY_Q", insertable = false, updatable = false)
	private String waterIeButyQ;

	@Column(name = "IE_SN")
	private Double ieSn;

	@Column(name = "IE_SI")
	private Double ieSi;

	@Column(name = "IE_Y_C")
	private Double ieYC;

	@Column(name = "IE_LI")
	private Double waterIeLi;

	@Column(name = "IE_Y_Q")
	private String ieYQ;

	@Column(name = "IE_NI_C", insertable = false, updatable = false)
	private Double ieNiC;

	@Column(name = "IE_MG")
	private Double waterIeMg;

	@Column(name = "IE_NI_Q", insertable = false, updatable = false)
	private String ieNiQ;

	@Column(name = "IE_MN")
	private Double waterIeMn;

	@Column(name = "IE_MO")
	private Double waterIeMo;

	@Column(name = "IE_NA")
	private Double waterIeNa;

	@Column(name = "IE_CARB", insertable = false, updatable = false)
	private Double ieCarb;

	@Column(name = "IE_NI")
	private Double waterIeNi;

	@Column(name = "IE_CR_C", insertable = false, updatable = false)
	private Double ieCrC;

	@Column(name = "IE_ZN")
	private Double ieZn;

	@Column(name = "IE_DATE")
	private Date waterIeDate;

	@Column(name = "IE_ZR")
	private Double ieZr;

	@Column(name = "IE_NA_C", insertable = false, updatable = false)
	private Double ieNaC;

	@Column(name = "IE_CO3_Q")
	private String ieCo3Q;

	@Column(name = "IE_CA_Q", insertable = false, updatable = false)
	private String ieCaQ;

	@Column(name = "IE_CA_C", insertable = false, updatable = false)
	private Double ieCaC;

	@Column(name = "IE_CO3_C")
	private Double ieCo3C;

	@Column(name = "IE_ZN", insertable = false, updatable = false)
	private Double waterIeZn;

	@Column(name = "IE_CR_Q", insertable = false, updatable = false)
	private String ieCrQ;

	@Id
	@Column(name = "IE_METHOD_CATION")
	private Integer waterIeMethodCation;

	@Column(name = "IE_ACE_Q")
	private String ieAceQ;

	@Column(name = "IE_SI", insertable = false, updatable = false)
	private Double waterIeSi;

	@Column(name = "IE_ACE_C")
	private Double ieAceC;

	@Column(name = "UPDATED_USER")
	private String ieUpdatedUser;

	@Column(name = "IE_SR", insertable = false, updatable = false)
	private Double waterIeSr;

	@Column(name = "IE_U_C")
	private Double ieUC;

	@Column(name = "IE_U_Q")
	private String ieUQ;

	@Column(name = "IE_VAL", insertable = false, updatable = false)
	private Double ieVal;

	@Column(name = "QC_DATE")
	private Date ieQcDate;

	@Column(name = "IE_SO4")
	private Double waterIeSo4;

	@Column(name = "IE_SI_Q")
	private String waterIeSiQ;

	@Column(name = "IE_H2S_C")
	private Double ieH2sC;

	@Column(name = "IE_SO4_C")
	private Double ieSo4C;

	@Column(name = "IE_SI_C")
	private Double waterIeSiC;

	@Column(name = "IE_ALK")
	private Double waterIeAlk;

	@Column(name = "IE_H2S_Q")
	private String ieH2sQ;

	@Column(name = "IE_AL_Q")
	private String ieAlQ;

	@Column(name = "IE_ACE", insertable = false, updatable = false)
	private Double ieAce;

	@Column(name = "IE_RE_Q")
	private String ieReQ;

	@Column(name = "IE_SO4_Q")
	private String ieSo4Q;

	@Column(name = "IE_I_C")
	private Double waterIeIC;

	@Column(name = "IE_CITRIC_Q")
	private String ieCitricQ;

	@Column(name = "IE_BA")
	private Double waterIeBa;

	@Column(name = "IE_I_Q")
	private String waterIeIQ;

	@Column(name = "IE_GE_Q")
	private String ieGeQ;

	@Column(name = "IE_RE_C")
	private Double ieReC;

	@Column(name = "IE_NITRITE_C")
	private Double ieNitriteC;

	@Column(name = "IE_FORM", insertable = false, updatable = false)
	private Double ieForm;

	@Column(name = "IE_NH34_C")
	private Double waterIeNh34C;

	@Column(name = "IE_AL_C")
	private Double ieAlC;

	@Column(name = "IE_NA_Q", insertable = false, updatable = false)
	private String ieNaQ;

	@Column(name = "IE_PT_C")
	private Double iePtC;

	@Column(name = "IE_NITRITE_Q")
	private String ieNitriteQ;

	@Column(name = "IE_PT_Q")
	private String iePtQ;

	@Column(name = "IE_MO_C", insertable = false, updatable = false)
	private Double ieMoC;

	@Column(name = "IE_NH34_C", insertable = false, updatable = false)
	private Double ieNh34C;

	@Column(name = "IE_MO_Q", insertable = false, updatable = false)
	private String ieMoQ;

	@Column(name = "IE_NH34_Q")
	private String waterIeNh34Q;

	@Column(name = "SAMPLE_ID_VEND", insertable = false, updatable = false)
	private String waterSampleIdVend;

	@Column(name = "IE_NH34_Q", insertable = false, updatable = false)
	private String ieNh34Q;

	@Column(name = "IE_NO3")
	private Double waterIeNo3;

	@Column(name = "IE_V_C")
	private Double waterIeVC;

	@Column(name = "IE_NH34")
	private Double waterIeNh34;

	@Column(name = "CREATED_DATE")
	private Date ieCreatedDate;

	@Column(name = "IE_LI_C")
	private Double waterIeLiC;

	@Column(name = "IE_ZN_C")
	private Double waterIeZnC;

	@Column(name = "IE_ALK", insertable = false, updatable = false)
	private Double ieAlk;

	@Column(name = "IE_V_Q")
	private String waterIeVQ;

	@Column(name = "IE_ALK_C")
	private Double ieAlkC;

	@Column(name = "IE_ALK_Q")
	private String ieAlkQ;

	@Column(name = "IE_CO_Q")
	private String waterIeCoQ;

	@Column(name = "IE_BR")
	private Double waterIeBr;

	@Column(name = "IE_PO4_C", insertable = false, updatable = false)
	private Double waterIePo4C;

	@Column(name = "IE_CD")
	private Double waterIeCd;

	@Column(name = "IE_CO_C")
	private Double waterIeCoC;

	@Column(name = "IE_CA")
	private Double waterIeCa;

	@Column(name = "IE_GA_C")
	private Double ieGaC;

	@Column(name = "IE_CL")
	private Double waterIeCl;

	@Column(name = "IE_CO")
	private Double waterIeCo;

	@Column(name = "IE_CU")
	private Double waterIeCu;

	@Column(name = "IE_GA_Q")
	private String ieGaQ;

	@Column(name = "IE_CR")
	private Double waterIeCr;

	@Column(name = "IE_FE")
	private Double waterIeFe;

	@Column(name = "IE_S_Q")
	private String waterIeSQ;

	@Column(name = "IE_B_Q")
	private String waterIeBQ;

	@Column(name = "IE_B_C")
	private Double waterIeBC;

	@Column(name = "IE_DATE", insertable = false, updatable = false)
	private Date ieDate;

	@Column(name = "IE_NO3", insertable = false, updatable = false)
	private Double ieNo3;

	@Column(name = "IE_NITRITE_C", insertable = false, updatable = false)
	private Double waterIeNitriteC;

	@Column(name = "IE_NITRITE_Q", insertable = false, updatable = false)
	private String waterIeNitriteQ;

	@Column(name = "IE_V_C", insertable = false, updatable = false)
	private Double ieVC;

	@Column(name = "IE_AU_C")
	private Double ieAuC;

	@Column(name = "IE_FORM_Q")
	private String ieFormQ;

	@Column(name = "IE_FORM_C")
	private Double ieFormC;

	@Column(name = "IE_I_C", insertable = false, updatable = false)
	private Double ieIC;

	@Column(name = "IE_BUTY")
	private Double waterIeButy;

	@Column(name = "IE_I_Q", insertable = false, updatable = false)
	private String ieIQ;

	@Column(name = "IE_ZN_Q")
	private String waterIeZnQ;

	@Column(name = "IE_LI_Q")
	private String waterIeLiQ;

	@Column(name = "REQUEST_ID_VEND")
	private String waterRequestIdVend;

	@Column(name = "IE_SR_Q")
	private String waterIeSrQ;

	@Column(name = "IE_SR_C")
	private Double waterIeSrC;

	@Column(name = "IE_MG_C", insertable = false, updatable = false)
	private Double ieMgC;

	@Column(name = "IE_MG_Q", insertable = false, updatable = false)
	private String ieMgQ;

	@Column(name = "IE_AU_Q")
	private String ieAuQ;

	@Column(name = "IE_CO3_C", insertable = false, updatable = false)
	private Double waterIeCo3C;

	@Column(name = "IE_NO3_Q", insertable = false, updatable = false)
	private String waterIeNo3Q;

	@Column(name = "IE_NB_Q")
	private String ieNbQ;

	@Column(name = "IE_CO3_Q", insertable = false, updatable = false)
	private String waterIeCo3Q;

	@Column(name = "IE_SI_C", insertable = false, updatable = false)
	private Double ieSiC;

	@Column(name = "IE_SI_Q", insertable = false, updatable = false)
	private String ieSiQ;

	@Column(name = "IE_PD_C")
	private Double iePdC;

	@Column(name = "IE_TL_Q")
	private String ieTlQ;

	@Column(name = "IE_ACE_Q", insertable = false, updatable = false)
	private String waterIeAceQ;

	@Column(name = "IE_H2S")
	private Double waterIeH2s;

	@Column(name = "IE_ACE_C", insertable = false, updatable = false)
	private Double waterIeAceC;

	@Column(name = "IE_NO3_C", insertable = false, updatable = false)
	private Double waterIeNo3C;

	@Column(name = "IE_NB_C")
	private Double ieNbC;

	@Column(name = "IE_VAL_Q")
	private String ieValQ;

	@Column(name = "IE_V_Q", insertable = false, updatable = false)
	private String ieVQ;

	@Column(name = "IE_VAL_C")
	private Double ieValC;

	@Column(name = "UPDATED_DATE", insertable = false, updatable = false)
	private Date ieUpdatedDate;

	@Column(name = "IE_TL_C")
	private Double ieTlC;

	@Column(name = "IE_K_C")
	private Double waterIeKC;

	@Column(name = "IE_CO3")
	private Double waterIeCo3;

	@Column(name = "IE_AL")
	private Double ieAl;

	@Column(name = "IE_AG")
	private Double ieAg;

	@Column(name = "IE_METHOD_ANION", insertable = false, updatable = false)
	private Integer waterIeMethodAnion;

	@Column(name = "IE_AS")
	private Double ieAs;

	@Column(name = "IE_AU")
	private Double ieAu;

	@Column(name = "IE_NITRITE")
	private Double waterIeNitrite;

	@Column(name = "IE_NH34", insertable = false, updatable = false)
	private Double ieNh34;

	@Column(name = "IE_SE_C")
	private Double ieSeC;

	@Column(name = "IE_SE_Q")
	private String ieSeQ;

	@Column(name = "IE_CO_Q", insertable = false, updatable = false)
	private String ieCoQ;

	@Column(name = "IE_CD", insertable = false, updatable = false)
	private Double ieCd;

	@Column(name = "IE_CA", insertable = false, updatable = false)
	private Double ieCa;

	@Column(name = "IE_CL", insertable = false, updatable = false)
	private Double ieCl;

	@Column(name = "IE_CO", insertable = false, updatable = false)
	private Double ieCo;

	@Column(name = "IE_TH_Q")
	private String ieThQ;

	@Column(name = "IE_CU", insertable = false, updatable = false)
	private Double ieCu;

	@Column(name = "IE_CR", insertable = false, updatable = false)
	private Double ieCr;

	@Column(name = "IE_BE")
	private Double ieBe;

	@Column(name = "IE_BA", insertable = false, updatable = false)
	private Double ieBa;

	@Column(name = "IE_BI")
	private Double ieBi;

	@Column(name = "IE_BR", insertable = false, updatable = false)
	private Double ieBr;

	@Column(name = "IE_ZR_Q")
	private String ieZrQ;

	@Column(name = "IE_TH_C")
	private Double ieThC;

	@Column(name = "IE_GE")
	private Double ieGe;

	@Column(name = "IE_CO_C", insertable = false, updatable = false)
	private Double ieCoC;

	@Column(name = "IE_PD_Q")
	private String iePdQ;

	@Column(name = "IE_FE", insertable = false, updatable = false)
	private Double ieFe;

	@Column(name = "IE_ZR_C")
	private Double ieZrC;

	@Column(name = "IE_GA")
	private Double ieGa;

	@Column(name = "IE_IR")
	private Double ieIr;

	@Column(name = "IE_IN")
	private Double ieIn;

	@Column(name = "IE_HF")
	private Double ieHf;

	@Column(name = "IE_HG")
	private Double ieHg;

	@Column(name = "IE_F_Q")
	private String waterIeFQ;

	@Column(name = "IE_F_C")
	private Double waterIeFC;

	@Column(name = "IE_SO4", insertable = false, updatable = false)
	private Double ieSo4;

	@Column(name = "IE_OXAL_Q")
	private String ieOxalQ;

	@Column(name = "IE_CL_Q")
	private String waterIeClQ;

	@Column(name = "IE_NITRITE", insertable = false, updatable = false)
	private Double ieNitrite;

	@Column(name = "IE_CL_C")
	private Double waterIeClC;

	@Column(name = "IE_SR_C", insertable = false, updatable = false)
	private Double ieSrC;

	@Column(name = "CREATED_USER")
	private String ieCreatedUser;

	@Column(name = "IE_OXAL_C")
	private Double ieOxalC;

	@Column(name = "IE_SR_Q", insertable = false, updatable = false)
	private String ieSrQ;

	@Column(name = "IE_MO", insertable = false, updatable = false)
	private Double ieMo;

	@Column(name = "IE_MN", insertable = false, updatable = false)
	private Double ieMn;

	@Column(name = "IE_RB_Q")
	private String ieRbQ;

	@Column(name = "IE_ZN_Q", insertable = false, updatable = false)
	private String ieZnQ;

	@Column(name = "IE_LI_C", insertable = false, updatable = false)
	private Double ieLiC;

	@Column(name = "IE_MALON")
	private Double ieMalon;

	@Column(name = "IE_LI_Q", insertable = false, updatable = false)
	private String ieLiQ;

	@Column(name = "IE_NB")
	private Double ieNb;

	@Column(name = "IE_NA", insertable = false, updatable = false)
	private Double ieNa;

	@Column(name = "IE_NI", insertable = false, updatable = false)
	private Double ieNi;

	@Column(name = "IE_LI", insertable = false, updatable = false)
	private Double ieLi;

	@Column(name = "IE_HCO3_C", insertable = false, updatable = false)
	private Double waterIeHco3C;

	@Column(name = "IE_MG", insertable = false, updatable = false)
	private Double ieMg;

	@Column(name = "IE_PB", insertable = false, updatable = false)
	private Double iePb;

	@Column(name = "IE_PD")
	private Double iePd;

	@Column(name = "IE_HCO3_Q", insertable = false, updatable = false)
	private String waterIeHco3Q;

	@Column(name = "IE_METHOD_CATION", insertable = false, updatable = false)
	private Integer ieMethodCation;

	@Column(name = "IE_BUTY", insertable = false, updatable = false)
	private Double ieButy;

	@Column(name = "IE_S_C")
	private Double waterIeSC;

	@Column(name = "IE_RB_C")
	private Double ieRbC;

	@Column(name = "IE_ZN_C", insertable = false, updatable = false)
	private Double ieZnC;

	@Column(name = "IE_GLYC")
	private Double waterIeGlyc;

	@Column(name = "IE_W_C")
	private Double ieWC;

	@Column(name = "IE_W_Q")
	private String ieWQ;

	@Column(name = "IE_SN_C")
	private Double ieSnC;

	@Column(name = "IE_F_C", insertable = false, updatable = false)
	private Double ieFC;

	@Column(name = "IE_SN_Q")
	private String ieSnQ;

	@Column(name = "IE_F_Q", insertable = false, updatable = false)
	private String ieFQ;

	@Column(name = "REQUEST_ID_VEND", insertable = false, updatable = false)
	private String ieRequestIdVend;

	@Column(name = "IE_CU_C", insertable = false, updatable = false)
	private Double waterIeCuC;

	@Column(name = "IE_CU_Q", insertable = false, updatable = false)
	private String waterIeCuQ;

	@Column(name = "IE_S_C", insertable = false, updatable = false)
	private Double ieSC;

	@Column(name = "IE_VAL_Q", insertable = false, updatable = false)
	private String waterIeValQ;

	@Column(name = "IE_S_Q", insertable = false, updatable = false)
	private String ieSQ;

	@Column(name = "IE_HCO3", insertable = false, updatable = false)
	private Double waterIeHco3;

	@Column(name = "IE_VAL_C", insertable = false, updatable = false)
	private Double waterIeValC;

	@Column(name = "IE_CD_C", insertable = false, updatable = false)
	private Double waterIeCdC;

	@Column(name = "IE_CD_Q", insertable = false, updatable = false)
	private String waterIeCdQ;

	@Column(name = "IE_B_C", insertable = false, updatable = false)
	private Double ieBC;

	@Column(name = "IE_AUTHOR")
	private String waterIeAuthor;

	@Column(name = "IE_B_Q", insertable = false, updatable = false)
	private String ieBQ;

	@Column(name = "IE_F")
	private Double ieF;

	@Column(name = "IE_PRO_C", insertable = false, updatable = false)
	private Double ieProC;

	@Column(name = "IE_I")
	private Double ieI;

	@Column(name = "IE_K")
	private Double ieK;

	@Column(name = "IE_P")
	private Double ieP;

	@Column(name = "IE_U")
	private Double ieU;

	@Column(name = "IE_PRO_Q", insertable = false, updatable = false)
	private String ieProQ;

	@Column(name = "IE_V")
	private Double ieV;

	@Column(name = "IE_OXAL")
	private Double ieOxal;

	@Column(name = "IE_S")
	private Double ieS;

	@Column(name = "IE_Y")
	private Double ieY;

	@Column(name = "IE_W")
	private Double ieW;

	@Column(name = "IE_B")
	private Double ieB;

	@Column(name = "IE_LAB")
	private String waterIeLab;

	@Column(name = "IE_METHOD_SULF")
	private Integer ieMethodSulf;

	@Column(name = "IE_FE_C", insertable = false, updatable = false)
	private Double waterIeFeC;

	@Column(name = "IE_K_Q")
	private String waterIeKQ;

	@Column(name = "IE_SO4_C", insertable = false, updatable = false)
	private Double waterIeSo4C;

	@Column(name = "IE_SO4_Q", insertable = false, updatable = false)
	private String waterIeSo4Q;

	@Column(name = "IE_HF_C")
	private Double ieHfC;

	@Column(name = "IE_H2S_Q", insertable = false, updatable = false)
	private String waterIeH2sQ;

	@Column(name = "IE_HF_Q")
	private String ieHfQ;

	@Column(name = "IE_AUTHOR", insertable = false, updatable = false)
	private String ieAuthor;

	@Column(name = "IE_FE_Q", insertable = false, updatable = false)
	private String waterIeFeQ;

	@Column(name = "IE_H2S_C", insertable = false, updatable = false)
	private Double waterIeH2sC;

	@Column(name = "IE_BA_C", insertable = false, updatable = false)
	private Double waterIeBaC;

	@Column(name = "IE_TI_Q")
	private String ieTiQ;

	@Column(name = "IE_PO4", insertable = false, updatable = false)
	private Double waterIePo4;

	@Column(name = "IE_BR_Q", insertable = false, updatable = false)
	private String waterIeBrQ;

	@Column(name = "IE_BR_C", insertable = false, updatable = false)
	private Double waterIeBrC;

	@Column(name = "IE_TI_C")
	private Double ieTiC;

	@Column(name = "IE_BA_Q", insertable = false, updatable = false)
	private String waterIeBaQ;

	@Column(name = "IE_FORM_Q", insertable = false, updatable = false)
	private String waterIeFormQ;

	@Column(name = "IE_FORM_C", insertable = false, updatable = false)
	private Double waterIeFormC;

	@Column(name = "IE_ALK_Q", insertable = false, updatable = false)
	private String waterIeAlkQ;

	@Column(name = "IE_BI_Q")
	private String ieBiQ;

	@Column(name = "IE_PRO", insertable = false, updatable = false)
	private Double waterIePro;

	@Column(name = "IE_K_C", insertable = false, updatable = false)
	private Double ieKC;

	@Column(name = "IE_CO3", insertable = false, updatable = false)
	private Double ieCo3;

	@Column(name = "IE_K_Q", insertable = false, updatable = false)
	private String ieKQ;

	@Column(name = "IE_BI_C")
	private Double ieBiC;

	@Column(name = "IE_IR_C")
	private Double ieIrC;

	@Column(name = "IE_GLYC", insertable = false, updatable = false)
	private Double ieGlyc;

	@Column(name = "IE_IR_Q")
	private String ieIrQ;

	@Column(name = "IE_ALK_C", insertable = false, updatable = false)
	private Double waterIeAlkC;

	@Column(name = "IE_LAB", insertable = false, updatable = false)
	private String ieLab;

	@Column(name = "IE_SB_C")
	private Double ieSbC;

	@Column(name = "IE_SB_Q")
	private String ieSbQ;

	@Column(name = "IE_CL_Q", insertable = false, updatable = false)
	private String ieClQ;

	@Column(name = "IE_TE_Q")
	private String ieTeQ;

	@Column(name = "IE_PB_Q", insertable = false, updatable = false)
	private String waterIePbQ;

	@Column(name = "IE_PB_C", insertable = false, updatable = false)
	private Double waterIePbC;

	@Column(name = "IE_H2S", insertable = false, updatable = false)
	private Double ieH2s;

	@Column(name = "IE_CL_C", insertable = false, updatable = false)
	private Double ieClC;

	@Column(name = "IE_MN_C", insertable = false, updatable = false)
	private Double waterIeMnC;

	@Column(name = "IE_MN_Q", insertable = false, updatable = false)
	private String waterIeMnQ;

	@Column(name = "IE_K", insertable = false, updatable = false)
	private Double waterIeK;

	@Column(name = "IE_S", insertable = false, updatable = false)
	private Double waterIeS;

	@Column(name = "IE_V", insertable = false, updatable = false)
	private Double waterIeV;

	@Column(name = "IE_B", insertable = false, updatable = false)
	private Double waterIeB;

	@Column(name = "IE_F", insertable = false, updatable = false)
	private Double waterIeF;

	@Column(name = "IE_I", insertable = false, updatable = false)
	private Double waterIeI;

	@Column(name = "IE_TE_C")
	private Double ieTeC;

	@Transient
	private String ieHtQcUser;

	@Transient
	private Date ieHtQcDate;

	@Transient
	private String ieLaQ;

	@Transient
	private Double ieLaC;

	@Transient
	private String ieJobId;

	@Transient
	private Date ieAcqDate;

	@Transient
	private String ieMethod;

	@Transient
	private String ieDataType;

	@Transient
	private String ieComm;

	@Transient
	private Double ieLa;

	@Transient
	private String ieHtIqmCode;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS;
	}
}
