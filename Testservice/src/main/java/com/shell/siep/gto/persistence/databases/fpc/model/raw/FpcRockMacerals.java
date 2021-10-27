package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTORockMacerals;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ROCK_MACERALS", schema="gfs")
public class FpcRockMacerals extends FpcDatabaseObject implements GTORockMacerals, Serializable {

	@Column(name = "SAMPLE_ID_VEND")
	private String macSampleIdVend;

	@Column(name = "MAC_QC")
	private String macQc;

	@Column(name = "LIPT_CUTIN")
	private Integer macLiptCutin;

	@Column(name = "LIPT_SPORINITE_MEGA")
	private Integer macLiptSporiniteMega;

	@Column(name = "INERT_SCLER")
	private Integer macInertScler;

	@Column(name = "VIT_2_DESMOCOL_DETR")
	private Integer macVit2DesmocolDetr;

	@Column(name = "IQM_CODE")
	private String macIqmCode;

	@Column(name = "MINERAL_PYR_AGG_CRYST")
	private Integer macMineralPyrAggCryst;

	@Column(name = "LIPT_SUBER")
	private Integer macLiptSuber;

	@Column(name = "JOB_ID")
	private String macJobId;

	@Column(name = "MAC_METHOD")
	private String macMethod;

	@Column(name = "BLOCK")
	private String macBlock;

	@Column(name = "SVC_CODE")
	private String macSvcCode;

	@Column(name = "INERT_FUSIN")
	private Integer macInertFusin;

	@Column(name = "MAC_LAB")
	private String macLab;

	@Column(name = "LIPT_ALG_OTHR")
	private Integer macLiptAlgOthr;

	@Column(name = "LIPT_ALG_TASM")
	private Integer macLiptAlgTasm;

	@Column(name = "INERTINITE")
	private Integer macInert;

	@Column(name = "LIPT_LIPTO")
	private Integer macLiptLipto;

	@Column(name = "VIT_2_DESMOCOL_LAYERS")
	private Integer macVit2DesmocolLayers;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "QC_DATE")
	private Date macQcDate;

	@Column(name = "LIPT_ALG_BOTR")
	private Integer macLiptAlgBotr;

	@Column(name = "SOM_LB_LAYERS")
	private Integer macSomLbLayers;

	@Column(name = "VIT_1_TELOCOL_DETR")
	private Integer macVit1TelocolDetr;

	@Column(name = "LIPT_ALG_MICR_PLANC")
	private Integer macLiptAlgMicrPlanc;

	@Column(name = "MAC_STANDARD_COMM")
	private String macStandardComm;

	@Column(name = "SOM_LB_DENS")
	private Integer macSomLbDens;

	@Column(name = "QC_USER")
	private String macQcUser;

	@Column(name = "MAC_AUTHOR")
	private String macAuthor;

	@Column(name = "AMORPH_UNSPEC_FL")
	private Double macAmorphUnspecFl;

	@Column(name = "MAC_DATE")
	private Date macAcqDate;

	@Column(name = "MAC_COMMENT")
	private String macComment;

	@Column(name = "MAC_COMMENT2")
	private String macComment2;

	@Column(name = "LIPT_SPORINITE_MICRO")
	private Integer macLiptSporiniteMicro;

	@Column(name = "VIT_1_TELIN_DETR")
	private Integer macVit1TelinDetr;

	@Column(name = "VITRINITE")
	private Integer macVit;

	@Column(name = "LIPT_EXSUDAT_FL")
	private Integer macLiptExsudatFl;

	@Column(name = "MINERAL_PYR_FRAM")
	private Integer macMineralPyrFram;

	@Column(name = "SR_TYPE")
	private String macSrType;

	@Column(name = "LIPT_RESIN")
	private Integer macLiptResin;

	@Column(name = "SEMIQUAN")
	private String macSemiquan;

	@Column(name = "AMORPH_UNSPEC")
	private Double macAmorphUnspec;

	@Column(name = "VIT_1_TELOCOL_LAYERS")
	private Integer macVit1TelocolLayers;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MAC_SOM_UNSPEC")
	private Integer macSomUnspec;

	@Column(name = "RUN_NUMBER")
	private String macRunNumber;

	@Column(name = "SOM_NLB_DIFF")
	private Integer macSomNlbDiff;

	@Column(name = "MAC_DATE", insertable = false, updatable = false)
	private Date macDate;

	@Column(name = "MINERAL_UNDEF")
	private Integer macMineralUndef;

	@Column(name = "LIPTINITE")
	private Integer macLipt;

	@Column(name = "VIT_1_TELIN_LAYERS")
	private Integer macVit1TelinLayers;

	@Column(name = "LIPT_EXSUDAT_NON_FL")
	private Integer macLiptExsudatNonFl;

	@Column(name = "SOM_LB_LENS")
	private Integer macSomLbLens;

	@Column(name = "INERT_MICRIN")
	private Integer macInertMicrin;


	@Override
	public String getName() {
		 return AnalysisConstants.ROCK_MACERALS;
	}
}
