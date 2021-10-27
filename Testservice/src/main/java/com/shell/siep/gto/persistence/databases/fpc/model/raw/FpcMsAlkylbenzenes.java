package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOMsAlkylbenzenes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_ALKYLBENZENES", schema="gfs")
public class FpcMsAlkylbenzenes extends FpcDatabaseObject implements GTOMsAlkylbenzenes, Serializable {

	@Column(name = "AB_OXYL_105")
	private Integer abOxyl105;

	@Column(name = "AB_OXYL_106")
	private Integer abOxyl106;

	@Column(name = "AB_1M2EBZ_120")
	private Integer ab1m2ebz120;

	@Column(name = "AB_1M2EBZ_105")
	private Integer ab1m2ebz105;

	@Column(name = "AB_COMMENT")
	private String abComment;

	@Column(name = "AB_PXYL_105")
	private Integer abPxyl105;

	@Column(name = "AB_PXYL_106")
	private Integer abPxyl106;

	@Column(name = "AB_NPBZ_105")
	private Integer abNpbz105;

	@Column(name = "QC_USER")
	private String abQcUser;

	@Column(name = "AB_NPBZ_120")
	private Integer abNpbz120;

	@Column(name = "AB_MXYL_106")
	private Integer abMxyl106;

	@Column(name = "AB_MXYL_105")
	private Integer abMxyl105;

	@Column(name = "AB_1M3EBZ_105")
	private Integer ab1m3ebz105;

	@Column(name = "AB_1M3EBZ_120")
	private Integer ab1m3ebz120;

	@Column(name = "AB_EBZ_91")
	private Integer abEbz91;

	@Column(name = "AB_135TMBZ_105")
	private Integer ab135tmbz105;

	@Column(name = "AB_135TMBZ_120")
	private Integer ab135tmbz120;

	@Column(name = "QC_DATE")
	private Date abQcDate;

	@Column(name = "AB_AUTHOR")
	private String abAuthor;

	@Column(name = "AB_METHOD")
	private String abMethod;

	@Column(name = "AB_NPBZ_91")
	private Integer abNpbz91;

	@Column(name = "AB_LAB")
	private String abLab;

	@Column(name = "AB_124TMBZ_120")
	private Integer ab124tmbz120;

	@Column(name = "AB_124TMBZ_105")
	private Integer ab124tmbz105;

	@Column(name = "AB_123TMBZ_120")
	private Integer ab123tmbz120;

	@Column(name = "AB_123TMBZ_105")
	private Integer ab123tmbz105;

	@Column(name = "AB_DATE")
	private Date abAcqDate;

	@Column(name = "AB_OXYL_91")
	private Integer abOxyl91;

	@Column(name = "JOB_ID")
	private String abJobId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "AB_DATE", insertable = false, updatable = false)
	private Date abDate;

	@Column(name = "IQM_CODE")
	private String abIqmCode;

	@Column(name = "AB_QC")
	private String abQc;

	@Column(name = "SAMPLE_ID_VEND")
	private String abSampleIdVend;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "AB_PXYL_91")
	private Integer abPxyl91;

	@Column(name = "LAST_UPDATE")
	private Date abLastUpdate;

	@Column(name = "AB_STD_PPM")
	private Integer abStdPpm;

	@Column(name = "AB_1M4EBZ_105")
	private Integer ab1m4ebz105;

	@Column(name = "AB_DATA_TYPE")
	private String abDataType;

	@Column(name = "AB_1M4EBZ_120")
	private Integer ab1m4ebz120;

	@Column(name = "AB_SAMP_AMT")
	private Double abSampAmt;

	@Column(name = "AB_STD_CNTS")
	private Integer abStdCnts;

	@Column(name = "AB_IPBZ_120")
	private Integer abIpbz120;

	@Column(name = "RUN_NUMBER")
	private String abRunNumber;

	@Column(name = "AB_EBZ_106")
	private Integer abEbz106;

	@Column(name = "AB_EBZ_105")
	private Integer abEbz105;

	@Column(name = "SVC_CODE")
	private String abSvcCode;

	@Column(name = "AB_MXYL_91")
	private Integer abMxyl91;

	@Column(name = "AB_IPBZ_105")
	private Integer abIpbz105;

	@Column(name = "AB_IPBZ_106")
	private Integer abIpbz106;


	@Override
	public String getName() {
		 return AnalysisConstants.MS_ALKYLBENZ;
	}
}
