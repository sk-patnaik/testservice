package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOMsMs;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_MS", schema="gfs")
public class FpcMsMs extends FpcDatabaseObject implements GTOMsMs, Serializable {

	@Column(name = "MSMS_DATE")
	private Date msmsAcqDate;

	@Column(name = "MSMS_BICADINENE")
	private Integer msmsBicadinene;

	@Column(name = "RUN_NUMBER")
	private String msmsRunNumber;

	@Column(name = "MSMS_C28UNK9")
	private Integer msmsC28unk9;

	@Column(name = "MSMS_COMMENT")
	private String msmsComment;

	@Column(name = "MSMS_H29TS")
	private Integer msmsH29ts;

	@Column(name = "MSMS_D293MBASA")
	private Integer msmsD293mbasa;

	@Column(name = "MSMS_D293MBARB")
	private Integer msmsD293mbarb;

	@Column(name = "MSMS_D293MBARA")
	private Integer msmsD293mbara;

	@Column(name = "MSMS_H33ABR")
	private Integer msmsH33abr;

	@Column(name = "MSMS_H33ABS")
	private Integer msmsH33abs;

	@Column(name = "MSMS_D293MBASB")
	private Integer msmsD293mbasb;

	@Column(name = "MSMS_S294MAAASB")
	private Integer msmsS294maaasb;

	@Column(name = "MSMS_S294MAAASA")
	private Integer msmsS294maaasa;

	@Column(name = "MSMS_NORPREG12")
	private Integer msmsNorpreg12;

	@Column(name = "MSMS_NORPREG11")
	private Integer msmsNorpreg11;

	@Column(name = "MSMS_NORPREG10")
	private Integer msmsNorpreg10;

	@Column(name = "MSMS_H29BA")
	private Integer msmsH29ba;

	@Column(name = "MSMS_S29ABBR")
	private Integer msmsS29abbr;

	@Column(name = "MSMS_S29ABBS")
	private Integer msmsS29abbs;

	@Column(name = "MSMS_D30NPBASB")
	private Integer msmsD30npbasb;

	@Column(name = "MSMS_D30NPBASA")
	private Integer msmsD30npbasa;

	@Column(name = "MSMS_H29AB")
	private Integer msmsH29ab;

	@Column(name = "MSMS_DS4ARS20R")
	private Integer msmsDs4ars20r;

	@Column(name = "MSMS_OL3B543ABEO")
	private Integer msmsOl3b543abeo;

	@Column(name = "MSMS_D283MBAS")
	private Integer msmsD283mbas;

	@Column(name = "MSMS_D283MBAR")
	private Integer msmsD283mbar;

	@Column(name = "MSMS_S26N27AAAR")
	private Integer msmsS26n27aaar;

	@Column(name = "MSMS_S26N27AAAS")
	private Integer msmsS26n27aaas;

	@Column(name = "MSMS_DESATARAX")
	private Integer msmsDesatarax;

	@Column(name = "MSMS_METHOD")
	private String msmsMethod;

	@Column(name = "QC_USER")
	private String msmsQcUser;

	@Column(name = "MSMS_OL3A5B543ABEO")
	private Integer msmsOl3a5b543abeo;

	@Column(name = "MSMS_S29AAAR")
	private Integer msmsS29aaar;

	@Column(name = "MSMS_S29AAAS")
	private Integer msmsS29aaas;

	@Column(name = "LAST_UPDATE")
	private Date msmsLastUpdate;

	@Column(name = "MSMS_C30UNKT2")
	private Integer msmsC30unkt2;

	@Column(name = "MSMS_DS4ARR20R")
	private Integer msmsDs4arr20r;

	@Column(name = "MSMS_S26N27ABBR")
	private Integer msmsS26n27abbr;

	@Column(name = "MSMS_S26N27ABBS")
	private Integer msmsS26n27abbs;

	@Column(name = "MSMS_PP1")
	private Integer msmsPp1;

	@Column(name = "MSMS_DH33A")
	private Integer msmsDh33a;

	@Column(name = "MSMS_DH33B")
	private Integer msmsDh33b;

