package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqNpd;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_NPD", schema="gfs")
public class FpcLiqNpd extends FpcDatabaseObject implements GTOLiqNpd, Serializable {

	@Column(name = "NPD_9E_PHENANTH_Q")
	private String npd9ePhenanthQ;

	@Column(name = "NPD_126TM_PHENANTH")
	private Double npd126tmPhenanth;

	@Column(name = "NPD_26DM_NAPTH")
	private Double npd26dmNapth;

	@Column(name = "CREATED_USER")
	private String npdCreatedUser;

	@Column(name = "NPD_C3_DBTHIOPH_Q")
	private String npdC3DbthiophQ;

	@Column(name = "CREATED_DATE")
	private Date npdCreatedDate;

	@Column(name = "NPD_9MNAPTH")
	private Double npd9mnapth;

	@Column(name = "NPD_C2_PHENANTH_Q")
	private String npdC2PhenanthQ;

	@Column(name = "NPD_C1_NATH")
	private Double npdC1Nath;

	@Column(name = "NPD_4P_DBTHIOPH")
	private Double npd4pDbthioph;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer npdConfTypeId;

	@Column(name = "NPD_C3_NATH")
	private Double npdC3Nath;

	@Column(name = "NPD_C3_PHENANTH")
	private Double npdC3Phenanth;

	@Column(name = "QC_DATE")
	private Date npdQcDate;

	@Column(name = "NPD_AUTHOR")
	private String npdAuthor;

	@Column(name = "NPD_1MNAPTH")
	private Double npd1mnapth;

	@Column(name = "NPD_4P_DBTHIOPH_Q")
	private String npd4pDbthiophQ;

	@Column(name = "QC_USER")
	private String npdQcUser;

	@Column(name = "NPD_4E_DBTHIOPH_Q")
	private String npd4eDbthiophQ;

	@Column(name = "NPD_NAPTH_Q")
	private String npdNapthQ;

	@Column(name = "NPD_DBTHIOPH")
	private Double npdDbthioph;

	@Column(name = "NPD_2MNAPTH")
	private Double npd2mnapth;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "NPD_26DM_NAPTH_Q")
	private String npd26dmNapthQ;

	@Column(name = "NPD_DATE")
	private Date npdAcqDate;

	@Column(name = "UPDATED_USER")
	private String npdUpdatedUser;

	@Column(name = "NPD_9MNAPTH_Q")
	private String npd9mnapthQ;

	@Column(name = "SAMPLE_ID_VEND")
	private String npdSampleIdVend;

	@Column(name = "NPD_C1_NATH_Q")
	private String npdC1NathQ;

	@Column(name = "NPD_C1_PHENANTH_Q")
	private String npdC1PhenanthQ;

	@Column(name = "UPDATED_DATE")
	private Date npdUpdatedDate;

	@Column(name = "NPD_C3_DBTHIOPH")
	private Double npdC3Dbthioph;

	@Column(name = "NPD_C2_DBTHIOPH_Q")
	private String npdC2DbthiophQ;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "NPD_PHENANTH_Q")
	private String npdPhenanthQ;

	@Column(name = "NPD_2IP_NAPTH")
	private Double npd2ipNapth;

	@Column(name = "NPD_C2_NATH")
	private Double npdC2Nath;

	@Column(name = "NPD_C1_DBTHIOPH")
	private Double npdC1Dbthioph;

	@Column(name = "NPD_C2_NATH_Q")
	private String npdC2NathQ;

	@Column(name = "NPD_4E_DBTHIOPH")
	private Double npd4eDbthioph;

	@Column(name = "NPD_C3_NATH_Q")
	private String npdC3NathQ;

	@Column(name = "NPD_COMMENT")
	private String npdComment;

	@Column(name = "REQUEST_ID_VEND")
	private String npdRequestIdVend;

	@Column(name = "NPD_9E_PHENANTH")
	private Double npd9ePhenanth;

	@Column(name = "NPD_PHENANTH")
	private Double npdPhenanth;

	@Column(name = "NPD_C1_PHENANTH")
	private Double npdC1Phenanth;

	@Column(name = "NPD_4M_DBTHIOPH_Q")
	private String npd4mDbthiophQ;

	@Column(name = "FK_UNITS_ID")
	private Integer npdUnitsId;

	@Column(name = "NPD_2IP_NAPTH_Q")
	private String npd2ipNapthQ;

	@Column(name = "NPD_NAPTH")
	private Double npdNapth;

	@Column(name = "SVC_CODE")
	private String npdSvcCode;

	@Column(name = "NPD_C2_PHENANTH")
	private Double npdC2Phenanth;

	@Column(name = "NPD_1MNAPTH_Q")
	private String npd1mnapthQ;

	@Column(name = "FK_METHOD_ID")
	private Integer npdMethodId;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer npdRecordTypeId;

	@Column(name = "NPD_2MNAPTH_Q")
	private String npd2mnapthQ;

	@Column(name = "FK_LAB_ID")
	private Integer npdLab;

	@Column(name = "PK")
	private Integer npdPk;

	@Column(name = "NPD_C1_DBTHIOPH_Q")
	private String npdC1DbthiophQ;

	@Column(name = "NPD_C3_PHENANTH_Q")
	private String npdC3PhenanthQ;

	@Column(name = "RUN_NUMBER")
	private String npdRunNumber;

	@Column(name = "NPD_4M_DBTHIOPH")
	private Double npd4mDbthioph;

	@Column(name = "NPD_126TM_PHENANTH_Q")
	private String npd126tmPhenanthQ;

	@Column(name = "NPD_DBTHIOPH_Q")
	private String npdDbthiophQ;

	@Column(name = "NPD_C2_DBTHIOPH")
	private Double npdC2Dbthioph;


	@Override
	public String getName() {
		 return AnalysisConstants.NPD;
	}
}
