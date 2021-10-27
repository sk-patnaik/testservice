package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTORockMaceralsV2;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ROCK_MACERALS_V2")
public class DDRockMaceralsV2 extends DDDatabaseObject implements GTORockMaceralsV2, Serializable {

	@Column(name = "MAC_LIPT_CUTIN_L")
	private Integer vkaLiptOthCutin;

	@Column(name = "MAC_MIN_PYRITE_FRAM")
	private Integer vkaMinPyriteFram;

	@Column(name = "MAC_ORG_TYPE")
	private String vkaOrgType;

	@Column(name = "MAC_BLOCK_NR")
	private String vkaBlockNr;

	@Column(name = "MAC_INERT")
	private Integer vkaInert;

	@Column(name = "MAC_VIT_TELO")
	private Integer vkaVitTelo;

	@Column(name = "RUN_NUMBER")
	private String vkaRunNumber;

	@Column(name = "UPDATED_DATE")
	private Date vkaUpdatedDate;

	@Column(name = "MAC_ISO_SHC_SOLIDBIT_FL_HIGH")
	private Integer vkaPybIsoFlHigh;

	@Column(name = "MAC_VIT_1_TELIN_LAYERS")
	private Integer vkaVitTeloTeli;

	@Column(name = "MAC_SOM_FLUORAMORPH")
	private Integer vkaLiptAmFl;

	@Column(name = "MAC_ISO_SHC_SOLIDBIT_FL_MED")
	private Integer vkaPybIsoFlMed;

	@Column(name = "MAC_AUTHOR")
	private String vkaAuthor;

	@Column(name = "MAC_VIT_CORPOGEL")
	private Integer vkaVitGeloCor;

	@Column(name = "MAC_FILE")
	private String vkaFile;

	@Column(name = "MAC_VIT_DETRO")
	private Integer vkaVitDetro;

	@Column(name = "IQM_CODE")
	private String vkaIqmCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MAC_ZOOCLAST_FORAM")
	private Integer vkaZooclastForam;

	@Column(name = "MAC_INERT_FUSIN")
	private Integer vkaInertFusin;

	@Column(name = "MAC_ISO_SHC_SOLIDBIT_FL_LOW")
	private Integer vkaPybIsoFlLow;

	@Column(name = "MAC_SOM_LB_FLUORAMORPH")
	private Integer vkaLiptAmFlLb;

	@Column(name = "MAC_LIPT_ALG_LAMALGINITE")
	private Integer vkaLiptAlgLamalg;

	@Column(name = "FK_METHOD_ID")
	private Integer fkMethodId;

	@Column(name = "MAC_TOTAL")
	private Integer vkaTotal;

	@Column(name = "MAC_INERT_SEMIFUSIN")
	private Integer vkaInertSemifusin;

	@Column(name = "MAC_LIPT_LIPTODET_L")
	private Integer vkaLiptOthLipto;

	@Column(name = "MAC_ANS_SHC_DOMAIN_FLOW")
	private Integer vkaPybAnsLDomain;

