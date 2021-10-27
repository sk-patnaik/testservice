package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOChnos;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_CHNOS")
public class DDChnos extends DDDatabaseObject implements GTOChnos, Serializable {

	@Column(name = "CHNOS_C_Q")
	private String chnosCQ;

	@Column(name = "SAMPLE_ID_VEND")
	private String chnosSampleIdVend;

	@Column(name = "CHNOS_FE")
	private Double chnosFe;

	@Column(name = "CHNOS_QC")
	private String chnosQc;

	@Column(name = "CHNOS_S_Q")
	private String chnosSQ;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "IQM_CODE")
	private String chnosIqmCode;

	@Column(name = "CHNOS_COMMENT")
	private String chnosComments;

	@Column(name = "CHNOS_N")
	private Double chnosN;

	@Column(name = "CHNOS_O")
	private Double chnosO;

	@Column(name = "CHNOS_H")
	private Double chnosH;

	@Column(name = "CHNOS_C")
	private Double chnosC;

	@Column(name = "CHNOS_S")
	private Double chnosS;

	@Column(name = "CHNOS_H_Q")
	private String chnosHQ;

	@Column(name = "LAST_UPDATE")
	private Date chnosLastUpdate;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "CHNOS_ASH_Q")
	private String chnosAshQ;

	@Column(name = "RUN_NUMBER")
	private String chnosRunNumber;

	@Column(name = "QC_DATE")
	private Date chnosQcDate;

	@Column(name = "SVC_CODE")
	private String chnosSvcCode;

	@Column(name = "CHNOS_DATE")
	private Date chnosAcqDate;

	@Column(name = "CHNOS_LAB")
	private String chnosLab;

	@Column(name = "QC_USER")
	private String chnosQcUser;

	@Column(name = "CHNOS_ASH")
	private Double chnosAsh;

	@Column(name = "CHNOS_FE_Q")
	private String chnosFeQ;

	@Column(name = "CHNOS_AUTHOR")
	private String chnosAuthor;

	@Column(name = "JOB_ID")
	private String chnosJobId;

	@Column(name = "CHNOS_O_Q")
	private String chnosOQ;

	@Column(name = "CHNOS_METHOD")
	private String chnosMethod;

	@Column(name = "CHNOS_N_Q")
	private String chnosNQ;

	@Transient
	private Double chnosNCRatio;

	@Transient
	private Double chnosHCRatio;

	@Transient
	private String chnosQcFlag;

	@Transient
	private Date chnosUpdatedDate;

	@Transient
	private Double chnosHNRatio;

	@Transient
	private Double chnosSCRatio;

	@Transient
	private String chnosUpdatedUser;

	@Transient
	private String chnosRequestIdVend;

	@Transient
	private Date chnosCreatedDate;

	@Transient
	private Double chnosOCRatio;

	@Transient
	private String chnosComment;

	@Transient
	private String chnosIqmFlag;

	@Transient
	private String chnosCreatedUser;


	@Override
	public String getName() {
		 return AnalysisConstants.ELEMENTAL_CHNOS;
	}
}
