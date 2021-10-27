package com.shell.siep.gto.services;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.properties.DataCategoryProperties;
import com.shell.siep.gto.exceptions.GTOServiceException;
import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOLimsStatus;
import com.shell.siep.gto.properties.SearchVariable;
import com.shell.siep.gto.properties.SearchVariableProperties;
import com.shell.siep.gto.vo.request.AnalysisRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AnalysisServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(AnalysisServiceTest.class);

    @Autowired
    private AnalysisService analysisService;

    @Autowired
    private DataCategoryProperties dataCategoryProperties;

    @Autowired
    private SearchVariableProperties searchVariableProperties;

    private static final String FPC_SAMPLE_ID = "FPC_1042428";
    private static final String FPC_REQUEST_ID = "FPC6381";
    private static final String DD_SAMPLE_ID = "CLB_1240";
    private static final String DD_REQUEST_ID = "FPC2101";
    private static final String BG_SAMPLE_ID = "BG_00015370";
    private static final String BG_REQUEST_ID = "N.A.";
    private static final String SGS_SAMPLE_ID = "SGS_6970";

    @Test
    public void testSearchVariables() {
        Map<String, List<SearchVariable>> data = searchVariableProperties.getVariables();
        assert(data != null);
    }

    @Test
    public void testDataCategories() {
        Map<String, List<String>> data = dataCategoryProperties.getCategories();
       assert(data != null);
    }

    @Test
    public void testStatusDD() {
        if(Database.getActiveDatabases().contains(Database.DD)) {
            testStatus(Database.DD, DD_SAMPLE_ID);
        }
    }

    @Test
    public void testStatusBG() {
        testStatus(Database.BG, BG_SAMPLE_ID);
    }

    @Test
    public void testStatusFPC() {
        testStatus(Database.FPC, FPC_SAMPLE_ID);
    }

    @Test
    public void testStatusSGS() {
        testStatus(Database.SGS, SGS_SAMPLE_ID);
    }

    @Test
    public void testPhysicalPropertiesContaminant() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_2317");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_CONTAMINANT);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPhysicalPropertiesPh() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_17094");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_PH);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPhysicalPropertiesPvalue() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_10252");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_PVALUE);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPhysicalPropertiesTension() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_1116");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_TENSION);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPhysicalPropertiesAcid() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_1234");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_ACID);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPhysicalPropertiesBASE() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_12752");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_BASE);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPhysicalPropertiesTDS() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_17094");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_TDS);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPhysicalPropertiesTOG() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_17107");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_TOG);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPhysicalPropertiesWaterContent() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_1073");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_WATER_CONTENT);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPhysicalPropertiesWaxContent() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_1208");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_WAX_CONTENT);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWaterAnalysis() {
            List<String> sampleIds = new ArrayList<>();
            sampleIds.add("SGS_18329");
            List<String> dbs = new ArrayList<>();
            dbs.add(Database.SGS.getCode());
            List<String> analysisNames = new ArrayList<>();
            analysisNames.add(AnalysisConstants.WATER_ANALYSIS);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testSARA() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_10003");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.SARA);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testElementalInorganic() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_18323");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ELEMENTAL_INORGANIC);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testAsphalteneDispersion() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_1634");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ASPHALTENE_DISPERSION);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWaterAnalysisSolids() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_711585");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_SOLIDS);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPH() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_711585");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_PH);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPAH() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_711585");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_PAH);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testOrganicAcids() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_711585");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_ORGANIC_ACIDS);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testOilInWater() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_711585");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_OIL_IN_WATER);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWaterAnalysisNPD() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_711585");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.NPD);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWaterAnalysisElemental() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1185928");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_ELEMENTAL);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWaterAnalysisDissolvedGases() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1185928");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_DISSOLVED_GASES);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWaterAnalysisDensity() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1185928");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_DENSITY);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testRockMaceralsLegacy() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_32232");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ROCK_MACERALS);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testRockMacerals() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1186094");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ROCK_MACERALS_V2);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPFID() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_292951");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PFID);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPistonCore() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_511401");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PISTON_CORE);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWaterAnalysisAlkalinity() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1185917");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_ALKALINITY);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWaterAnalysisConductivity() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1185928");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_ANALYSIS_CONDUCTIVITY);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWaxDeposition() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("SGS_5836");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WAX_DEPOSITION);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testRockChemo() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1009180");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ROCK_CHEMO);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }


    @Test
    public void testRockRoc() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1042734");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ROCK_ROC);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testRockExtr() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1000580");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ROCK_EXTRACTION);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testOilBASE() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1154249");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.OIL_BASE);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testOilTAN() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1004360");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.OIL_TAN);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testOilInorganic() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1476");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ELEMENTAL_INORGANIC);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testNitrogen() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_555352");
        sampleIds.add("SGS_19279");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ELEMENTAL_NITROGEN);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testCHNOS() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1001551");
        sampleIds.add("SGS_7451");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ELEMENTAL_CHNOS);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGrossCompositionOther() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_10029");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GROSS_COMPOSITION_OTHER);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGrossCompositionSARA() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1000118");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GROSS_COMPOSITION_SARA);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testIsotopesWater() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1151280");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ISOTOPES_WATER);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testCSIAC7() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("EXPRO_36868");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.CSIA_C7);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGCGCMS() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1031274");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_GC_MS);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testAlkylBenzenes() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_760098");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.MS_ALKYLBENZ
        );

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testMSMS() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1008412");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GCMS_BIOMARKERS_MSMS);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testXMdgcBenz() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_323515");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_XMDGC_BENZ);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testXMdgcNaph() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_44304");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_XMDGC_NAPH);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGcMdgc() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("EXPRO_35573");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_MDGC);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGcTegc() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_288804");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_TEGC);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGcGc() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_10231");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_GC);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testSimdisHT() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1000123");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_SIMDIS_HT);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testSimdis() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_365224");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_SIMDIS);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testHeadspace() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1070428");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_HEADSPACE);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testMplc() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1032849");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.MPLC);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGCHtgc() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1037432.2");
        sampleIds.add("SGS_11823");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_HTGC);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGCAromatic() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_710466");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_AROMATICS);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testChromData() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_296100");
        sampleIds.add("BGPD_1432");
        sampleIds.add("SGS_16585");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.CHROMATOGRAMS);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testVrHeader() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_353869");
        sampleIds.add("BG_00001687");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ROCK_VITRINITE_REFLECTION);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testRockToc() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_13231");
        sampleIds.add("BG_00015181");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ROCK_TOC);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testRockPyro() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_569751");
        sampleIds.add("BG_00064818");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ROCK_PYROLYSIS);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testOilWax() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_656944");
        sampleIds.add("BG_00015922");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.OIL_WAX_CONTENT);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testOilCNT() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_707055");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.OIL_CONTAMINATION);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testOilWater() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_77681");
        sampleIds.add("BG_00080536");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.OIL_WATER_CONTENT);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testViscosity() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_773322");
        sampleIds.add("SGS_9614");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_VISCOSITY);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testBiomarkersSaturate() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1028300");
        sampleIds.add("TYC01990300");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GCMS_BIOMARKERS_SATURATE);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testBiomarkersAromatic() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("BG_00052697");
        sampleIds.add("FPC_1008942");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GCMS_BIOMARKERS_AROMATIC);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testOilSulf() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_63949");
        sampleIds.add("BG_00015919");
        sampleIds.add("SGS_12620");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ELEMENTAL_SULFUR);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testNiv() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_476597");
        sampleIds.add("BG_00007739");
        sampleIds.add("SGS_529");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.ELEMENTAL_NICKEL_VANADIUM);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }


        @Test
    public void testCloudPoint() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1008938");
        sampleIds.add("SGS_26");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_CLOUD_POINT);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGCGasComposition() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("BG_00051059");
        sampleIds.add("FPC_1005848");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_GAS_COMPOSITION);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testGCC7GasolineRange() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1062559");
        sampleIds.add("BG_00168966");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_C7_GASOLINE_RANGE);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testWholeOil() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_992891");
        sampleIds.add("TYC02015745");
        sampleIds.add("SGS_7665");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_WHOLE_OIL);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testBTEX() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_1185928");
        sampleIds.add("SGS_17120");
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.SGS.getCode());
        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.WATER_BTEX);
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_BTEX);
        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testSaturates() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_625144");
        sampleIds.add("BG_00010298");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.GC_SATURATES);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    @Test
    public void testPourpoint() {
        List<String> sampleIds = new ArrayList<>();
        sampleIds.add("FPC_693605");
        sampleIds.add("BG_00015921");
        sampleIds.add("SGS_2929");

        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.BG.getCode());
        dbs.add(Database.SGS.getCode());

        List<String> analysisNames = new ArrayList<>();
        analysisNames.add(AnalysisConstants.PHYSICAL_PROPERTIES_POURPOINT);

        testAnalysisData(sampleIds, dbs, analysisNames);
    }

    private void testAnalysisData(List<String> sampleIds, List<String> dbs, List<String> analysisNames) {
        AnalysisRequest request = new AnalysisRequest();
        List<String> searchableDatabases = getSearchableDatabases(dbs);

        if(!CollectionUtils.isEmpty(searchableDatabases)) {
            request.setDatabases(searchableDatabases);
            request.setSampleIds(sampleIds);
            request.setAnalysisNames(analysisNames);
            List<Object> responses = analysisService.getAnalysisData(request);


            assert (!CollectionUtils.isEmpty(responses));

            for (Object response : responses) {
                try {
                    Method getDb = response.getClass().getMethod("getDatabase");
                    Database database = (Database) getDb.invoke(response);
                    assert (dbs.contains(database.getCode()));

                    Method getSampleId = response.getClass().getMethod("getSampleId");
                    String sampleId = (String) getSampleId.invoke(response);
                    assert (sampleIds.contains(sampleId));

                    Method getAnalysisName = response.getClass().getMethod("getAnalysisName");
                    String analysisName = (String) getAnalysisName.invoke(response);
                    assert (analysisNames.contains(analysisName));

                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void testStatus(Database db, String sampleId) {
        if(Database.getActiveDatabases().contains(db)) {
            try {
                List<GTOLimsStatus> statuses = analysisService.getStatus(db.getCode(), sampleId);

                assert (statuses != null);

                for (GTOLimsStatus status : statuses) {
                    assert (status.getMeasSampleId().equals(sampleId));
                }

            } catch (GTOServiceException e) {
                fail("GTOServiceException - " + e.getMessage());
            }
        }
    }

    private List<String> getSearchableDatabases(List<String> databases ) {
        List<String> searchableDatabases = new ArrayList<>();
        for(Database db : Database.getActiveDatabases()) {
            if(databases.contains(db.getCode())) {
                searchableDatabases.add(db.getCode());
            }
        }
        return searchableDatabases;
    }



}
