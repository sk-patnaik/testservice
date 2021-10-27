package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOSimdis;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_SIMDIS")
public class DDSimdis extends DDDatabaseObject implements GTOSimdis, Serializable {

	@Column(name = "SIMDIS_90_T")
	private Double simdis90T;

	@Column(name = "SIMDIS_68_T")
	private Double simdis68T;

	@Column(name = "SIMDIS_LAB")
	private String simdisLab;

	@Column(name = "SIMDIS_55_T")
	private Double simdis55T;

	@Column(name = "SIMDIS_42_T")
	private Double simdis42T;

	@Column(name = "SVC_CODE")
	private String simdisSvcCode;

	@Column(name = "SIMDIS_91_T")
	private Double simdis91T;

	@Column(name = "SIMDIS_69_T")
	private Double simdis69T;

	@Column(name = "SIMDIS_56_T")
	private Double simdis56T;

	@Column(name = "SIMDIS_43_T")
	private Double simdis43T;

	@Column(name = "SIMDIS_30_T")
	private Double simdis30T;

	@Column(name = "SIMDIS_92_T")
	private Double simdis92T;

	@Column(name = "SIMDIS_79_T")
	private Double simdis79T;

	@Column(name = "SIMDIS_66_T")
	private Double simdis66T;

	@Column(name = "SIMDIS_53_T")
	private Double simdis53T;

	@Column(name = "SIMDIS_40_T")
	private Double simdis40T;

	@Column(name = "SIMDIS_8_T")
	private Double simdis8T;

	@Column(name = "SIMDIS_18_T")
	private Double simdis18T;

	@Column(name = "SIMDIS_67_T")
	private Double simdis67T;

	@Column(name = "SIMDIS_9_T")
	private Double simdis9T;

	@Column(name = "SIMDIS_54_T")
	private Double simdis54T;

	@Column(name = "SIMDIS_41_T")
	private Double simdis41T;

	@Column(name = "SIMDIS_CONF")
	private Double simdisConf;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SIMDIS_DATE")
	private Date simdisDate;

	@Column(name = "SIMDIS_19_T")
	private Double simdis19T;

	@Column(name = "SIMDIS_SPL_WT")
	private Double simdisSplWt;

	@Column(name = "SIMDIS_QC")
	private String simdisQc;

	@Column(name = "SIMDIS_59_T")
	private Double simdis59T;

	@Column(name = "SIMDIS_46_T")
	private Double simdis46T;

	@Column(name = "SIMDIS_33_T")
	private Double simdis33T;

	@Column(name = "SIMDIS_20_T")
	private Double simdis20T;

	@Column(name = "LAST_UPDATE")
	private Date simdisLastUpdate;

	@Column(name = "SIMDIS_95_T")
	private Double simdis95T;

	@Column(name = "SIMDIS_82_T")
	private Double simdis82T;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SIMDIS_47_T")
	private Double simdis47T;

	@Column(name = "SIMDIS_COMMENT")
	private String simdisComment;

	@Column(name = "SIMDIS_34_T")
	private Double simdis34T;

	@Column(name = "SIMDIS_21_T")
	private Double simdis21T;

	@Column(name = "SIMDIS_96_T")
	private Double simdis96T;

	@Column(name = "SIMDIS_83_T")
	private Double simdis83T;

	@Column(name = "SIMDIS_70_T")
	private Double simdis70T;

	@Column(name = "SIMDIS_57_T")
	private Double simdis57T;

	@Column(name = "SIMDIS_44_T")
	private Double simdis44T;

	@Column(name = "SIMDIS_METHOD")
	private String simdisMethod;

	@Column(name = "SIMDIS_31_T")
	private Double simdis31T;

	@Column(name = "SAMPLE_ID_VEND")
	private String simdisSampleIdVend;

	@Column(name = "IQM_CODE")
	private String simdisIqmCode;

	@Column(name = "SIMDIS_93_T")
	private Double simdis93T;

	@Column(name = "SIMDIS_80_T")
	private Double simdis80T;

	@Column(name = "SIMDIS_58_T")
	private Double simdis58T;

	@Column(name = "SIMDIS_45_T")
	private Double simdis45T;

	@Column(name = "SIMDIS_32_T")
	private Double simdis32T;

	@Column(name = "JOB_ID")
	private String simdisJobId;

	@Column(name = "SIMDIS_94_T")
	private Double simdis94T;

	@Column(name = "SIMDIS_81_T")
	private Double simdis81T;

	@Column(name = "SIMDIS_37_T")
	private Double simdis37T;

	@Column(name = "SIMDIS_24_T")
	private Double simdis24T;

	@Column(name = "SIMDIS_11_T")
	private Double simdis11T;

	@Column(name = "SIMDIS_99_T")
	private Double simdis99T;