	@Column(name = "MAC_LIPT_RESIN_L")
	private Integer vkaLiptOthResin;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "MAC_DATE")
	private Date vkaDate;

	@Column(name = "MAC_LIPT_ALG_T_DINOFLAG")
	private Integer vkaLiptAlgTUDinoflag;

	@Column(name = "MAC_SOM_HERB_DENS")
	private Integer vkaLiptAmHebLbDens;

	@Column(name = "MAC_HC_INCLUSIONS")
	private Integer vkaHcIncl;

	@Column(name = "MAC_SOM_HERB_DIFFUSE")
	private Integer vkaLiptAmHebDiffuse;

	@Column(name = "MAC_LIPT_SPORINITE")
	private Integer vkaLiptSpor;

	@Column(name = "MAC_VIT")
	private Integer vkaVit;

	@Column(name = "MAC_LIPT_ALG")
	private Integer vkaLiptAlg;

	@Column(name = "MAC_VIT_1_TELIN_DETR")
	private Integer vkaVitDetroVitro;

	@Column(name = "SAMPLE_ID_VEND")
	private String vkaSampleIdVend;

	@Column(name = "MAC_HC_INCLUSIONS_Y")
	private Integer vkaHcInclY;

	@Column(name = "MAC_LIPT_ALG_TELALGINITE")
	private Integer vkaLiptAlgT;

	@Column(name = "MAC_ANS_SHC_DOMAIN")
	private Integer vkaPybAnsDomain;

	@Column(name = "MAC_LIPT_EXU")
	private Integer vkaLiptOthExu;

	@Column(name = "MAC_VIT_1_TELOCOL_LAYERS")
	private Integer vkaVitTeloCol;

	@Column(name = "MAC_VIT_GEL")
	private Integer vkaVitGeloGel;

	@Column(name = "FK_DATATYPE_ID")
	private Integer fkDatatypeId;

	@Column(name = "MAC_SOM_LB_LENS")
	private Integer vkaLiptAmFlLbLens;

	@Column(name = "MAC_LIPT_SPOR_L_MICROSPOR")
	private Integer vkaLiptSporMicrospor;

	@Column(name = "MAC_LIPT_ALG_LAMALG_FILA")
	private Integer vkaLiptAlgLamalgFila;

	@Column(name = "MAC_ISO_SHC_SOLIDBIT_NF_LOW")
	private Integer vkaPybIsoNfLow;

	@Column(name = "MAC_INERT_MACRINITE")
	private Integer vkaInertMacrinite;

	@Column(name = "MAC_ZOOCLAST_SCOLECODONT")
	private Integer vkaZooclastScolecodont;

	@Column(name = "MAC_HC_INCLUSIONS_O")
	private Integer vkaHcInclOr;

	@Column(name = "MAC_LIPT_OTHER")
	private Integer vkaLiptOth;

	@Column(name = "MAC_LIPT_ALG_T_MICRO")
	private Integer vkaLiptAlgTUMicro;

	@Column(name = "MAC_HC_INCLUSIONS_GR")
	private Integer vkaHcInclGr;

	@Column(name = "MAC_HC_INCLUSIONS_B")
	private Integer vkaHcInclBl;

	@Column(name = "FK_LAB_ID")
	private String vkaLab;

	@Column(name = "QC_DATE")
	private Date vkaQcDate;

	@Column(name = "MAC_ISO_SHC_SOLIDBIT_NF_NIGH")
	private Integer vkaPybIsoNfHigh;

	@Column(name = "MAC_INERT_INERTODET")
	private Integer vkaInertInertodet;

	@Column(name = "MAC_ZOOCLAST_CHITIN")
	private Integer vkaZooclastChitin;

	@Column(name = "MAC_MIN_PYRITE_AGGR_CRYSTAL")
	private Integer vkaMinPyriteAggrCrystal;

	@Column(name = "MAC_ISO_SHC_SOLIDBIT_NF_MED")
	private Integer vkaPybIsoNfMed;

	@Column(name = "MAC_SOM_LB_DENSE")
	private Integer vkaLiptAmFlLbDense;

	@Column(name = "MAC_MIN_SULP")
	private Integer vkaMinSulp;

	@Column(name = "MAC_PYRITE")
	private Integer vkaPyrite;

	@Column(name = "QC_USER")
	private String vkaQcUser;

	@Column(name = "SEMIQUAN")
	private String vkaSemiquan;

	@Column(name = "MAC_LIPT_ALG_T_GLOEO")
	private Integer vkaLiptAlgTCGloeo;

	@Column(name = "MAC_LIPT_ALG_T_PEDIASTRUM")
	private Integer vkaLiptAlgTCPediastrum;

	@Column(name = "MAC_INERT_MICRIN")
	private Integer vkaInertMicrin;

	@Column(name = "MAC_SOM_HERB_LAYERS")
	private Integer vkaLiptAmHebLbLayers;

	@Column(name = "MAC_LIPT_SPOR_L_CRASSISPOR")
	private Integer vkaLiptSporCrassispor;

	@Column(name = "MAC_SOM_AMORPH")
	private Integer vkaLiptAm;

	@Column(name = "MAC_LIPT_ALG_T_LEIOSPHAER")
	private Integer vkaLiptAlgTULeiosphaer;

	@Column(name = "MAC_COMMENT")
	private String vkaComment;

	@Column(name = "MAC_LIPT_ALG_T_UNICEL")
	private Integer vkaLiptAlgTU;

	@Column(name = "MAC_LIPT_ALG_T_COC_COL")
	private Integer vkaLiptAlgTC;

	@Column(name = "MAC_LIPT_ALG_T_TASMANITES")
	private Integer vkaLiptAlgTUTasmanites;

	@Column(name = "MAC_HC_INCLUSIONS_W_Y")
	private Integer vkaHcInclWY;

	@Column(name = "CREATED_USER")
	private String vkaCreatedUser;

	@Column(name = "CREATED_DATE")
	private Date vkaCreatedDate;

	@Column(name = "MAC_SOM_HERB_LB")
	private Integer vkaLiptAmHebLb;

	@Column(name = "MAC_ZOOCLAST_COLLOGRAPTO")
	private Integer vkaZooclastCollograpto;

	@Column(name = "MAC_LIPT_ALG_T_ACRITARCH")
	private Integer vkaLiptAlgTUAcritarch;

	@Column(name = "SVC_CODE")
	private String vkaSvcCode;

	@Column(name = "JOB_ID")
	private String vkaJobId;

	@Column(name = "MAC_ANS_SHC_COKE_M")
	private Integer vkaPybAnsM;

	@Column(name = "MAC_ANS_SHC_COKE_F")
	private Integer vkaPybAnsF;

	@Column(name = "MAC_ANS_SHC_COKE_C")
	private Integer vkaPybAnsC;

	@Column(name = "MAC_INERT_FUNGI")
	private Integer vkaInertFungi;

	@Column(name = "MAC_MIN_NON_SULPH")
	private Integer vkaMinNonSulph;

	@Column(name = "MAC_ISO_SHC_SOLIDBIT_NF")
	private Integer vkaPybIsoNf;

	@Column(name = "MAC_ZOOCLAST_TELOGRAPTO")
	private Integer vkaZooclastTelograpto;

	@Column(name = "MAC_ISO_SHC_SOLIDBIT_FL")
	private Integer vkaPybIsoFl;

	@Column(name = "MAC_INERT_GRAPTI_RECYCLED")
	private Integer vkaInertGraphRecycl;

	@Column(name = "MAC_SOM_HERB_LENS")
	private Integer vkaLiptAmHebLbLens;

	@Column(name = "MAC_ZOOCLAST_GRAPTOLITE")
	private Integer vkaZooclastGraptolite;

	@Column(name = "PK")
	private Integer vkaPk;

	@Column(name = "MAC_LIPT_SUBER_L")
	private Integer vkaLiptOthSuber;

	@Column(name = "MAC_LIPT_SPOR_L_TENUISPOR")
	private Integer vkaLiptSporTenuispor;

	@Column(name = "MAC_ANS_SHC_COKE_F_A")
	private Integer vkaPybAnsCFlow;

	@Column(name = "MAC_LIPT_ALG_T_PILA")
	private Integer vkaLiptAlgTCPila;

	@Column(name = "MAC_SOM_HERB")
	private Integer vkaLiptAmHeb;

	@Column(name = "MAC_LIPT_ALG_T_REINSCHIA")
	private Integer vkaLiptAlgTCReinschia;

	@Column(name = "MAC_LIPT_SPOR_L_MACROSPOR")
	private Integer vkaLiptSporMacrospor;

	@Column(name = "FK_CONF_TYPE_ID")
	private Integer vkaConfTypeId;

	@Column(name = "MAC_LIPT_CHLOROPHYL_L")
	private Integer vkaLiptOthChlor;

	@Column(name = "UPDATED_USER")
	private String vkaUpdatedUser;

	@Column(name = "MAC_ANS_SHC_COKE_VF")
	private Integer vkaPybAnsVf;

	@Column(name = "MAC_VIT_1_TELOCOL_DETR")
	private Integer vkaVitDetroCollo;

	@Column(name = "MAC_ANS_SHC_COKE")
	private Integer vkaPybAns;

	@Column(name = "MAC_DOM_QUANTITY")
	private String vkaDomQuantity;

	@Column(name = "MAC_LIPT_ALG_T_BOTR")
	private Integer vkaLiptAlgTCBotr;

	@Column(name = "MAC_SOM_LB_LAYERS")
	private Integer vkaLiptAmFlLbLayers;

	@Column(name = "MAC_VIT_GELO")
	private Integer vkaVitGelo;

	@Column(name = "MAC_SOM_LB_DIFFUSE")
	private Integer vkaLiptAmDiffuse;


	@Override
	public String getName() {
		return AnalysisConstants.ROCK_MACERALS_V2;
	}
}
