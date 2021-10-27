package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOMsSaturate;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_SATURATE")
public class DDMsSaturate extends DDDatabaseObject implements GTOMsSaturate, Serializable {

	@Column(name = "MS_H32R")
	private Double c3222r;

	@Column(name = "MS_H32S")
	private Double c3222s;

	@Column(name = "MS_D29ABS_S28ABBR")
	private Double msD29absS28abbr;

	@Column(name = "MS_TR29B")
	private Double c29b3;

	@Column(name = "SAMPLE_ID_VEND")
	private String msSampleIdVend;

	@Column(name = "MS_TR30B")
	private Double c30b3;

	@Column(name = "MS_D28BASS_R")
	private Double msD28bassR;

	@Column(name = "MS_T21")
	private Double t21;

	@Column(name = "MS_T22")
	private Double t22;

	@Column(name = "MS_C26I20S")
	private Double c26i20s;

	@Column(name = "MS_C26I20R")
	private Double c26i20r;

	@Column(name = "MS_TR35A")
	private Double c35a3;

	@Column(name = "MS_A_PHYLLO")
	private Double phyllocladane16a;

	@Column(name = "MS_B_PHYLLO")
	private Double phyllocladane16b;

	@Column(name = "MS_DH30")
	private Double diah;

	@Column(name = "MS_OL")
	private Double x18aOl;

	@Column(name = "MS_S23B")
	private Double msT23b;

	@Column(name = "MS_S23A")
	private Double msT23a;

	@Column(name = "MS_S28AAAR")
	private Double msS28aaar;

	@Column(name = "MS_S28AAAS")
	private Double msS28aaas;

	@Column(name = "MS_ISTD")
	private Double msIstd;

	@Column(name = "MS_TR29A")
	private Double c29a3;

	@Column(name = "MS_8S26ABBS")
	private Double ms8s26bbs;

	@Column(name = "MS_8S26ABBR")
	private Double ms8s26bbr;

	@Column(name = "MS_TR30A")
	private Double c30a3;

	@Column(name = "MS_9D28BASS")
	private Double ms9d28bass;

	@Column(name = "MS_9D28BASR")
	private Double ms9d28basr;

	@Column(name = "MS_9D28BARS")
	private Double ms9d28bars;

	@Column(name = "MS_9D28BARR")
	private Double ms9d28barr;

	@Column(name = "MS_S28ABBR")
	private Double msS28abbr;

	@Column(name = "MS_S28ABBS")
	private Double msS28abbs;

	@Column(name = "MS_TR28A")
	private Double c28a3;

	@Column(name = "MS_C28N_20S")
	private Double c28n20sRaw;

	@Column(name = "SVC_CODE")
	private String msSvcCode;

	@Column(name = "MS_C27N_20S")
	private Double c27n20sRaw;

	@Column(name = "MS_H29B")
	private Double c29bHop;

	@Column(name = "MS_H35S")
	private Double c3522s;

	@Column(name = "MS_H35R")
	private Double c3522r;

	@Column(name = "MS_C29R_20R")
	private Double c29r20rRaw;

	@Column(name = "MS_C31_17B_21B_HHOP")
	private Double msC3117b21bHhop;

	@Column(name = "MS_TR19")
	private Double c193;

	@Column(name = "MS_TS")
	private Double c27Ts;

	@Column(name = "MS_TM")
	private Double c27Tm;

	@Column(name = "MS_C30_17B_21B_HOP")
	private Double msC3017b21bHop;

	@Column(name = "MS_D28BARS_R")
	private Double msD28barsR;

	@Column(name = "MS_X12")
	private Double msX12;

	@Column(name = "MS_C32_17B_21A_BHMOR")
	private Double msC3217b21aBhmor;

	@Column(name = "MS_TR35B")
	private Double c35b3;

	@Column(name = "MS_X04")
	private Double msX04;

	@Column(name = "MS_X03")
	private Double msX03;

	@Column(name = "MS_X02")
	private Double msX02;

	@Column(name = "MS_X01")
	private Double msX01;

	@Column(name = "MS_X08")
	private Double msX08;

	@Column(name = "MS_X07")
	private Double msX07;

	@Column(name = "MS_X06")
	private Double msX06;

	@Column(name = "MS_X05")
	private Double msX05;

	@Column(name = "MS_X09")
	private Double msX09;

	@Column(name = "MS_X11")
	private Double msX11;

	@Column(name = "MS_X10")
	private Double msX10;

	@Column(name = "MS_C28R_2")
	private Double c28r2Raw;

	@Column(name = "MS_H31S_205")
	private Double msH31s205;

	@Column(name = "MS_DRIM")
	private Double drimane;

