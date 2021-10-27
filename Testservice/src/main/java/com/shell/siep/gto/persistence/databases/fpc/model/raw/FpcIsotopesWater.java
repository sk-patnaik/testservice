package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOIsotopesWater;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ISOTOPES_WATER", schema="gfs")
public class FpcIsotopesWater extends FpcDatabaseObject implements GTOIsotopesWater, Serializable {

	@Column(name = "D_W_LAB")
	private String dWLab;

	@Column(name = "D_W_QC")
	private String dWQc;

	@Column(name = "DC_W_OXY")
	private Double dWOxy;

	@Column(name = "DC_W_SULF")
	private Double dWSulf;

	@Column(name = "D_W_COMMENT")
	private String dWComment;

	@Column(name = "DC_W_STR_CONF")
	private Double dWStrConf;

	@Column(name = "D_W_AUTHOR")
	private String dWAuthor;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "JOB_ID")
	private String dWJobId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "DC_W_DUE")
	private Double dWDue;

	@Column(name = "DC_W_CAR")
	private Double dWCar;

	@Column(name = "D_W_DATE")
	private Date dWAcqDate;

	@Column(name = "FK_METHOD_ID")
	private Integer dWMethodId;

	@Column(name = "SVC_CODE")
	private String dWSvcCode;

	@Column(name = "D_W_DATA_TYPE")
	private String dWDataType;

	@Column(name = "D_W_DATE", insertable = false, updatable = false)
	private Date dWDate;

	@Column(name = "DC_W_BOR")
	private Double dWBor;

	@Column(name = "DC_W_STR")
	private Double dWStr;

	@Column(name = "LAST_UPDATE")
	private Date dWLastUpdate;

	@Column(name = "RUN_NUMBER")
	private String dWRunNumber;

	@Column(name = "SAMPLE_ID_VEND")
	private String dWSampleIdVend;


	@Override
	public String getName() {
		 return AnalysisConstants.ISOTOPES_WATER;
	}
}
