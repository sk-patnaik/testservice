package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcGcMs;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_GC_MS")
public class DDGcGcMs extends DDDatabaseObject implements GTOGcGcMs, Serializable {

	@Column(name = "COMP127_AREA")
	private Double gcgcmsComp127Area;

	@Column(name = "COMP102_AREA")
	private Double gcgcmsComp102Area;

	@Column(name = "COMP093_PPM")
	private Double gcgcmsComp093Ppm;

	@Column(name = "COMP043_PPM")
	private Double gcgcms1EDiamPpm;

	@Column(name = "COMP087_PPM")
	private Double gcgcmsC3TetramPpm;

	@Column(name = "COMP058_PPM")
	private Double gcgcmsC624EdamPpm;

	@Column(name = "GCGCMS_LAB")
	private String gcgcmsLab;

	@Column(name = "COMP040_PPM")
	private Double gcgcms1224DmDiamPpm;

	@Column(name = "COMP133_PPM")
	private Double gcgcmsComp133Ppm;

	@Column(name = "COMP134_AREA")
	private Double gcgcmsComp134Area;

	@Column(name = "GCGCMS_DATA_TYPE")
	private String gcgcmsDataType;

	@Column(name = "COMP031_PPM")
	private Double gcgcmsMiscC5AdamPpm;

	@Column(name = "COMP106_PPM")
	private Double gcgcmsComp106Ppm;

	@Column(name = "COMP131_AREA")
	private Double gcgcmsComp131Area;

	@Column(name = "COMP080_PPM")
	private Double gcgcmsC5AdamPpm;

	@Column(name = "COMP010_AREA")
	private Double gcgcms2426DmAdam2;

	@Column(name = "COMP009_AREA")
	private Double gcgcms2426DmAdam1;

	@Column(name = "COMP065_AREA")
	private Double gcgcms59DmTriam;

	@Column(name = "COMP011_AREA")
	private Double gcgcms1EAdam;

	@Column(name = "COMP141_AREA")
	private Double gcgcmsComp141Area;

	@Column(name = "QC_USER")
	private String gcgcmsQcUser;

	@Column(name = "COMP047_PPM")
	private Double gcgcms349TmDiamPpm;

	@Column(name = "COMP020_PPM")
	private Double gcgcms1e3mAdamPpm;

	@Column(name = "COMP033_PPM")
	private Double gcgcmsC7AdamPpm;

	@Column(name = "COMP072_PPM")
	private Double gcgcmsTetram2Ppm;

	@Column(name = "COMP035_AREA")
	private Double gcgcmsDiam;