	@Column(name = "MS_D27BAR")
	private Double msD27bar;

	@Column(name = "MS_D27BAS")
	private Double msD27bas;

	@Column(name = "MS_1424DMDI")
	private Double ms1424dmdi;

	@Column(name = "IQM_CODE")
	private String msIqmCode;

	@Column(name = "MS_DATE")
	private Date msDate;

	@Column(name = "MS_8S28ABBR")
	private Double ms8s28abbr;

	@Column(name = "MS_8S28ABBS")
	private Double ms8s28abbs;

	@Column(name = "MS_C27_17B_TNH")
	private Double msC2717bTnh;

	@Column(name = "MS_TR31A")
	private Double c31a3;

	@Column(name = "MS_S27AAAS")
	private Double msS27aaas;

	@Column(name = "MS_S27AAAR")
	private Double msS27aaar;

	@Column(name = "MS_H34R")
	private Double c3422r;

	@Column(name = "MS_H34S")
	private Double c3422s;

	@Column(name = "JOB_ID")
	private String msJobId;

	@Column(name = "MS_LAB")
	private String msLab;

	@Column(name = "MS_D28ABR_S27AAAS")
	private Double msD28abrS27aaas;

	@Column(name = "MS_D27ABS")
	private Double msD27abs;

	@Column(name = "MS_D27ABR")
	private Double msD27abr;

	@Column(name = "MS_C29TS")
	private Double c29Ts;

	@Column(name = "MS_C27I_20S")
	private Double c27i20sRaw;

	@Column(name = "MS_TR25A")
	private Double c25a3;

	@Column(name = "MS_M31")
	private Double msM31;

	@Column(name = "MS_B_CHOL")
	private Double msBChol;

	@Column(name = "MS_C29I_20S")
	private Double c29i20sRaw;

	@Column(name = "MS_C28R_1")
	private Double c28r1Raw;

	@Column(name = "MS_ENTBEY")
	private Double beyerane;

	@Column(name = "MS_TR25B")
	private Double c25b3;

	@Column(name = "MS_H27B")
	private Double c27TmB;

	@Column(name = "MS_TR36A")
	private Double c36a3;

	@Column(name = "MS_AUTHOR")
	private String msAuthor;

	@Column(name = "MS_TR36B")
	private Double c36b3;

	@Column(name = "MS_D28ABS_S27ABBR")
	private Double msD28absS27abbr;

	@Column(name = "MS_25NOR28AB")
	private Double x25nor28ab;

	@Column(name = "MS_TR31B")
	private Double c31b3;

	@Column(name = "MS_C29N_20R")
	private Double c29n20rRaw;

	@Column(name = "MS_B_KAUR")
	private Double kaurane;

	@Column(name = "MS_C28R_4")
	private Double c28r4Raw;

	@Column(name = "MS_C29_17B_21B_NHOP")
	private Double msC2917b21bNhop;

	@Column(name = "MS_TNH")
	private Double tnrh;

	@Column(name = "MS_C27R_20R")
	private Double c27r20rRaw;

	@Column(name = "MS_METHOD")
	private String msMethod;

	@Column(name = "MS_OL18B")
	private Double x18bOl;

	@Column(name = "MS_S27ABBS")
	private Double msS27abbs;

	@Column(name = "MS_S27ABBR")
	private Double msS27abbr;

	@Column(name = "MS_GAM")
	private Double gammace;

	@Column(name = "MS_TR26A")
	private Double c26a3;

	@Column(name = "MS_D28ABS")
	private Double msD28abs;

	@Column(name = "MS_D28ABR")
	private Double msD28abr;

	@Column(name = "MS_C28N_20R")
	private Double c28n20rRaw;

	@Column(name = "MS_S30AAAS")
	private Double msS30aaas;

	@Column(name = "MS_S30AAAR")
	private Double msS30aaar;

	@Column(name = "MS_25NH29")
	private Double nh29a;

	@Column(name = "MS_TR20")
	private Double c203;

	@Column(name = "MS_C27N_20R")
	private Double c27n20rRaw;

	@Column(name = "MS_C29R_20S")
	private Double c29r20sRaw;

	@Column(name = "MS_C27I_20R")
	private Double c27i20rRaw;

	@Column(name = "MS_H31_2ME")
	private Double msH312me;

	@Column(name = "MS_HDRIM")
	private Double hdrimane;

	@Column(name = "MS_PIM")
	private Double nipimarane;

	@Column(name = "MS_H29")
	private Double c29Hop;

	@Column(name = "MS_C27R_20S")
	private Double c27r20sRaw;

	@Column(name = "MS_RDRIM1")
	private Double rdrimane1;

