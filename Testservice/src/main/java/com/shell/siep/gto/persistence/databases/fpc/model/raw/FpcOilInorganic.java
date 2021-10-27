package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilInorganic;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_INORGANIC", schema="gfs")
public class FpcOilInorganic extends FpcDatabaseObject implements GTOOilInorganic, Serializable {

	@Column(name = "IE_AS_C")
	private Double ieAsC;

	@Column(name = "IE_BE_Q")
	private String ieBeQ;

	@Column(name = "IE_BE_C")
	private Double ieBeC;

	@Column(name = "IE_AS_Q")
	private String ieAsQ;

	@Column(name = "IE_COMMENT")
	private String ieComment;

	@Column(name = "SAMPLE_ID_VEND")
	private String ieSampleIdVend;

	@Column(name = "IE_RU_C")
	private Double ieRuC;

	@Column(name = "IE_RU_Q")
	private String ieRuQ;

	@Column(name = "IE_HG_C")
	private Double ieHgC;

	@Column(name = "IE_HG_Q")
	private String ieHgQ;

	@Column(name = "IE_P_Q")
	private String iePQ;

	@Column(name = "IE_P_C")
	private Double iePC;

	@Column(name = "IE_RE")
	private Double ieRe;

	@Column(name = "IE_RB")
	private Double ieRb;

	@Column(name = "IE_RH")
	private Double ieRh;

	@Column(name = "IE_PT")
	private Double iePt;

	@Column(name = "IE_QC")
	private String ieQc;

	@Column(name = "IE_SR")
	private Double ieSr;

	@Column(name = "IE_TE")
	private Double ieTe;

	@Column(name = "IE_TH")
	private Double ieTh;

	@Column(name = "IE_TA")
	private Double ieTa;

	@Column(name = "IE_TI")
	private Double ieTi;

	@Column(name = "IE_TL")
	private Double ieTl;

	@Column(name = "IE_RU")
	private Double ieRu;

	@Column(name = "IE_SE")
	private Double ieSe;

	@Column(name = "IE_SB")
	private Double ieSb;

	@Column(name = "IE_SN")
	private Double ieSn;

	@Column(name = "IE_SI")
	private Double ieSi;

	@Column(name = "IE_NI_C")
	private Double ieNiC;

	@Column(name = "IE_NI_Q")
	private String ieNiQ;

	@Column(name = "IE_ZN")
	private Double ieZn;

	@Column(name = "IE_ZR")
	private Double ieZr;

	@Column(name = "IE_RE_Q")
	private String ieReQ;

	@Column(name = "IE_GE_Q")
	private String ieGeQ;

	@Column(name = "IE_RE_C")
	private Double ieReC;

	@Column(name = "QC_USER")
	private String ieHtQcUser;

	@Column(name = "IE_AU_C")
	private Double ieAuC;

	@Column(name = "IE_MG_C")
	private Double ieMgC;

	@Column(name = "IE_MG_Q")
	private String ieMgQ;

	@Column(name = "IE_AU_Q")
	private String ieAuQ;

	@Column(name = "IE_SI_C")
	private Double ieSiC;

	@Column(name = "IE_SI_Q")
	private String ieSiQ;

	@Column(name = "IE_TL_Q")
	private String ieTlQ;

	@Column(name = "IE_TL_C")
	private Double ieTlC;

	@Column(name = "IE_ZN_Q")
	private String ieZnQ;

	@Column(name = "QC_DATE")
	private Date ieHtQcDate;

	@Column(name = "IE_ZN_C")
	private Double ieZnC;

	@Column(name = "IE_S_C")
	private Double ieSC;

	@Column(name = "IE_S_Q")
	private String ieSQ;

	@Column(name = "IE_B_C")
	private Double ieBC;

	@Column(name = "IE_B_Q")
	private String ieBQ;

	@Column(name = "IE_AUTHOR")
	private String ieAuthor;

	@Column(name = "IE_BI_Q")
	private String ieBiQ;

	@Column(name = "IE_BI_C")
	private Double ieBiC;

	@Column(name = "IE_CL_Q")
	private String ieClQ;

	@Column(name = "IE_CL_C")
	private Double ieClC;

	@Column(name = "IE_CU_C")
	private Double ieCuC;

	@Column(name = "IE_BA_Q")
	private String ieBaQ;

	@Column(name = "IE_BA_C")
	private Double ieBaC;

	@Column(name = "SVC_CODE")
	private String ieSvcCode;

	@Column(name = "IE_CD_Q")
	private String ieCdQ;

