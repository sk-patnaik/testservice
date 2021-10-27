package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcXmdgcBenz;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_XMDGC_BENZ")
public class DDGcXmdgcBenz extends DDDatabaseObject implements GTOGcXmdgcBenz, Serializable {

	@Column(name = "QC_USER")
	private String xbQcUser;

	@Column(name = "RUN_NUMBER")
	private String xbRunNumber;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "XB_LAB")
	private String xbLab;

	@Column(name = "XB_COMP_B")
	private Double xbB;

	@Column(name = "XB_COMP_D")
	private Double xbD;

	@Column(name = "XB_COMP_C")
	private Double xbC;

	@Column(name = "XB_COMP_N")
	private Double xbN;

	@Column(name = "XB_COMP_M")
	private Double xbM;

	@Column(name = "XB_COMP_P")
	private Double xbP;

	@Column(name = "XB_COMP_O")
	private Double xbO;

	@Column(name = "XB_COMP_R")
	private Double xbR;

	@Column(name = "XB_COMP_T")
	private Double xbT;

	@Column(name = "XB_COMP_S")
	private Double xbS;

	@Column(name = "XB_COMP_F")
	private Double xbF;

	@Column(name = "XB_COMP_E")
	private Double xbE;

	@Column(name = "XB_COMP_H")
	private Double xbH;

	@Column(name = "XB_COMP_G")
	private Double xbG;

	@Column(name = "XB_COMP_J")
	private Double xbJ;

	@Column(name = "XB_COMP_I")
	private Double xbI;

	@Column(name = "XB_COMP_L")
	private Double xbL;

	@Column(name = "XB_COMP_K")
	private Double xbK;

	@Column(name = "XB_COMP_U")
	private Double xbU;

	@Column(name = "XB_COMP_W")
	private Double xbW;

	@Column(name = "GM_QC")
	private String xbQc;

	@Column(name = "QC_DATE")
	private Date xbQcDate;

	@Column(name = "SVC_CODE")
	private String xbSvcCode;

	@Column(name = "IQM_CODE")
	private String xbIqmCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "LAST_UPDATE")
	private Date xbLastUpdate;

	@Column(name = "XB_METHOD")
	private String xbMethod;

	@Column(name = "GM_AUTHOR")
	private String xbAuthor;

	@Column(name = "JOB_ID")
	private String xbJobId;

	@Column(name = "GM_COMMENT")
	private String xbComments;

	@Column(name = "XB_DATE")
	private Date xbAcqDate;

	@Column(name = "SAMPLE_ID_VEND")
	private String xbSampleIdVend;

	@Column(name = "XB_DATE", insertable = false, updatable = false)
	private Date xbDate;

	@Column(name = "XB_DATA_TYPE")
	private String xbDataType;


	@Override
	public String getName() {
		 return AnalysisConstants.GC_XMDGC_BENZ;
	}
}
