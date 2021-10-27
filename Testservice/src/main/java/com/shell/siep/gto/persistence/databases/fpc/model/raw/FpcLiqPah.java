package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqPah;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_PAH", schema="gfs")
public class FpcLiqPah extends FpcDatabaseObject implements GTOLiqPah, Serializable {

	@Column(name = "PAH_ANTHRACENE_Q")
	private String pahAnthraceneQ;

	@Column(name = "QC_USER")
	private String pahQcUser;

	@Column(name = "FK_METHOD_ID")
	private Integer pahMethodId;

	@Column(name = "PAH_CHRYSENE")
	private Double pahChrysene;

	@Column(name = "UPDATED_USER")
	private String pahUpdatedUser;

	@Column(name = "PAH_ANTHRACENE")
	private Double pahAnthracene;

	@Column(name = "PAH_INDEO_Q")
	private String pahIndeoQ;

	@Column(name = "QC_DATE")
	private Date pahQcDate;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "RUN_NUMBER")
	private Integer pahRunNumber;

	@Column(name = "PAH_BENZ_A_Q")
	private String pahBenzAQ;

	@Column(name = "UPDATED_DATE")
	private Date pahUpdatedDate;

	@Column(name = "SVC_CODE")
	private String pahSvcCode;

	@Column(name = "FK_LAB_ID")
	private Integer pahLab;

	@Column(name = "PAH_FLUORENE")
	private Double pahFluorene;

	@Column(name = "PAH_FLUORENE_Q")
	private String pahFluoreneQ;

	@Column(name = "PAH_BENZO_K")
	private Double pahBenzoK;

	@Column(name = "PAH_BENZO_B")
	private Double pahBenzoB;

	@Column(name = "PAH_BENZO_A")
	private Double pahBenzoA;

	@Column(name = "PAH_CHRYSENE_Q")
	private String pahChryseneQ;

	@Column(name = "PAH_BENZO_GHL")
	private Double pahBenzoGhl;

	@Column(name = "PAH_DATE")
	private Date pahAcqDate;

	@Column(name = "REQUEST_ID_VEND")
	private String pahRequestIdVend;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer pahRecordTypeId;

	@Column(name = "PAH_BENZO_A_Q")
	private String pahBenzoAQ;

	@Column(name = "CREATED_DATE")
	private Date pahCreatedDate;

	@Column(name = "PAH_BENZO_GHL_Q")
	private String pahBenzoGhlQ;

	@Column(name = "PAH_ACENAPHTHYLENE_Q")
	private String pahAcenaphthyleneQ;

	@Column(name = "SAMPLE_ID_VEND")
	private String pahSampleIdVend;

	@Column(name = "PAH_ACENAPHTHENE_Q")
	private String pahAcenaphtheneQ;

	@Column(name = "PK")
	private Integer pahPk;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "PAH_COMMENT")
	private String pahComment;

	@Column(name = "PAH_BENZO_B_Q")
	private String pahBenzoBQ;

	@Column(name = "PAH_FLORANTHENE")
	private Double pahFloranthene;

	@Column(name = "PAH_ACENAPHTHYLENE")
	private Double pahAcenaphthylene;

	@Column(name = "FK_UNITS_ID")
	private Integer pahUnitsId;

	@Column(name = "CREATED_USER")
	private String pahCreatedUser;

	@Column(name = "PAH_FLORANTHENE_Q")
	private String pahFlorantheneQ;

	@Column(name = "PAH_INDEO")
	private Double pahIndeo;

	@Column(name = "PAH_BENZ_A")
	private Double pahBenzA;

	@Column(name = "IQM_CODE")
	private String pahIqmCode;

	@Column(name = "PAH_DIBENZ_Q")
	private String pahDibenzQ;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer pahConfTypeId;

	@Column(name = "PAH_PYRENE_Q")
	private String pahPyreneQ;

	@Column(name = "PAH_PYRENE")
	private Double pahPyrene;

	@Column(name = "PAH_ACENAPHTHENE")
	private Double pahAcenaphthene;

	@Column(name = "PAH_DIBENZ")
	private Double pahDibenz;

	@Column(name = "PAH_BENZO_K_Q")
	private String pahBenzoKQ;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_PAH;
	}
}
