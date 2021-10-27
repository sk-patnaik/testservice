package com.shell.siep.gto.services;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.shell.siep.gto.persistence.vo.WellLatLong;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shell.siep.gto.exceptions.GTOServiceException;
import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOCountry;
import com.shell.siep.gto.persistence.model.GTOWell;

import javassist.NotFoundException;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class WellServiceTest {

    //TODO: This test is fragile because it uses specific well codes.  Need to fix.
    private final static String BG_WELL_ID = "TYC00001154";
    private final static String FPC_WELL_ID = "FPCW_3424";
    private final static String FLOW_WELL_ID = "SGSW_383";
    private final static String DD_WELL_ID = "FPCW_89488";

    @Autowired
    private WellService wellService;

    @Test
    public void testGetExistingWhellIdsFromWellIds() {
        List<String> dbs = Arrays.asList("FPC");
        List<String> countries = null;
        List<String> wellIds = Arrays.asList("FPCW_49111", "FPCW_31800", "PETER");
        List<String> existingWellIds = wellService.getExistingWellIds(dbs, countries, wellIds);

        assert(existingWellIds != null);
        assert(existingWellIds.size() == 2);
        assert(!existingWellIds.contains("PETER"));
    }

    @Test
    public void testGetExistingWellIdsFromWellIdsAndCountries() {
        List<String> dbs = Arrays.asList("FPC");
        List<String> countries = Arrays.asList("United States");
        List<String> wellIds = Arrays.asList("FPCW_49111", "FPCW_31800", "PETER", "FPCW_89488", "FPCW_31838");
        List<String> existingWellIds = wellService.getExistingWellIds(dbs, countries, wellIds);

        assert(existingWellIds != null);
        assert(existingWellIds.size() == 2);
        assert(!existingWellIds.contains("PETER"));
    }

    @Test
    public void testGetWellIdsWithLatLongFpc() throws GTOServiceException {
        List<String> countries = Arrays.asList("Bahamas", "Cuba");
        List<String> wellIds = null; Arrays.asList("FPCW_7201","FPCW_31837", "FPCW_86264", "FPCW_8288");
        List<String> sampleIds = null; //Arrays.asList("FPC_355144", "FPC_355145");
        List<String> sampleTypes = null; //Collections.singletonList("ROCK");

        testGetWellIdsWithLatLong(Database.FPC, countries, wellIds, sampleIds, sampleTypes);
    }

    @Test
    public void testGetWellIdsWithLatLongBg() throws GTOServiceException {
        List<String> countries = Arrays.asList("Trinidad", "Spain");
        List<String> wellIds = Arrays.asList("BG_00001697","BG_00001698", "BG_00000502", "BG_00000503");
        List<String> sampleIds = null;
        List<String> sampleTypes = Collections.singletonList("ROCK");

        testGetWellIdsWithLatLong(Database.BG, countries, wellIds, sampleIds, sampleTypes);
    }

    @Test
    public void testGetWellIdsWithLatLongDD() throws GTOServiceException {
        List<String> countries = Arrays.asList("Slovakia", "Kerguelen");
        List<String> wellIds = Arrays.asList("FPCW_30185","FPCW_30186", "FPCW_67180", "FPCW_67181");
        List<String> sampleIds = null;
        List<String> sampleTypes = Collections.singletonList("ROCK");

        testGetWellIdsWithLatLong(Database.DD, countries, wellIds, sampleIds, sampleTypes);
    }

    @Test
    public void testGetWellIdsWithLatLongSGS() throws GTOServiceException {
        List<String> countries = Arrays.asList("Cameroon", "United States");
        List<String> wellIds = Arrays.asList("SGSW_458","SGSW_1665", "SGSW_222", "SGSW_223");
        List<String> sampleIds = null;
        List<String> sampleTypes = Collections.singletonList("OIL");

        testGetWellIdsWithLatLong(Database.SGS, countries, wellIds, sampleIds, sampleTypes);
    }



    @Test
    public void testGetWellsFromCountryCombined() throws GTOServiceException {
        List<String> dbs = new ArrayList<>(Arrays.asList(Database.FPC.getCode(), Database.BG.getCode(),
                Database.SGS.getCode()));

        List<String> found = wellService.getWellIdsFromCountries(dbs, Collections.singletonList("Brazil"));
        assert(found != null && !found.isEmpty());
    }

    @Test(expected = NotFoundException.class)
    public void testGetWellFromFpcNotFound() throws NotFoundException {
        wellService.getWell("Test Baby!", Database.FPC.getCode());
    }

    @Test
    public void testGetWellFromBG() {
        testGetWell("United Kingdom", BG_WELL_ID, Database.BG);
    }


    @Test
    public void testGetWellFromSGS() {
        testGetWell("United States", FLOW_WELL_ID, Database.SGS);
    }

    @Test
    public void testGetWellFromFPC() {
        testGetWell("Brazil", FPC_WELL_ID, Database.FPC);
    }

    @Test
    public void testGetWellFromDD() {
        testGetWell("Bahamas", DD_WELL_ID, Database.DD);
    }

    @Test
    public void testGetWellIdsFromPartialWellIdFPC() {
        testGetWellIdsFromPartialWellId(Database.FPC, "PCW_12");
    }

    @Test
    public void testGetWellIdsFromPartialWellIdBG() {
        testGetWellIdsFromPartialWellId(Database.BG, "YC0001");
    }

    @Test
    public void testGetWellIdsFromPartialWellIdSGS() {
        testGetWellIdsFromPartialWellId(Database.SGS, "GSW_22");
    }

    private void testGetWellIdsFromPartialWellId(Database db, String partial) {
        if(Database.getActiveDatabases().contains(db)) {
            List<String> wellIds = wellService.getWellIdsFromPartialWellId(partial, Collections.singletonList(db.getCode()));

            assert (wellIds != null);
            assert (!wellIds.isEmpty());

            for (String wellId : wellIds) {
                assert (wellId.contains(partial));
            }
        }
    }

    private void testGetWell(String country, String wellId, Database database) {
        if(Database.getActiveDatabases().contains(database)) {
            GTOWell well = null;

            try {
                well = wellService.getWell(wellId, database.getCode());
            } catch (NotFoundException e) {
                fail("");
            }
            assert (well != null);

            if (well.getDatabase() != database) {
                fail("got well from wrong database");
            }

            assert (well.getWellId().equals(wellId));

            GTOCountry gtoCountry = well.getCountry();
            assert (gtoCountry.getCountryName().equals(country));
        }
    }

    private void testGetWellIdsWithLatLong(Database db, List<String> countries, List<String> wellIds, List<String> sampleIds,
                                           List<String> sampleTypes) throws GTOServiceException {

        if(Database.getActiveDatabases().contains(db)) {
            List<WellLatLong> wellLatLongs2 = wellService.getWellIdsWithLatLong(Collections.singletonList(db.getCode()),
                    countries, wellIds, sampleIds, sampleTypes);

            assert (wellLatLongs2 != null);
        }
    }
}
