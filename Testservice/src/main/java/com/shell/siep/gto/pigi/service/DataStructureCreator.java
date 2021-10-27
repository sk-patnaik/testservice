package com.shell.siep.gto.pigi.service;

import com.shell.siep.gto.pigi.properties.PigiProperties;
import com.shell.siep.gto.pigi.properties.PigiProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataStructureCreator {

    public static final String SAMPLE_ID = "sampleId";
    public static final String REQUEST_ID = "requestId";

    private final PigiProperties props;


    public DataStructureCreator(PigiProperties props) {
        this.props = props;
    }

    public Map<String, Map<String, Map<PigiProperty, String>>> createDataStructure(List<Map<String, String>> analyses) {

        Map<String, Map<String, Map<PigiProperty, String>>> dataStructure = new HashMap<>();
        List<Map<String, String>> noRequestList = new ArrayList<>();

        for (Map<String, String> analysis : analyses) {

            if(analysis.containsKey(REQUEST_ID)) {
                String sampleId = analysis.get(SAMPLE_ID);
                String requestId = analysis.get(REQUEST_ID);

                dataStructure.computeIfAbsent(sampleId, k -> new HashMap<>());
                dataStructure.get(sampleId).computeIfAbsent(requestId, k -> new HashMap<>());

                List<PigiProperty> pigiProperties = props.getProperties().get(analysis.get("name"));
                pigiProperties.addAll(props.getProperties().get("common"));

                for(PigiProperty prop: pigiProperties) {
                    dataStructure.get(sampleId).get(requestId).put(prop, analysis.get(prop.getGto()));
                }

            } else {
               noRequestList.add(analysis);
            }
        }

        putInAnalysisWithoutRequests(noRequestList, dataStructure);

        return dataStructure;
    }

    private void putInAnalysisWithoutRequests(List<Map<String, String>> noRequestList, Map<String, Map<String,
                                                Map<PigiProperty, String>>> dataStructure) {

        for(Map<String, String> analysis: noRequestList) {
            String sampleId = analysis.get(SAMPLE_ID);

            dataStructure.computeIfAbsent(sampleId, k -> new HashMap<>());
            if(dataStructure.get(sampleId).isEmpty()) {
                dataStructure.put("NO_REQUEST", new HashMap<>());
            }

            for(Map<PigiProperty, String> data : dataStructure.get(sampleId).values())  {
                List<PigiProperty> pigiProperties = props.getProperties().get(analysis.get("name"));
                pigiProperties.addAll(props.getProperties().get("common"));

                for(PigiProperty prop: pigiProperties) {
                    data.put(prop, analysis.get(prop.getGto()));
                }
            }
        }
    }
}
