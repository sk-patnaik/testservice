package com.shell.siep.gto.services;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.services.paginated.PaginatedRecordWrapper;
import com.shell.siep.gto.services.paginated.PaginatedSampleSearch;
import com.shell.siep.gto.vo.request.PageableRequest;
import com.shell.siep.gto.vo.request.PageableSamplesRequest;
import javassist.NotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StopWatch;

import java.util.*;

import static org.junit.Assert.fail;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class PaginatedSampleServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(PaginatedSampleServiceTest.class);

    @Autowired
    private PaginatedSampleSearch sampleService;

    // PAGINATION TESTS
    @Test
    public void testCountryAscendingPageStringNoSort() {

        String country = "Mexico";
        List<String> countries = new ArrayList<>();
        countries.add(country);

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.DD.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(3);
        request.setCountries(countries);
        request.setDatabases(dbs);
        request.setSize(100);
        //request.setSortColumn("shWellId");
        request.setAscending(true);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 100);

        String s = "";
        testPageSortAscendingStringSample(samples, s);
    }

    @Test
    public void testCountryAscendingPageString() {

        String country = "Mexico";
        List<String> countries = new ArrayList<>();
        countries.add(country);

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.DD.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(3);
        request.setCountries(countries);
        request.setDatabases(dbs);
        request.setSize(100);
        request.setSortColumn("shWellId");
        request.setAscending(true);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 100);

        String s = "";
        testPageSortAscendingString(samples, s);
    }

    @Test
    public void testCountryAscendingPageStringSingleDB() {

        String country = "Mexico";
        List<String> countries = new ArrayList<>();
        countries.add(country);

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(3);
        request.setCountries(countries);
        request.setDatabases(dbs);
        request.setSize(100);
        request.setSortColumn("shWellId");
        request.setAscending(true);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 100);

        String s = "";
        testPageSortAscendingString(samples, s);
    }

    @Test
    public void testRequest() {

        String country = "Mexico";
        List<String> countries = new ArrayList<>();
        countries.add(country);

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.DD.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        //request.setPage(3);
        request.setCountries(countries);
        request.setDatabases(dbs);
        request.setSize(100);
        request.setSortColumn("shWellId");
        //request.setAscending(true);

        Pageable p = request.getPageable();
        assert(request.getPageable().getSort().stream().findFirst().get().isAscending());
        assert(p.getPageNumber() == 1);
    }

    @Test
    public void testCountryDescendingPageString() {

        String country = "Mexico";
        List<String> countries = new ArrayList<>();
        countries.add(country);

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.DD.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(3);
        request.setCountries(countries);
        request.setDatabases(dbs);
        request.setSize(100);
        request.setSortColumn("shWellId");
        request.setAscending(false);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 100);

        String s = "ZZZZZZZ";
        testPageSortDescendingString(samples, s);
    }

    @Test
    public void testCountryDescendingPageStringSingleDB() {

        String country = "Mexico";
        List<String> countries = new ArrayList<>();
        countries.add(country);

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(3);
        request.setCountries(countries);
        request.setDatabases(dbs);
        request.setSize(100);
        request.setSortColumn("shWellId");
        request.setAscending(false);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 100);

        String s = "ZZZZZZZ";
        testPageSortDescendingString(samples, s);
    }

    @Test
    public void testWellAscendingPage() {
        List<String> wellIds = new ArrayList<>();
        wellIds.add("FPCW_109191");
        wellIds.add("FPCW_112656");
        wellIds.add("FPCW_112650");
        wellIds.add("FPCW_7362");

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.DD.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(1);
        request.setWellIds(wellIds);
        request.setDatabases(dbs);
        request.setSize(10);
        request.setSortColumn("shDepthBot");
        request.setAscending(true);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 10);

        double d = Double.MAX_VALUE * -1;
        testPageSortAscending(samples, d);
    }

    @Test
    public void testWellAscendingPageSingleDB() {
        List<String> wellIds = new ArrayList<>();
        wellIds.add("FPCW_7362");
        wellIds.add("FPCW_7363");

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(1);
        request.setWellIds(wellIds);
        request.setDatabases(dbs);
        request.setSize(10);
        request.setSortColumn("shDepthBot");
        request.setAscending(true);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 10);

        double d = Double.MAX_VALUE * -1;
        testPageSortAscending(samples, d);
    }

    @Test
    public void testWellDescendingPage() {
        List<String> wellIds = new ArrayList<>();
        wellIds.add("FPCW_7362");

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.DD.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(3);
        request.setWellIds(wellIds);
        request.setDatabases(dbs);
        request.setSize(10);
        request.setSortColumn("shDepthBot");
        request.setAscending(false);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();

        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 10);

        double d = Double.MAX_VALUE;
        testPageSortDescending(samples, d);
    }

    @Test
    public void testWellDescendingPageSingleDB() {
        List<String> wellIds = new ArrayList<>();
        wellIds.add("FPCW_7362");

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(3);
        request.setWellIds(wellIds);
        request.setDatabases(dbs);
        request.setSize(10);
        request.setSortColumn("shDepthBot");
        request.setAscending(false);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 10);

        double d = Double.MAX_VALUE;
        testPageSortDescending(samples, d);
    }


    @Test
    public void testCountryDescendingPage() {
        String country = "United States";
        List<String> countries = new ArrayList<>();
        countries.add(country);

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());
        dbs.add(Database.DD.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(3);
        request.setCountries(countries);
        request.setDatabases(dbs);
        request.setSize(10);
        request.setSortColumn("shDepthBot");
        request.setAscending(false);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 10);

        double d = Double.MAX_VALUE;
        testPageSortDescending(samples, d);
    }

    @Test
    public void testCountryDescendingPageSingleDB() {
        String country = "United States";
        List<String> countries = new ArrayList<>();
        countries.add(country);

        List dbs = new ArrayList();
        dbs.add(Database.FPC.getCode());

        PageableSamplesRequest request = new PageableSamplesRequest();
        request.setPage(3);
        request.setCountries(countries);
        request.setDatabases(dbs);
        request.setSize(10);
        request.setSortColumn("shDepthBot");
        request.setAscending(false);

        var stopWatch = new StopWatch();
        stopWatch.start();

        PaginatedRecordWrapper paginatedRecordWrapper  = sampleService.getSamples(request);
        List<GTOSample> samples = (List<GTOSample>) paginatedRecordWrapper.getRecords();
        stopWatch.stop();
        logger.info("[Time: {}]", stopWatch.getTotalTimeSeconds());

        assert (samples != null);
        assert (samples.size() == 10);

        double d = Double.MAX_VALUE;
        testPageSortDescending(samples, d);
    }

    private void testPageSortAscendingStringSample(List<GTOSample> samples, String s) {
        for(GTOSample sample : samples) {
            if(sample.getShWellId() != null) {
                assert (sample.getSampleId().compareTo(s) != -1);
                s = sample.getSampleId();
            }
        }
    }

    private void testPageSortAscendingString(List<GTOSample> samples, String s) {
        for(GTOSample sample : samples) {
            if(sample.getShWellId() != null) {
                assert (sample.getShWellId().compareTo(s) != -1);
                s = sample.getShWellId();
            }
        }
    }

    private void testPageSortDescendingString(List<GTOSample> samples, String s) {
        for(GTOSample sample : samples) {
            if(sample.getShWellId() != null) {
                assert (sample.getShWellId().compareTo(s) != 1);
                s = sample.getShWellId();
            }
        }
    }

    private void testPageSortAscending(List<GTOSample> samples, double d) {
        for(GTOSample sample : samples) {
            assert(sample.getShDepthBot() >= d);
            d = sample.getShDepthBot();
        }
    }

    private void testPageSortDescending(List<GTOSample> samples, double d) {
        for(GTOSample sample : samples) {
            assert(sample.getShDepthBot() <= d);
            d = sample.getShDepthBot();
        }
    }
}
