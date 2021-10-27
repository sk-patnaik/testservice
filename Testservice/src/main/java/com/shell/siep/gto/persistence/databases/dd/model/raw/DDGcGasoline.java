package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcGasoline;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_GASOLINE")
public class DDGcGasoline extends DDDatabaseObject implements GTOGcGasoline, Serializable {

	@Column(name = "G7_ETHYLCYCLOHEXANE")
	private Double g7Ethylcyclohexane;

	@Column(name = "G7_WEIGHT_PERC_IS")
	private Double g7WeightPercIs;

	@Column(name = "G7_24DMH")
	private Double x24dmh;

	@Column(name = "G7_24DMP")
	private Double x24dmp;

	@Column(name = "G7_223TMP")
	private Double x223tmp;

	@Column(name = "G7_223TMB")
	private Double x223tmb;

	@Column(name = "G7_112TMCP")
	private Double g7112tmcp;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "G7_TOL")
	private Double tol;

	@Column(name = "G7_2MH")
	private Double x2mh;

	@Column(name = "G7_2MP")
	private Double x2mp;

	@Column(name = "G7_3MC7")
	private Double g73mc7;

	@Column(name = "G7_3EP")
	private Double x3ep;

	@Column(name = "G7_NC1")
	private Double c1;

	@Column(name = "G7_NC2")
	private Double c2;

	@Column(name = "G7_NC3")
	private Double c3;

	@Column(name = "G7_NC4")
	private Double c4;

	@Column(name = "G7_NC5")
	private Double c5;

	@Column(name = "G7_NC6")
	private Double c6;

	@Column(name = "G7_NC7")
	private Double c7;

	@Column(name = "G7_CH")
	private Double ch;

	@Column(name = "G7_CP")
	private Double cp;

	@Column(name = "G7_3MH")
	private Double x3mh;

	@Column(name = "G7_3MP")
	private Double x3mp;

	@Column(name = "G7_LAB")
	private String g7Lab;

	@Column(name = "G7_DATA_TYPE")
	private String g7DataType;

	@Column(name = "G7_RATIO_1C2DMCP_MCH")
	private Double ratio3132;

	@Column(name = "G7_ECP")
	private Double ecp;

	@Column(name = "G7_23DMB")
	private Double x23dmb;

	@Column(name = "G7_BZ")
	private Double benz;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "G7_23DMP")
	private Double x23dmp;

	@Column(name = "LAST_UPDATE")
	private Date g7LastUpdate;

	@Column(name = "G7_23DMH")
	private Double g723dmh;

	@Column(name = "G7_1TR2CIS4_TMH")
	private Double g71tr2cis4Tmh;

	@Column(name = "G7_123TMCP")
	private Double g7123tmcp;

	@Column(name = "G7_RATIO_113TMCP_22DMH")
	private Double ratio3334;

	@Column(name = "G7_PERC")
	private Double g7Perc;

	@Column(name = "IQM_CODE")
	private String g7IqmCode;

	@Column(name = "G7_1C2DMCP_MCH")
	private Double g71c2dmcpMch;

	@Column(name = "G7_224TMP")
	private Double x224tmp;

	@Column(name = "G7_DATE")
	private Date g7Date;

	@Column(name = "G7_MPC_22DMP")
	private Double mcp22dmp;

	@Column(name = "G7_1T2DMCP_3EP")
	private Double x1t2dmcp3ep;

	@Column(name = "G7_22DMB")
	private Double x22dmb;

	@Column(name = "G7_22DMH")
	private Double x22dmh;

	@Column(name = "G7_22DMP")
	private Double x22dmp;

	@Column(name = "SAMPLE_ID_VEND")
	private String g7SampleIdVend;

	@Column(name = "G7_2MB")
	private Double ic5;

	@Column(name = "G7_2MPR")
	private Double ic4;

	@Column(name = "G7_SUM_1C2DMCP_MCH")
	private Double peak3132;

	@Column(name = "G7_124TMCP")
	private Double x1t2c4tmcp;

	@Column(name = "G7_2MC7")
	private Double g72mc7;

	@Column(name = "G7_SPL_CONC")
	private Double g7SplConc;

	@Column(name = "G7_11DMCP")
	private Double x11dmcp;

	@Column(name = "G7_1C3DMCP")
	private Double x1c3dmcp;

	@Column(name = "G7_1T3DMCP")
	private Double x1t3dmcp;

	@Column(name = "G7_ISTD_CONC")
	private Double g7IstdConc;

	@Column(name = "SVC_CODE")
	private String g7SvcCode;

	@Column(name = "RUN_NUMBER")
	private String g7RunNumber;

	@Column(name = "G7_22DMPR")
	private Double x22dmpr;

	@Column(name = "G7_SUM_113TMCP_22DMH")
	private Double peak3334;

	@Column(name = "G7_113TMCP")
	private Double x113tmcp;

	@Column(name = "JOB_ID")
	private String g7JobId;

	@Column(name = "G7_33DMP")
	private Double x33dmp;

	@Column(name = "G7_113TMCP_22DMH")
	private Double g7113tmcp22dmh;

	@Column(name = "G7_1C2DMCP")
	private Double x1c2dmcp;

	@Column(name = "G7_33DMH")
	private Double g733dmh;

	@Column(name = "G7_1T2DMCP")
	private Double x1t2dmcp;

	@Column(name = "G7_MCH")
	private Double mch;

	@Column(name = "G7_MCP")
	private Double mcp;

	@Column(name = "G7_ISTD")
	private Double g7Istd;

	@Column(name = "QC_DATE")
	private Date g7QcDate;

	@Column(name = "G7_DATE", insertable = false, updatable = false)
	private String g7AcqDate;

	@Column(name = "QC_USER")
	private String g7QcUser;

	@Column(name = "G7_4MC7")
	private Double g74mc7;

	@Column(name = "G7_25DMH")
	private Double x25dmh;

	@Column(name = "G7_METHOD")
	private String g7Method;

	@Column(name = "G7_C8")
	private Double g7C8;

	@Column(name = "G7_COMMENT")
	private String g7Comments;

	@Column(name = "G7_QC")
	private String g7Qc;

	@Column(name = "G7_T14DMCH")
	private Double g7T14dmch;

	@Column(name = "G7_AUTHOR")
	private String g7Author;

	@Column(name = "G7_234TMP")
	private Double g7234tmp;

	@Column(name = "G7_MCH_1C2DMCP")
	private Double mch1c2dmcp;

	@Transient
	private Double pxyl;

	@Transient
	private Double mxylPxyl;

	@Transient
	private Double mxyl;

	@Transient
	private String g7ProcDate;

	@Override
	public String getName() {
		return AnalysisConstants.GC_C7_GASOLINE_RANGE;
	}

}