	@Column(name = "MSMS_OLEANOID15A")
	private Integer msmsOleanoid15a;

	@Column(name = "MSMS_DH32A")
	private Integer msmsDh32a;

	@Column(name = "MSMS_DH32B")
	private Integer msmsDh32b;

	@Column(name = "MSMS_DH34B")
	private Integer msmsDh34b;

	@Column(name = "MSMS_DH34A")
	private Integer msmsDh34a;

	@Column(name = "JOB_ID")
	private String msmsJobId;

	@Column(name = "QC_DATE")
	private Date msmsQcDate;

	@Column(name = "MSMS_DH31A")
	private Integer msmsDh31a;

	@Column(name = "MSMS_DH31B")
	private Integer msmsDh31b;

	@Column(name = "MSMS_D28ABRB")
	private Integer msmsD28abrb;

	@Column(name = "MSMS_D28ABRA")
	private Integer msmsD28abra;

	@Column(name = "MSMS_S284MABBS")
	private Integer msmsS284mabbs;

	@Column(name = "MSMS_S284MABBR")
	private Integer msmsS284mabbr;

	@Column(name = "MSMS_C30UNK12")
	private Integer msmsC30unk12;

	@Column(name = "MSMS_S303PABBS")
	private Integer msmsS303pabbs;

	@Column(name = "MSMS_B30T1")
	private Integer msmsB30t1;

	@Column(name = "SVC_CODE")
	private String msmsSvcCode;

	@Column(name = "MSMS_D284MBAS")
	private Integer msmsD284mbas;

	@Column(name = "MSMS_D284MBAR")
	private Integer msmsD284mbar;

	@Column(name = "MSMS_H32ABS")
	private Integer msmsH32abs;

	@Column(name = "MSMS_H32ABR")
	private Integer msmsH32abr;

	@Column(name = "MSMS_S26N21")
	private Integer msmsS26n21;

	@Column(name = "MSMS_OL1318ENE")
	private Integer msmsOl1318ene;

	@Column(name = "MSMS_S30IPABBR")
	private Integer msmsS30ipabbr;

	@Column(name = "MSMS_S27ABBR")
	private Integer msmsS27abbr;

	@Column(name = "MSMS_S27ABBS")
	private Integer msmsS27abbs;

	@Column(name = "MSMS_H30N30")
	private Integer msmsH30n30;

	@Column(name = "MSMS_TRITERP18")
	private Integer msmsTriterp18;

	@Column(name = "MSMS_TRITERP14")
	private Integer msmsTriterp14;

	@Column(name = "MSMS_S293MAAASB")
	private Integer msmsS293maaasb;

	@Column(name = "MSMS_DC29UNK27")
	private Integer msmsDc29unk27;

	@Column(name = "MSMS_DC29UNK28")
	private Integer msmsDc29unk28;

	@Column(name = "MSMS_D30NPABSA")
	private Integer msmsD30npabsa;

	@Column(name = "MSMS_D30NPABSB")
	private Integer msmsD30npabsb;

	@Column(name = "MSMS_S27AAAR")
	private Integer msmsS27aaar;

	@Column(name = "MSMS_S27AAAS")
	private Integer msmsS27aaas;

	@Column(name = "MSMS_XS29AAAR")
	private Integer msmsXs29aaar;

	@Column(name = "MSMS_S294MABBS_3MAAAR")
	private Integer msmsS294mabbs3maaar;

	@Column(name = "MSMS_H31ABS")
	private Integer msmsH31abs;

	@Column(name = "MSMS_H31ABR")
	private Integer msmsH31abr;

	@Column(name = "MSMS_S293MAAASA_4ABRB")
	private Integer msmsS293maaasa4abrb;

	@Column(name = "MSMS_D26N27BAS")
	private Integer msmsD26n27bas;

	@Column(name = "MSMS_D26N27BAR")
	private Integer msmsD26n27bar;

	@Column(name = "MSMS_UNK_H")
	private Integer msmsUnkH;

	@Column(name = "MSMS_S304MABBR")
	private Integer msmsS304mabbr;

	@Column(name = "MSMS_DATE", insertable = false, updatable = false)
	private Date msmsDate;

