package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOWaxDeposition;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_WAX_DEPOSITION", schema="sgs_data")
public class SGSWaxDeposition extends SGSDatabaseObject implements GTOWaxDeposition, Serializable {

	@Column(name = "DEP_FHT")
	private Double depFht;

	@Column(name = "UPDATED_DATE")
	private Date depUpdatedDate;

	@Column(name = "DEP_TOLUENEWAX")
	private Double depToluenewax;

	@Column(name = "DEP_CONF")
	private Double depConf;

	@Column(name = "DEP_ACRATE")
	private Double depAcrate;

	@Column(name = "CREATED_USER")
	private String depCreatedUser;

	@Column(name = "DEP_FDIAM")
	private Double depFdiam;

	@Column(name = "DEP_TOPPED")
	private Double depTopped;

	@Column(name = "DEP_WTEMP")
	private Double depWtemp;

	@Column(name = "DEP_RAT")
	private Double depRat;

	@Column(name = "DEP_SMP_TRTMT")
	private String depSmpTrtmt;

	@Column(name = "DEP_METHOD")
	private String depMethod;

	@Column(name = "QC_USER")
	private String depQcUser;

	@Column(name = "DEP_DATE")
	private Date depAcqDate;

	@Column(name = "DEP_COMMENTS")
	private String depComments;

	@Column(name = "DEP_TESTDUR")
	private Double depTestdur;

	@Column(name = "DEP_OTEMP")
	private Double depOtemp;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "DEP_CRATE")
	private Double depCrate;

	@Column(name = "DEP_LABREF")
	private String depLabref;

	@Column(name = "DEP_DAUGHTER")
	private String depDaughter;

	@Column(name = "QC_FLAG")
	private String depQcFlag;

	@Column(name = "DEP_AUTHOR")
	private String depAuthor;

	@Column(name = "DEP_LAB")
	private String depLab;

	@Column(name = "QC_DATE")
	private Date depQcDate;

	@Column(name = "SAMPLE_ID_VEND")
	private Integer depSampleIdVend;

	@Column(name = "DEP_OPID")
	private Integer depOpid;

	@Column(name = "DEP_LABREF_PAGE")
	private String depLabrefPage;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "DEP_OILVOL")
	private Double depOilvol;

	@Column(name = "RUN_NUMBER")
	private String depRunNumber;

	@Column(name = "DEP_TEMP_UNITS")
	private String depTempUnits;

	@Column(name = "UPDATED_USER")
	private String depUpdatedUser;

	@Column(name = "DEP_SOLIDB")
	private Double depSolidb;

	@Column(name = "SVC_CODE")
	private String depSvcCode;

	@Column(name = "CREATED_DATE")
	private Date depCreatedDate;

	@Column(name = "DEP_PROCESS_RUN")
	private String depProcessRun;

	@Column(name = "DEP_PTEMP")
	private Double depPtemp;

	@Column(name = "DEP_SRATE")
	private Double depSrate;

	@Column(name = "REQUEST_ID_VEND")
	private String depRequestIdVend;


	@Override
	public String getName() {
		 return AnalysisConstants.WAX_DEPOSITION;
	}
}
