package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOIsotopesRock;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ISOTOPES_ROCK", schema="gfs")
public class FpcIsotopesRock extends FpcDatabaseObject implements GTOIsotopesRock, Serializable {

	@Column(name = "D_R_QC")
	private String dRQc;

	@Column(name = "DC_R_EXT")
	private Double dcRExt;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "DS_R_KERO")
	private Double dsRKero;

	@Column(name = "DS_R_AS")
	private Double dsRAs;

	@Column(name = "D_R_DATA_TYPE")
	private String dRDataType;

	@Column(name = "SVC_CODE")
	private String dRSvcCode;

	@Column(name = "D_R_METHOD")
	private String dRMethod;

	@Column(name = "DD_R_KERO")
	private Double ddRKero;

	@Column(name = "DS_R_SULF_SILVER")
	private Double dsRSulfSilver;

	@Column(name = "D_R_LAB")
	private String dRLab;

	@Column(name = "RUN_NUMBER")
	private String dRRunNumber;

	@Column(name = "DC_R_SAT")
	private Double dcRSat;

	@Column(name = "DC_R_SID")
	private Double dcRSid;

	@Column(name = "DC_R_ANK")
	private Double dcRAnk;

	@Column(name = "DC_R_ARO")
	private Double dcRAro;

	@Column(name = "DC_R_DECALC")
	private Double dcRDecalc;

	@Column(name = "DO_R_DOLOMITE")
	private Double doRDolomite;

	@Column(name = "DC_R_NP")
	private Double dcRNp;

	@Column(name = "D_R_DATE")
	private Date dRAcqDate;

	@Column(name = "DO_R_ANK")
	private Double doRAnk;

	@Column(name = "DC_R_CHI")
	private Double dcRChi;

	@Column(name = "DC_R_CHS")
	private Double dcRChs;

	@Column(name = "DS_R_SULF_ANH")
	private Double dsRSulfAnh;

	@Column(name = "DC_R_AS")
	private Double dcRAs;

	@Column(name = "DO_R_SID")
	private Double doRSid;

	@Column(name = "DC_R_IC")
	private Double dcRIc;

	@Column(name = "DC_R_NHC")
	private Double dcRNhc;

	@Column(name = "DC_R_NCC")
	private Double dcRNcc;

	@Column(name = "LAST_UPDATE")
	private Date dRLastUpdate;

	@Column(name = "QC_DATE")
	private Date dcQcDate;

	@Column(name = "D_R_COMMENT")
	private String dRComments;

	@Column(name = "DC_R_PYR")
	private Double dcRPyr;

	@Column(name = "DO_R_NCC")
	private Double doRNcc;

	@Column(name = "DS_R_H2S")
	private Double dsRH2s;

	@Column(name = "D_R_AUTHOR")
	private String dRAuthor;

	@Column(name = "DC_R_BITUMEN")
	private Double dcRBitumen;

	@Column(name = "DO_R_OID")
	private Double doROid;

	@Column(name = "DO_R_CALCITE")
	private Double doRCalcite;

	@Column(name = "DC_R_OID")
	private Double dcROid;

	@Column(name = "DC_R_CALCITE")
	private Double dcRCalcite;

	@Column(name = "DC_R_DOLOMITE")
	private Double dcRDolomite;

	@Column(name = "JOB_ID")
	private String dRJobId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "QC_USER")
	private String dcQcUser;

	@Column(name = "DN_R_N2")
	private Double dnRN2;

	@Column(name = "SAMPLE_ID_VEND")
	private String dRSampleIdVend;

	@Column(name = "DS_R_SULF_PYRITE")
	private Double dsRSulfPyrite;

	@Column(name = "DN_R_AS")
	private Double dnRAs;

	@Column(name = "DS_R_SULF_ORGANIC")
	private Double dsRSulfOrganic;

	@Column(name = "IQM_CODE")
	private String dcIqmCode;

	@Column(name = "DC_R_KER")
	private Double dcRKer;

	@Override
	public String getName() {
		return AnalysisConstants.ISOTOPES_ROCK;
	}
}
