package com.shell.siep.gto.persistence.databases.bg.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.bg.model.BGDatabaseObject;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOIsotopesOil;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ISOTOPES_OIL")
public class BGIsotopesOil extends BGDatabaseObject implements GTOIsotopesOil, Serializable {

	@Column(name = "DD_O_WHO")
	private Double ddOWho;

	@Column(name = "DD_O_SAT")
	private Double ddOSat;

	@Column(name = "DD_O_NSO")
	private Double ddONso;

	@Column(name = "DS_O_SAT")
	private Double dsOSat;

	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "DD_O_ARO")
	private Double ddOAro;

	@Column(name = "D_O_DATE")
	private Date dOAcqDate;

	@Column(name = "D_O_QC")
	private String dOQc;

	@Column(name = "DN_O_ASPH")
	private Double dnOAsph;

	@Column(name = "DD_O_ASPH")
	private Double ddOAsph;

	@Column(name = "QC_DATE")
	private Date doQcDate;

	@Column(name = "D_O_COMMENT")
	private String dOComments;

	@Column(name = "DC_O_TOP")
	private Double dcOOil;

	@Column(name = "DC_O_TOP", insertable = false, updatable = false)
	private Double isoOil;

	@Column(name = "D_O_AUTHOR")
	private String dOAuthor;

	@Column(name = "D_O_LAB")
	private String dOLab;

	@Column(name = "DS_O_NSO")
	private Double dsONso;

	@Column(name = "DC_O_SAT")
	private Double dcOSat;

	@Column(name = "DS_O_WHO")
	private Double dsOWho;

	@Column(name = "DN_O_WHO")
	private Double dnOWho;

	@Column(name = "DC_O_SAT", insertable = false, updatable = false)
	private Double isoSat;

	@Column(name = "DO_O_WHO")
	private Double doOWho;

	@Column(name = "DS_O_ARO")
	private Double dsOAro;

	@Column(name = "DD_O_NPAR")
	private Double ddONpar;

	@Column(name = "DN_O_NSO")
	private Double dnONso;

	@Column(name = "QC_USER")
	private String doQcUser;

	@Column(name = "DO_O_NSO")
	private Double doONso;

	@Column(name = "SAMPLE_ID_VEND")
	private String dOSampleIdVend;

	@Column(name = "DC_O_ARO")
	private Double dcOAro;

	@Column(name = "D_O_METHOD")
	private String dOMethod;

	@Column(name = "DS_O_ASPH")
	private Double dsOAsph;

	@Column(name = "DC_O_ARO", insertable = false, updatable = false)
	private Double isoAro;

	@Column(name = "DC_O_ASPH")
	private Double dcOAsph;

	@Column(name = "DC_O_WHO")
	private Double dcOWho;

	@Column(name = "DC_O_NSO")
	private Double dcONso;

	@Column(name = "DC_O_ISO")
	private Double dcOIso;

	@Column(name = "JOB_ID")
	private String dOJobId;

	@Column(name = "DD_O_TOP")
	private Double ddOTop;

	@Column(name = "LAST_UPDATE")
	private Date dOLastUpdate;

	@Column(name = "RUN_NUMBER")
	private String dORunNumber;

	@Column(name = "DD_O_ISO")
	private Double ddOIso;

	@Column(name = "DS_O_TOP")
	private Double dsOTop;

	@Column(name = "DC_O_NPAR")
	private Double dcONpar;

	@Column(name = "DN_O_TOP")
	private Double dnOTop;

	@Column(name = "DO_O_TOP")
	private Double doOTop;

	@Column(name = "SVC_CODE")
	private String dOSvcCode;

	@Column(name = "D_O_DATA_TYPE")
	private String dODataType;

	@Column(name = "IQM_CODE")
	private String doIqmCode;

	@Column(name = "DO_O_ASPH")
	private Double doOAsph;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Override
	public String getName() {
		return AnalysisConstants.ISOTOPES_OIL_FRACTIONS;
	}
}
