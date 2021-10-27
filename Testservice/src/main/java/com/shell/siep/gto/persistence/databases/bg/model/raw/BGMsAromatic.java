package com.shell.siep.gto.persistence.databases.bg.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.bg.model.BGDatabaseObject;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOMsAromatic;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_AROMATIC")
public class BGMsAromatic extends BGDatabaseObject implements GTOMsAromatic, Serializable {

	@Column(name = "MA_TA_28R")
	private Double taC2820r;

	@Column(name = "MA_MA_21")
	private Double maC21AB;

	@Column(name = "MA_PHEN_29DM")
	private Double dmp162529;

	@Column(name = "O_TERPHENYL")
	private Double maOTerphenyl;

	@Column(name = "MA_NAPH_236TM")
	private Double tmn236;

	@Column(name = "MA_MTA_4M_27S")
	private Double ta4meC2720s;

	@Column(name = "MA_PHEN_410DM")
	private Double dmp410;

	@Column(name = "MA_NAPH_1257QM")
	private Double temn1257;

	@Column(name = "MA_BIPHEN_U34DM")
	private Double biphenU34dm;

	@Column(name = "MA_NAPH_1256QM")
	private Double temn1256;

	@Column(name = "MA_NAPH_2M")
	private Double mn2;

	@Column(name = "MA_NAPH_1M")
	private Double mn1;

	@Column(name = "MA_NAPH_1267QM")
	private Double temn1267;

	@Column(name = "MA_NAPH_1236QM")
	private Double temn1236;

	@Column(name = "MA_NAPH_1237QM")
	private Double temn1237;

	@Column(name = "MA_TA_26S")
	private Double taC2620s;

	@Column(name = "TA_C26_20R")
	private Double taC2620r;

	@Column(name = "MA_MTA_3M_29S")
	private Double ta3meC2920s;

	@Column(name = "MA_MTA_3M_29R")
	private Double ta3meC2920r;

	@Column(name = "MA_NAPH_1247QM")
	private Double temn1247;

	@Column(name = "MA_ISTD")
	private Double maIstd;

	@Column(name = "MA_5AC28_20S_5BC29_20S_C28_DIA")
	private Double ma5ac2820s5bc2920sC28Dia;

	@Column(name = "MA_MA_21_B")
	private Double maC21B;

	@Column(name = "MA_MA_21_A")
	private Double maC21A;

	@Column(name = "MA_FLUOR")
	private Double fluor;

	@Column(name = "MA_DBF_1M")
	private Double dbf1m;

	@Column(name = "C13_BENZENE")
	private Double c13Benzene;

	@Column(name = "MA_MTA_4M_29S")
	private Double ta4meC2920s;

	@Column(name = "MA_MTA_4M_29R")
	private Double ta4meC2920r;

	@Column(name = "MA_MA_D27BBS")
	private Double maC27V20s;

	@Column(name = "MA_BIPHEN_22DM")
	private Double biphen22dm;

	@Column(name = "MA_MA_D29BBR_R29BBR")
	private Double maC29I20rC29V20r;

	@Column(name = "MA_NAPH_127_167_126TM")
	private Double tmn127167126;

	@Column(name = "MA_TA_DMD2")
	private Double taDmd2;

	@Column(name = "MA_TA_DMD1")
	private Double taDmd1;

	@Column(name = "MA_TA_DMD4")
	private Double taDmd4;

	@Column(name = "MA_TA_DMD3")
	private Double taDmd3;

	@Column(name = "MA_TA_DMD5")
	private Double taDmd5;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C13")
	private Double arylIsopren236TmbC13;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C16")
	private Double arylIsopren236TmbC16;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C17")
	private Double arylIsopren236TmbC17;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C14")
	private Double arylIsopren236TmbC14;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C15")
	private Double arylIsopren236TmbC15;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C20")
	private Double arylIsopren236TmbC20;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C23")
	private Double arylIsopren236TmbC23;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C21")
	private Double arylIsopren236TmbC21;

	@Column(name = "MA_NAPH")
	private Double naph;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C18")
	private Double arylIsopren236TmbC18;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C19")
	private Double arylIsopren236TmbC19;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MA_PHEN_26_27_35DM")
	private Double dmp262735;

	@Column(name = "MA_NAPH_167")
	private Double tmn167;

	@Column(name = "MA_DATE")
	private Date maAcqDate;

	@Column(name = "MA_R27ABR")
	private Double maR27abr;