	@Column(name = "MSMS_S28AAASB")
	private Integer msmsS28aaasb;

	@Column(name = "MSMS_S28AAASA")
	private Integer msmsS28aaasa;

	@Column(name = "MSMS_DS4ASS20R")
	private Integer msmsDs4ass20r;

	@Column(name = "MSMS_H27BB")
	private Integer msmsH27bb;

	@Column(name = "MSMS_D28BARA")
	private Integer msmsD28bara;

	@Column(name = "MSMS_D28BARB")
	private Integer msmsD28barb;

	@Column(name = "MSMS_D28BASB")
	private Integer msmsD28basb;

	@Column(name = "MSMS_D28BASA")
	private Integer msmsD28basa;

	@Column(name = "MSMS_D26N27ABR")
	private Integer msmsD26n27abr;

	@Column(name = "MSMS_D26N27ABS")
	private Integer msmsD26n27abs;

	@Column(name = "MSMS_S304MAAAR")
	private Integer msmsS304maaar;

	@Column(name = "MSMS_S304MAAAS")
	private Integer msmsS304maaas;

	@Column(name = "MSMS_D27ABS")
	private Integer msmsD27abs;

	@Column(name = "MSMS_D27ABR")
	private Integer msmsD27abr;

	@Column(name = "MSMS_S28AAAR")
	private Integer msmsS28aaar;

	@Column(name = "MSMS_DC28UNK3")
	private Integer msmsDc28unk3;

	@Column(name = "SAMPLE_ID_VEND")
	private String msmsSampleIdVend;

	@Column(name = "MSMS_S283MABBR")
	private Integer msmsS283mabbr;

	@Column(name = "MSMS_S283MABBS")
	private Integer msmsS283mabbs;

	@Column(name = "MSMS_XS28AAAR")
	private Integer msmsXs28aaar;

	@Column(name = "MSMS_DS4ASR20R")
	private Integer msmsDs4asr20r;

	@Column(name = "MSMS_S30NPAAAS")
	private Integer msmsS30npaaas;

	@Column(name = "MSMS_S30NPAAAR")
	private Integer msmsS30npaaar;

	@Column(name = "MSMS_BOTYROCOCCANE")
	private Integer msmsBotyrococcane;

	@Column(name = "IQM_CODE")
	private String msmsIqmCode;

	@Column(name = "MSMS_D27BAR")
	private Integer msmsD27bar;

	@Column(name = "MSMS_D27BAS")
	private Integer msmsD27bas;

	@Column(name = "MSMS_D30NPBAR")
	private Integer msmsD30npbar;

	@Column(name = "MSMS_PP2_S303PABBR")
	private Integer msmsPp2S303pabbr;

	@Column(name = "MSMS_S28N21")
	private Integer msmsS28n21;

	@Column(name = "MSMS_ISTD")
	private Integer msmsIstd;

	@Column(name = "MSMS_S293MABBS")
	private Integer msmsS293mabbs;

	@Column(name = "MSMS_S293MABBR")
	private Integer msmsS293mabbr;

	@Column(name = "MSMS_DESEHOP")
	private Integer msmsDesehop;

	@Column(name = "MSMS_S30NPABBS")
	private Integer msmsS30npabbs;

	@Column(name = "MSMS_S30NPABBR")
	private Integer msmsS30npabbr;

	@Column(name = "MSMS_H28N2930")
	private Integer msmsH28n2930;

	@Column(name = "MSMS_S302MAAAS")
	private Integer msmsS302maaas;

	@Column(name = "MSMS_DESAOL")
	private Integer msmsDesaol;

	@Column(name = "MSMS_AUTHOR")
	private String msmsAuthor;

	@Column(name = "MSMS_H28N2830")
	private Integer msmsH28n2830;

	@Column(name = "MSMS_D28ABS")
	private Integer msmsD28abs;

	@Column(name = "MSMS_S28BAAR")
	private Integer msmsS28baar;

	@Column(name = "MSMS_D294MABRA")
	private Integer msmsD294mabra;

	@Column(name = "MSMS_S283MAAAR")
	private Integer msmsS283maaar;

