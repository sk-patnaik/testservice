package com.shell.siep.gto.pigi;

import com.shell.siep.gto.pigi.properties.PigiProperties;
import com.shell.siep.gto.pigi.properties.PigiProperty;
import com.shell.siep.gto.pigi.service.DataStructureCreator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DataStructureCreatorTest {

	@Autowired
	private DataStructureCreator dataStructureCreator;

	@Autowired
	private PigiProperties pigiProperties;

	public static final List<Map<String, String>> TEST_ANALYSES = new ArrayList<>();

	@Test
	public void createDataStructureTest() {

		Map<String, Map<String, Map<PigiProperty, String>>> dataStructure =
				dataStructureCreator.createDataStructure(TEST_ANALYSES);

		assert(dataStructure.size() == 2);
		assert(dataStructure.get("sample1").size() == 3);
		assert(dataStructure.get("sample1").get("request1Sample1").get(getProperty("common", "sampleId")).equals("sample1"));
		assert(dataStructure.get("sample1").get("request1Sample1").get(getProperty("p:IGI Base Info", "topDepth")).equals("topDepthSample1"));
		assert(dataStructure.get("sample1").get("request1Sample1").get(getProperty("p:IGI Base Info", "baseDepth")).equals("baseDepthSample1"));
		assert(dataStructure.get("sample1").get("request1Sample1").get(getProperty("p:IGI Misc Biomarkers", "drimane")).equals("drimaneRequest1Sample1"));
		assert(dataStructure.get("sample1").get("request1Sample1").get(getProperty("p:IGI Misc Biomarkers", "hdrimane")).equals("hdrimaneRequest1Sample1"));
		assert(dataStructure.get("sample1").get("request1Sample1").get(getProperty("p:IGI Misc Biomarkers", "kaurane")).equals("kauraneRequest1Sample1"));
		assert(dataStructure.get("sample1").get("request2Sample1").get(getProperty("common", "sampleId")).equals("sample1"));
		assert(dataStructure.get("sample1").get("request2Sample1").get(getProperty("p:IGI Base Info", "topDepth")).equals("topDepthSample1"));
		assert(dataStructure.get("sample1").get("request2Sample1").get(getProperty("p:IGI Base Info", "baseDepth")).equals("baseDepthSample1"));
		assert(dataStructure.get("sample1").get("request2Sample1").get(getProperty("p:IGI Misc Biomarkers", "drimane")).equals("drimaneRequest2Sample1"));
		assert(dataStructure.get("sample1").get("request2Sample1").get(getProperty("p:IGI Misc Biomarkers", "hdrimane")).equals("hdrimaneRequest2Sample1"));
		assert(dataStructure.get("sample1").get("request2Sample1").get(getProperty("p:IGI Misc Biomarkers", "kaurane")).equals("kauraneRequest2Sample1"));
		assert(dataStructure.get("sample1").get("request3Sample1").get(getProperty("common", "sampleId")).equals("sample1"));
		assert(dataStructure.get("sample1").get("request3Sample1").get(getProperty("p:IGI Base Info", "topDepth")).equals("topDepthSample1"));
		assert(dataStructure.get("sample1").get("request3Sample1").get(getProperty("p:IGI Base Info", "baseDepth")).equals("baseDepthSample1"));
		assert(dataStructure.get("sample1").get("request3Sample1").get(getProperty("p:IGI aromatics", "cad")).equals("cadRequest3Sample1"));
		assert(dataStructure.get("sample1").get("request3Sample1").get(getProperty("p:IGI aromatics", "dmn15")).equals("dmn15Request3Sample1"));
		assert(dataStructure.get("sample1").get("request3Sample1").get(getProperty("p:IGI aromatics", "dbt")).equals("dbtRequest3Sample1"));
		assert(dataStructure.get("sample2").size() == 3);
		assert(dataStructure.get("sample2").get("request1Sample2").get(getProperty("common", "sampleId")).equals("sample2"));
		assert(!dataStructure.get("sample2").get("request1Sample2").containsKey(getProperty("p:IGI Base Info", "topDepth")));
		assert(!dataStructure.get("sample2").get("request1Sample2").containsKey(getProperty("p:IGI Base Info", "baseDepth")));
		assert(dataStructure.get("sample2").get("request1Sample2").get(getProperty("p:IGI Misc Biomarkers", "drimane")).equals("drimaneRequest1Sample2"));
		assert(dataStructure.get("sample2").get("request1Sample2").get(getProperty("p:IGI Misc Biomarkers", "hdrimane")).equals("hdrimaneRequest1Sample2"));
		assert(dataStructure.get("sample2").get("request1Sample2").get(getProperty("p:IGI Misc Biomarkers", "kaurane")).equals("kauraneRequest1Sample2"));
		assert(dataStructure.get("sample2").get("request2Sample2").get(getProperty("common", "sampleId")).equals("sample2"));
		assert(!dataStructure.get("sample2").get("request1Sample2").containsKey(getProperty("p:IGI Base Info", "topDepth")));
		assert(!dataStructure.get("sample2").get("request1Sample2").containsKey(getProperty("p:IGI Base Info", "baseDepth")));
		assert(dataStructure.get("sample2").get("request2Sample2").get(getProperty("p:IGI Misc Biomarkers", "drimane")).equals("drimaneRequest2Sample2"));
		assert(dataStructure.get("sample2").get("request2Sample2").get(getProperty("p:IGI Misc Biomarkers", "hdrimane")).equals("hdrimaneRequest2Sample2"));
		assert(dataStructure.get("sample2").get("request2Sample2").get(getProperty("p:IGI Misc Biomarkers", "kaurane")).equals("kauraneRequest2Sample2"));
		assert(dataStructure.get("sample2").get("request3Sample2").get(getProperty("common", "sampleId")).equals("sample2"));
		assert(!dataStructure.get("sample2").get("request1Sample2").containsKey(getProperty("p:IGI Base Info", "topDepth")));
		assert(!dataStructure.get("sample2").get("request1Sample2").containsKey(getProperty("p:IGI Base Info", "baseDepth")));
		assert(dataStructure.get("sample2").get("request3Sample2").get(getProperty("p:IGI aromatics", "cad")).equals("cadRequest3Sample2"));
		assert(dataStructure.get("sample2").get("request3Sample2").get(getProperty("p:IGI aromatics", "dmn15")).equals("dmn15Request3Sample2"));
		assert(dataStructure.get("sample2").get("request3Sample2").get(getProperty("p:IGI aromatics", "dbt")).equals("dbtRequest3Sample2"));
	}

	private PigiProperty getProperty(String cat, String var) {
		for(PigiProperty p: pigiProperties.getProperties().get(cat)) {
			if(p.getGto().equals(var)) {
				return p;
			}
		}
		return null;
	}


	static {
		Map<String, String> analysis1 = new HashMap<>();
		analysis1.put("sampleId", "sample1");
		analysis1.put("topDepth", "topDepthSample1");
		analysis1.put("baseDepth", "baseDepthSample1");
		analysis1.put("name", "p:IGI Base Info");
		TEST_ANALYSES.add(analysis1);

		Map<String, String> analysis2 = new HashMap<>();
		analysis2.put("sampleId", "sample1");
		analysis2.put("drimane", "drimaneRequest1Sample1");
		analysis2.put("hdrimane", "hdrimaneRequest1Sample1");
		analysis2.put("kaurane", "kauraneRequest1Sample1");
		analysis2.put("requestId", "request1Sample1");
		analysis2.put("name", "p:IGI Misc Biomarkers");
		TEST_ANALYSES.add(analysis2);

		Map<String, String> analysis3 = new HashMap<>();
		analysis3.put("sampleId", "sample1");
		analysis3.put("drimane", "drimaneRequest2Sample1");
		analysis3.put("hdrimane", "hdrimaneRequest2Sample1");
		analysis3.put("kaurane", "kauraneRequest2Sample1");
		analysis3.put("requestId", "request2Sample1");
		analysis3.put("name", "p:IGI Misc Biomarkers");
		TEST_ANALYSES.add(analysis3);

		Map<String, String> analysis4 = new HashMap<>();
		analysis4.put("sampleId", "sample1");
		analysis4.put("cad", "cadRequest3Sample1");
		analysis4.put("dmn15", "dmn15Request3Sample1");
		analysis4.put("dbt", "dbtRequest3Sample1");
		analysis4.put("requestId", "request3Sample1");
		analysis4.put("name", "p:IGI aromatics");
		TEST_ANALYSES.add(analysis4);

		Map<String, String> analysis6 = new HashMap<>();
		analysis6.put("sampleId", "sample2");
		analysis6.put("drimane", "drimaneRequest1Sample2");
		analysis6.put("hdrimane", "hdrimaneRequest1Sample2");
		analysis6.put("kaurane", "kauraneRequest1Sample2");
		analysis6.put("requestId", "request1Sample2");
		analysis6.put("name", "p:IGI Misc Biomarkers");
		TEST_ANALYSES.add(analysis6);

		Map<String, String> analysis7 = new HashMap<>();
		analysis7.put("sampleId", "sample2");
		analysis7.put("drimane", "drimaneRequest2Sample2");
		analysis7.put("hdrimane", "hdrimaneRequest2Sample2");
		analysis7.put("kaurane", "kauraneRequest2Sample2");
		analysis7.put("requestId", "request2Sample2");
		analysis7.put("name", "p:IGI Misc Biomarkers");
		TEST_ANALYSES.add(analysis7);

		Map<String, String> analysis8 = new HashMap<>();
		analysis8.put("sampleId", "sample2");
		analysis8.put("cad", "cadRequest3Sample2");
		analysis8.put("dmn15", "dmn15Request3Sample2");
		analysis8.put("dbt", "dbtRequest3Sample2");
		analysis8.put("requestId", "request3Sample2");
		analysis8.put("name", "p:IGI aromatics");
		TEST_ANALYSES.add(analysis8);
	}
}