	@Column(name = "MA_BIPHEN_26DM")
	private Double biphen26dm;

	@Column(name = "MA_LAB")
	private String maLab;

	@Column(name = "MA_NAPH_137TM")
	private Double tmn137;

	@Column(name = "MA_NAPH_136TM")
	private Double tmn136;

	@Column(name = "MA_MTA_4M_28S_27R")
	private Double ta4mec2820s4mec2720r;

	@Column(name = "MA_CAD")
	private Double cad;

	@Column(name = "MA_NAPH_18DM")
	private Double dmn18;

	@Column(name = "MA_COMMENT")
	private String maComments;

	@Column(name = "MA_NAPH_23DM")
	private Double dmn23;

	@Column(name = "MA_NAPH_27DM")
	private Double dmn27;

	@Column(name = "MA_NAPH_26DM")
	private Double dmn26;

	@Column(name = "MA_NAPH_12DM")
	private Double dmn12;

	@Column(name = "MA_NAPH_16DM")
	private Double dmn16;

	@Column(name = "MA_NAPH_15DM")
	private Double dmn15;

	@Column(name = "MA_NAPH_14DM")
	private Double dmn14;

	@Column(name = "MA_BIPHEN_35DM")
	private Double biphen35dm;

	@Column(name = "MA_MTA_4M_28S_27R_B")
	private Double ta4mec2820s4mec2720rb;

	@Column(name = "MA_MTA_4M_28S_27R_A")
	private Double ta4mec2820s4mec2720ra;

	@Column(name = "MA_NAPH_167_126TM")
	private Double tmn167126;

	@Column(name = "MA_12467PMN")
	private Double ma12467pmn;

	@Column(name = "MA_THN")
	private Double thn;

	@Column(name = "MA_PHEN")
	private Double phen;

	@Column(name = "MA_MTA_2M_29S")
	private Double ta2meC2920s;

	@Column(name = "MA_MTA_2M_29R")
	private Double ta2meC2920r;

	@Column(name = "MA_PHEN_19_49_410DM")
	private Double dmp1949410;

	@Column(name = "MA_FLUOR_D")
	private Double fluorD;

	@Column(name = "MA_MTA_3M_28S_27R")
	private Double ta4mec2820s3mec2720r;

	@Column(name = "MA_FLUOR_C")
	private Double fluorC;

	@Column(name = "MA_FLUOR_B")
	private Double fluorB;

	@Column(name = "MA_FLUOR_A")
	private Double fluorA;

	@Column(name = "MA_MA_D29BBS_R29BBS")
	private Double maC29I20sC29V20s;

	@Column(name = "MA_C27_V_R")
	private Double maC27VR;

	@Column(name = "MA_FLUOR_E")
	private Double fluorE;

	@Column(name = "MA_PHEN_2E_9E_36DM")
	private Double ep2Ep9Dmp36;

	@Column(name = "MA_ISTD", insertable = false, updatable = false)
	private Double pdp;

	@Column(name = "MA_PHEN_39DM")
	private Double dmpX;

	@Column(name = "MA_DBT_46DM")
	private Double dmt46dm;

	@Column(name = "MA_NAPH_1357QM")
	private Double temn1357;

	@Column(name = "MA_MA_22_B")
	private Double maC22B;

	@Column(name = "MA_MA_22_A")
	private Double maC22A;

	@Column(name = "MA_NAPH_1367QM")
	private Double temn1367;

	@Column(name = "MA_MA_R27ABR_R28ABS")
	private Double maR27abrR28abs;

	@Column(name = "MA_PHEN_1E")
	private Double ep1;

	@Column(name = "MA_NAPH_BB_EM")
	private Double naphBbEm;

	@Column(name = "MA_DBT_DM5")
	private Double dmtDm5;

	@Column(name = "MA_DBT_DM6")
	private Double dmtDm6;

	@Column(name = "MA_DBT_DM7")
	private Double dmtDm7;

	@Column(name = "MA_DBT_DM8")
	private Double dmtDm8;

	@Column(name = "MA_MTA_3M_28R")
	private Double ta3meC2820r;

	@Column(name = "MA_DBT_DM4")
	private Double dmtDm4;

	@Column(name = "MA_BIPHEN_34DM")
	private Double biphen34dm;

	@Column(name = "SAMPLE_ID_VEND")
	private String maSampleIdVend;