	@Column(name = "MSMS_S283MAAAS")
	private Integer msmsS283maaas;

	@Column(name = "MSMS_S302MABBS")
	private Integer msmsS302mabbs;

	@Column(name = "MSMS_S302MABBR")
	private Integer msmsS302mabbr;

	@Column(name = "MSMS_NORPREG3_4")
	private Integer msmsNorpreg34;

	@Column(name = "MSMS_H35ABS")
	private Integer msmsH35abs;

	@Column(name = "MSMS_H35ABR")
	private Integer msmsH35abr;

	@Column(name = "MSMS_S30IPAAAR")
	private Integer msmsS30ipaaar;

	@Column(name = "MSMS_S30IPAAAS")
	private Integer msmsS30ipaaas;

	@Column(name = "MSMS_H313MAB")
	private Integer msmsH313mab;

	@Column(name = "MSMS_OLEANOID16")
	private Integer msmsOleanoid16;

	@Column(name = "MSMS_OLEANOID15")
	private Integer msmsOleanoid15;

	@Column(name = "MSMS_OLEANOID17")
	private Integer msmsOleanoid17;

	@Column(name = "MSMS_OLEANOID13")
	private Integer msmsOleanoid13;

	@Column(name = "MSMS_ISTD_CONC")
	private Integer msmsIstdConc;

	@Column(name = "MSMS_S303MABBR")
	private Integer msmsS303mabbr;

	@Column(name = "MSMS_S303MABBS")
	private Integer msmsS303mabbs;

	@Column(name = "MSMS_H31BA")
	private Integer msmsH31ba;

	@Column(name = "MSMS_OL18ENE")
	private Integer msmsOl18ene;

	@Column(name = "MSMS_QC")
	private String msmsQc;

	@Column(name = "MSMS_H30TS")
	private Integer msmsH30ts;

	@Column(name = "MSMS_TM")
	private Integer msmsTm;

	@Column(name = "MSMS_TS")
	private Integer msmsTs;

	@Column(name = "MSMS_DC28UNK17")
	private Integer msmsDc28unk17;

	@Column(name = "MSMS_DC28UNK16")
	private Integer msmsDc28unk16;

	@Column(name = "MSMS_S303PAAAR")
	private Integer msmsS303paaar;

