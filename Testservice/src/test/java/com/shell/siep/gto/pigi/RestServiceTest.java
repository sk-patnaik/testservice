package com.shell.siep.gto.pigi;

import com.shell.siep.gto.pigi.exceptions.PigiServiceException;
import com.shell.siep.gto.pigi.service.AnalysisRequest;
import com.shell.siep.gto.pigi.service.RestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RestServiceTest {

	@Autowired
	private RestService restService;

	@Test
	public void getWellSampleAnalysisTest() throws PigiServiceException {

		List<String> databases = Collections.singletonList("DD");
		List<String> sampleIds = Collections.singletonList("FPC_8752");
		List<String> analysisNames = new ArrayList<>();
		analysisNames.add("p:IGI Base Info");
		analysisNames.add("p:IGI Misc Biomarkers");
		analysisNames.add("p:IGI aromatics");
		AnalysisRequest request = new AnalysisRequest(databases, sampleIds, analysisNames);
		List<Map<String, String>> analyses = restService.getWellSampleAnalysis(request);

		assert (analyses.size() > 0);

		for(Map<String, String> analysis : analyses) {
			assert (sampleIds.contains(analysis.get("sampleId")));
			assert (analysisNames.contains(analysis.get("name")));
		}
	}

	@Test
	public void getWellSampleAnalysisFailTest() {

		List<String> databases = Collections.singletonList("DD");
		List<String> sampleIds = Collections.singletonList("FPC_8752X");
		List<String> analysisNames = new ArrayList<>();
		analysisNames.add("p:IGI Base Info");

		try {
			AnalysisRequest request = new AnalysisRequest(databases, sampleIds, analysisNames);
			restService.getWellSampleAnalysis(request);

		} catch (PigiServiceException e) {
		    assert(e.getMessage().contains("NO_DATA_FOUND"));
		}
	}
}