	@Column(name = "MS_RDRIM2")
	private Double rdrimane2;

	@Column(name = "MS_1MDIAM")
	private Double diamantane1m;

	@Column(name = "MS_C28R_3")
	private Double c28r3Raw;

	@Column(name = "MS_4MDIAM")
	private Double diamantane4m;

	@Column(name = "MS_S30ABBS")
	private Double msS30abbs;

	@Column(name = "MS_S30ABBR")
	private Double msS30abbr;

	@Column(name = "MS_3MDIAM")
	private Double diamantane3m;

	@Column(name = "MS_PH183")
	private Double msPh183;

	@Column(name = "MS_DIAM")
	private Double diamantane;

	@Column(name = "MS_H31R_205")
	private Double msH31r205;

	@Column(name = "MS_C28I_20R")
	private Double c28i20rRaw;

	@Column(name = "MS_H31_3ME")
	private Double msH313me;

	@Column(name = "MS_TR21")
	private Double c213;

	@Column(name = "MS_D28BARR")
	private Double msD28barr;

	@Column(name = "MS_D28BARS")
	private Double msD28bars;

	@Column(name = "MS_D28BASR")
	private Double msD28basr;

	@Column(name = "MS_D28BASS")
	private Double msD28bass;

	@Column(name = "MS_C29_17A_21B_NHOP")
	private Double msC2917a21bNhop;

	@Column(name = "MS_TR33B")
	private Double c33b3;

	@Column(name = "MS_48DMDI")
	private Double ms48dmdi;

	@Column(name = "MS_TPP_A")
	private Double msTppA;

	@Column(name = "MS_TPP_B")
	private Double msTppB;

	@Column(name = "MS_H31S")
	private Double c3122s;

	@Column(name = "MS_H31R")
	private Double c3122r;

	@Column(name = "MS_C28_25_30_BNH")
	private Double msC282530Bnh;

	@Column(name = "MS_TRISNORM")
	private Double msTrisnorm;

	@Column(name = "MS_D30BAS")
	private Double msD30bas;

	@Column(name = "MS_BICAD_R")
	private Double bicadR;

	@Column(name = "MS_D29BAS")
	private Double msD29bas;

	@Column(name = "MS_D29BAR")
	private Double msD29bar;

	@Column(name = "MS_BICAD_W")
	private Double bicadW;

	@Column(name = "MS_BICAD_T")
	private Double bicadT;

	@Column(name = "MS_LABD")
	private Double labdane;

	@Column(name = "MS_M30")
	private Double mor;

	@Column(name = "MS_8S27ABBS")
	private Double ms8s27abbs;

	@Column(name = "MS_8S27ABBR")
	private Double ms8s27abbr;

	@Column(name = "MS_HENEICO")
	private Double msHeneico;

	@Column(name = "MS_H30")
	private Double c30Hop;

	@Column(name = "MS_9D27BAS")
	private Double ms9d27bas;

	@Column(name = "MS_9D27BAR")
	private Double ms9d27bar;

	@Column(name = "MS_TR22")
	private Double c223;

	@Column(name = "MS_S29AAAS")
	private Double msS29aaas;

	@Column(name = "MS_S29AAAR")
	private Double msS29aaar;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MS_ISOPIM")
	private Double ipimarane;

	@Column(name = "MS_9D27ABS")
	private Double ms9d27abs;

	@Column(name = "MS_9D27ABR")
	private Double ms9d27abr;

	@Column(name = "MS_D29ABS")
	private Double msD29abs;

	@Column(name = "MS_TR26B")
	private Double c26b3;

	@Column(name = "MS_D29ABR")
	private Double msD29abr;

	@Column(name = "MS_30NH30")
	private Double nh30a;

	@Column(name = "MS_C29I_20R")
	private Double c29i20rRaw;

	@Column(name = "MS_DATA_TYPE")
	private String msDataType;

	@Column(name = "MS_34DMDI")
	private Double ms34dmdi;

	@Column(name = "MS_S29ABBS")
	private Double msS29abbs;

	@Column(name = "MS_S29ABBR")
	private Double msS29abbr;

	@Column(name = "MS_H28")
	private Double bnrh;

	@Column(name = "MS_TR23")
	private Double c233;

	@Column(name = "MS_TR25A_B")
	private Double c253;

	@Column(name = "MS_9D29BAR")
	private Double ms9d29bar;

	@Column(name = "MS_9D29BAS")
	private Double ms9d29bas;

	@Column(name = "MS_M32B")
	private Double msM32b;

	@Column(name = "MS_M32R")
	private Double msM32r;

