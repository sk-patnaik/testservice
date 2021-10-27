package com.shell.siep.gto.persistence.databases.sgs.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.sgs.model.SGSDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOOilNiv;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="WTC_MEAS_NIV", schema="sgs_data")
public class SGSMeasNiv extends SGSDatabaseObject implements GTOOilNiv, Serializable {

	@Column(name = "SAMPLE_ID_VEND")
	private String nivSampleIdVend;

	@Column(name = "V_VALUE")
	private Double v;

	@Column(name = "QC_USER")
	private String nivQcUser;

	@Column(name = "NINIV")
	private Double niniv;

	@Column(name = "NIV_LAB")
	private String nivLab;

	@Column(name = "NI_Q")
	private String niQ;

	@Column(name = "NI_CONF")
	private Double niConf;

	@Column(name = "NI_QC")
	private String niQc;

	@Column(name = "NIV_DATE")
	private Date nivAcqDate;

	@Column(name = "JOB_ID")
	private String nivJobId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "NIV_AUTHOR")
	private String nivAuthor;

	@Column(name = "NIV_COMMENT")
	private String nivComments;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "V_QC")
	private String vQc;

	@Column(name = "NIV_METHOD")
	private String nivMethod;

	@Column(name = "NI_VALUE")
	private Double ni;

	@Column(name = "V_VALUE", insertable = false, updatable = false)
	private Double va;

	@Column(name = "REQUEST_ID_VEND")
	private String nivRequestIdVend;

	@Column(name = "RUN_NUMBER")
	private String nivRunNumber;

	@Column(name = "UPDATED_DATE")
	private Date nivLastUpdate;

	@Column(name = "SVC_CODE")
	private String nivSvcCode;

	@Column(name = "V_CONF")
	private Double vConf;

	@Column(name = "QC_DATE")
	private Date nivQcDate;

	@Column(name = "NIV")
	private Double niv;

	@Column(name = "V_Q")
	private String vQ;

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
	private Double ppValue;

	@Transient
	private Integer pcSampleIdVend;

	@Transient
	private String pcSampleId;

	@Transient
	private Double volatiles;

	@Transient
	private Double densApi;

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
	private String sulfValueQ;

	@Transient
	private String densComments;

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
	private String densMethod;

	@Transient
	private Double densTemp;

	@Transient
	private String densJobId;

	@Transient
	private String densRequest;

	@Transient
	private String densLab;

	@Transient
	private String densQc;

	@Transient
	private String densUnits;

	@Transient
	private Double densDensity;

	@Transient
	private Date densQcDate;

	@Transient
	private String densLabrefPage;

	@Transient
	private String densTempUnits;

	@Transient
	private Double densSpGr;

	@Transient
	private Date densLastUpdate;

	@Transient
	private String densSvcCode;

	@Transient
	private String densRunNumber;

	@Transient
	private String densSampleIdVend;

	@Transient
	private String densQcUser;

	@Transient
	private String densSampleId;

	@Transient
	private Double densValue;

	@Transient
	private String densAuthor;

	@Transient
	private String densLabref;

	@Transient
	private Double densConf;

	@Transient
	private Date densAcqDate;

	@Transient
	private String densRequestIdVend;

	@Transient
	private String cntUpdatedUser;

	@Transient
	private String cntRequestIdVendor;

	@Transient
	private String nivQc;

	@Transient
	private String nivIqmCode;

	@Transient
	private String niValueQualifier;

	@Override
	public String getName() {
		return AnalysisConstants.ELEMENTAL_NICKEL_VANADIUM;
	}
}