	@Column(name = "IE_CD_C")
	private Double ieCdC;

	@Column(name = "IE_CU_Q")
	private String ieCuQ;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "IE_BR_Q")
	private String ieBrQ;

	@Column(name = "IE_BR_C")
	private Double ieBrC;

	@Column(name = "IE_CE_C")
	private Double ieCeC;

	@Column(name = "IE_U_C")
	private Double ieUC;

	@Column(name = "IE_U_Q")
	private String ieUQ;

	@Column(name = "IE_GA_C")
	private Double ieGaC;

	@Column(name = "IE_GA_Q")
	private String ieGaQ;

	@Column(name = "IE_V_C")
	private Double ieVC;

	@Column(name = "IE_V_Q")
	private String ieVQ;

	@Column(name = "IE_SE_C")
	private Double ieSeC;

	@Column(name = "IE_SE_Q")
	private String ieSeQ;

	@Column(name = "IE_TH_Q")
	private String ieThQ;

	@Column(name = "IE_TH_C")
	private Double ieThC;

	@Column(name = "IE_RB_Q")
	private String ieRbQ;

	@Column(name = "IE_RB_C")
	private Double ieRbC;

	@Column(name = "IE_W_C")
	private Double ieWC;

	@Column(name = "IE_W_Q")
	private String ieWQ;

	@Column(name = "IE_F_C")
	private Double ieFC;

	@Column(name = "IE_F_Q")
	private String ieFQ;

	@Column(name = "IE_LA_Q")
	private String ieLaQ;

	@Column(name = "IE_LA_C")
	private Double ieLaC;

	@Column(name = "IE_HF_C")
	private Double ieHfC;

	@Column(name = "IE_HF_Q")
	private String ieHfQ;

	@Column(name = "IE_TI_Q")
	private String ieTiQ;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "IE_TI_C")
	private Double ieTiC;

	@Column(name = "IE_TA_Q")
	private String ieTaQ;

	@Column(name = "IE_TA_C")
	private Double ieTaC;

	@Column(name = "LAST_UPDATE")
	private Date ieLastUpdate;

	@Column(name = "IE_MN_C")
	private Double ieMnC;

	@Column(name = "IE_MN_Q")
	private String ieMnQ;

	@Column(name = "JOB_ID")
	private String ieJobId;

	@Column(name = "IE_DATE")
	private Date ieAcqDate;

	@Column(name = "IE_Y_C")
	private Double ieYC;

	@Column(name = "IE_Y_Q")
	private String ieYQ;

	@Column(name = "IE_CR_C")
	private Double ieCrC;

	@Column(name = "IE_NA_C")
	private Double ieNaC;

	@Column(name = "IE_CA_Q")
	private String ieCaQ;

	@Column(name = "IE_CA_C")
	private Double ieCaC;

	@Column(name = "IE_CR_Q")
	private String ieCrQ;

	@Column(name = "IE_AL_Q")
	private String ieAlQ;

	@Column(name = "IE_AL_C")
	private Double ieAlC;

	@Column(name = "IE_NA_Q")
	private String ieNaQ;

	@Column(name = "IE_MO_C")
	private Double ieMoC;

	@Column(name = "IE_MO_Q")
	private String ieMoQ;

	@Column(name = "IE_I_C")
	private Double ieIC;

	@Column(name = "IE_I_Q")
	private String ieIQ;

	@Column(name = "IE_NB_Q")
	private String ieNbQ;

	@Column(name = "IE_NB_C")
	private Double ieNbC;

	@Column(name = "IE_SR_C")
	private Double ieSrC;

	@Column(name = "IE_SR_Q")
	private String ieSrQ;

	@Column(name = "IE_METHOD")
	private String ieMethod;

	@Column(name = "IE_K_C")
	private Double ieKC;

	@Column(name = "IE_K_Q")
	private String ieKQ;

	@Column(name = "IE_LAB")
	private String ieLab;

	@Column(name = "IE_SB_C")
	private Double ieSbC;

	@Column(name = "IE_SB_Q")
	private String ieSbQ;

	@Column(name = "IE_TE_Q")
	private String ieTeQ;

	@Column(name = "IE_DATA_TYPE")
	private String ieDataType;

	@Column(name = "IE_TE_C")
	private Double ieTeC;

	@Column(name = "IE_IN_C")
	private Double ieInC;

	@Column(name = "IE_IN_Q")
	private String ieInQ;

	@Column(name = "IE_RH_Q")
	private String ieRhQ;

	@Column(name = "IE_RH_C")
	private Double ieRhC;

	@Column(name = "RUN_NUMBER")
	private String ieRunNumber;

	@Column(name = "IE_PB_Q")
	private String iePbQ;

	@Column(name = "IE_PB_C")
	private Double iePbC;

	@Column(name = "IE_FE_C")
	private Double ieFeC;

	@Column(name = "IE_FE_Q")
	private String ieFeQ;

	@Column(name = "IE_AG_Q")
	private String ieAgQ;

	@Column(name = "IE_AG_C")
	private Double ieAgC;

	@Column(name = "IE_PT_C")
	private Double iePtC;

	@Column(name = "IE_PT_Q")
	private String iePtQ;

	@Column(name = "IE_DATE", insertable = false, updatable = false)
	private Date ieDate;

	@Column(name = "IE_COMM")
	private String ieComm;

	@Column(name = "IE_PD_C")
	private Double iePdC;

	@Column(name = "IE_AL")
	private Double ieAl;

	@Column(name = "IE_AG")
	private Double ieAg;

	@Column(name = "IE_AS")
	private Double ieAs;

	@Column(name = "IE_AU")
	private Double ieAu;

	@Column(name = "IE_CO_Q")
	private String ieCoQ;

	@Column(name = "IE_CD")
	private Double ieCd;

	@Column(name = "IE_CA")
	private Double ieCa;

	@Column(name = "IE_CL")
	private Double ieCl;

	@Column(name = "IE_CO")
	private Double ieCo;

	@Column(name = "IE_CU")
	private Double ieCu;

	@Column(name = "IE_CR")
	private Double ieCr;

	@Column(name = "IE_BE")
	private Double ieBe;

	@Column(name = "IE_BA")
	private Double ieBa;

	@Column(name = "IE_BI")
	private Double ieBi;

	@Column(name = "IE_BR")
	private Double ieBr;

	@Column(name = "IE_ZR_Q")
	private String ieZrQ;

	@Column(name = "IE_GE")
	private Double ieGe;

	@Column(name = "IE_CO_C")
	private Double ieCoC;

	@Column(name = "IE_PD_Q")
	private String iePdQ;

	@Column(name = "IE_FE")
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

	@Column(name = "IE_LA")
	private Double ieLa;

	@Column(name = "IE_MO")
	private Double ieMo;

	@Column(name = "IE_MN")
	private Double ieMn;

	@Column(name = "IE_LI_C")
	private Double ieLiC;

	@Column(name = "IE_LI_Q")
	private String ieLiQ;

	@Column(name = "IE_NB")
	private Double ieNb;

	@Column(name = "IE_NA")
	private Double ieNa;

	@Column(name = "IE_NI")
	private Double ieNi;

	@Column(name = "IE_LI")
	private Double ieLi;

	@Column(name = "IE_MG")
	private Double ieMg;

	@Column(name = "IE_PB")
	private Double iePb;

	@Column(name = "IE_PD")
	private Double iePd;

	@Column(name = "IQM_CODE")
	private String ieHtIqmCode;

	@Column(name = "IE_SN_C")
	private Double ieSnC;

	@Column(name = "IE_SN_Q")
	private String ieSnQ;

	@Column(name = "IE_F")
	private Double ieF;

	@Column(name = "IE_I")
	private Double ieI;

	@Column(name = "IE_K")
	private Double ieK;

	@Column(name = "IE_P")
	private Double ieP;

	@Column(name = "IE_U")
	private Double ieU;

	@Column(name = "IE_V")
	private Double ieV;

	@Column(name = "IE_S")
	private Double ieS;

	@Column(name = "IE_Y")
	private Double ieY;

	@Column(name = "IE_W")
	private Double ieW;

	@Column(name = "IE_B")
	private Double ieB;

	@Column(name = "IE_IR_C")
	private Double ieIrC;

	@Column(name = "IE_IR_Q")
	private String ieIrQ;

	@Transient
	private Double waterIeNiC;

	@Transient
	private String iePo4Q;

	@Transient
	private Double iePo4C;

	@Transient
	private String ieHexQ;

	@Transient
	private Double iePro;

	@Transient
	private Double ieHexC;

	@Transient
	private String waterIeNiQ;

	@Transient
	private String waterIeComment;

	@Transient
	private Double iePo4;

	@Transient
	private Double ieGlycC;

	@Transient
	private Double waterIeAce;

	@Transient
	private Double ieCitric;

	@Transient
	private String ieQcUser;

	@Transient
	private String ieCarbQ;

	@Transient
	private String ieGlycQ;

	@Transient
	private Double ieCarbC;

	@Transient
	private String waterIeCarbQ;

	@Transient
	private Double waterIeCarbC;

	@Transient
	private Double ieHco3;

	@Transient
	private String waterIeAppear;

	@Transient
	private Double waterIeCarb;

	@Transient
	private Double ieHex;

	@Transient
	private Integer ieMethodAcid;

	@Transient
	private String ieAppear;

	@Transient
	private Double waterIeNaC;

	@Transient
	private Double waterIeForm;

	@Transient
	private String waterIeCaQ;

	@Transient
	private Double waterIeProC;

	@Transient
	private Double waterIeCaC;

	@Transient
	private Double ieButyC;

	@Transient
	private Double waterIeMoC;

	@Transient
	private String waterIeMoQ;

	@Transient
	private String ieButyQ;

	@Transient
	private String waterIeNaQ;

	@Transient
	private Double waterIeGlycC;

	@Transient
	private Double ieMalonC;

	@Transient
	private String waterIeGlycQ;

	@Transient
	private String waterIeCrQ;

	@Transient
	private String ieNo3Q;

	@Transient
	private Double waterIeCrC;

	@Transient
	private String waterIeProQ;

	@Transient
	private Double ieNo3C;

	@Transient
	private String ieMalonQ;

	@Transient
	private Double waterIeVal;

	@Transient
	private String ieHco3Q;

	@Transient
	private Double ieHco3C;

	@Transient
	private Integer ieMethodAnion;

	@Transient
	private Double waterIePb;

	@Transient
	private String waterIeQc;

	@Transient
	private Double waterIeButyC;

	@Transient
	private String waterIeMgQ;

	@Transient
	private String waterIePo4Q;

	@Transient
	private Double waterIeMgC;

	@Transient
	private String waterIeButyQ;

	@Transient
	private Double waterIeLi;

	@Transient
	private Double waterIeMg;

	@Transient
	private Double waterIeMn;

	@Transient
	private Double waterIeMo;

	@Transient
	private Double waterIeNa;

	@Transient
	private Double ieCarb;

	@Transient
	private Double waterIeNi;

	@Transient
	private Date waterIeDate;

	@Transient
	private String ieCo3Q;

	@Transient
	private Double ieCo3C;

	@Transient
	private Double waterIeZn;

	@Transient
	private Integer waterIeMethodCation;

	@Transient
	private String ieAceQ;

	@Transient
	private Double waterIeSi;

	@Transient
	private Double ieAceC;

	@Transient
	private String ieUpdatedUser;

	@Transient
	private Double waterIeSr;

	@Transient
	private Double ieVal;

	@Transient
	private Date ieQcDate;

	@Transient
	private Double waterIeSo4;

	@Transient
	private String waterIeSiQ;

	@Transient
	private Double ieH2sC;

	@Transient
	private Double ieSo4C;

	@Transient
	private Double waterIeSiC;

	@Transient
	private Double waterIeAlk;

	@Transient
	private String ieH2sQ;

	@Transient
	private Double ieAce;

	@Transient
	private String ieSo4Q;

	@Transient
	private Double waterIeIC;

	@Transient
	private String ieCitricQ;

	@Transient
	private Double waterIeBa;

	@Transient
	private String waterIeIQ;

	@Transient
	private Double ieNitriteC;

	@Transient
	private Double ieForm;

	@Transient
	private Double waterIeNh34C;

	@Transient
	private String ieNitriteQ;

	@Transient
	private Double ieNh34C;

	@Transient
	private String waterIeNh34Q;

	@Transient
	private String waterSampleIdVend;

	@Transient
	private String ieNh34Q;

	@Transient
	private Double waterIeNo3;

	@Transient
	private Double waterIeVC;

	@Transient
	private Double waterIeNh34;

	@Transient
	private Date ieCreatedDate;

	@Transient
	private Double waterIeLiC;

	@Transient
	private Double waterIeZnC;

	@Transient
	private Double ieAlk;

	@Transient
	private String waterIeVQ;

	@Transient
	private Double ieAlkC;

	@Transient
	private String ieAlkQ;

	@Transient
	private String waterIeCoQ;

	@Transient
	private Double waterIeBr;

	@Transient
	private Double waterIePo4C;

	@Transient
	private Double waterIeCd;

	@Transient
	private Double waterIeCoC;

	@Transient
	private Double waterIeCa;

	@Transient
	private Double waterIeCl;

	@Transient
	private Double waterIeCo;

	@Transient
	private Double waterIeCu;

	@Transient
	private Double waterIeCr;

	@Transient
	private Double waterIeFe;

	@Transient
	private String waterIeSQ;

	@Transient
	private String waterIeBQ;

	@Transient
	private Double waterIeBC;

	@Transient
	private Double ieNo3;

	@Transient
	private Double waterIeNitriteC;

	@Transient
	private String waterIeNitriteQ;

	@Transient
	private String ieFormQ;

	@Transient
	private Double ieFormC;

	@Transient
	private Double waterIeButy;

	@Transient
	private String waterIeZnQ;

	@Transient
	private String waterIeLiQ;

	@Transient
	private String waterRequestIdVend;

	@Transient
	private String waterIeSrQ;

	@Transient
	private Double waterIeSrC;

	@Transient
	private Double waterIeCo3C;

	@Transient
	private String waterIeNo3Q;

	@Transient
	private String waterIeCo3Q;

	@Transient
	private String waterIeAceQ;

	@Transient
	private Double waterIeH2s;

	@Transient
	private Double waterIeAceC;

	@Transient
	private Double waterIeNo3C;

	@Transient
	private String ieValQ;

	@Transient
	private Double ieValC;

	@Transient
	private Date ieUpdatedDate;

	@Transient
	private Double waterIeKC;

	@Transient
	private Double waterIeCo3;

	@Transient
	private Integer waterIeMethodAnion;

	@Transient
	private Double waterIeNitrite;

	@Transient
	private Double ieNh34;

	@Transient
	private String waterIeFQ;

	@Transient
	private Double waterIeFC;

	@Transient
	private Double ieSo4;

	@Transient
	private String ieOxalQ;

	@Transient
	private String waterIeClQ;

	@Transient
	private Double ieNitrite;

	@Transient
	private Double waterIeClC;

	@Transient
	private String ieCreatedUser;

	@Transient
	private Double ieOxalC;

	@Transient
	private Double ieMalon;

	@Transient
	private Double waterIeHco3C;

	@Transient
	private String waterIeHco3Q;

	@Transient
	private Integer ieMethodCation;

	@Transient
	private Double ieButy;

	@Transient
	private Double waterIeSC;

	@Transient
	private Double waterIeGlyc;

	@Transient
	private String ieRequestIdVend;

	@Transient
	private Double waterIeCuC;

	@Transient
	private String waterIeCuQ;

	@Transient
	private String waterIeValQ;

	@Transient
	private Double waterIeHco3;

	@Transient
	private Double waterIeValC;

	@Transient
	private Double waterIeCdC;

	@Transient
	private String waterIeCdQ;

	@Transient
	private String waterIeAuthor;

	@Transient
	private Double ieProC;

	@Transient
	private String ieProQ;

	@Transient
	private Double ieOxal;

	@Transient
	private String waterIeLab;

	@Transient
	private Integer ieMethodSulf;

	@Transient
	private Double waterIeFeC;

	@Transient
	private String waterIeKQ;

	@Transient
	private Double waterIeSo4C;

	@Transient
	private String waterIeSo4Q;

	@Transient
	private String waterIeH2sQ;

	@Transient
	private String waterIeFeQ;

	@Transient
	private Double waterIeH2sC;

	@Transient
	private Double waterIeBaC;

	@Transient
	private Double waterIePo4;

	@Transient
	private String waterIeBrQ;

	@Transient
	private Double waterIeBrC;

	@Transient
	private String waterIeBaQ;

	@Transient
	private String waterIeFormQ;

	@Transient
	private Double waterIeFormC;

	@Transient
	private String waterIeAlkQ;

	@Transient
	private Double waterIePro;

	@Transient
	private Double ieCo3;

	@Transient
	private Double ieGlyc;

	@Transient
	private Double waterIeAlkC;

	@Transient
	private String waterIePbQ;

	@Transient
	private Double waterIePbC;

	@Transient
	private Double ieH2s;

	@Transient
	private Double waterIeMnC;

	@Transient
	private String waterIeMnQ;

	@Transient
	private Double waterIeK;

	@Transient
	private Double waterIeS;

	@Transient
	private Double waterIeV;

	@Transient
	private Double waterIeB;

	@Transient
	private Double waterIeF;

	@Transient
	private Double waterIeI;


	@Override
	public String getName() {
		 return AnalysisConstants.ELEMENTAL_INORGANIC;
	}
}