	@Column(name = "MA_NAPH_13_17DM")
	private Double dmn1317;

	@Column(name = "MA_MA_R27ABS")
	private Double maC27Ii20s;

	@Column(name = "MA_12357PMN")
	private Double ma12357pmn;

	@Column(name = "MA_MA_R27ABR")
	private Double maC27Ii20r;

	@Column(name = "MA_BIPHEN_U24_24DM")
	private Double biphenU2424dm;

	@Column(name = "MA_OTP")
	private Integer maOtp;

	@Column(name = "MA_DBT_23M")
	private Double mdbt23;

	@Column(name = "MA_TA_22S")
	private Double taC2220s;

	@Column(name = "MA_TA_22R")
	private Double taC2220r;

	@Column(name = "MA_TA_28S")
	private Double taC2820sAB;

	@Column(name = "MA_AUTHOR")
	private String maAuthor;

	@Column(name = "MA_DBF")
	private Double dbf;

	@Column(name = "MA_DBT")
	private Double dbt;

	@Column(name = "MA_BIPHEN_25DM")
	private Double biphen25dm;

	@Column(name = "MA_NAPH_167TM")
	private Double maNaph167tm;

	@Column(name = "MA_MTA_4M_29S_2M28R")
	private Double ta4m29s2m28r;

	@Column(name = "LAST_UPDATE")
	private Date maLastUpdate;

	@Column(name = "MA_MTA_4M_28R")
	private Double ta4meC2820r;

	@Column(name = "MA_NAPH_C4")
	private Double c4Naph;

	@Column(name = "MA_BIPHEN")
	private Double bp;

	@Column(name = "MA_METHOD")
	private String maMethod;

	@Column(name = "MA_DN")
	private Double dn;

	@Column(name = "MA_PHEN_1MP")
	private Double mp1;

	@Column(name = "MA_PHEN_2MP")
	private Double mp2;

	@Column(name = "MA_PHEN_3MP")
	private Double mp3;

	@Column(name = "MA_PHEN_9MP")
	private Double mp9;

	@Column(name = "MA_R28ABS")
	private Double maR28abs;

