package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOPistonCore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_PISTON_CORE")
public class DDPistonCore extends DDDatabaseObject implements GTOPistonCore, Serializable {

	@Column(name = "HG_13C_CO2")
	private Double hg13cCo2;

	@Column(name = "GC_UCM_G_N_C2")
	private Integer gcUcmGNC2;

	@Column(name = "AG_13C_NEO_PENT")
	private Double ag13cNeoPent;

	@Column(name = "HG_13C_PROPENE")
	private Double hg13cPropene;

	@Column(name = "AG_13C_N_PENTANE")
	private Double ag13cNPentane;

	@Column(name = "TSF_MAX_INT")
	private Integer tsfMaxInt;

	@Column(name = "HG_13C_N_BUTANE")
	private Double hg13cNButane;

	@Column(name = "LAST_UPDATE")
	private Date pcLastUpdate;

	@Column(name = "HG_13C_METHANE")
	private Double hg13cMethane;

	@Column(name = "SVC_CODE")
	private String pcSvcCode;

	@Column(name = "QC_FLAG")
	private String pcQcFlag;

	@Column(name = "AG_CO2")
	private Double agCo2;

	@Column(name = "HG_13C_BUTENES")
	private Double hg13cButenes;

	@Column(name = "HG_13C_NEO_PENT")
	private Double hg13cNeoPent;

	@Column(name = "AG_13C_N_BUTANE")
	private Double ag13cNButane;

	@Column(name = "JOB_ID")
	private String pcJobId;

	@Column(name = "HG_RMUD_HS")
	private Double hgRmudHs;

	@Column(name = "HG_DMUD")
	private Double hgDmud;

	@Column(name = "AG_13C_PROPENE")
	private Double ag13cPropene;

	@Column(name = "HG_13C_ETHANE")
	private Double hg13cEthane;

	@Column(name = "GC_PRISTANE")
	private Double gcPristane;

	@Column(name = "HG_CO2")
	private Double hgCo2;

	@Column(name = "AG_METHANE")
	private Double agMethane;

	@Column(name = "HG_ETHENE")
	private Double hgEthene;

	@Column(name = "AG_I_BUTANE")
	private Double agIButane;

	@Column(name = "HG_13C_I_BUTANE")
	private Double hg13cIButane;

	@Column(name = "IQM_CODE")
	private String pcIqmCode;

	@Column(name = "AG_NEO_PENT")
	private Double agNeoPent;

	@Column(name = "AG_13C_BUTENES")
	private Double ag13cButenes;

	@Column(name = "HG_N_PENTANE")
	private Double hgNPentane;

	@Column(name = "TSF_MAX_EX")
	private Integer tsfMaxEx;

	@Column(name = "GC_UCM_L_C23")
	private Integer gcUcmLC23;

	@Column(name = "TSF_MAX_EM")
	private Integer tsfMaxEm;

	@Column(name = "AG_N_BUTANE")
	private Double agNButane;

	@Column(name = "HG_13C_N_PENTANE")
	private Double hg13cNPentane;

	@Column(name = "HG_NEO_PENT")
	private Double hgNeoPent;

	@Column(name = "AG_13C_ETHANE")
	private Double ag13cEthane;

	@Column(name = "AG_13C_PROPANE")
	private Double ag13cPropane;

	@Column(name = "AG_N_PENTANE")
	private Double agNPentane;

	@Column(name = "HG_ETHANE")
	private Double hgEthane;

