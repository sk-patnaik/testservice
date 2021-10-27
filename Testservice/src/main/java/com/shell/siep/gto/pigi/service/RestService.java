package com.shell.siep.gto.pigi.service;

import com.shell.siep.gto.commons.UrlConstants;
import com.shell.siep.gto.pigi.exceptions.PigiServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class RestService {

    private static final Logger logger = LoggerFactory.getLogger(RestService.class);

    private final RestTemplate restTemplate;


    @Value("${gto.service.url}")
    private String serviceUrl;

    public RestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public List<Map<String, String>> getWellSampleAnalysis(AnalysisRequest request) throws PigiServiceException {

        logger.debug("Getting Analysis Data [Databases: {}] [SampleIds: {}] [Analysis Names: {}]", request.getDatabases(), request.getSampleIds(),
                request.getAnalysisNames());

        AnalysisResponse response = getAnalysisResponse(request, serviceUrl + UrlConstants.GET_ANALYSIS_DATA);

        return response.getData();
    }

    private AnalysisResponse getAnalysisResponse(AnalysisRequest request, String url) throws PigiServiceException {
        AnalysisResponse response;
        try {

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            headers.set("webaccesskey", request.getAuthkey());
            HttpEntity<AnalysisRequest> entity = new HttpEntity<>(request, headers);

            response = restTemplate.postForObject(url, entity, AnalysisResponse.class);

        } catch (Exception e) {
            throw new PigiServiceException("Exception making rest call [URL: " + url + "]", e);
        }

        if (response == null) {
            throw new PigiServiceException("Response was null [URL: " + url + "]");
        }

        if (response.getError() != null) {
            throw new PigiServiceException("Exception while getting analysis data [Error: "
                    + response.getError().get("msg") + "] [URL: " + url + "]");
        }

        return response;
    }
}
