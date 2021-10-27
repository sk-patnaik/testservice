package com.shell.siep.gto.pigi;

import com.shell.siep.gto.pigi.exceptions.NoAnalysisDataException;
import com.shell.siep.gto.pigi.exceptions.PigiServiceException;
import com.shell.siep.gto.pigi.properties.PigiProperties;
import com.shell.siep.gto.pigi.service.AnalysisRequest;
import com.shell.siep.gto.pigi.service.PigiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class PigiApplicationTest {

	@Autowired
	private PigiService pigiService;

	@Autowired
	private PigiProperties pigiProperties;

	@Test
	public void getPropertiesTest() {
		assert (pigiProperties != null);
		assert (pigiProperties.getProperties().size() > 0);
		assert (pigiProperties.getProperties().get("p:IGI Base Info").size() >0 );
	}

	@Test
	public void buildFileTest() throws PigiServiceException, NoAnalysisDataException, IOException {
		String filePath = "C:\\Users\\P.Poranski\\temp\\pigi\\test.zip";

		List<String> databases = Collections.singletonList("DD");
		List<String> sampleIds = Collections.singletonList("FPC_8752");
		List<String> analysisNames = new ArrayList<>();
		analysisNames.add("p:IGI Base Info");
		analysisNames.add("p:IGI Misc Biomarkers");
		analysisNames.add("p:IGI aromatics");
		AnalysisRequest request = new AnalysisRequest(databases, sampleIds, analysisNames);
		ByteArrayOutputStream baos = pigiService.createPigiFile(request);

		OutputStream os = new FileOutputStream(filePath);
		os.write(baos.toByteArray());
		os.close();

		File f = new File(filePath);
		assert(f.exists());
		//f.delete();
	}

	@Test
	public void setPigiPropertiesTest() {
		assert(pigiProperties.getProperties().size() >0);
		assert (pigiProperties.getProperties().size()	> 0);
	}

}
