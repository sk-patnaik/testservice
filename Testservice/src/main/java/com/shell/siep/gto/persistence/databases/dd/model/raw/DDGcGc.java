package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcGc;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_GC")
public class DDGcGc extends DDDatabaseObject implements GTOGcGc, Serializable {

	@Column(name = "GCGC_1234TM_BENZ")
	private Integer gcgc1234tmBenz;

	@Column(name = "GCGC_SECC4_BENZ")
	private Integer gcgcSecc4Benz;

	@Column(name = "SAMPLE_ID_VEND")
	private String gcgcSampleIdVend;

	@Column(name = "GCGC_TOL")
	private Integer gcgcTol;

	@Column(name = "RUN_NUMBER")
	private String gcgcRunNumber;

	@Column(name = "GCGC_1M_2IP_BENZ")
	private Integer gcgc1m2ipBenz;

	@Column(name = "GCGC_M_P_XYL")
	private Integer gcgcMPXyl;

	@Column(name = "GCGC_STD_PPM")
	private Integer gcgcStdPpm;

	@Column(name = "IQM_CODE")
	private String gcgcIqmCode;

	@Column(name = "GCGC_METHOD")
	private String gcgcMethod;

	@Column(name = "GCGC_STD_CNTS_2")
	private Integer gcgcStdCnts2;

	@Column(name = "GCGC_2M_NAPH")
	private Integer gcgc2mNaph;

	@Column(name = "GCGC_IP_BENZ")
	private Integer gcgcIpBenz;

	@Column(name = "GCGC_5_6_ANT")
	private Integer gcgc56Ant;

