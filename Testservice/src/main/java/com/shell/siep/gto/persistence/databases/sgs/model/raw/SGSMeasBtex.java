package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqBtex;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_BTEX", schema="sgs_data")
public class SGSMeasBtex extends SGSDatabaseObject implements GTOLiqBtex, Serializable {

	@Column(name = "UPDATED_USER")
	private String btexUpdatedUser;

	@Column(name = "BTEX_COMMENT")
	private String waterBtexComment;

	@Column(name = "BTEX_LAB")
	private String btexLab;

	@Column(name = "BTEX_XYLENE_Q")
	private Integer btexXyleneQ;

	@Column(name = "BTEX_TOLUENE")
	private Double btexToluene;

	@Column(name = "BTEX_METHOD")
	private Integer btexMethod;

	@Column(name = "BTEX_AUTHOR")
	private String btexAuthor;

	@Column(name = "SAMPLE_ID_VEND")
	private String btexSampleIdVend;

	@Column(name = "QC_USER")
	private String btexQcUser;

	@Column(name = "BTEX_METHOD", insertable = false, updatable = false)
	private Integer waterBtexMethod;

	@Column(name = "BTEX_LAB", insertable = false, updatable = false)
	private String waterBtexLab;

	@Column(name = "BTEX_BENZENE_Q")
	private Integer waterBtexBenzeneQ;

	@Column(name = "BTEX_TOTAL")
	private Double waterBtexTotal;

	@Column(name = "BTEX_BENZENE")
	private Double waterBtexBenzene;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "CREATED_USER")
	private String btexCreatedUser;

	@Column(name = "BTEX_XYLENE")
	private Double waterBtexXylene;

	@Column(name = "BTEX_TOTAL", insertable = false, updatable = false)
	private Double btexTotal;

	@Column(name = "BTEX_QC")
	private String btexQc;

	@Column(name = "BTEX_COMMENT", insertable = false, updatable = false)
	private String btexComment;

	@Column(name = "BTEX_AUTHOR", insertable = false, updatable = false)
	private String waterBtexAuthor;

	@Column(name = "REQUEST_ID_VEND")
	private String btexRequestIdVend;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "BTEX_XYLENE", insertable = false, updatable = false)
	private Double btexXylene;

	@Column(name = "BTEX_UNITS")
	private Integer btexUnits;

	@Column(name = "BTEX_TOLUENE", insertable = false, updatable = false)
	private Double waterBtexToluene;

	@Column(name = "SVC_CODE")
	private String btexSvcCode;

	@Column(name = "BTEX_UNITS", insertable = false, updatable = false)
	private Integer waterBtexUnits;

	@Column(name = "RUN_NUMBER")
	private String btexRunNumber;

	@Column(name = "BTEX_BENZENE_Q", insertable = false, updatable = false)
	private String btexBenzeneQ;

	@Column(name = "CREATED_DATE")
	private Date btexCreatedDate;

	@Column(name = "BTEX_ETHENE")
	private Double waterBtexEthene;

	@Column(name = "BTEX_DATE")
	private Date btexDate;

	@Column(name = "BTEX_QC", insertable = false, updatable = false)
	private String waterBtexQc;

	@Column(name = "BTEX_TOLUENE_Q")
	private String btexTolueneQ;

	@Column(name = "BTEX_XYLENE_Q", insertable = false, updatable = false)
	private Integer waterBtexXyleneQ;

	@Column(name = "BTEX_ETHENE", insertable = false, updatable = false)
	private Double btexEthene;

	@Column(name = "BTEX_DATE", insertable = false, updatable = false)
	private Date waterBtexDate;

	@Column(name = "UPDATED_DATE")
	private Date btexUpdatedDate;

	@Column(name = "BTEX_ETHENE_Q")
	private Integer btexEtheneQ;

	@Column(name = "BTEX_ETHENE_Q", insertable = false, updatable = false)
	private Integer waterBtexEtheneQ;

	@Column(name = "BTEX_BENZENE", insertable = false, updatable = false)
	private Double btexBenzene;

	@Column(name = "QC_DATE")
	private Date btexQcDate;

	@Column(name = "BTEX_TOLUENE_Q", insertable = false, updatable = false)
	private Integer waterBtexTolueneQ;

	@Transient
	private String btexMpxyleneQ;

	@Transient
	private String btexOxyleneQ;

	@Transient
	private Integer btexUnitsId;

	@Transient
	private Integer btexConfTypeId;

	@Transient
	private Integer btexMethodId;

	@Transient
	private String btexEthylbenzeneQ;

	@Transient
	private Integer btexRecordTypeId;

	@Transient
	private Integer btexPk;

	@Transient
	private Date btexAcqDate;

	@Transient
	private Double btexEthylbenzene;

	@Transient
	private Double btexMpxylene;

	@Transient
	private Double btexOxylene;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_BTEX;
	}
}
