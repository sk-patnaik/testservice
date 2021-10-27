package com.shell.siep.gto.services;

import static org.junit.Assert.fail;

import java.util.*;

import com.shell.siep.gto.services.paginated.PaginatedRecordWrapper;
import com.shell.siep.gto.vo.request.PageableRequest;
import com.shell.siep.gto.vo.request.PageableSamplesRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOSample;

import javassist.NotFoundException;
import org.springframework.util.StopWatch;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(SampleServiceTest.class);
    private final static String BG_WELL_ID = "TYC00001154";
    private final static String BG_SAMPLE_ID = "BG_00152140";
    private final static String FPC_WELL_ID = "FPCW_3424";
    private final static String FPC_SAMPLE_ID = "FPC_752766";
    private final static String FLOW_WELL_ID = "SGSW_68";
    private final static String FLOW_SAMPLE_ID = "SGS_3135";
    private final static String DD_WELL_ID = "FPCW_89488";
    private final static String DD_SAMPLE_ID = "FPC_780494";

    @Autowired
    private SampleService sampleService;

    @Test
    public void testGetExistingSampleIdsFromSampleIds() {
        List<String> dbs = Arrays.asList("FPC");
        List<String> countries = null;
        List<String> wellIds = null;
        List<String> sampleIds = Arrays.asList("FPC_355216", "FPC_69502", "FPC_649387", "FPC_649388", "FPC_698024", "PETER");
        List<String> existingSampleIds = sampleService.getExistingSampleIds(dbs, countries, wellIds, sampleIds);

        assert(existingSampleIds != null);
        assert(existingSampleIds.size() == 5);
        assert(!existingSampleIds.contains("PETER"));
    }

    @Test
    public void testGetExistingSampleIdsFromWellIdsSampleIdsCountryIds() {
        List<String> dbs = Arrays.asList("FPC");
        List<String> countries = Arrays.asList("United States");
        List<String> wellIds =  Arrays.asList("FPCW_8289", "FPCW_35961");
        List<String> sampleIds = Arrays.asList("FPC_355216", "FPC_69502", "FPC_649387", "FPC_649388", "FPC_698024", "PETER");
        List<String> existingSampleIds = sampleService.getExistingSampleIds(dbs, countries, wellIds, sampleIds);

        assert(existingSampleIds != null);
        assert(existingSampleIds.size() == 2);
        assert(!existingSampleIds.contains("PETER"));
        assert(!existingSampleIds.contains("FPC_698024"));
        assert(!existingSampleIds.contains("FPC_69502"));
    }

    @Test
    public void testGetExistingSampleIdsFromWellIdsSampleIds() {
        List<String> dbs = Arrays.asList("FPC");
        List<String> countries = null;
        List<String> wellIds =  Arrays.asList("FPCW_8289", "FPCW_35961");
        List<String> sampleIds = Arrays.asList("FPC_355216", "FPC_69502", "FPC_649387", "FPC_649388", "FPC_698024", "PETER");
        List<String> existingSampleIds = sampleService.getExistingSampleIds(dbs, countries, wellIds, sampleIds);

        assert(existingSampleIds != null);
        assert(existingSampleIds.size() == 3);
        assert(!existingSampleIds.contains("PETER"));
        assert(!existingSampleIds.contains("FPC_698024"));
    }



    // getSample()
    @Test
    public void testGetSampleFromBG() {
        testGetSample(BG_SAMPLE_ID, Database.BG);
    }

    @Test
    public void testGetSampleFromDD() {
        testGetSample(DD_SAMPLE_ID, Database.DD);
    }


    @Test
    public void testGetSampleFromFpc() {
        testGetSample(FPC_SAMPLE_ID, Database.FPC);
    }

    @Test
    public void testGetSampleFromSGS() {
        testGetSample(FLOW_SAMPLE_ID, Database.SGS);
    }


    // getSampleIdsFromWellIds
    @Test
    public void testGetSampleIdsFromWellIdsSGS() {
        testSampleIdsFromWellIds(Collections.singletonList(FLOW_WELL_ID), Database.SGS);
    }

    @Test
    public void testGetSampleIdsFromWellIdsDD() {
        testSampleIdsFromWellIds(Collections.singletonList(DD_WELL_ID), Database.DD);
    }

    @Test
    public void testGetSampleIdsFromWellIdsFpc() {
        List<String> wells = new ArrayList<>();
        wells.add("EXPROW_274");
        wells.add("BEBW_71");
        testSampleIdsFromWellIds(wells, Database.FPC);
    }

    @Test
    public void testGetSampleIdsFromWellIdsBG() {
        testSampleIdsFromWellIds(Collections.singletonList(BG_WELL_ID), Database.BG);
    }

    @Test
    public void testGetSampleIdsFromPartialSampleIdFPC() {
        testGetSampleIdsFromPartialSampleId(Database.FPC, "FPC_111");
    }

    @Test
    public void testGetSampleIdsFromPartialSampleIdBG() {
        testGetSampleIdsFromPartialSampleId(Database.BG, "G_0014");
    }

    @Test
    public void testGetSampleIdsFromPartialSampleIdDD() {
        testGetSampleIdsFromPartialSampleId(Database.DD, "FPC_78049");
    }

    @Test
    public void testGetSampleIdsFromPartialSampleIdSGS() {
        testGetSampleIdsFromPartialSampleId(Database.SGS, "GS_94");
    }

    @Test
    public void testGetSampleTypes() {
        List<String> dbs = new ArrayList<>();
        dbs.add(Database.FPC.getCode());
        //dbs.add(Database.SGS.getCode());
        dbs.add(Database.BG.getCode());
        dbs.add(Database.DD.getCode());

        Map<String, List<String>> sampleTypes = sampleService.getSamplesTypes();
        assert(sampleTypes != null);

        for(String db : dbs) {
            assert(!sampleTypes.get(db).isEmpty());
        }
    }

    private void testGetSampleIdsFromPartialSampleId(Database db, String partial) {
        if(Database.getActiveDatabases().contains(db)) {
            List<String> sampleIds = null;
            sampleIds = sampleService.getSampleIdsFromPartialSampleId(partial, Collections.singletonList(db.getCode()));

            assert (sampleIds != null);
            assert (!sampleIds.isEmpty());

            for (String wellId : sampleIds) {
                if (!wellId.contains(partial)) {
                    logger.debug(wellId);
                }
                assert (wellId.contains(partial));
            }
        }
    }

    /*
    @Test
    public void testGetSamplesFromCountriesFPCSampleTypes() {
        testGetSamplesFromCountries(Collections.singletonList("Mexico"), Database.FPC,
                Collections.singletonList("OIL"));
    }

    @Test
    public void testGetSamplesFromCountriesFPC() {
        testGetSamplesFromCountries(Collections.singletonList("Mali"), Database.FPC, null);
    }

    @Test
    public void testGetSamplesFromCountriesBGSampleTypes() {
        testGetSamplesFromCountries(Collections.singletonList("Germany"), Database.BG,
            Collections.singletonList("GAS"));
    }

    @Test
    public void testGetSamplesFromCountriesBG() {
        testGetSamplesFromCountries(Collections.singletonList("Germany"), Database.BG, null);
    }

    @Test
    public void testGetSamplesFromCountriesSGSSampleCodes() {
        testGetSamplesFromCountries(Collections.singletonList("Venezuela"), Database.SGS,
            Collections.singletonList("SOLID"));
    }

    @Test
    public void testGetSamplesFromCountriesSGS() {
        testGetSamplesFromCountries(Collections.singletonList("Venezuela"), Database.SGS, null);
    }
     */

    // getSamplesFromWellIds
    @Test
    public void testGetSamplesFromWellIdsFpc() {
        List<String> wells = new ArrayList<>();
        wells.add("EXPROW_274");
        wells.add("BEBW_71");
        testGetSamplesFromWellIds(wells, Database.FPC, Collections.singletonList("ROCK"));
    }

    @Test
    public void testGetSamplesFromWellIdsBG() {
        testGetSamplesFromWellIds(Collections.singletonList(BG_WELL_ID), Database.BG, Collections.singletonList("ROCK"));
    }

    @Test
    public void testGetSamplesFromWellIdsDD() {
        testGetSamplesFromWellIds(Collections.singletonList(DD_WELL_ID), Database.DD, Collections.singletonList("ROCK"));
    }

    @Test
    public void testGetSamplesFromWellIdsSGS() {
        testGetSamplesFromWellIds(Collections.singletonList(FLOW_WELL_ID), Database.SGS, Collections.singletonList("OIL"));
    }

    @Test
    public void testGetSamplesFromSampleIdsFpc() {
        testGetSamplesFromSampleIds("FPCW_10317", Database.FPC, Collections.singletonList("OIL"));
    }

    @Test
    public void testGetSamplesFromSampleIdsBG() {
        testGetSamplesFromSampleIds(BG_WELL_ID, Database.BG, Collections.singletonList("ROCK"));
    }

    @Test
    public void testGetSamplesFromSampleids() {
        testGetSamplesFromSampleIdsFpc(FPC_WELL_ID, Database.FPC);
    }

    private void testGetSamplesFromSampleIdsFpc(String wellId, Database db) {

        List<String> samples = null;
        List<GTOSample> samples2 = null;
        PageableRequest pageableRequest = new PageableRequest();
        pageableRequest.setPage(0);
        pageableRequest.setSize(10);
        samples = sampleService.getSampleIdsFromWellIds(Collections.singletonList(db.getCode()),
                    Collections.singletonList(wellId));
        samples2 = sampleService.getSamplesFromSampleIds(Collections.singletonList(db.getCode()),samples, null,pageableRequest.getPageable());

        assert(samples != null);

        for(GTOSample sample : samples2) {
            assert(sample.getDatabase() == db);
            samples.contains(sample.getSampleId());
        }
    }

    private void testGetSamplesFromSampleIds(String well, Database db, List<String> sampleTypes) {
        List<GTOSample> samples = null;
        List<String> sampleIds = null;
        PageableRequest pageableRequest = new PageableRequest();
        pageableRequest.setPage(0);
        pageableRequest.setSize(10);

        sampleIds = sampleService.getSampleIdsFromWellIds(Collections.singletonList(db.getCode()),
                    Collections.singletonList(well));

        samples = sampleService.getSamplesFromSampleIds(Collections.singletonList(db.getCode()), sampleIds, null, pageableRequest.getPageable());

        assert(sampleIds.size() == samples.size());

        for(GTOSample sample : samples) {
            assert(sample.getShWellId().equals(well));
            assert(sample.getSampleType() != null);
        }

        samples = sampleService.getSamplesFromSampleIds(Collections.singletonList(db.getCode()), sampleIds, sampleTypes,pageableRequest.getPageable());

        for(GTOSample sample : samples) {
            assert(sample.getShWellId().equals(well));
            assert(sampleTypes.contains(sample.getSampleType().getParent()));
        }

        assert(samples != null);

        for(GTOSample sample : samples) {
            assert(sample.getDatabase() == db);
            assert(sample.getShWellId().equals(well));
            assert(sampleTypes.contains(sample.getSampleType().getParent()));
        }
    }

    private void testGetSamplesFromWellIds(List<String> wells, Database db, List<String> sampleTypes) {
        PageableRequest pageableRequest = new PageableRequest();
        pageableRequest.setPage(0);
        pageableRequest.setSize(10);
        List<GTOSample> samples = sampleService.getSamplesFromWellIds(Collections.singletonList(db.getCode()), wells, sampleTypes, pageableRequest.getPageable());

        assert(samples != null);

        for(GTOSample sample : samples) {
            assert(sample.getDatabase() == db);
            assert(wells.contains(sample.getShWellId()));
            assert(sampleTypes.contains(sample.getSampleType().getParent()));
        }
    }

    private void testGetSample(String sampleId, Database database) {
        if(Database.getActiveDatabases().contains(database)) {
            GTOSample sample = null;
            try {
                sample = sampleService.getSample(sampleId, database.getCode());
            } catch (NotFoundException e) {
                fail("Not Found Exception");
            }

            assert (sample != null);

            if (sample.getDatabase() != database) {
                fail("got sample from wrong database");
            }

            assert (sample.getSampleId().equals(sampleId));
        }
    }

    private void testSampleIdsFromWellIds(List<String> wellIds, Database database) {
        if(Database.getActiveDatabases().contains(database)) {
            List<String> sampleIds = sampleService.getSampleIdsFromWellIds(Collections.singletonList(database.getCode()), wellIds);
            assert (sampleIds != null);
            assert (!sampleIds.isEmpty());
        }
    }
}
