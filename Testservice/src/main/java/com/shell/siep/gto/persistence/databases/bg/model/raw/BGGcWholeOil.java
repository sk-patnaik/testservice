package com.shell.siep.gto.persistence.databases.bg.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.bg.model.BGDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcWholeOil;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_WHOLE_OIL")
public class BGGcWholeOil extends BGDatabaseObject implements GTOGcWholeOil, Serializable {

	@Column(name = "GO_PHEN")
	private Double oilPhen;

	@Column(name = "GO_ECP")
	private Double oilEcp;

	@Column(name = "GO_11DMCP")
	private Double oil11dmcp;

	@Column(name = "GO_123TMCP")
	private Double oil123tmcp;

	@Column(name = "GO_DATA_TYPE")
	private String oilDataType;

	@Column(name = "GO_1C3DMCP")
	private Double oil1c3dmcp;

	@Column(name = "GO_DATE")
	private Date oilAcqDate;

	@Column(name = "GO_2MC7")
	private Double oil2mc7;

	@Column(name = "GO_C25HBI")
	private Double oilC25hbi;

	@Column(name = "GO_IP9")
	private Double oilIc9;

	@Column(name = "GO_AUTHOR")
	private String oilAuthor;

	@Column(name = "GO_MCP")
	private Double oilMcp;

	@Column(name = "GO_MCH")
	private Double oilMch;

	@Column(name = "GO_3MP")
	private Double oil3mp;

	@Column(name = "GO_3MH")
	private Double oil3mh;

	@Column(name = "GO_22DMPR")
	private Double oil22dmpr;

	@Column(name = "GO_24DMH")
	private Double oil24dmh;

	@Column(name = "GO_24DMP")
	private Double oil24dmp;

	@Column(name = "GO_DM1")
	private Double oilDm1;

	@Column(name = "GO_DM2")
	private Double oilDm2;

	@Column(name = "GO_223TMB")
	private Double oil223tmb;

	@Column(name = "GO_3EP")
	private Double oil3ep;

	@Column(name = "GO_223TMP")
	private Double oil223tmp;

	@Column(name = "GO_33DMH")
	private Double oil33dmh;

	@Column(name = "GO_33DMP")
	private Double oil33dmp;

	@Column(name = "GO_NP_BENZ")
	private Double oilNpBenz;

	@Column(name = "QC_USER")
	private String oilQcUser;

	@Column(name = "GO_1T2DMCP")
	private Double oil1t2dmcp;

	@Column(name = "GO_ISTD_CONC")
	private Double oilIstdConc;

	@Column(name = "GO_3MC7")
	private Double oil3mc7;

	@Column(name = "GO_E_BENZ")
	private Double oilEBenz;

	@Column(name = "GO_NC30")
	private Double oilNc30;

	@Column(name = "GO_NC23")
	private Double oilNc23;

	@Column(name = "GO_NC22")
	private Double oilNc22;

	@Column(name = "GO_NC21")
	private Double oilNc21;

	@Column(name = "GO_NC20")
	private Double oilNc20;

	@Column(name = "GO_NC27")
	private Double oilNc27;

	@Column(name = "GO_NC26")
	private Double oilNc26;

	@Column(name = "GO_NC25")
	private Double oilNc25;

	@Column(name = "GO_NC24")
	private Double oilNc24;

	@Column(name = "GO_NC29")
	private Double oilNc29;

	@Column(name = "GO_NC28")
	private Double oilNc28;

	@Column(name = "GO_NC12")
	private Double oilNc12;

	@Column(name = "GO_NC11")
	private Double oilNc11;

	@Column(name = "GO_NC10")
	private Double oilNc10;

	@Column(name = "GO_NC16")
	private Double oilNc16;

	@Column(name = "GO_NC15")
	private Double oilNc15;

	@Column(name = "GO_NC14")
	private Double oilNc14;

	@Column(name = "GO_NC13")
	private Double oilNc13;

	@Column(name = "GO_NC19")
	private Double oilNc19;

	@Column(name = "GO_NC18")
	private Double oilNc18;

	@Column(name = "GO_NC17")
	private Double oilNc17;

	@Column(name = "GO_NC41")
	private Double oilNc41;

	@Column(name = "GO_NC40")
	private Double oilNc40;

	@Column(name = "GO_NC34")
	private Double oilNc34;

	@Column(name = "GO_NC33")
	private Double oilNc33;

	@Column(name = "GO_NC32")
	private Double oilNc32;

	@Column(name = "GO_NC31")
	private Double oilNc31;

	@Column(name = "GO_NC38")
	private Double oilNc38;

	@Column(name = "GO_NC37")
	private Double oilNc37;

	@Column(name = "GO_NC36")
	private Double oilNc36;

	@Column(name = "GO_NC35")
	private Double oilNc35;

	@Column(name = "GO_NC39")
	private Double oilNc39;

	@Column(name = "GO_M_XYL")
	private Double oilMXyl;

	@Column(name = "SAMPLE_ID_VEND")
	private String oilSampleIdVend;

	@Column(name = "GO_112TMCP")
	private Double oil112tmcp;

