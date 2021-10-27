package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOIsotopesOil;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ISOTOPES_OIL")
public class DDIsotopesOil extends DDDatabaseObject implements GTOIsotopesOil, Serializable {

	@Column(name = "DD_O_WHO")
	private Double ddOWho;

	@Column(name = "D_O_LAB")
	private String dOLab;

	@Column(name = "DS_O_NSO")
	private Double dsONso;

	@Column(name = "DN_O_WHO")
	private Double dnOWho;

	@Column(name = "DO_O_WHO")
	private Double doOWho;

	@Column(name = "DD_O_NPAR")
	private Double ddONpar;

	@Column(name = "DC_O_ISO")
	private Double dcOIso;

	@Column(name = "DD_O_TOP")
	private Double ddOTop;

	@Column(name = "RUN_NUMBER")
	private String dORunNumber;

	@Column(name = "DC_O_NPAR")
	private Double dcONpar;

	@Column(name = "DN_O_TOP")
	private Double dnOTop;

	@Column(name = "DS_O_SAT")
	private Double dsOSat;

	@Column(name = "D_O_DATE")
	private Date dOAcqDate;

	@Column(name = "D_O_COMMENT")
	private String dOComments;

	@Column(name = "DC_O_SAT")
	private Double dcOSat;

	@Column(name = "DS_O_ARO")
	private Double dsOAro;

	@Column(name = "DS_O_ASPH")
	private Double dsOAsph;

	@Column(name = "DC_O_WHO")
	private Double dcOWho;

	@Column(name = "DD_O_ISO")
	private Double ddOIso;

	@Column(name = "DS_O_TOP")
	private Double dsOTop;

	@Column(name = "DO_O_TOP")
	private Double doOTop;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "DD_O_NSO")
	private Double ddONso;

	@Column(name = "D_O_QC")
	private String dOQc;

	@Column(name = "DD_O_ASPH")
	private Double ddOAsph;

	@Column(name = "QC_DATE")
	private Date doQcDate;

	@Column(name = "DC_O_TOP")
	private Double dcOOil;

	@Column(name = "DC_O_TOP", insertable = false, updatable = false)
	private Double isoOil;

	@Column(name = "D_O_AUTHOR")
	private String dOAuthor;

	@Column(name = "DS_O_WHO")
	private Double dsOWho;

	@Column(name = "DN_O_NSO")
	private Double dnONso;

	@Column(name = "QC_USER")
	private String doQcUser;

	@Column(name = "DO_O_NSO")
	private Double doONso;

	@Column(name = "DC_O_ARO")
	private Double dcOAro;

	@Column(name = "DC_O_ARO", insertable = false, updatable = false)
	private Double isoAro;

	@Column(name = "DC_O_ASPH")
	private Double dcOAsph;

	@Column(name = "LAST_UPDATE")
	private Date dOLastUpdate;

	@Column(name = "D_O_DATA_TYPE")
	private String dODataType;

	@Column(name = "DO_O_ASPH")
	private Double doOAsph;

	@Column(name = "DD_O_SAT")
	private Double ddOSat;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "DD_O_ARO")
	private Double ddOAro;

	@Column(name = "DN_O_ASPH")
	private Double dnOAsph;

	@Column(name = "DC_O_SAT", insertable = false, updatable = false)
	private Double isoSat;

	@Column(name = "SAMPLE_ID_VEND")
	private String dOSampleIdVend;

	@Column(name = "D_O_METHOD")
	private String dOMethod;

	@Column(name = "DC_O_NSO")
	private Double dcONso;

	@Column(name = "JOB_ID")
	private String dOJobId;

	@Column(name = "SVC_CODE")
	private String dOSvcCode;

	@Column(name = "IQM_CODE")
	private String doIqmCode;


	@Override
	public String getName() {
		return AnalysisConstants.ISOTOPES_OIL_FRACTIONS;
	}
}