	@Column(name = "AG_PROPANE")
	private Double agPropane;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "HG_METHANE")
	private Double hgMethane;

	@Column(name = "TSF_R1")
	private Double tsfR1;

	@Column(name = "HG_13C_ETHENE")
	private Double hg13cEthene;

	@Column(name = "AG_I_PENTANE")
	private Double agIPentane;

	@Column(name = "HG_PROPENE")
	private Double hgPropene;

	@Column(name = "HG_BUTENES")
	private Double hgButenes;

	@Column(name = "RUN_NUMBER")
	private String pcRunNumber;

	@Column(name = "AG_ETHENE")
	private Double agEthene;

	@Column(name = "AG_13C_CO2")
	private Double ag13cCo2;

	@Column(name = "GC_UCM_TOTAL")
	private Integer gcUcmTotal;

	@Column(name = "HG_I_PENTANE")
	private Double hgIPentane;

	@Column(name = "HG_I_BUTANE")
	private Double hgIButane;

	@Column(name = "AG_13C_ETHENE")
	private Double ag13cEthene;

	@Column(name = "TSF_DATAFILE")
	private String tsfDatafile;

	@Column(name = "AG_PROPENE")
	private Double agPropene;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "AG_13C_METHANE")
	private Double ag13cMethane;

	@Column(name = "AG_BUTENES")
	private Double agButenes;

	@Column(name = "HG_N_BUTANE")
	private Double hgNButane;

	@Column(name = "AG_13C_I_BUTANE")
	private Double ag13cIButane;

	@Column(name = "AG_13C_I_PENTANE")
	private Double ag13cIPentane;

	@Column(name = "QC_DATE")
	private Date pcQcDate;

	@Column(name = "HG_PROPANE")
	private Double hgPropane;

	@Column(name = "HG_13C_PROPANE")
	private Double hg13cPropane;

	@Column(name = "HG_13C_I_PENTANE")
	private Double hg13cIPentane;

	@Column(name = "QC_USER")
	private String pcQcUser;

	@Column(name = "GC_N_C30")
	private Double gcNC30;

	@Column(name = "GC_N_C31")
	private Double gcNC31;

	@Column(name = "GC_N_C32")
	private Double gcNC32;

	@Column(name = "GC_N_C33")
	private Double gcNC33;

	@Column(name = "GC_N_C34")
	private Double gcNC34;

	@Column(name = "GC_N_C35")
	private Double gcNC35;

	@Column(name = "GC_N_C36")
	private Double gcNC36;

	@Column(name = "AG_ETHANE")
	private Double agEthane;

	@Column(name = "GC_N_C37")
	private Double gcNC37;

	@Column(name = "GC_N_C38")
	private Double gcNC38;

	@Column(name = "GC_N_C39")
	private Double gcNC39;

	@Column(name = "GC_N_C40")
	private Double gcNC40;

	@Column(name = "GC_N_C10")
	private Double gcNC10;

	@Column(name = "GC_N_C11")
	private Double gcNC11;

	@Column(name = "GC_N_C12")
	private Double gcNC12;

	@Column(name = "GC_N_C13")
	private Double gcNC13;

	@Column(name = "GC_N_C14")
	private Double gcNC14;

	@Column(name = "GC_N_C15")
	private Double gcNC15;

	@Column(name = "GC_N_C16")
	private Double gcNC16;

	@Column(name = "GC_N_C17")
	private Double gcNC17;

	@Column(name = "GC_N_C18")
	private Double gcNC18;

	@Column(name = "GC_N_C19")
	private Double gcNC19;

	@Column(name = "GC_N_C20")
	private Double gcNC20;

	@Column(name = "GC_N_C21")
	private Double gcNC21;

	@Column(name = "GC_N_C22")
	private Double gcNC22;

	@Column(name = "GC_N_C23")
	private Double gcNC23;

	@Column(name = "GC_N_C24")
	private Double gcNC24;

	@Column(name = "GC_N_C25")
	private Double gcNC25;

	@Column(name = "GC_N_C26")
	private Double gcNC26;

	@Column(name = "GC_N_C27")
	private Double gcNC27;

	@Column(name = "GC_N_C28")
	private Double gcNC28;

	@Column(name = "GC_N_C29")
	private Double gcNC29;

	@Column(name = "GC_PHYTANE")
	private Double gcPhytane;


	@Override
	public String getName() {
		 return AnalysisConstants.PISTON_CORE;
	}
}
