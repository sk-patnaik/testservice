package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcMdgc;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_MDGC", schema="gfs")
public class FpcGcMdgc extends FpcDatabaseObject implements GTOGcMdgc, Serializable {

	@Column(name = "GM_1E_2M_BENZ")
	private Double gm1e2mbz;

	@Column(name = "GM_DATE")
	private Date gmDate;

	@Column(name = "GM_LAB")
	private String gmLab;

	@Column(name = "GM_IP_BENZ")
	private Double gmIpbz;

	@Column(name = "GM_DATA_TYPE")
	private String gmDataType;

	@Column(name = "GM_MP2")
	private Double gmMustPeak2;

	@Column(name = "GM_MP1")
	private Double gmMustPeak1;

	@Column(name = "GM_METHOD")
	private String gmMethod;

	@Column(name = "GM_135_TM_BENZ")
	private Double gm135Tmbz;

	@Column(name = "GM_COMMENT")
	private String gmComments;

	@Column(name = "GM_DATE", insertable = false, updatable = false)
	private Date gmAcqDate;

	@Column(name = "GM_IB_BENZ")
	private Double iBBenzC;

	@Column(name = "JOB_ID")
	private String gmJobId;

	@Column(name = "GM_M_XYL")
	private Double gm13Dmbz;

	@Column(name = "SAMPLE_ID_VEND")
	private String gmSampleIdVend;

	@Column(name = "GM_STD_CNTS")
	private Double mdgcCisC;

	@Column(name = "GM_STD_PPM")
	private Double mdgcCisP;

	@Column(name = "GM_E_BENZ")
	private Double gmEbz;

	@Column(name = "QC_DATE")
	private Date gmQcDate;

	@Column(name = "GM_124_TM_B")
	private Double gm124Tmbz;

	@Column(name = "GM_SOLVENT_AMT")
	private Double mdgcSolvAmt;

	@Column(name = "GM_1E_4M_BENZ")
	private Double gm1e4mbz;

	@Column(name = "GM_AUTHOR")
	private String gmAuthor;

	@Column(name = "GM_NP_BENZ")
	private Double gmNPbz;

	@Column(name = "GM_SAMP_AMT")
	private Double mdgcSampAmt;

	@Column(name = "GM_APOLAR")
	private Double mdgcApolar;

	@Column(name = "QC_USER")
	private String gmQcUser;

	@Column(name = "GM_P_XYL")
	private Double gm14Dmbz;

	@Column(name = "GM_QC")
	private String gmQc;

	@Column(name = "IQM_CODE")
	private String gmIqmCode;

	@Column(name = "RUN_NUMBER")
	private String gmRunNumber;

	@Column(name = "GM_STD_PPM", insertable = false, updatable = false)
	private Double mdgc5m3hP;

	@Column(name = "GM_STD_CNTS", insertable = false, updatable = false)
	private Double mdgc5m3hC;

	@Column(name = "GM_1E_3M_BENZ")
	private Double gm1e3mbz;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SVC_CODE")
	private String gmSvcCode;

	@Column(name = "GM_O_XYL")
	private Double gm12Dmbz;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "LAST_UPDATE")
	private Date gmLastUpdate;

	@Column(name = "GM_NC9")
	private Double gmNc9;

	@Column(name = "GM_NC8")
	private Double gmNc8;

	@Override
	public String getName() {
		return AnalysisConstants.GC_MDGC;
	}
}