	@Column(name = "SIMDIS_86_T")
	private Double simdis86T;

	@Column(name = "SIMDIS_73_T")
	private Double simdis73T;

	@Column(name = "SIMDIS_60_T")
	private Double simdis60T;

	@Column(name = "SIMDIS_2_T")
	private Double simdis2T;

	@Column(name = "SIMDIS_38_T")
	private Double simdis38T;

	@Column(name = "SIMDIS_25_T")
	private Double simdis25T;

	@Column(name = "SIMDIS_12_T")
	private Double simdis12T;

	@Column(name = "SIMDIS_87_T")
	private Double simdis87T;

	@Column(name = "SIMDIS_74_T")
	private Double simdis74T;

	@Column(name = "SIMDIS_61_T")
	private Double simdis61T;

	@Column(name = "SIMDIS_AUTHOR")
	private String simdisAuthor;

	@Column(name = "SIMDIS_39_T")
	private Double simdis39T;

	@Column(name = "SIMDIS_3_T")
	private Double simdis3T;

	@Column(name = "SIMDIS_REC")
	private Double simdisRec;

	@Column(name = "SIMDIS_48_T")
	private Double simdis48T;

	@Column(name = "SIMDIS_35_T")
	private Double simdis35T;

	@Column(name = "SIMDIS_22_T")
	private Double simdis22T;

	@Column(name = "SIMDIS_97_T")
	private Double simdis97T;

	@Column(name = "SIMDIS_84_T")
	private Double simdis84T;

	@Column(name = "SIMDIS_71_T")
	private Double simdis71T;

	@Column(name = "SIMDIS_49_T")
	private Double simdis49T;

	@Column(name = "SIMDIS_36_T")
	private Double simdis36T;

	@Column(name = "SIMDIS_23_T")
	private Double simdis23T;

	@Column(name = "SIMDIS_10_T")
	private Double simdis10T;

	@Column(name = "SIMDIS_98_T")
	private Double simdis98T;

	@Column(name = "RUN_NUMBER")
	private String simdisRunNumber;

	@Column(name = "SIMDIS_85_T")
	private Double simdis85T;

	@Column(name = "SIMDIS_72_T")
	private Double simdis72T;

	@Column(name = "SIMDIS_1_T")
	private Double simdis1T;

	@Column(name = "SIMDIS_77_T")
	private Double simdis77T;

	@Column(name = "SIMDIS_64_T")
	private Double simdis64T;

	@Column(name = "SIMDIS_6_T")
	private Double simdis6T;

	@Column(name = "SIMDIS_51_T")
	private Double simdis51T;

	@Column(name = "QC_USER")
	private String simdisQcUser;

	@Column(name = "SIMDIS_29_T")
	private Double simdis29T;

	@Column(name = "SIMDIS_16_T")
	private Double simdis16T;

	@Column(name = "SIMDIS_DATE", insertable = false, updatable = false)
	private Date simdisAcqDate;

	@Column(name = "SIMDIS_78_T")
	private Double simdis78T;

	@Column(name = "SIMDIS_100_T")
	private Double simdis100T;

	@Column(name = "SIMDIS_65_T")
	private Double simdis65T;

	@Column(name = "SIMDIS_52_T")
	private Double simdis52T;

	@Column(name = "SIMDIS_7_T")
	private Double simdis7T;

	@Column(name = "SIMDIS_17_T")
	private Double simdis17T;

	@Column(name = "SIMDIS_26_T")
	private Double simdis26T;

	@Column(name = "SIMDIS_13_T")
	private Double simdis13T;

	@Column(name = "SIMDIS_88_T")
	private Double simdis88T;

	@Column(name = "SIMDIS_75_T")
	private Double simdis75T;

	@Column(name = "SIMDIS_62_T")
	private Double simdis62T;

	@Column(name = "SIMDIS_4_T")
	private Double simdis4T;

	@Column(name = "SIMDIS_27_T")
	private Double simdis27T;

	@Column(name = "SIMDIS_14_T")
	private Double simdis14T;

	@Column(name = "SIMDIS_89_T")
	private Double simdis89T;

	@Column(name = "SIMDIS_76_T")
	private Double simdis76T;

	@Column(name = "SIMDIS_63_T")
	private Double simdis63T;

	@Column(name = "SIMDIS_5_T")
	private Double simdis5T;

	@Column(name = "QC_DATE")
	private Date simdisQcDate;

	@Column(name = "SIMDIS_50_T")
	private Double simdis50T;

	@Column(name = "SIMDIS_28_T")
	private Double simdis28T;

	@Column(name = "SIMDIS_15_T")
	private Double simdis15T;

	@Override
	public String getName() {
		return AnalysisConstants.GC_SIMDIS;
	}

}
