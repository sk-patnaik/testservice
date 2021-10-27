package com.shell.siep.gto.persistence.databases.sgs.model;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOChnos;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_CHNOS", schema="sgs_data")
public class SGSChnos extends SGSDatabaseObject implements GTOChnos, Serializable {

	@Column(name = "N_C_RATIO")
	private Double chnosNCRatio;

	@Column(name = "RUN_NUMBER")
	private String chnosRunNumber;

	@Column(name = "H_C_RATIO")
	private Double chnosHCRatio;

	@Column(name = "CHNOS_ASH")
	private Double chnosAsh;

	@Column(name = "QC_DATE")
	private Date chnosQcDate;

	@Column(name = "QC_FLAG")
	private String chnosQcFlag;

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

	@Column(name = "CHNOS_AUTHOR")
	private String chnosAuthor;

	@Column(name = "UPDATED_DATE")
	private Date chnosUpdatedDate;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "H_N_RATIO")
	private Double chnosHNRatio;

	@Column(name = "S_C_RATIO")
	private Double chnosSCRatio;

	@Column(name = "SAMPLE_ID_VEND")
	private String chnosSampleIdVend;

	@Column(name = "UPDATED_USER")
	private String chnosUpdatedUser;

	@Column(name = "CHNOS_FE")
	private Double chnosFe;

	@Column(name = "SVC_CODE")
	private String chnosSvcCode;

	@Column(name = "CHNOS_DATE")
	private Date chnosAcqDate;

	@Column(name = "CHNOS_LAB")
	private String chnosLab;

	@Column(name = "CHNOS_QC")
	private String chnosQc;

	@Column(name = "REQUEST_ID_VEND")
	private String chnosRequestIdVend;

	@Column(name = "CREATED_DATE")
	private Date chnosCreatedDate;

	@Column(name = "O_C_RATIO")
	private Double chnosOCRatio;

	@Column(name = "CHNOS_COMMENT")
	private String chnosComment;

	@Column(name = "IQM_FLAG")
	private String chnosIqmFlag;

	@Column(name = "QC_USER")
	private String chnosQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "CREATED_USER")
	private String chnosCreatedUser;

	@Column(name = "CHNOS_METHOD")
	private String chnosMethod;

	@Transient
	private String chnosCQ;

	@Transient
	private String chnosSQ;

	@Transient
	private String chnosIqmCode;

	@Transient
	private String chnosComments;

	@Transient
	private String chnosHQ;

	@Transient
	private Date chnosLastUpdate;

	@Transient
	private String chnosAshQ;

	@Transient
	private String chnosFeQ;

	@Transient
	private String chnosJobId;

	@Transient
	private String chnosOQ;

	@Transient
	private String chnosNQ;


	@Override
	public String getName() {
		 return AnalysisConstants.ELEMENTAL_CHNOS;
	}
}
