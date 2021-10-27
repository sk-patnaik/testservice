package com.shell.siep.gto.pigi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shell.siep.gto.pigi.exceptions.NoAnalysisDataException;
import com.shell.siep.gto.pigi.exceptions.PigiServiceException;
import com.shell.siep.gto.pigi.properties.PigiProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class PigiServiceImpl implements PigiService {

    private static final Logger logger = LoggerFactory.getLogger(PigiServiceImpl.class);

    @Value("${pigi.header.filename}")
    private String pigiHeaderFileName;

    @Value("${pigi.data.filename}")
    private String pigiDataFileName;

    @Value("${pigi.version}")
    private String pigiVersion;

    @Value("${pigi.comment}")
    private String pigiComment;

    @Value("${pigi.dateFormat}")
    private String pigiDateFormat;

    private final RestService restService;
    private final DataStructureCreator dataStructureCreator;

    public PigiServiceImpl(RestService restService, DataStructureCreator dataStructureCreator) {
        this.restService = restService;
        this.dataStructureCreator = dataStructureCreator;
    }

   
    @Override
    public ByteArrayOutputStream createPigiFile(AnalysisRequest request) throws PigiServiceException, NoAnalysisDataException {
        logger.debug("Creating Pigi Files [Databases: {}] [SampleIds: {}] [Analysis Names: {}]",
                request.getDatabases(), request.getSampleIds(), request.getAnalysisNames());

        ByteArrayOutputStream baos;
        List<Map<String, String>> analyses = restService.getWellSampleAnalysis(request);
        Map<String, Map<String, Map<PigiProperty, String>>> dataStructure = dataStructureCreator.createDataStructure(analyses);

        if (dataStructure.size() > 0) {
            List<PigiProperty> headers = extractHeaders(dataStructure);

            String pigiLnk = createGTOLnk(headers);
            String gtoData = createGTOData(headers, dataStructure);

            baos = createZipFile(pigiLnk, gtoData);

        } else {
            throw new NoAnalysisDataException("There were no analysis data returned. [Databases: " + request.getDatabases() +
                    "] [SampleIds: " + request.getSampleIds() + "] [Analysis Names: " + request.getAnalysisNames() + "]");
        }

        logger.debug("Created Pigi Files Successfully [Databases: {}] [SampleIds: {}] [Analysis Names: {}]",
                request.getDatabases(), request.getSampleIds(), request.getAnalysisNames());

        return baos;
    }

    private List<PigiProperty> extractHeaders(Map<String, Map<String, Map<PigiProperty, String>>> data) {
        Set<PigiProperty> headers = new LinkedHashSet<>();

        for (Map<String, Map<PigiProperty, String>> sample : data.values()) {
            for (Map<PigiProperty, String> request : sample.values()) {
                headers.addAll(request.keySet());
            }
        }

        return new LinkedList<>(headers);
    }

    private String createGTOLnk(List<PigiProperty> headers) throws PigiServiceException {
        Calendar cal = Calendar.getInstance();
        String userName = System.getProperty("user.name");
        SimpleDateFormat sdf = new SimpleDateFormat(pigiDateFormat);

        PigiLnk data = new PigiLnk();
        data.setCreationAuthor(userName);
        data.setLastEditAuthor(userName);
        data.setCreationDate(sdf.format(cal.getTime()));
        data.setLastEdit(sdf.format(cal.getTime()));
        data.setComments(pigiComment);
        data.setProperLinks(new ArrayList<>(headers));
        data.setNumberOfTemplateProperties(headers.size());
        data.setVersion(pigiVersion);

        ObjectMapper mapper = new ObjectMapper();
        String json;

        try {
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new PigiServiceException("Exception converting into json", e);
        }

        return json;
    }

    private String createGTOData(List<PigiProperty> headers, Map<String, Map<String, Map<PigiProperty, String>>> dataStructure) {
        List<List<String>> data = new LinkedList<>();
        List<String> titles = new LinkedList<>();
        List<String> units = new LinkedList<>();

        for (PigiProperty pigiProperty : headers) {
            titles.add(pigiProperty.getFileProperty());
            if (pigiProperty.getUnitSymbol() == null || pigiProperty.getUnitSymbol().equals("UNDEFINED")) {
                units.add("");
            } else {
                units.add(pigiProperty.getUnitSymbol());
            }
        }

        data.add(titles);
        data.add(units);
        data.addAll(getDataValues(headers, dataStructure));

        return getGTODataAsString(data);
    }

    private List<List<String>> getDataValues(List<PigiProperty> headers,
                                             Map<String, Map<String, Map<PigiProperty, String>>> dataStructure) {

        List<List<String>> dataValues = new LinkedList<>();

        for (Map<String, Map<PigiProperty, String>> sample : dataStructure.values()) {

            for (Map<PigiProperty, String> request : sample.values()) {
                List<String> row = new LinkedList<>();

                for (PigiProperty pigiProperty : headers) {
                    String value = request.getOrDefault(pigiProperty, "");

                    if (value == null || value.equals("null")) {
                        value = "";
                    }

                    row.add(value);
                }

                dataValues.add(row);
            }
        }
        return dataValues;
    }

    private String getGTODataAsString(List<List<String>> gtoData) {
        StringBuilder builder = new StringBuilder();

        for (List<String> row : gtoData) {
            String delimiter = "";
            for (String cell : row) {
                builder.append(delimiter).append(cell);
                delimiter = "\t";
            }
            builder.append(System.lineSeparator());
        }

        return builder.toString();
    }

    private ByteArrayOutputStream createZipFile(String pigiLnk, String gtoData) throws PigiServiceException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            ZipOutputStream out = new ZipOutputStream(baos);
            outputZipEntry(out, pigiHeaderFileName, pigiLnk);
            outputZipEntry(out, pigiDataFileName, gtoData);
            out.close();

        } catch (Exception e) {
            throw new PigiServiceException("Exception creating zip file", e);
        }

        return baos;
    }

    private void outputZipEntry(ZipOutputStream out, String entryName, String data) throws IOException {
        ZipEntry e = new ZipEntry(entryName);
        out.putNextEntry(e);

        byte[] dataBytes = data.getBytes();
        out.write(dataBytes, 0, dataBytes.length);
        out.closeEntry();
    }
}