	@Column(name = "GCGC_1E_NAPH")
	private Integer gcgc1eNaph;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "GCGC_1M3_1M4_IP_BENZ")
	private Integer gcgc1m31m4IpBenz;

	@Column(name = "GCGC_2M_BP")
	private Integer gcgc2mBp;

	@Column(name = "GCGC_O_XYL")
	private Integer gcgcOXyl;

	@Column(name = "GCGC_C3_NAPH_6")
	private Integer gcgcC3Naph6;

	@Column(name = "GCGC_C3_NAPH_7")
	private Integer gcgcC3Naph7;

	@Column(name = "GCGC_AUTHOR")
	private String gcgcAuthor;

	@Column(name = "GCGC_STD_PPM_2")
	private Integer gcgcStdPpm2;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "GCGC_7_8_ANT")
	private Integer gcgc78Ant;

	@Column(name = "GCGC_2E_NAPH")
	private Integer gcgc2eNaph;

	@Column(name = "GCGC_NP_BENZ")
	private Integer gcgcNpBenz;

	@Column(name = "QC_DATE")
	private Date gcgcQcDate;

	@Column(name = "GCGC_MCH")
	private Integer gcgcMch;

	@Column(name = "GCGC_BP")
	private Integer gcgcBp;

	@Column(name = "GCGC_NC36")
	private Double gcgcNc36;

	@Column(name = "GCGC_NC35")
	private Double gcgcNc35;

	@Column(name = "GCGC_NC34")
	private Double gcgcNc34;

	@Column(name = "GCGC_NC33")
	private Double gcgcNc33;

	@Column(name = "GCGC_NC32")
	private Double gcgcNc32;

	@Column(name = "GCGC_NC31")
	private Double gcgcNc31;

	@Column(name = "GCGC_NC30")
	private Double gcgcNc30;

	@Column(name = "GCGC_NC29")
	private Double gcgcNc29;

	@Column(name = "GCGC_NC28")
	private Double gcgcNc28;

	@Column(name = "GCGC_NC27")
	private Double gcgcNc27;

	@Column(name = "GCGC_NC26")
	private Double gcgcNc26;

	@Column(name = "GCGC_NC25")
	private Double gcgcNc25;

	@Column(name = "GCGC_NC24")
	private Double gcgcNc24;

	@Column(name = "GCGC_NC23")
	private Double gcgcNc23;

	@Column(name = "GCGC_NC22")
	private Double gcgcNc22;

	@Column(name = "GCGC_NC21")
	private Double gcgcNc21;

	@Column(name = "GCGC_NC20")
	private Double gcgcNc20;

	@Column(name = "GCGC_NC19")
	private Double gcgcNc19;

	@Column(name = "GCGC_NC18")
	private Double gcgcNc18;

	@Column(name = "GCGC_NC17")
	private Double gcgcNc17;

	@Column(name = "GCGC_NC16")
	private Double gcgcNc16;

	@Column(name = "GCGC_NC15")
	private Double gcgcNc15;

	@Column(name = "GCGC_NC14")
	private Double gcgcNc14;

	@Column(name = "GCGC_NC13")
	private Double gcgcNc13;

	@Column(name = "GCGC_NC12")
	private Double gcgcNc12;

	@Column(name = "GCGC_NC11")
	private Double gcgcNc11;

	@Column(name = "GCGC_NC10")
	private Double gcgcNc10;

	@Column(name = "GCGC_NAPH")
	private Integer gcgcNaph;

	@Column(name = "LAST_UPDATE")
	private Date gcgcLastUpdate;

	@Column(name = "GCGC_A_BENZ")
	private Integer gcgcABenz;

	@Column(name = "GCGC_PHEN")
	private Integer gcgcPhen;

	@Column(name = "GCGC_LAB")
	private String gcgcLab;

	@Column(name = "GCGC_NC40")
	private Double gcgcNc40;

	@Column(name = "GCGC_NC39")
	private Double gcgcNc39;

	@Column(name = "GCGC_NC38")
	private Double gcgcNc38;

	@Column(name = "GCGC_NC37")
	private Double gcgcNc37;

	@Column(name = "GCGC_QC")
	private String gcgcQc;

	@Column(name = "GCGC_COMMENT")
	private String gcgcComment;

	@Column(name = "JOB_ID")
	private String gcgcJobId;

	@Column(name = "QC_USER")
	private String gcgcQcUser;

	@Column(name = "SVC_CODE")
	private String gcgcSvcCode;

	@Column(name = "GCGC_NC5")
	private Double gcgcNc5;

	@Column(name = "GCGC_NC4")
	private Double gcgcNc4;

	@Column(name = "GCGC_NC7")
	private Double gcgcNc7;

	@Column(name = "GCGC_NC6")
	private Double gcgcNc6;

	@Column(name = "GCGC_NC9")
	private Double gcgcNc9;

	@Column(name = "GCGC_NC8")
	private Double gcgcNc8;

	@Column(name = "GCGC_NC1")
	private Double gcgcNc1;

	@Column(name = "GCGC_NC3")
	private Double gcgcNc3;

	@Column(name = "GCGC_NC2")
	private Double gcgcNc2;

	@Column(name = "GCGC_135TM_BENZ")
	private Integer gcgc135tmBenz;

	@Column(name = "GCGC_13DM_2E_BENZ")
	private Integer gcgc13dm2eBenz;

	@Column(name = "GCGC_124_TM_BENZ")
	private Integer gcgc124TmBenz;

	@Column(name = "GCGC_B_BENZ")
	private Integer gcgcBBenz;

	@Column(name = "GCGC_G")
	private Integer gcgcG;

	@Column(name = "GCGC_B")
	private Integer gcgcB;

	@Column(name = "GCGC_A")
	private Integer gcgcA;

	@Column(name = "GCGC_D")
	private Integer gcgcD;

	@Column(name = "GCGC_F")
	private Integer gcgcF;

	@Column(name = "GCGC_SAMP_AMT")
	private Double gcgcSampAmt;

	@Column(name = "GCGC_123TMB")
	private Integer gcgc123tmb;

	@Column(name = "GCGC_STD_CNTS")
	private Integer gcgcStdCnts;

	@Column(name = "GCGC_X_BENZ")
	private Integer gcgcXBenz;

	@Column(name = "GCGC_DATE")
	private Date gcgcAcqDate;

	@Column(name = "GCGC_IC4_BENZ")
	private Integer gcgcIc4Benz;

	@Column(name = "GCGC_1M_2NP_BENZ")
	private Integer gcgc1m2npBenz;

	@Column(name = "GCGC_1M_NAPH")
	private Integer gcgc1mNaph;

	@Column(name = "GCGC_E_BENZ")
	private Integer gcgcEBenz;

	@Column(name = "GCGC_DATE", insertable = false, updatable = false)
	private Date gcgcDate;

	@Column(name = "GCGC_DM_NAPH_2")
	private Integer gcgcDmNaph2;

	@Column(name = "GCGC_DM_NAPH_1")
	private Integer gcgcDmNaph1;

	@Column(name = "GCGC_DM_NAPH_3")
	private Integer gcgcDmNaph3;

	@Column(name = "GCGC_1M_2E_BENZ")
	private Integer gcgc1m2eBenz;

	@Column(name = "GCGC_ANT")
	private Integer gcgcAnt;

	@Column(name = "GCGC_1M_3E_4E_BENZ")
	private Integer gcgc1m3e4eBenz;

	@Override
	public String getName() {
		return AnalysisConstants.GC_GC;
	}

}