	@Column(name = "MS_M32S")
	private Double msM32s;

	@Column(name = "MS_25NOR30AB")
	private Double x25nor30ab;

	@Column(name = "MS_T23A")
	private Double t23a;

	@Column(name = "MS_T23B")
	private Double t23b;

	@Column(name = "MS_M31B")
	private Double msM31b;

	@Column(name = "QC_DATE")
	private Date msQcDate;

	@Column(name = "LAST_UPDATE")
	private Date msLastUpdate;

	@Column(name = "MS_TR34B")
	private Double c34b3;

	@Column(name = "MS_C30NOR_C29HOM")
	private Double msC30norC29hom;

	@Column(name = "MS_S26BBS")
	private Double msS26bbs;

	@Column(name = "MS_S26BBR")
	private Double msS26bbr;

	@Column(name = "MS_D21")
	private Double msD21;

	@Column(name = "MS_D22")
	private Double msD22;

	@Column(name = "MS_ISTD_CONC")
	private Double msIstdConc;

	@Column(name = "MS_C31_17B_21A_HMOR")
	private Double msC3117b21aHmor;

	@Column(name = "MS_TET24")
	private Double c244;

	@Column(name = "MS_TR24")
	private Double c243;

	@Column(name = "MS_TR28B")
	private Double c28b3;

	@Column(name = "MS_TET26")
	private Double c264;

	@Column(name = "MS_TR26A_B")
	private Double c263;

	@Column(name = "MS_C29N_20S")
	private Double c29n20sRaw;

	@Column(name = "MS_25NOR31AB")
	private Double x25nor31ab;

	@Column(name = "QC_USER")
	private String msQcUser;

	@Column(name = "MS_TR34A")
	private Double c34a3;

	@Column(name = "MS_S27ABBR_D29BAS")
	private Double msS27abbrD29bas;

	@Column(name = "MS_DIAHOP_C29")
	private Double c29Diahop;

	@Column(name = "MS_C30TP2")
	private Double msC30tp2;

	@Column(name = "MS_C30TP1")
	private Double msC30tp1;

	@Column(name = "MS_S22BB")
	private Double msS22bb;

	@Column(name = "MS_PR183")
	private Double msPr183;

	@Column(name = "MS_DATE", insertable = false, updatable = false)
	private Date msAcqDate;

	@Column(name = "MS_8S30AAAS")
	private Double ms8s30aaas;

	@Column(name = "MS_8S30AAAR")
	private Double ms8s30aaar;

	@Column(name = "MS_8S29ABBS")
	private Double ms8s29abbs;

	@Column(name = "MS_8S29ABBR")
	private Double ms8s29abbr;

	@Column(name = "MS_TARAX")
	private Double tarax;

	@Column(name = "MS_M29")
	private Double normor;

	@Column(name = "MS_H30B")
	private Double msH30b;

	@Column(name = "MS_C27_17A_TNH")
	private Double msC2717aTnh;

	@Column(name = "MS_H31B")
	private Double msH31b;

	@Column(name = "MS_S22")
	private Double msS22;

	@Column(name = "MS_S21")
	private Double msS21;

	@Column(name = "MS_RIMU")
	private Double ntcyclane;

	@Column(name = "MS_TR33A")
	private Double c33a3;

	@Column(name = "MS_H33S")
	private Double c3322s;

	@Column(name = "MS_H33R")
	private Double c3322r;

	@Column(name = "MS_C29DM")
	private Double c29dm;

	@Column(name = "MS_COMMENT")
	private String msComments;

	@Column(name = "MS_S21BB")
	private Double msS21bb;

	@Column(name = "MS_BCAROT")
	private Double bcarot;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "RUN_NUMBER")
	private String msRunNumber;

	@Column(name = "MS_8S30ABBS")
	private Double ms8s30abbs;

	@Column(name = "MS_8S30ABBR")
	private Double ms8s30abbr;

	@Column(name = "MS_C28I_20S")
	private Double c28i20sRaw;

	@Column(name = "MS_QC")
	private String msQc;

	@Column(name = "MS_S22", insertable = false, updatable = false)
	private Double msT22;

	@Column(name = "MS_S21", insertable = false, updatable = false)
	private Double msT21;

	@Column(name = "MS_49DMDI")
	private Double ms49dmdi;

	@Column(name = "MS_S23B", insertable = false, updatable = false)
	private Double msS23b;

	@Column(name = "MS_S23A", insertable = false, updatable = false)
	private Double msS23a;

	@Column(name = "MS_C28DM")
	private Double c28dm;

	@Override
	public String getName() {
		return AnalysisConstants.GCMS_BIOMARKERS_SATURATE;
	}

}
