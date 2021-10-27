package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
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
@Table(name="FPC_LIQ_BTEX", schema="gfs")
public class FpcLiqBtex extends FpcDatabaseObject implements GTOLiqBtex, Serializable {

	@Column(name = "QC_USER")
	private String btexQcUser;

	@Column(name = "BTEX_MPXYLENE_Q")
	private String btexMpxyleneQ;

	@Column(name = "CREATED_USER")
	private String btexCreatedUser;

	@Column(name = "BTEX_COMMENT")
	private String btexComment;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "RUN_NUMBER")
	private String btexRunNumber;

	@Column(name = "CREATED_DATE")
	private Date btexCreatedDate;

	@Column(name = "BTEX_OXYLENE_Q")
	private String btexOxyleneQ;

	@Column(name = "FK_UNITS_ID")
	private Integer btexUnitsId;

	@Column(name = "BTEX_BENZENE")
	private Double btexBenzene;

	@Column(name = "QC_DATE")
	private Date btexQcDate;

	@Column(name = "FK_LAB_ID")
	private String btexLab;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer btexConfTypeId;

	@Column(name = "BTEX_TOLUENE")
	private Double btexToluene;

	@Column(name = "BTEX_AUTHOR")
	private String btexAuthor;

	@Column(name = "FK_METHOD_ID")
	private Integer btexMethodId;

	@Column(name = "BTEX_ETHYLBENZENE_Q")
	private String btexEthylbenzeneQ;

	@Column(name = "BTEX_TOLUENE_Q")
	private String btexTolueneQ;

	@Column(name = "UPDATED_DATE")
	private Date btexUpdatedDate;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer btexRecordTypeId;

	@Column(name = "UPDATED_USER")
	private String btexUpdatedUser;

	@Column(name = "SAMPLE_ID_VEND")
	private String btexSampleIdVend;

	@Column(name = "BTEX_TOTAL")
	private Double btexTotal;

	@Column(name = "REQUEST_ID_VEND")
	private String btexRequestIdVend;

	@Column(name = "PK")
	private Integer btexPk;

	@Column(name = "BTEX_DATE")
	private Date btexAcqDate;

	@Column(name = "BTEX_ETHYLBENZENE")
	private Double btexEthylbenzene;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "BTEX_MPXYLENE")
	private Double btexMpxylene;

	@Column(name = "SVC_CODE")
	private String btexSvcCode;

	@Column(name = "BTEX_BENZENE_Q")
	private String btexBenzeneQ;

	@Column(name = "BTEX_OXYLENE")
	private Double btexOxylene;

	@Transient
	private String waterBtexComment;

	@Transient
	private Integer btexXyleneQ;

	@Transient
	private Integer btexMethod;

	@Transient
	private Integer waterBtexMethod;

	@Transient
	private String waterBtexLab;

	@Transient
	private Integer waterBtexBenzeneQ;

	@Transient
	private Double waterBtexTotal;

	@Transient
	private Double waterBtexBenzene;

	@Transient
	private Double waterBtexXylene;

	@Transient
	private String btexQc;

	@Transient
	private String waterBtexAuthor;

	@Transient
	private Double btexXylene;

	@Transient
	private Integer btexUnits;

	@Transient
	private Double waterBtexToluene;

	@Transient
	private Integer waterBtexUnits;

	@Transient
	private Double waterBtexEthene;

	@Transient
	private Date btexDate;

	@Transient
	private String waterBtexQc;

	@Transient
	private Integer waterBtexXyleneQ;

	@Transient
	private Double btexEthene;

	@Transient
	private Date waterBtexDate;

	@Transient
	private Integer btexEtheneQ;

	@Transient
	private Integer waterBtexEtheneQ;

	@Transient
	private Integer waterBtexTolueneQ;


	@Override
	public String getName() {
		 return AnalysisConstants.PHYSICAL_PROPERTIES_BTEX;
	}
}
