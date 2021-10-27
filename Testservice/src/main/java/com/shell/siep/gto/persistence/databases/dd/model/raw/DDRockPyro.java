package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTORockPyro;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ROCK_PYRO")
public class DDRockPyro extends DDDatabaseObject implements GTORockPyro, Serializable {

	@Column(name = "FK_DATATYPE_ID")
	private Integer rpPrep;

	@Column(name = "RP_COMMENT")
	private String rpComments;

	@Column(name = "JOB_ID")
	private String rpJobId;

	@Column(name = "RP_METHOD")
	private String rpMethod;

	@Column(name = "RP_DATE")
	private Date rpAcqDate;

	@Column(name = "RP_TMAX")
	private Integer revTmax;

	@Column(name = "RP_PCR")
	private Double rpPcr;

	@Column(name = "RP_S4CO")
	private Double rpS4co;

	@Column(name = "SAMPLE_ID_VEND")
	private String rpSampleIdVend;

	@Column(name = "RP_HI")
	private Integer rpHi;

	@Column(name = "RP_QC")
	private String rpQc;

	@Column(name = "RP_OI_CO")
	private Double rpOiCo;

	@Column(name = "RP_PI")
	private Double rpPi;

	@Column(name = "RP_S5")
	private Double rpS5;

	@Column(name = "RP_OI")
	private Integer rpOi;

	@Column(name = "RP_TMAX_S3B")
	private Integer rpTmaxS3b;

	@Column(name = "RP_TMAX_S2B")
	private Integer rpTmaxS2b;

	@Column(name = "RP_TMAX_S2A")
	private Integer rpTmaxS2a;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "RP_LAB")
	private String rpLab;

	@Column(name = "RP_S3BCO")
	private Double rpS3bco;

	@Column(name = "FK_METHOD_ID")
	private Integer rpMethodNew;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer rpConfType;

	@Column(name = "FK_UNITS_ID")
	private Integer rpUom;

	@Column(name = "RP_S3BCO2")
	private Double rpS3bco2;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer rpRecordType;

	@Column(name = "RP_S2A_400")
	private Double rpS2a400;

	@Column(name = "SVC_CODE")
	private String rpSvcCode;

	@Column(name = "IQM_CODE")
	private String rpIqmCode;

	@Column(name = "RP_GAS")
	private Double rpGas;

	@Column(name = "RP_AUTHOR")
	private String rpAuthor;

	@Column(name = "LAST_UPDATE")
	private Date rpLastUpdate;

	@Column(name = "RP_TMIN_S2A_S2B")
	private Integer rpTminS2aS2b;

	@Column(name = "RP_OI_CO2")
	private Double rpOiCo2;

	@Column(name = "RUN_NUMBER")
	private String rpRunNumber;

	@Column(name = "QC_DATE")
	private Date rpQcDate;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "RP_RCR")
	private Double rpRcr;

	@Column(name = "QC_USER")
	private String rpQcUser;

	@Column(name = "RP_S3B")
	private Double rpS3b;

	@Column(name = "RP_S2A")
	private Double rpS2a;

	@Column(name = "RP_S2B")
	private Double rpS2b;

	@Column(name = "RP_S4CO2")
	private Double rpS4co2;

	@Column(name = "RP_MINC")
	private Double rpMinc;

	@Column(name = "RP_S2B_400")
	private Double rpS2b400;

	@Column(name = "RP_CO2")
	private Double revTots3;

	@Column(name = "RP_PYRO")
	private Double revTots2;

	@Column(name = "RP_DIST")
	private Double revTots1;

    @Override
	public String getName() {
    	return AnalysisConstants.ROCK_PYROLYSIS;
	}

}
