package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTORockChemostrat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ROCK_CHEMOSTRAT")
public class DDRockChemostrat extends DDDatabaseObject implements GTORockChemostrat, Serializable {

	@Column(name = "CS_LITOLOGY")
	private String csLitology;

	@Column(name = "RUN_NUMBER")
	private String csRunNumber;

	@Column(name = "CS_DATE")
	private Date csAcqDate;

	@Column(name = "JOB_ID")
	private String csJobId;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "CS_MO")
	private Double csMo;

	@Column(name = "CS_ND")
	private Double csNd;

	@Column(name = "CS_NB")
	private Double csNb;

	@Column(name = "CS_NI")
	private Double csNi;

	@Column(name = "CS_LU")
	private Double csLu;

	@Column(name = "CS_LA")
	private Double csLa;

	@Column(name = "CS_IN")
	private Double csIn;

	@Column(name = "CS_GE")
	private Double csGe;

	@Column(name = "CS_GD")
	private Double csGd;

	@Column(name = "CS_GA")
	private Double csGa;

	@Column(name = "CS_HO")
	private Double csHo;

	@Column(name = "CS_HG")
	private Double csHg;

	@Column(name = "CS_HF")
	private Double csHf;

	@Column(name = "CS_EU")
	private Double csEu;

	@Column(name = "CS_ER")
	private Double csEr;

	@Column(name = "CS_DY")
	private Double csDy;

	@Column(name = "CS_CE")
	private Double csCe;

	@Column(name = "CS_CD")
	private Double csCd;

	@Column(name = "CS_CS")
	private Double csCs;

	@Column(name = "CS_CR")
	private Double csCr;

	@Column(name = "CS_CO")
	private Double csCo;

	@Column(name = "CS_CL")
	private Double csCl;

	@Column(name = "CS_CU")
	private Double csCu;

	@Column(name = "CS_AG")
	private Double csAg;

	@Column(name = "CS_BI")
	private Double csBi;

	@Column(name = "CS_BE")
	private Double csBe;

	@Column(name = "CS_BR")
	private Double csBr;

	@Column(name = "CS_AS")
	private Double csAs;

	@Column(name = "CS_BA")
	private Double csBa;

	@Column(name = "CS_NA2O")
	private Double csNa2o;

	@Column(name = "CS_COMMENTS")
	private String csComments;

	@Column(name = "LAST_UPDATE")
	private Date csLastUpdate;

	@Column(name = "QC_USER")
	private String csQcUser;

	@Column(name = "QC_DATE")
	private Date csQcDate;

	@Column(name = "CS_ZR")
	private Double csZr;

	@Column(name = "CS_ZN")
	private Double csZn;

	@Column(name = "CS_YB")
	private Double csYb;

	@Column(name = "CS_TB")
	private Double csTb;

	@Column(name = "CS_TA")
	private Double csTa;

	@Column(name = "CS_SE")
	private Double csSe;

	@Column(name = "CS_SR")
	private Double csSr;

	@Column(name = "CS_SN")
	private Double csSn;

	@Column(name = "CS_SM")
	private Double csSm;

	@Column(name = "CS_TL")
	private Double csTl;

	@Column(name = "CS_TH")
	private Double csTh;

	@Column(name = "CS_TE")
	private Double csTe;

	@Column(name = "CS_TM")
	private Double csTm;

	@Column(name = "CS_RB")
	private Double csRb;

	@Column(name = "CS_QC")
	private String csQc;

	@Column(name = "CS_SC")
	private Double csSc;

	@Column(name = "CS_SB")
	private Double csSb;

	@Column(name = "CS_PR")
	private Double csPr;

	@Column(name = "CS_PD")
	private Double csPd;

	@Column(name = "CS_PB")
	private Double csPb;

	@Column(name = "SAMPLE_ID_VEND")
	private String csSampleIdVend;

	@Column(name = "CS_FE2O3")
	private Double csFe2o3;

	@Column(name = "CS_AL2O3")
	private Double csAl2o3;

	@Column(name = "CS_MNO")
	private Double csMno;

	@Column(name = "CS_MGO")
	private Double csMgo;

	@Column(name = "CS_SIO2")
	private Double csSio2;

	@Column(name = "CS_K2O")
	private Double csK2o;

	@Column(name = "CS_TIO2")
	private Double csTio2;

	@Column(name = "IQM_CODE")
	private String csIqmCode;

	@Column(name = "CS_COLOR")
	private String csColor;

	@Column(name = "CS_P2O5")
	private Double csP2o5;

	@Column(name = "CS_CAO")
	private Double csCao;

	@Column(name = "CS_GRAINSIZE")
	private String csGrainsize;

	@Column(name = "CS_DATE", insertable = false, updatable = false)
	private Date csDate;

	@Column(name = "CS_SO3")
	private Double csSo3;

	@Column(name = "SVC_CODE")
	private String csSvcCode;

	@Column(name = "CS_I")
	private Double csI;

	@Column(name = "CS_Y")
	private Double csY;

	@Column(name = "CS_W")
	private Double csW;

	@Column(name = "CS_V")
	private Double csV;

	@Column(name = "CS_U")
	private Double csU;

	@Column(name = "CS_S")
	private Double csS;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "CS_METHOD")
	private String csMethod;


	@Override
	public String getName() {
		 return AnalysisConstants.ROCK_CHEMO;
	}
}
