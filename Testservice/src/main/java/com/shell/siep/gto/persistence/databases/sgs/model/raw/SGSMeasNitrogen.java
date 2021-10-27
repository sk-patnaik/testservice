package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilNitrogen;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_NITROGEN", schema="sgs_data")
public class SGSMeasNitrogen extends SGSDatabaseObject implements GTOOilNitrogen, Serializable {

	@Column(name = "NITRO_CONF")
	private Double nitroConf;

	@Column(name = "SVC_CODE")
	private String nitroSvcCode;

	@Column(name = "SAMPLE_ID_VEND")
	private String nitroSampleIdVend;

	@Column(name = "NITRO_QC")
	private String nitroQc;

	@Column(name = "NITRO_AUTHOR")
	private String nitroAuthor;

	@Column(name = "NITRO_VALUE")
	private Double nitroValue;

	@Column(name = "NITRO_DATE")
	private Date nitroAcqDate;

	@Column(name = "QC_USER")
	private String nitroQcUser;

	@Column(name = "RUN_NUMBER")
	private String nitroRunNumber;

	@Column(name = "NITRO_COMMENT")
	private String nitroComments;

	@Column(name = "NITRO_METHOD")
	private String nitroMethod;

	@Column(name = "QC_DATE")
	private Date nitroQcDate;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "JOB_ID")
	private String nitroJobId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "REQUEST_ID_VEND")
	private String nitroRequestIdVend;

	@Column(name = "UPDATED_DATE")
	private Date nitroLastUpdate;

	@Column(name = "NITRO_LAB")
	private String nitroLab;

	@Transient
	private String nitroValueQualifier;

	@Transient
	private String nitroIqmCode;


	@Override
	public String getName() {
		 return AnalysisConstants.ELEMENTAL_NITROGEN;
	}
}
