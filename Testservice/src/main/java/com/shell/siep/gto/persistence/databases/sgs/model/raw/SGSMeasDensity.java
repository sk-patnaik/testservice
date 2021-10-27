package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilDens;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_DENSITY", schema="sgs_data")
public class SGSMeasDensity extends SGSDatabaseObject implements GTOOilDens, Serializable {

	@Column(name = "DENS_METHOD")
	private String densMethod;

	@Column(name = "DENS_TEMP")
	private Double densTemp;

	@Column(name = "JOB_ID")
	private String densJobId;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "DENS_API")
	private Double densApi;

	@Column(name = "DENS_LAB")
	private String densLab;

	@Column(name = "DENS_QC")
	private String densQc;

	@Column(name = "DENS_UNITS")
	private String densUnits;

	@Column(name = "DENS_DENSITY")
	private Double densDensity;

	@Column(name = "QC_DATE")
	private Date densQcDate;

	@Column(name = "DENS_LABREF_PAGE")
	private String densLabrefPage;

	@Column(name = "DENS_TEMP_UNITS")
	private String densTempUnits;

	@Column(name = "DENS_SP_GR")
	private Double densSpGr;

	@Column(name = "UPDATED_DATE")
	private Date densLastUpdate;

	@Column(name = "SVC_CODE")
	private String densSvcCode;

	@Column(name = "RUN_NUMBER")
	private String densRunNumber;

	@Column(name = "SAMPLE_ID_VEND")
	private String densSampleIdVend;

	@Column(name = "QC_USER")
	private String densQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "DENS_DENSITY", insertable = false, updatable = false)
	private Double densValue;

	@Column(name = "DENS_AUTHOR")
	private String densAuthor;

	@Column(name = "DENS_LABREF")
	private String densLabref;

	@Column(name = "DENS_CONF")
	private Double densConf;

	@Column(name = "DENS_DATE")
	private Date densAcqDate;

	@Column(name = "DENS_COMMENT")
	private String densComments;

	@Column(name = "REQUEST_ID_VEND")
	private String densRequestIdVend;

	@Transient
	private String cntMethod;

	@Transient
	private String cntValueQualifier;

	@Transient
	private String cntRunNumber;

	@Transient
	private String cntRequest;

	@Transient
	private Date cntLastUpdate;

	@Transient
	private String cntComments;

	@Transient
	private String cntJobId;

	@Transient
	private Date cntQcDate;

	@Transient
	private String cntName;

	@Transient
	private Date cntAcqDate;

	@Transient
	private String cntSvcCode;

	@Transient
	private String cntSampleId;

	@Transient
	private String cntIqmCode;

	@Transient
	private String cntQcUser;

	@Transient
	private String cntSampleIdVend;

	@Transient
	private String cntQc;

	@Transient
	private String cntAuthor;

	@Transient
	private Double cntPct;

	@Transient
	private String cntLab;

	@Transient
	private Double cpValue;

	@Transient
	private String mpUnits;

	@Transient
	private Double v;

	@Transient
	private String pcOwner;

	@Transient
	private Double pcGor;

	@Transient
	private Double waxValue;

	@Transient
	private String pcLab;

	@Transient
	private String ppUnits;

	@Transient
	private String waxValueQ;

	@Transient
	private Double ni;

	@Transient
	private Double sulfValue;

	@Transient
	private String cpMethod;

	@Transient
	private Double mpValue;

	@Transient
	private String cpUnits;

	@Transient
	private Double visc60;

	@Transient
	private String densApiQ;

	@Transient
	private String niQ;

	@Transient
	private Double ppValue;

	@Transient
	private Integer pcSampleIdVend;

	@Transient
	private String pcSampleId;

	@Transient
	private Double volatiles;

	@Transient
	private String ppMethod;

	@Transient
	private Double visc20;

	@Transient
	private Double visc25;

	@Transient
	private String mpMethod;

	@Transient
	private Double visc30;

	@Transient
	private Double visc40;

	@Transient
	private Double h2oValue;

	@Transient
	private String vQ;

	@Transient
	private String sulfValueQ;

	@Transient
	private Double pcResTemp;

	@Transient
	private String h2oValueQ;

	@Transient
	private Double hg13cCo2;

	@Transient
	private Integer gcUcmGNC2;

	@Transient
	private Double ag13cNeoPent;

	@Transient
	private Double hg13cPropene;

	@Transient
	private Double ag13cNPentane;

	@Transient
	private Integer tsfMaxInt;

	@Transient
	private Double hg13cNButane;

	@Transient
	private Date pcLastUpdate;

	@Transient
	private Double hg13cMethane;

	@Transient
	private String pcSvcCode;

	@Transient
	private String pcQcFlag;

	@Transient
	private Double agCo2;

	@Transient
	private Double hg13cButenes;

	@Transient
	private Double hg13cNeoPent;

	@Transient
	private Double ag13cNButane;

	@Transient
	private String pcJobId;

	@Transient
	private Double hgRmudHs;

	@Transient
	private Double hgDmud;

	@Transient
	private Double ag13cPropene;

	@Transient
	private Double hg13cEthane;

	@Transient
	private Double gcPristane;

	@Transient
	private Double hgCo2;

	@Transient
	private Double agMethane;

	@Transient
	private Double hgEthene;

	@Transient
	private Double agIButane;

	@Transient
	private Double hg13cIButane;

	@Transient
	private String pcIqmCode;

	@Transient
	private Double agNeoPent;

	@Transient
	private Double ag13cButenes;

	@Transient
	private Double hgNPentane;

	@Transient
	private Integer tsfMaxEx;

	@Transient
	private Integer gcUcmLC23;

	@Transient
	private Integer tsfMaxEm;

	@Transient
	private Double agNButane;

	@Transient
	private Double hg13cNPentane;

	@Transient
	private Double hgNeoPent;

	@Transient
	private Double ag13cEthane;

	@Transient
	private Double ag13cPropane;

	@Transient
	private Double agNPentane;

	@Transient
	private Double hgEthane;

	@Transient
	private Double agPropane;

	@Transient
	private String pcRequestId;

	@Transient
	private Double hgMethane;

	@Transient
	private Double tsfR1;

	@Transient
	private Double hg13cEthene;

	@Transient
	private Double agIPentane;

	@Transient
	private Double hgPropene;

	@Transient
	private Double hgButenes;

	@Transient
	private String pcRunNumber;

	@Transient
	private Double agEthene;

	@Transient
	private Double ag13cCo2;

	@Transient
	private Integer gcUcmTotal;

	@Transient
	private Double hgIPentane;

	@Transient
	private Double hgIButane;

	@Transient
	private Double ag13cEthene;

	@Transient
	private String tsfDatafile;

	@Transient
	private Double agPropene;

	@Transient
	private Double ag13cMethane;

	@Transient
	private Double agButenes;

	@Transient
	private Double hgNButane;

	@Transient
	private Double ag13cIButane;

	@Transient
	private Double ag13cIPentane;

	@Transient
	private Date pcQcDate;

	@Transient
	private Double hgPropane;

	@Transient
	private Double hg13cPropane;

	@Transient
	private Double hg13cIPentane;

	@Transient
	private String pcQcUser;

	@Transient
	private Double gcNC30;

	@Transient
	private Double gcNC31;

	@Transient
	private Double gcNC32;

	@Transient
	private Double gcNC33;

	@Transient
	private Double gcNC34;

	@Transient
	private Double gcNC35;

	@Transient
	private Double gcNC36;

	@Transient
	private Double agEthane;

	@Transient
	private Double gcNC37;

	@Transient
	private Double gcNC38;

	@Transient
	private Double gcNC39;

	@Transient
	private Double gcNC40;

	@Transient
	private Double gcNC10;

	@Transient
	private Double gcNC11;

	@Transient
	private Double gcNC12;

	@Transient
	private Double gcNC13;

	@Transient
	private Double gcNC14;

	@Transient
	private Double gcNC15;

	@Transient
	private Double gcNC16;

	@Transient
	private Double gcNC17;

	@Transient
	private Double gcNC18;

	@Transient
	private Double gcNC19;

	@Transient
	private Double gcNC20;

	@Transient
	private Double gcNC21;

	@Transient
	private Double gcNC22;

	@Transient
	private Double gcNC23;

	@Transient
	private Double gcNC24;

	@Transient
	private Double gcNC25;

	@Transient
	private Double gcNC26;

	@Transient
	private Double gcNC27;

	@Transient
	private Double gcNC28;

	@Transient
	private Double gcNC29;

	@Transient
	private Double gcPhytane;

	@Transient
	private Integer h2oUnits;

	@Transient
	private Date h2oQcDate;

	@Transient
	private Double h2oConf;

	@Transient
	private String h2oLab;

	@Transient
	private String h2oRequest;

	@Transient
	private String h2oComments;

	@Transient
	private Double h2oBswEmulsion;

	@Transient
	private Double h2oBswSolids;

	@Transient
	private String h2oSampleIdVend;

	@Transient
	private String h2oQc;

	@Transient
	private String h2oSampleId;

	@Transient
	private String h2oAuthor;

	@Transient
	private String h2oMethod;

	@Transient
	private Date h2oAcqDate;

	@Transient
	private String h2oSvcCode;

	@Transient
	private String h2oQcUser;

	@Transient
	private String h2oJobId;

	@Transient
	private String h2oQ;

	@Transient
	private String h2oRunNumber;

	@Transient
	private String h2oRequestIdVend;

	@Transient
	private Date h2oLastUpdate;

	@Transient
	private String nivSampleIdVend;

	@Transient
	private String nivQcUser;

	@Transient
	private Double niniv;

	@Transient
	private String nivLab;

	@Transient
	private Double niConf;

	@Transient
	private String niQc;

	@Transient
	private Date nivAcqDate;

	@Transient
	private String nivJobId;

	@Transient
	private String nivSampleId;

	@Transient
	private String nivAuthor;

	@Transient
	private String nivComments;

	@Transient
	private String nivRequest;

	@Transient
	private String vQc;

	@Transient
	private String nivMethod;

	@Transient
	private Double va;

	@Transient
	private String nivRequestIdVend;

	@Transient
	private String nivRunNumber;

	@Transient
	private Date nivLastUpdate;

	@Transient
	private String nivSvcCode;

	@Transient
	private Double vConf;

	@Transient
	private Date nivQcDate;

	@Transient
	private Double niv;

	@Transient
	private String cntUpdatedUser;

	@Transient
	private String cntRequestIdVendor;

	@Transient
	private String densValueQualifier;

	@Transient
	private String densIqmCode;

	@Transient
	private Double api;

	@Override
	public String getName() {
		return AnalysisConstants.PHYSICAL_PROPERTIES_DENSITY;
	}
}