	@Column(name = "MSMS_S303PAAAS")
	private Integer msmsS303paaas;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "MSMS_S284MAAAS")
	private Integer msmsS284maaas;

	@Column(name = "MSMS_S284MAAAR")
	private Integer msmsS284maaar;

	@Column(name = "MSMS_D29BAS")
	private Integer msmsD29bas;

	@Column(name = "MSMS_D29BAR")
	private Integer msmsD29bar;

	@Column(name = "MSMS_H30AB")
	private Integer msmsH30ab;

	@Column(name = "MSMS_H30AA")
	private Integer msmsH30aa;

	@Column(name = "MSMS_H30BA")
	private Integer msmsH30ba;

	@Column(name = "MSMS_S29BAAR")
	private Integer msmsS29baar;

	@Column(name = "MSMS_TRITERP17A")
	private Integer msmsTriterp17a;

	@Column(name = "MSMS_S303MAAAR")
	private Integer msmsS303maaar;

	@Column(name = "MSMS_S303MAAAS")
	private Integer msmsS303maaas;

	@Column(name = "MSMS_S30NPBAAR")
	private Integer msmsS30npbaar;

	@Column(name = "MSMS_DH29")
	private Integer msmsDh29;

	@Column(name = "MSMS_DH30")
	private Integer msmsDh30;

	@Column(name = "MSMS_REARNGHOP")
	private Integer msmsRearnghop;

	@Column(name = "MSMS_H312MAB")
	private Integer msmsH312mab;

	@Column(name = "MSMS_GAMA")
	private Integer msmsGama;

	@Column(name = "MSMS_GAMB")
	private Integer msmsGamb;

	@Column(name = "MSMS_DESALUP")
	private Integer msmsDesalup;

	@Column(name = "MSMS_S294MAAAR")
	private Integer msmsS294maaar;

	@Column(name = "MSMS_D26N24BAR")
	private Integer msmsD26n24bar;

	@Column(name = "MSMS_D26N24BAS")
	private Integer msmsD26n24bas;

	@Column(name = "MSMS_D30NPABR")
	private Integer msmsD30npabr;

	@Column(name = "MSMS_NORPREG8_9")
	private Integer msmsNorpreg89;

	@Column(name = "MSMS_S26N24ABBS")
	private Integer msmsS26n24abbs;

	@Column(name = "MSMS_S26N24ABBR")
	private Integer msmsS26n24abbr;

	@Column(name = "MSMS_D26N24ABR")
	private Integer msmsD26n24abr;

	@Column(name = "MSMS_D26N24ABS")
	private Integer msmsD26n24abs;

	@Column(name = "MSMS_H34ABS")
	private Integer msmsH34abs;

	@Column(name = "MSMS_H34ABR")
	private Integer msmsH34abr;

	@Column(name = "MSMS_H29N25AB")
	private Integer msmsH29n25ab;

	@Column(name = "MSMS_RH34B")
	private Integer msmsRh34b;

	@Column(name = "MSMS_RH34A")
	private Integer msmsRh34a;

	@Column(name = "MSMS_RH33A")
	private Integer msmsRh33a;

	@Column(name = "MSMS_RH33B")
	private Integer msmsRh33b;

	@Column(name = "MSMS_S28ABBR")
	private Integer msmsS28abbr;

	@Column(name = "MSMS_S28ABBS")
	private Integer msmsS28abbs;

	@Column(name = "MSMS_S304MABBS_2MAAAR")
	private Integer msmsS304mabbs2maaar;

	@Column(name = "MSMS_S26N27BAAR")
	private Integer msmsS26n27baar;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MSMS_H32BA")
	private Integer msmsH32ba;

	@Column(name = "MSMS_OL12ENE")
	private Integer msmsOl12ene;

	@Column(name = "MSMS_OL12ENE18A")
	private Integer msmsOl12ene18a;

	@Column(name = "MSMS_D294MBARA")
	private Integer msmsD294mbara;

	@Column(name = "MSMS_D294MBARB")
	private Integer msmsD294mbarb;

	@Column(name = "MSMS_D294MBASB")
	private Integer msmsD294mbasb;

	@Column(name = "MSMS_D294MBASA")
	private Integer msmsD294mbasa;

	@Column(name = "MSMS_LAB")
	private String msmsLab;

	@Column(name = "MSMS_S26N24AAAS")
	private Integer msmsS26n24aaas;

	@Column(name = "MSMS_S26N24AAAR")
	private Integer msmsS26n24aaar;

	@Column(name = "MSMS_OL3M24N105ABEO")
	private Integer msmsOl3m24n105abeo;

	@Column(name = "MSMS_B30R")
	private Integer msmsB30r;

	@Column(name = "MSMS_B30W")
	private Integer msmsB30w;

	@Column(name = "MSMS_B30T")
	private Integer msmsB30t;

	@Column(name = "MSMS_D294MABS")
	private Integer msmsD294mabs;

	@Column(name = "MSMS_D29ABR")
	private Integer msmsD29abr;

	@Column(name = "MSMS_D29ABS")
	private Integer msmsD29abs;

	@Column(name = "MSMS_S294MABBR")
	private Integer msmsS294mabbr;

	@Column(name = "MSMS_NORPREG1")
	private Integer msmsNorpreg1;

	@Column(name = "MSMS_NORPREG5")
	private Integer msmsNorpreg5;

	@Column(name = "MSMS_NORPREG2")
	private Integer msmsNorpreg2;

	@Column(name = "MSMS_NORPREG7")
	private Integer msmsNorpreg7;

	@Column(name = "MSMS_NORPREG6")
	private Integer msmsNorpreg6;

	@Column(name = "MSMS_OL18B")
	private Integer msmsOl18b;

	@Column(name = "MSMS_OL18A")
	private Integer msmsOl18a;


	@Override
	public String getName() {
		 return AnalysisConstants.GCMS_BIOMARKERS_MSMS;
	}
}