	@Column(name = "MA_QC")
	private String maQc;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "MA_5BC28_20R_C29_DIASTERANE")
	private Double ma5bc2820rC29Diasterane;

	@Column(name = "MA_NAPH_2367QM")
	private Double temn2367;

	@Column(name = "MA_DMP")
	private Double dmp;

	@Column(name = "MA_TA_29_3")
	private Double taC2920r;

	@Column(name = "MA_MA_23_A")
	private Double maC23A;

	@Column(name = "MA_MA_23_B")
	private Double maC23B;

	@Column(name = "MA_BIPHEN_U23DM")
	private Double biphenU23dm;

	@Column(name = "MA_SECOHOP_29")
	private Double secohop29;

	@Column(name = "MA_5AC28_20R_5BC29_20R_C29_DIA")
	private Double ma5ac2820r5bc2920rC29Dia;

	@Column(name = "MA_DBF_32M")
	private Double dbf32m;

	@Column(name = "MA_SECOHOP_30")
	private Double secohop30;

	@Column(name = "MA_DBT_14DM")
	private Double dmt14dm;

	@Column(name = "MA_NAPH_146_135TM")
	private Double tmn135146;

	@Column(name = "MA_MA_D28AAS_R28BBS")
	private Double maC28I20sC28V20s;

	@Column(name = "CREATED_USER")
	private String maCreatedUser;

	@Column(name = "RUN_NUMBER")
	private String maRunNumber;

	@Column(name = "IQM_CODE")
	private String maIqmCode;

	@Column(name = "TA_C27_20S")
	private Double taC2720s;

	@Column(name = "MA_TA_27R")
	private Double taC2720r;

	@Column(name = "MA_NAPH_14_23DM")
	private Double dmn1423;

	@Column(name = "MA_PERYLENE")
	private Double maPerylene;

	@Column(name = "MA_ISTD_CONC")
	private Double maIstdConc;

	@Column(name = "MA_FLUOR_3M")
	private Double fluor3m;

	@Column(name = "MA_DATA_TYPE")
	private String maDataType;

	@Column(name = "MA_FLUOR_2M")
	private Double fluor2m;

	@Column(name = "MA_FLUOR_1M")
	private Double fluor1m;

	@Column(name = "MA_BIPHEN_33DM")
	private Double biphen33dm;

	@Column(name = "MA_MA_R28ABR")
	private Double maC28Ii20r;

	@Column(name = "MA_MA_R28ABS")
	private Double maC28Ii20s;

	@Column(name = "MA_ANTH")
	private Double maAnth;

	@Column(name = "QC_USER")
	private String maQcUser;

	@Column(name = "MA_DBT_1M")
	private Double mdbt1;

	@Column(name = "MA_DBT_4M")
	private Double mdbt4;

	@Column(name = "MA_FLUOR_4M")
	private Double fluor4m;

	@Column(name = "MA_12356PMN")
	private Double ma12356pmn;

	@Column(name = "UPDATED_USER")
	private String maUpdatedUser;

	@Column(name = "MA_MTA_1M_21")
	private Double ta1meC21;

	@Column(name = "MA_PHEN_19DM")
	private Double dmp1949;

	@Column(name = "MA_RETENE")
	private Double retene;

	@Column(name = "MA_MTA_6M_21")
	private Double ta6meC21;

	@Column(name = "MAC28II20R_MAC29I20R_MAC29V20R")
	private Double maC28Ii20rMaC29I20rMaC29V20r;

	@Column(name = "MA_MTA_4M_22")
	private Double ta4meC22;

	@Column(name = "MA_MTA_4M_21")
	private Double ta4meC21;

	@Column(name = "MA_BIPHEN_24DM")
	private Double biphen24dm;

	@Column(name = "MA_C27_I_R")
	private Double maC27IR;

	@Column(name = "MA_MTA_3M_21")
	private Double ta3meC21;

	@Column(name = "MA_MTA_3M_22")
	private Double ta3meC22;

	@Column(name = "MA_PHEN_15DM")
	private Double dmp15;

	@Column(name = "MA_PHEN_17DM")
	private Double dmp17;

	@Column(name = "MA_PHEN_18DM")
	private Double dmp18;

	@Column(name = "MA_PHEN_12DM")
	private Double dmp12;

	@Column(name = "MA_MTA_2M_28S")
	private Double ta2meC2820s;

	@Column(name = "MA_MTA_2M_28R")
	private Double ta2meC2820r;

	@Column(name = "MA_FLUOR_BC")
	private Double fluorBc;

	@Column(name = "MAC28IS_MAC28VBS_MAC27VIIR")
	private Double maC28ISmaC28VBsmaC27ViiR;

	@Column(name = "MA_NAPH_127TM")
	private Double tmn127;

	@Column(name = "MA_NAPH_126TM")
	private Double tmn126;

	@Column(name = "MA_NAPH_125TM")
	private Double tmn125;

	@Column(name = "MA_MA_D28AAS")
	private Double maC28V20s;

	@Column(name = "MA_NAPH_124TM")
	private Double tmn124;

	@Column(name = "MA_BIPHEN_U44DM")
	private Double biphenU44dm;

	@Column(name = "MA_PHEN_45DM")
	private Double dmp45;

	@Column(name = "MA_BZHOP_35")
	private Double bzhop35;

	@Column(name = "MA_PHEN_39DM", insertable = false, updatable = false)
	private Double dmp39;

	@Column(name = "MA_BZHOP_33")
	private Double bzhop33;

	@Column(name = "MA_BZHOP_34")
	private Double bzhop34;

	@Column(name = "MA_PHEN_35DM")
	private Double dmp35;

	@Column(name = "MA_PHEN_36DM")
	private Double dmp36;

	@Column(name = "MA_BZHOP_32")
	private Double bzhop32;

	@Column(name = "MA_PHEN_26DM")
	private Double dmp26;

	@Column(name = "MA_PHEN_27DM")
	private Double dmp27;

	@Column(name = "MA_PHEN_23DM")
	private Double dmp23;

	@Column(name = "MA_TA_27S_26R")
	private Double taC2620rC2720s;

	@Column(name = "SVC_CODE")
	private String maSvcCode;

	@Column(name = "MA_ISTD_CONC", insertable = false, updatable = false)
	private Double pdpC;

	@Column(name = "MA_PHEN_26_36")
	private Double dmp2636;

	@Column(name = "MA_PHEN_128TM")
	private Double tmp128;

	@Column(name = "MA_PHEN_127TM")
	private Double tmp127;

	@Column(name = "MA_PHEN_126TM")
	private Double tmp126;

	@Column(name = "MA_PHEN_125TM")
	private Double tmp125;

	@Column(name = "MA_PHEN_129TM")
	private Double tmp129;

	@Column(name = "MA_EUD")
	private Double eud;

	@Column(name = "MA_TA_28S_B")
	private Double taC2820sB;

	@Column(name = "MA_MA_R28ABR_R29ABR")
	private Double maR28abrR29abr;

	@Column(name = "MA_OHTMP")
	private Double maOhtmp;

	@Column(name = "MA_TA_28S_A")
	private Double taC2820sA;

	@Column(name = "MA_PHEN_910DM")
	private Double dmp910;

	@Column(name = "MA_TA_29_2")
	private Double taC2920sB;

	@Column(name = "MA_TA_29_1")
	private Double taC2920sA;

	@Column(name = "ONE_METHYL_FLOURENE")
	private Double maOneMethylFluorene;

	@Column(name = "MA_NAPH_127_167TM")
	private Double maNaph127167tm;

	@Column(name = "MA_DBT_4E")
	private Double dmt4e;

	@Column(name = "MA_BIPHEN_4M")
	private Double mbp4;

	@Column(name = "MA_BIPHEN_2M")
	private Double mbp2;

	@Column(name = "MA_BIPHEN_3M")
	private Double mbp3;

	@Column(name = "MA_BIPHEN_23DM")
	private Double biphen23dm;

	@Column(name = "MA_NAPH_1E")
	private Double en1;

	@Column(name = "MA_NAPH_2E")
	private Double en2;

	@Column(name = "MA_C27_VII_S")
	private Double maC27ViiS;

	@Column(name = "MA_NAPH_26_27DM")
	private Double dmn2627;

	@Column(name = "MA_MTA_DINO_C")
	private Double taDinoD3;

	@Column(name = "MA_MTA_DINO_D")
	private Double taDinoD4;

	@Column(name = "MA_MTA_DINO_A")
	private Double taDinoD1;

	@Column(name = "MA_MTA_DINO_B")
	private Double taDinoD2;

	@Column(name = "MA_MTA_DINO_E")
	private Double taDinoD5;

	@Column(name = "MA_MTA_DINO_F")
	private Double taDinoD6;

	@Column(name = "MA_MDBF_2")
	private Double mdbf2;

	@Column(name = "MA_MDBF_3")
	private Double mdbf3;

	@Column(name = "MA_MDBF_1")
	private Double mdbf1;

	@Column(name = "MA_MDBF_4")
	private Double mdbf4;

	@Column(name = "MA_PHEN_39DM", insertable = false, updatable = false)
	private Double dmp3931021013;

	@Column(name = "QC_DATE")
	private Date maQcDate;

	@Column(name = "MA_MA_D28AAR_R28BBR")
	private Double maC28I20rC28V20r;

	@Column(name = "MA_MTA_3M_27S")
	private Double ta3meC2720s;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C22A")
	private Double arylIsopren236TmbC22a;

	@Column(name = "MA_ARYL_ISOPREN_236_TMB_C22B")
	private Double arylIsopren236TmbC22b;

	@Column(name = "JOB_ID")
	private String maJobId;

	@Column(name = "MA_MA_D27BBS_R27BBR")
	private Double maC27I20rC27V20r;

	@Column(name = "MA_BIPHEN_2E")
	private Double biphen2e;

	@Column(name = "MA_MA_22")
	private Double maC22AB;

	@Column(name = "MA_BIPHEN_3E")
	private Double biphen3e;

	@Column(name = "MA_BIPHEN_4E")
	private Double biphen4e;

	@Column(name = "MA_MA_R29ABR")
	private Double maC29Ii20r;

	@Column(name = "MA_MA_R29ABS")
	private Double maC29Ii20s;

	@Column(name = "MA_NAPH_AB_EM")
	private Double naphAbEm;

	@Column(name = "MA_MA_R28BBS")
	private Double maC28I20s;

	@Column(name = "MA_C28_I_20R_MA_C28_V_20R")
	private Double maC28I20rmaC28V20r;

	@Column(name = "MA_SPL_CONC")
	private Double maSplConc;

	@Column(name = "MA_MA_R27BBS")
	private Double maC27I20s;

	@Column(name = "MA_TA_21")
	private Double taC21;

	@Column(name = "MA_TA_20")
	private Double taC20;

	@Override
	public String getName() {
		return AnalysisConstants.GCMS_BIOMARKERS_AROMATIC;
	}

}