	@Column(name = "COMP079_PPM")
	private Double gcgcmsC4AdamPpm;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "COMP145_PPM")
	private Double gcgcmsComp145Ppm;

	@Column(name = "COMP020_AREA")
	private Double gcgcms1e3mAdam;

	@Column(name = "COMP037_AREA")
	private Double gcgcms1mDiam;

	@Column(name = "COMP124_PPM")
	private Double gcgcmsComp124Ppm;

	@Column(name = "COMP023_AREA")
	private Double gcgcms1357TmAdam;

	@Column(name = "GCGCMS_AUTHOR")
	private String gcgcmsAuthor;

	@Column(name = "COMP098_AREA")
	private Double gcgcmsComp098Area;

	@Column(name = "COMP115_PPM")
	private Double gcgcmsComp115Ppm;

	@Column(name = "COMP085_PPM")
	private Double gcgcmsC3TriamPpm;

	@Column(name = "COMP149_AREA")
	private Double gcgcmsComp149Area;

	@Column(name = "COMP083_PPM")
	private Double gcgcmsC1TriamPpm;

	@Column(name = "COMP079_AREA")
	private Double gcgcmsC4Adam;

	@Column(name = "COMP068_AREA")
	private Double gcgcms914DmTriam;

	@Column(name = "COMP005_PPM")
	private Double gcgcms13DmAdamPpm;

	@Column(name = "COMP052_PPM")
	private Double gcgcms24EdamPpm;

	@Column(name = "COMP068_PPM")
	private Double gcgcms914DmTriamPpm;

	@Column(name = "COMP019_AREA")
	private Double gcgcmsMiscTmAdam;

	@Column(name = "COMP018_PPM")
	private Double gcgcms123TmAdamPpm;

	@Column(name = "COMP090_AREA")
	private Double gcgcmsComp090Area;

	@Column(name = "COMP005_AREA")
	private Double gcgcms13DmAdam;

	@Column(name = "COMP076_PPM")
	private Double gcgcmsPtqAdamPpm;

	@Column(name = "COMP004_PPM")
	private Double gcgcms2mAdamPpm;

	@Column(name = "COMP081_AREA")
	private Double gcgcmsC2Diam;

	@Column(name = "COMP081_PPM")
	private Double gcgcmsC2DiamPpm;

	@Column(name = "COMP055_PPM")
	private Double gcgcmsC324EdamPpm;

	@Column(name = "COMP089_PPM")
	private Double gcgcmsComp089Ppm;

	@Column(name = "COMP109_PPM")
	private Double gcgcmsComp109Ppm;

	@Column(name = "COMP092_AREA")
	private Double gcgcmsComp092Area;

	@Column(name = "COMP114_AREA")
	private Double gcgcmsComp114Area;

	@Column(name = "COMP121_AREA")
	private Double gcgcmsComp121Area;

	@Column(name = "COMP108_AREA")
	private Double gcgcmsComp108Area;

	@Column(name = "COMP090_PPM")
	private Double gcgcmsComp090Ppm;

	@Column(name = "COMP115_AREA")
	private Double gcgcmsComp115Area;

	@Column(name = "COMP136_PPM")
	private Double gcgcmsComp136Ppm;

	@Column(name = "ISTD3_PPM")
	private Double gcgcmsIstd3Ppm;

	@Column(name = "COMP007_AREA")
	private Double gcgcmsTr14DmAdam;

	@Column(name = "COMP118_PPM")
	private Double gcgcmsComp118Ppm;

	@Column(name = "COMP061_AREA")
	private Double gcgcms5mTriam;

	@Column(name = "COMP147_AREA")
	private Double gcgcmsComp147Area;

	@Column(name = "COMP037_PPM")
	private Double gcgcms1mDiamPpm;

	@Column(name = "COMP064_AREA")
	private Double gcgcms915DmTriam;

	@Column(name = "COMP107_AREA")
	private Double gcgcmsComp107Area;

	@Column(name = "COMP069_PPM")
	private Double gcgcms5915TmTriamPpm;

	@Column(name = "COMP101_PPM")
	private Double gcgcmsComp101Ppm;

	@Column(name = "COMP098_PPM")
	private Double gcgcmsComp098Ppm;

	@Column(name = "COMP028_PPM")
	private Double gcgcmsMiscC4AdamPpm;

	@Column(name = "GCGCMS_COMMENT")
	private String gcgcmsComment;

	@Column(name = "COMP039_PPM")
	private Double gcgcms49DmDiamPpm;

	@Column(name = "COMP014_AREA")
	private Double gcgcms136TmAdam;

	@Column(name = "COMP009_PPM")
	private Double gcgcms2426DmAdam1Ppm;

	@Column(name = "COMP122_AREA")
	private Double gcgcmsComp122Area;

	@Column(name = "COMP110_PPM")
	private Double gcgcmsComp110Ppm;

	@Column(name = "COMP032_PPM")
	private Double gcgcmsC6AdamPpm;

	@Column(name = "COMP063_PPM")
	private Double gcgcms16mTriamPpm;

	@Column(name = "COMP142_PPM")
	private Double gcgcmsComp142Ppm;

	@Column(name = "COMP127_PPM")
	private Double gcgcmsComp127Ppm;

	@Column(name = "COMP044_AREA")
	private Double gcgcms2EDiam;

	@Column(name = "ISTD3_AREA")
	private Double gcgcmsIstd3Area;

	@Column(name = "COMP082_PPM")
	private Double gcgcmsC3DiamPpm;

	@Column(name = "COMP039_AREA")
	private Double gcgcms49DmDiam;

	@Column(name = "COMP015_PPM")
	private Double gcgcmsCis134TmAdamPpm;

	@Column(name = "ISTD1_AREA")
	private Double gcgcmsIstd1Area;

	@Column(name = "COMP089_AREA")
	private Double gcgcmsComp089Area;

	@Column(name = "COMP006_AREA")
	private Double gcgcmsCis14DmAdam;

	@Column(name = "COMP011_PPM")
	private Double gcgcms1EAdamPpm;

	@Column(name = "COMP030_AREA")
	private Double gcgcms12357PmAdam;

	@Column(name = "COMP091_PPM")
	private Double gcgcmsComp091Ppm;

	@Column(name = "COMP108_PPM")
	private Double gcgcmsComp108Ppm;

	@Column(name = "COMP032_AREA")
	private Double gcgcmsC6Adam;

	@Column(name = "COMP065_PPM")
	private Double gcgcms59DmTriamPpm;

	@Column(name = "COMP104_AREA")
	private Double gcgcmsComp104Area;

	@Column(name = "COMP147_PPM")
	private Double gcgcmsComp147Ppm;

	@Column(name = "COMP069_AREA")
	private Double gcgcms5915TmTriam;

	@Column(name = "COMP135_PPM")
	private Double gcgcmsComp135Ppm;

	@Column(name = "COMP042_PPM")
	private Double gcgcms34DmDiamPpm;

	@Column(name = "COMP093_AREA")
	private Double gcgcmsComp093Area;

	@Column(name = "COMP029_AREA")
	private Double gcgcms1e357TmAdam;

	@Column(name = "COMP059_PPM")
	private Double gcgcmsTriamPpm;

	@Column(name = "COMP049_PPM")
	private Double gcgcmsC4DiamPpm;

	@Column(name = "COMP076_AREA")
	private Double gcgcmsPtqAdam;

	@Column(name = "COMP043_AREA")
	private Double gcgcms1EDiam;

	@Column(name = "COMP002_AREA")
	private Double gcgcmsAdam;

	@Column(name = "COMP133_AREA")
	private Double gcgcmsComp133Area;

	@Column(name = "COMP150_AREA")
	private Double gcgcmsComp150Area;

	@Column(name = "COMP117_PPM")
	private Double gcgcmsComp117Ppm;

	@Column(name = "COMP010_PPM")
	private Double gcgcms2426DmAdam2Ppm;

	@Column(name = "COMP146_AREA")
	private Double gcgcmsComp146Area;

	@Column(name = "COMP003_AREA")
	private Double gcgcms1mAdam;

	@Column(name = "COMP100_PPM")
	private Double gcgcmsComp100Ppm;

	@Column(name = "COMP006_PPM")
	private Double gcgcmsCis14DmAdamPpm;

	@Column(name = "COMP027_PPM")
	private Double gcgcms1235TmAdamPpm;

	@Column(name = "COMP126_PPM")
	private Double gcgcmsComp126Ppm;

	@Column(name = "COMP036_AREA")
	private Double gcgcms4mDiam;

	@Column(name = "COMP004_AREA")
	private Double gcgcms2mAdam;

	@Column(name = "COMP046_PPM")
	private Double gcgcms149TmDiamPpm;

	@Column(name = "COMP049_AREA")
	private Double gcgcmsC4Diam;

	@Column(name = "COMP136_AREA")
	private Double gcgcmsComp136Area;

	@Column(name = "COMP099_PPM")
	private Double gcgcmsComp099Ppm;

	@Column(name = "COMP042_AREA")
	private Double gcgcms34DmDiam;

	@Column(name = "COMP048_PPM")
	private Double gcgcmsMiscC3DiamPpm;

	@Column(name = "COMP048_AREA")
	private Double gcgcmsMiscC3Diam;

	@Column(name = "COMP144_AREA")
	private Double gcgcmsComp144Area;

	@Column(name = "COMP026_AREA")
	private Double gcgcms1356TmAdam;

	@Column(name = "COMP121_PPM")
	private Double gcgcmsComp121Ppm;

	@Column(name = "COMP096_PPM")
	private Double gcgcmsComp096Ppm;

	@Column(name = "COMP112_AREA")
	private Double gcgcmsComp112Area;

	@Column(name = "COMP103_PPM")
	private Double gcgcmsComp103Ppm;

	@Column(name = "COMP130_PPM")
	private Double gcgcmsComp130Ppm;

	@Column(name = "COMP095_AREA")
	private Double gcgcmsComp095Area;

	@Column(name = "COMP117_AREA")
	private Double gcgcmsComp117Area;

	@Column(name = "COMP053_PPM")
	private Double gcgcmsC124EdamPpm;

	@Column(name = "COMP072_AREA")
	private Double gcgcmsTetram2;

	@Column(name = "COMP071_AREA")
	private Double gcgcmsTetram1;

	@Column(name = "COMP073_AREA")
	private Double gcgcmsTetram3;

	@Column(name = "COMP077_PPM")
	private Double gcgcmsC2AdamPpm;

	@Column(name = "COMP060_AREA")
	private Double gcgcms9mTriam;

	@Column(name = "COMP063_AREA")
	private Double gcgcms16mTriam;

	@Column(name = "COMP002_PPM")
	private Double gcgcmsAdamPpm;

	@Column(name = "COMP029_PPM")
	private Double gcgcms1e357TmAdamPpm;

	@Column(name = "COMP027_AREA")
	private Double gcgcms1235TmAdam;

	@Column(name = "COMP053_AREA")
	private Double gcgcmsC124Edam;

	@Column(name = "COMP144_PPM")
	private Double gcgcmsComp144Ppm;

	@Column(name = "COMP138_PPM")
	private Double gcgcmsComp138Ppm;

	@Column(name = "COMP078_AREA")
	private Double gcgcmsC3Adam;

	@Column(name = "COMP125_AREA")
	private Double gcgcmsComp125Area;

	@Column(name = "ISTD1_PPM")
	private Double gcgcmsIstd1Ppm;

	@Column(name = "COMP025_AREA")
	private Double gcgcms1e35DmAdam;

	@Column(name = "COMP073_PPM")
	private Double gcgcmsTetram3Ppm;

	@Column(name = "COMP031_AREA")
	private Double gcgcmsMiscC5Adam;

	@Column(name = "ISTD2_NAME")
	private String gcgcmsIstd2Name;

	@Column(name = "COMP058_AREA")
	private Double gcgcmsC624Edam;

	@Column(name = "COMP074_AREA")
	private Double gcgcmsC1Tetram;

	@Column(name = "COMP088_AREA")
	private Double gcgcmsC4Tetram;

	@Column(name = "COMP056_PPM")
	private Double gcgcmsC424EdamPpm;

	@Column(name = "IQM_CODE")
	private String gcgcmsIqmCode;

	@Column(name = "COMP084_AREA")
	private Double gcgcmsC2Triam;

	@Column(name = "COMP129_PPM")
	private Double gcgcmsComp129Ppm;

	@Column(name = "COMP084_PPM")
	private Double gcgcmsC2TriamPpm;

	@Column(name = "COMP013_PPM")
	private Double gcgcms135TmAdamPpm;

	@Column(name = "COMP112_PPM")
	private Double gcgcmsComp112Ppm;

	@Column(name = "COMP051_PPM")
	private Double gcgcmsC6DiamPpm;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "COMP120_PPM")
	private Double gcgcmsComp120Ppm;

	@Column(name = "COMP060_PPM")
	private Double gcgcms9mTriamPpm;

	@Column(name = "COMP034_AREA")
	private Double gcgcmsC8Adam;

	@Column(name = "COMP075_PPM")
	private Double gcgcmsC2TetramPpm;

	@Column(name = "GCGCMS_DATE")
	private Date gcgcmsDate;

	@Column(name = "COMP028_AREA")
	private Double gcgcmsMiscC4Adam;

	@Column(name = "COMP064_PPM")
	private Double gcgcms915DmTriamPpm;

	@Column(name = "COMP120_AREA")
	private Double gcgcmsComp120Area;

	@Column(name = "COMP145_AREA")
	private Double gcgcmsComp145Area;

	@Column(name = "COMP102_PPM")
	private Double gcgcmsComp102Ppm;

	@Column(name = "IS_EXTERNAL_STD")
	private String gcgcmsIsExternalStd;

	@Column(name = "SAMPLE_ID_VEND")
	private String gcgcmsSampleIdVend;

	@Column(name = "RUN_NUMBER")
	private String gcgcmsRunNumber;

	@Column(name = "COMP041_PPM")
	private Double gcgcms48DmDiamPpm;

	@Column(name = "COMP138_AREA")
	private Double gcgcmsComp138Area;

	@Column(name = "COMP014_PPM")
	private Double gcgcms136TmAdamPpm;

	@Column(name = "COMP056_AREA")
	private Double gcgcmsC424Edam;

	@Column(name = "COMP067_AREA")
	private Double gcgcms39496979DmTriam;

	@Column(name = "COMP051_AREA")
	private Double gcgcmsC6Diam;

	@Column(name = "COMP001_PPM")
	private Double gcgcmsIstdPpm;

	@Column(name = "COMP149_PPM")
	private Double gcgcmsComp149Ppm;

	@Column(name = "COMP013_AREA")
	private Double gcgcms135TmAdam;

	@Column(name = "COMP087_AREA")
	private Double gcgcmsC3Tetram;

	@Column(name = "COMP119_PPM")
	private Double gcgcmsComp119Ppm;

	@Column(name = "COMP137_PPM")
	private Double gcgcmsComp137Ppm;

	@Column(name = "COMP088_PPM")
	private Double gcgcmsC4TetramPpm;

	@Column(name = "COMP123_AREA")
	private Double gcgcmsComp123Area;

	@Column(name = "COMP150_PPM")
	private Double gcgcmsComp150Ppm;

	@Column(name = "COMP036_PPM")
	private Double gcgcms4mDiamPpm;

	@Column(name = "ISTD2_PPM")
	private Double gcgcmsIstd2Ppm;

	@Column(name = "COMP057_AREA")
	private Double gcgcmsC524Edam;

	@Column(name = "COMP054_PPM")
	private Double gcgcmsC224EdamPpm;

	@Column(name = "EXT_STD_ID3")
	private String gcgcmsExtStdId3;

	@Column(name = "EXT_STD_ID2")
	private String gcgcmsExtStdId2;

	@Column(name = "EXT_STD_ID1")
	private String gcgcmsExtStdId1;

	@Column(name = "GCGCMS_METHOD")
	private Integer gcgcmsMethod;

	@Column(name = "COMP097_PPM")
	private Double gcgcmsComp097Ppm;

	@Column(name = "SVC_CODE")
	private String gcgcmsSvcCode;

	@Column(name = "COMP109_AREA")
	private Double gcgcmsComp109Area;

	@Column(name = "COMP113_AREA")
	private Double gcgcmsComp113Area;

	@Column(name = "COMP116_AREA")
	private Double gcgcmsComp116Area;

	@Column(name = "COMP111_PPM")
	private Double gcgcmsComp111Ppm;

	@Column(name = "COMP007_PPM")
	private Double gcgcmsTr14DmAdamPpm;

	@Column(name = "COMP141_PPM")
	private Double gcgcmsComp141Ppm;

	@Column(name = "COMP106_AREA")
	private Double gcgcmsComp106Area;

	@Column(name = "COMP128_PPM")
	private Double gcgcmsComp128Ppm;

	@Column(name = "COMP103_AREA")
	private Double gcgcmsComp103Area;

	@Column(name = "COMP105_PPM")
	private Double gcgcmsComp105Ppm;

	@Column(name = "COMP097_AREA")
	private Double gcgcmsComp097Area;

	@Column(name = "ISTD2_AREA")
	private Double gcgcmsIstd2Area;

	@Column(name = "COMP035_PPM")
	private Double gcgcmsDiamPpm;

	@Column(name = "COMP119_AREA")
	private Double gcgcmsComp119Area;

	@Column(name = "QC_FLAG")
	private String gcgcmsQcFlag;

	@Column(name = "COMP045_AREA")
	private Double gcgcmsMiscC2DmDiam;

	@Column(name = "COMP075_AREA")
	private Double gcgcmsC2Tetram;

	@Column(name = "COMP057_PPM")
	private Double gcgcmsC524EdamPpm;

	@Column(name = "COMP054_AREA")
	private Double gcgcmsC224Edam;

	@Column(name = "COMP110_AREA")
	private Double gcgcmsComp110Area;

	@Column(name = "COMP123_PPM")
	private Double gcgcmsComp123Ppm;

	@Column(name = "COMP135_AREA")
	private Double gcgcmsComp135Area;

	@Column(name = "COMP094_PPM")
	private Double gcgcmsComp094Ppm;

	@Column(name = "COMP066_AREA")
	private Double gcgcms34DmTriam;

	@Column(name = "COMP101_AREA")
	private Double gcgcmsComp101Area;

	@Column(name = "COMP130_AREA")
	private Double gcgcmsComp130Area;

	@Column(name = "COMP024_PPM")
	private Double gcgcms1257TmAdamPpm;

	@Column(name = "COMP041_AREA")
	private Double gcgcms48DmDiam;

	@Column(name = "COMP017_PPM")
	private Double gcgcmsCisTr134TmAdamPpm;

	@Column(name = "COMP132_PPM")
	private Double gcgcmsComp132Ppm;

	@Column(name = "COMP128_AREA")
	private Double gcgcmsComp128Area;

	@Column(name = "COMP001_AREA")
	private Double gcgcmsIstd;

	@Column(name = "COMP062_AREA")
	private Double gcgcms8mTriam;

	@Column(name = "COMP071_PPM")
	private Double gcgcmsTetram1Ppm;

	@Column(name = "COMP055_AREA")
	private Double gcgcmsC324Edam;

	@Column(name = "COMP148_AREA")
	private Double gcgcmsComp148Area;

	@Column(name = "COMP008_AREA")
	private Double gcgcms12DmAdam;

	@Column(name = "COMP146_PPM")
	private Double gcgcmsComp146Ppm;

	@Column(name = "COMP044_PPM")
	private Double gcgcms2EDiamPpm;

	@Column(name = "COMP082_AREA")
	private Double gcgcmsC3Diam;

	@Column(name = "COMP052_AREA")
	private Double gcgcms24Edam;

	@Column(name = "COMP024_AREA")
	private Double gcgcms1257TmAdam;

	@Column(name = "COMP080_AREA")
	private Double gcgcmsC5Adam;

	@Column(name = "COMP091_AREA")
	private Double gcgcmsComp091Area;

	@Column(name = "COMP085_AREA")
	private Double gcgcmsC3Triam;

	@Column(name = "COMP045_PPM")
	private Double gcgcmsMiscC2DmDiamPpm;

	@Column(name = "COMP086_PPM")
	private Double gcgcmsC4TriamPpm;

	@Column(name = "COMP142_AREA")
	private Double gcgcmsComp142Area;

	@Column(name = "COMP083_AREA")
	private Double gcgcmsC1Triam;

	@Column(name = "COMP114_PPM")
	private Double gcgcmsComp114Ppm;

	@Column(name = "COMP046_AREA")
	private Double gcgcms149TmDiam;

	@Column(name = "COMP050_PPM")
	private Double gcgcmsC5DiamPpm;

	@Column(name = "COMP095_PPM")
	private Double gcgcmsComp095Ppm;

	@Column(name = "COMP104_PPM")
	private Double gcgcmsComp104Ppm;

	@Column(name = "COMP143_AREA")
	private Double gcgcmsComp143Area;

	@Column(name = "COMP131_PPM")
	private Double gcgcmsComp131Ppm;

	@Column(name = "COMP122_PPM")
	private Double gcgcmsComp122Ppm;

	@Column(name = "COMP018_AREA")
	private Double gcgcms123TmAdam;

	@Column(name = "COMP016_PPM")
	private Double gcgcmsTr134TmAdamPpm;

	@Column(name = "COMP066_PPM")
	private Double gcgcms34DmTriamPpm;

	@Column(name = "JOB_ID")
	private String gcgcmsJobId;

	@Column(name = "COMP008_PPM")
	private Double gcgcms12DmAdamPpm;

	@Column(name = "COMP096_AREA")
	private Double gcgcmsComp096Area;

	@Column(name = "COMP118_AREA")
	private Double gcgcmsComp118Area;

	@Column(name = "COMP111_AREA")
	private Double gcgcmsComp111Area;

	@Column(name = "COMP016_AREA")
	private Double gcgcmsTr134TmAdam;

	@Column(name = "COMP143_PPM")
	private Double gcgcmsComp143Ppm;

	@Column(name = "COMP067_PPM")
	private Double gcgcms39496979DmTriamPpm;

	@Column(name = "COMP139_AREA")
	private Double gcgcmsComp139Area;

	@Column(name = "COMP023_PPM")
	private Double gcgcms1357TmAdamPpm;

	@Column(name = "COMP021_PPM")
	private Double gcgcmsMiscEmAdamPpm;

	@Column(name = "COMP100_AREA")
	private Double gcgcmsComp100Area;

	@Column(name = "COMP047_AREA")
	private Double gcgcms349TmDiam;

	@Column(name = "COMP017_AREA")
	private Double gcgcmsCisTr134TmAdam;

	@Column(name = "COMP059_AREA")
	private Double gcgcmsTriam;

	@Column(name = "COMP140_AREA")
	private Double gcgcmsComp140Area;

	@Column(name = "COMP022_PPM")
	private Double gcgcmsSumPrAdamPpm;

	@Column(name = "COMP139_PPM")
	private Double gcgcmsComp139Ppm;

	@Column(name = "COMP070_PPM")
	private Double gcgcms39154915TmTriamPpm;

	@Column(name = "COMP061_PPM")
	private Double gcgcms5mTriamPpm;

	@Column(name = "COMP129_AREA")
	private Double gcgcmsComp129Area;

	@Column(name = "COMP070_AREA")
	private Double gcgcms39154915TmTriam;

	@Column(name = "COMP019_PPM")
	private Double gcgcmsMiscTmAdamPpm;

	@Column(name = "COMP021_AREA")
	private Double gcgcmsMiscEmAdam;

	@Column(name = "COMP038_AREA")
	private Double gcgcms3mDiam;

	@Column(name = "COMP030_PPM")
	private Double gcgcms12357PmAdamPpm;

	@Column(name = "COMP113_PPM")
	private Double gcgcmsComp113Ppm;

	@Column(name = "COMP126_AREA")
	private Double gcgcmsComp126Area;

	@Column(name = "COMP034_PPM")
	private Double gcgcmsC8AdamPpm;

	@Column(name = "COMP078_PPM")
	private Double gcgcmsC3AdamPpm;

	@Column(name = "COMP033_AREA")
	private Double gcgcmsC7Adam;

	@Column(name = "QC_DATE")
	private Date gcgcmsQcDate;

	@Column(name = "COMP137_AREA")
	private Double gcgcmsComp137Area;

	@Column(name = "COMP038_PPM")
	private Double gcgcms3mDiamPpm;

	@Column(name = "ISTD3_NAME")
	private String gcgcmsIstd3Name;

	@Column(name = "COMP077_AREA")
	private Double gcgcmsC2Adam;

	@Column(name = "COMP148_PPM")
	private Double gcgcmsComp148Ppm;

	@Column(name = "COMP105_AREA")
	private Double gcgcmsComp105Area;

	@Column(name = "GCGCMS_DATE", insertable = false, updatable = false)
	private Date gcgcmsAcqDate;

	@Column(name = "COMP099_AREA")
	private Double gcgcmsComp099Area;

	@Column(name = "COMP092_PPM")
	private Double gcgcmsComp092Ppm;

	@Column(name = "ISTD1_NAME")
	private String gcgcmsIstd1Name;

	@Column(name = "COMP134_PPM")
	private Double gcgcmsComp134Ppm;

	@Column(name = "COMP107_PPM")
	private Double gcgcmsComp107Ppm;

	@Column(name = "COMP026_PPM")
	private Double gcgcms1356TmAdamPpm;

	@Column(name = "COMP025_PPM")
	private Double gcgcms1e35DmAdamPpm;

	@Column(name = "COMP132_AREA")
	private Double gcgcmsComp132Area;

	@Column(name = "COMP086_AREA")
	private Double gcgcmsC4Triam;

	@Column(name = "COMP003_PPM")
	private Double gcgcms1mAdamPpm;

	@Column(name = "COMP124_AREA")
	private Double gcgcmsComp124Area;

	@Column(name = "COMP062_PPM")
	private Double gcgcms8mTriamPpm;

	@Column(name = "COMP040_AREA")
	private Double gcgcms1224DmDiam;

	@Column(name = "COMP050_AREA")
	private Double gcgcmsC5Diam;

	@Column(name = "COMP022_AREA")
	private Double gcgcmsSumPrAdam;

	@Column(name = "COMP015_AREA")
	private Double gcgcmsCis134TmAdam;

	@Column(name = "COMP116_PPM")
	private Double gcgcmsComp116Ppm;

	@Column(name = "COMP012_PPM")
	private Double gcgcms2EAdamPpm;

	@Column(name = "COMP125_PPM")
	private Double gcgcmsComp125Ppm;

	@Column(name = "COMP094_AREA")
	private Double gcgcmsComp094Area;

	@Column(name = "COMP012_AREA")
	private Double gcgcms2EAdam;

	@Column(name = "COMP140_PPM")
	private Double gcgcmsComp140Ppm;

	@Column(name = "COMP074_PPM")
	private Double gcgcmsC1TetramPpm;


	@Override
	public String getName() {
		 return AnalysisConstants.GC_GC_MS;
	}
}
