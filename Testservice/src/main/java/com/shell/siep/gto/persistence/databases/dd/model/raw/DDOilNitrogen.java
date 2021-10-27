package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilNitrogen;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_OIL_NITROGEN")
public class DDOilNitrogen extends DDDatabaseObject implements GTOOilNitrogen, Serializable {

	@Column(name = "NITRO_CONF")
	private Double nitroConf;

	@Column(name = "SAMPLE_ID_VEND")
	private String nitroSampleIdVend;

	@Column(name = "NITRO_DATE")
	private Date nitroAcqDate;

	@Column(name = "QC_USER")
	private String nitroQcUser;

	@Column(name = "NITRO_COMMENT")
	private String nitroComments;

	@Column(name = "NITRO_METHOD")
	private String nitroMethod;

	@Column(name = "JOB_ID")
	private String nitroJobId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "NITRO_VALUE_QUALIFIER")
	private String nitroValueQualifier;

	@Column(name = "NITRO_QC")
	private String nitroQc;

	@Column(name = "RUN_NUMBER")
	private String nitroRunNumber;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "IQM_CODE")
	private String nitroIqmCode;

	@Column(name = "NITRO_AUTHOR")
	private String nitroAuthor;

	@Column(name = "NITRO_VALUE")
	private Double nitroValue;

	@Column(name = "LAST_UPDATE")
	private Date nitroLastUpdate;

	@Column(name = "SVC_CODE")
	private String nitroSvcCode;

	@Column(name = "QC_DATE")
	private Date nitroQcDate;

	@Column(name = "NITRO_LAB")
	private String nitroLab;

	@Transient
	private String nitroRequestIdVend;


	@Override
	public String getName() {
		 return AnalysisConstants.ELEMENTAL_NITROGEN;
	}
}
