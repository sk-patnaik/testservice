package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOPfidHeader;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_PFID_HEADER", schema="gfs")
public class DDPfidHeader extends FpcDatabaseObject implements GTOPfidHeader, Serializable {

	@Column(name = "PFID_DELTA_T")
	private Integer pfidDeltaT;

	@Column(name = "JOB_DATE")
	private Date pfidAcqDate;

	@Column(name = "PFID_QC")
	private String pfidQc;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "PFID_LAB")
	private String pfidJobVendor;

	@Column(name = "QC_USER")
	private String pfidHeaderQcUser;

	@Column(name = "QC_DATE")
	private Date pfidHeaderQcDate;

	@Column(name = "SVC_CODE")
	private String pfidSvcCode;

	@Column(name = "PFID_QC", insertable = false, updatable = false)
	private String pfidHeaderQc;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "JOB_DATE", insertable = false, updatable = false)
	private Date pfidJobDate;

	@Column(name = "PFID_FIN_WT")
	private Double pfidFinWt;

	@Column(name = "PFID_UNIT")
	private Integer pfidUnit;

	@Column(name = "LAST_UPDATE")
	private Date pfidLastUpdate;

	@Column(name = "PFID_LAB_NUM")
	private String pfidLabNum;

	@Column(name = "PFID_ASH_WT")
	private Double pfidAshWt;

	@Column(name = "IQM_CODE")
	private String pfidHeaderIqmCode;

	@Column(name = "PFID_METH")
	private String pfidMeth;

	@Column(name = "QC_USER", insertable = false, updatable = false)
	private String pfidQcUser;

	@Column(name = "PFID_START_T")
	private Integer pfidStartT;

	@Column(name = "QC_DATE", insertable = false, updatable = false)
	private Date pfidQcDate;

	@Column(name = "JOB_ID")
	private String pfidJobId;

	@Column(name = "RUN_NUMBER")
	private String pfidRunNumber;

	@Column(name = "PFID_INI_WT")
	private Double pfidIniWt;

	@Column(name = "PFID_PEAK_T")
	private Integer pfidPeakT;

	@OneToMany
	@JoinColumn(name = "JOB_ID", referencedColumnName = "JOB_ID")
	private List<DDPfidData> pfidData;


	@Override
	public String getName() {
		 return AnalysisConstants.PFID;
	}
}
