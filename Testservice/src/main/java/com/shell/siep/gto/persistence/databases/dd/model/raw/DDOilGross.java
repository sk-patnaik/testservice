package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilGross;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_GROSS")
public class DDOilGross extends DDDatabaseObject implements GTOOilGross, Serializable {

	@Column(name = "GRO_NSO_PCT")
	private Double hetero;

	@Column(name = "GRO_WLT")
	private Double grossWlt;

	@Column(name = "JOB_ID")
	private String grossJobId;

	@Column(name = "GRO_QC")
	private String grossQc;

	@Column(name = "RUN_NUMBER")
	private String grossRunNumber;

	@Column(name = "QC_DATE")
	private Date grossQcDate;

	@Column(name = "GRO_METHOD")
	private String grossMethod;

	@Column(name = "GRO_REST_PCT")
	private Double rest;

	@Column(name = "SAMPLE_ID_VEND")
	private String grossSampleIdVend;

	@Column(name = "QC_USER")
	private String grossQcUser;

	@Column(name = "GRO_DATE")
	private Date grossAcqDate;

	@Column(name = "GRO_COMMENT")
	private String grossComments;

	@Column(name = "GRO_CONF")
	private Double grossConf;

	@Column(name = "IQM_CODE")
	private String grossIqmCode;

	@Column(name = "GRO_LAB")
	private String grossLab;

	@Column(name = "LAST_UPDATE")
	private Date grossLastUpdate;

	@Column(name = "GRO_AUTHOR")
	private String grossAuthor;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SVC_CODE")
	private String grossSvcCode;

	@Column(name = "GRO_ARO_PCT")
	private Double aro;

	@Column(name = "GRO_ASP_PCT")
	private Double asp;

	@Column(name = "GRO_SAT_PCT")
	private Double sat;


	@Override
	public String getName() {
		 return AnalysisConstants.GROSS_COMPOSITION_OTHER;
	}
}
