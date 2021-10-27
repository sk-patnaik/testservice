package com.shell.siep.gto.persistence.databases.dd.model.raw;


import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOVrHeader;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_VR_HEADER")
public class DDVrHeader extends DDDatabaseObject implements GTOVrHeader, Serializable {

	@Column(name = "VR_METH")
	private String vrMeth;

	@Column(name = "QC_DATE")
	private Date vrQcDate;

	@Column(name = "VR_QUALITY")
	private String vrQual;

	@Column(name = "SVC_CODE")
	private String vrSvcCode;

	@Column(name = "JOB_ID")
	private String vrJobId;

	@Column(name = "QC_USER")
	private String vrQcUser;

	@Column(name = "VR_INTERVAL")
	private Double vrInterval;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "VR_MEAN")
	private Double vrMean;

	@Column(name = "VR_COMMENTS")
	private String vrComments;

	@Column(name = "VR_ST")
	private Double vrSt;

	@Column(name = "VR_QC")
	private String vrQc;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "VR_HISTOGRAM")
	private String vrHistogram;

	@Column(name = "LAST_UPDATE")
	private Date vrLastUpdate;

	@Column(name = "IQM_CODE")
	private String vrIqmCode;

	@Column(name = "TAI")
	private Double vrTai;

	@Column(name = "RUN_NUMBER")
	private String vrRunNumber;

	@Column(name = "JOB_DATE")
	private Date vrJobDate;

	@Column(name = "VR_LAB")
	private String vrJobVendor;

	@Column(name = "VR_MIN")
	private Double vrMin;

	@Column(name = "VR_MAX")
	private Double vrMax;

	@Column(name = "VR_NR_OBS")
	private Integer vrNrOb;

	@Column(name = "VR_LAB_NUM")
	private String vrLabNum;

	@Column(name = "VR_MACERAL")
	private String vrMaceral;

	@Override
	public String getName() {
		return AnalysisConstants.ROCK_VITRINITE_REFLECTION;
	}
}
