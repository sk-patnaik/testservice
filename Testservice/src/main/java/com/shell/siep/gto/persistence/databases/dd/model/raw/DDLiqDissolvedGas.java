package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOLiqDissolvedGas;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_LIQ_DISSOLVED_GAS")
public class DDLiqDissolvedGas extends DDDatabaseObject implements GTOLiqDissolvedGas, Serializable {

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "DGAS_COMMENT")
	private String dgComment;

	@Column(name = "DGAS_DATE")
	private Date dgAcqDate;

	@Column(name = "QC_USER")
	private String dgQcUser;

	@Column(name = "SAMPLE_ID_VEND")
	private String dgSampleIdVend;

	@Column(name = "QC_DATE")
	private Date dgQcDate;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "UPDATED_USER")
	private String dgUpdatedUser;

	@Column(name = "CREATED_USER")
	private String dgCreatedUser;

	@Column(name = "REQUEST_ID_VEND")
	private String dgRequestIdVend;

	@Column(name = "FK_LAB_ID")
	private Integer dgLab;

	@Column(name = "UPDATED_DATE")
	private Date dgUpdatedDate;

	@Column(name = "FK_DGAS_H2S_METHOD_ID")
	private Integer dgH2sMethodId;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer dgConfTypeId;

	@Column(name = "CREATED_DATE")
	private Date dgCreatedDate;

	@Column(name = "FK_DGAS_CO2_METHOD_ID")
	private Integer dgCo2MethodId;

	@Column(name = "FK_RECORD_TYPE_ID")
	private Integer dgRecordTypeId;

	@Column(name = "DGAS_H2S")
	private Double dgH2s;

	@Column(name = "FK_DGAS_H2S_UNITS_ID")
	private Integer dgH2sUnitsId;

	@Column(name = "SVC_CODE")
	private String dgSvcCode;

	@Column(name = "PK")
	private Integer dgPk;

	@Column(name = "FK_DGAS_CO2_UNITS_ID")
	private Integer dgCo2UnitsId;

	@Column(name = "RUN_NUMBER")
	private String dgRunNumber;

	@Column(name = "DGAS_CO2")
	private Double dgCo2;

	@Column(name = "DGAS_CO2_Q")
	private String dgCo2Q;

	@Column(name = "DGAS_H2S_Q")
	private String dgH2sQ;


	@Override
	public String getName() {
		 return AnalysisConstants.WATER_ANALYSIS_DISSOLVED_GASES;
	}
}
