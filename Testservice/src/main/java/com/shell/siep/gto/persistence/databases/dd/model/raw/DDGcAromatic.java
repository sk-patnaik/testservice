package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcAromatic;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_AROMATIC")
public class DDGcAromatic extends DDDatabaseObject implements GTOGcAromatic, Serializable {

	@Column(name = "AG_ISTD_PPM")
	private Double agIstdPpm;

	@Column(name = "AG_236TMN")
	private Double ag236tmn;

	@Column(name = "AG_18DMP")
	private Double ag18dmp;

	@Column(name = "SVC_CODE")
	private String agSvcCode;

	@Column(name = "AG_1MP")
	private Double ag1mp;

	@Column(name = "AG_1MN")
	private Double ag1mn;

	@Column(name = "AG_1EN")
	private Double ag1en;

	@Column(name = "AG_12DMN")
	private Double ag12dmn;

	@Column(name = "AG_2EN")
	private Double ag2en;

	@Column(name = "AG_36DMP")
	private Double ag36dmp;

	@Column(name = "AG_2MP")
	private Double ag2mp;

	@Column(name = "AG_2MN")
	private Double ag2mn;

	@Column(name = "AG_29DMP")
	private Double ag29dmp;

	@Column(name = "AG_17DMP")
	private Double ag17dmp;

	@Column(name = "AG_3MP")
	private Double ag3mp;

	@Column(name = "QC_USER")
	private String agQcUser;

	@Column(name = "AG_26DMN")
	private Double ag26dmn;

	@Column(name = "AG_26DMP")
	private Double ag26dmp;

	@Column(name = "AG_14DMN")
	private Double ag14dmn;

	@Column(name = "AG_SPL_PPM")
	private Double agSplPpm;

	@Column(name = "RUN_NUMBER")
	private String agRunNumber;

	@Column(name = "AG_19DMP")
	private Double ag19dmp;

	@Column(name = "QC_DATE")
	private Date agQcDate;

	@Column(name = "AG_1317DMN")
	private Double ag1317dmn;

	@Column(name = "AG_127TMN")
	private Double ag127tmn;

	@Column(name = "AG_DATE")
	private Date agAcqDate;

	@Column(name = "AG_COMMENTS")
	private String agComments;

	@Column(name = "AG_PHEN")
	private Double agPhen;

	@Column(name = "AG_137TMN")
	private Double ag137tmn;

	@Column(name = "AG_125TMN")
	private Double ag125tmn;

	@Column(name = "AG_DATA_TYPE")
	private String agDataType;

	@Column(name = "AG_ISTD")
	private Double agIstd;

	@Column(name = "AG_15DMN")
	private Double ag15dmn;

	@Column(name = "AG_39DMP")
	private Double ag39dmp;

	@Column(name = "AG_9MP")
	private Double ag9mp;

	@Column(name = "AG_27DMP")
	private Double ag27dmp;

	@Column(name = "AG_27DMN")
	private Double ag27dmn;

	@Column(name = "AG_BP")
	private Double agBp;

	@Column(name = "AG_LAB")
	private String agLab;

	@Column(name = "AG_146135T")
	private Double ag146135t;

	@Column(name = "AG_DATE", insertable = false, updatable = false)
	private Date agDate;

	@Column(name = "AG_QC")
	private String agQc;

	@Column(name = "JOB_ID")
	private String agJobId;

	@Column(name = "LAST_UPDATE")
	private Date agLastUpdate;

	@Column(name = "SAMPLE_ID_VEND")
	private String agSampleIdVend;

	@Column(name = "AG_23DMP")
	private Double ag23dmp;

	@Column(name = "AG_23DMN")
	private Double ag23dmn;

	@Column(name = "AG_167126T")
	private Double ag167126t;

	@Column(name = "AG_136TMN")
	private Double ag136tmn;

	@Column(name = "AG_124TMN")
	private Double ag124tmn;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "AG_AUTHOR")
	private String agAuthor;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "AG_16DMN")
	private Double ag16dmn;

	@Column(name = "IQM_CODE")
	private String agIqmCode;

	@Column(name = "AG_METHOD")
	private String agMethod;

	@Override
	public String getName() {
		return AnalysisConstants.GC_AROMATICS;
	}

}