	@Column(name = "GO_NC3")
	private Double oilNc3;

	@Column(name = "GO_NC2")
	private Double oilNc2;

	@Column(name = "GO_NC5")
	private Double oilNc5;

	@Column(name = "GO_NC4")
	private Double oilNc4;

	@Column(name = "GO_NC7")
	private Double oilNc7;

	@Column(name = "GO_NC6")
	private Double oilNc6;

	@Column(name = "GO_NC9")
	private Double oilNc9;

	@Column(name = "GO_NC8")
	private Double oilNc8;

	@Column(name = "GO_224TMP")
	private Double oil224tmp;

	@Column(name = "GO_2MPR")
	private Double oil2mpr;

	@Column(name = "SVC_CODE")
	private String oilSvcCode;

	@Column(name = "GO_25DMH")
	private Double oil25dmh;

	@Column(name = "GO_124_TM_B")
	private Double oil124TmBenz;

	@Column(name = "GO_O_XYL")
	private Double oilOXyl;

	@Column(name = "OIL_4MC7")
	private Double oil4mc7;

	@Column(name = "GO_22DMB")
	private Double oil22dmb;

	@Column(name = "GO_22DMH")
	private Double oil22dmh;

	@Column(name = "GO_22DMP")
	private Double oil22dmp;

	@Column(name = "GO_113TMCP")
	private Double oil113tmcp;

	@Column(name = "GO_1C2DMCP")
	private Double oil1c2dmcp;

	@Column(name = "QC_DATE")
	private Date oilQcDate;

	@Column(name = "TMP_SAM")
	private String oilTmpSam;

	@Column(name = "JOB_ID")
	private String oilJobId;

	@Column(name = "GO_1E_2M_BENZ")
	private Double oil1e2mBenz;

	@Column(name = "GO_MP_XYL")
	private Double oilMpXyl;

	@Column(name = "LAST_UPDATE")
	private Date oilLastUpdate;

	@Column(name = "GO_SPL_CONC")
	private Double oilSplConc;

	@Column(name = "GO_IP10")
	private Double oilIc10;

	@Column(name = "GO_IP11")
	private Double oilIc11;

	@Column(name = "GO_IP12")
	private Double oilIc12;

	@Column(name = "GO_IP13")
	private Double oilIc13;

	@Column(name = "GO_IP14")
	private Double oilIc14;

	@Column(name = "GO_IP15")
	private Double oilIc15;

	@Column(name = "GO_IP16")
	private Double oilIc16;

	@Column(name = "GO_IP18")
	private Double oilIc18;

	@Column(name = "GO_1E_4M_BENZ")
	private Double oil1e4mBenz;

	@Column(name = "GO_IP_BENZ")
	private Double oilIpBenz;

	@Column(name = "GO_135_TM_BENZ")
	private Double oil135TmBenz;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "GO_ISTD")
	private Double oilIstd;

	@Column(name = "IQM_CODE")
	private String oilIqmCode;

	@Column(name = "GO_CH")
	private Double oilCh;

	@Column(name = "RUN_NUMBER")
	private String oilRunNumber;

	@Column(name = "GO_CP")
	private Double oilCp;

	@Column(name = "GO_ETCH")
	private Double oilEtch;

	@Column(name = "GO_BZ")
	private Double oilBz;

	@Column(name = "GO_QC")
	private String oilQc;

	@Column(name = "GO_IP20")
	private Double oilPh;

	@Column(name = "GO_IP19")
	private Double oilPr;

	@Column(name = "GO_1E_3M_BENZ")
	private Double oil1e3mBenz;

	@Column(name = "GO_METHOD")
	private String oilMethod;

	@Column(name = "GO_1T3DMCP")
	private Double oil1t3dmcp;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "GO_LAB")
	private String oilLab;

	@Column(name = "GO_2MP")
	private Double oil2mp;

	@Column(name = "GO_2MH")
	private Double oil2mh;

	@Column(name = "GO_2MB")
	private Double oil2mb;

	@Column(name = "GO_TOL")
	private Double oilTol;

	@Column(name = "GO_124TMCP")
	private Double oil124tmcp;

	@Column(name = "GO_COMMENT")
	private String oilComments;

	@Column(name = "OIL_11DMCH")
	private Double oil11dmch;

	@Column(name = "GO_P_XYL")
	private Double oilPXyl;

	@Column(name = "GO_23DMB_CP")
	private Double oil23dmbCp;

	@Column(name = "GO_234TMP")
	private Double oil234tmp;

	@Column(name = "GO_23DMB")
	private Double oil23dmb;

	@Column(name = "OIL_23DMH")
	private Double oil23dmh;

	@Column(name = "GO_23DMP")
	private Double oil23dmp;

	@Column(name = "GO_MCH_1C2DMCP")
	private Double oilMch1c2dmcp;

	@Transient
	private Double oilItsd;

	@Transient
	private Double oilIc4;

	@Transient
	private Double oilIc5;

	@Transient
	private Double oilXylene;

	@Override
	public String getName() {
		return AnalysisConstants.GC_WHOLE_OIL;
	}
}
