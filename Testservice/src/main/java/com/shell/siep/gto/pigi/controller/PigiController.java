package com.shell.siep.gto.pigi.controller;

import com.shell.siep.gto.commons.UrlConstants;
import com.shell.siep.gto.pigi.exceptions.NoAnalysisDataException;
import com.shell.siep.gto.pigi.exceptions.PigiServiceException;
import com.shell.siep.gto.pigi.service.AnalysisRequest;
import com.shell.siep.gto.pigi.service.PigiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.io.ByteArrayOutputStream;

@RestController
public class PigiController {

    private static final Logger logger = LoggerFactory.getLogger(PigiController.class);
    private static final HttpHeaders HEADERS = new HttpHeaders();

    private final PigiService service;

    static {
        HEADERS.add("Cache-Control", "no-cache, no-store, must-revalidate");
        HEADERS.add("Pragma", "no-cache");
        HEADERS.add("Expires", "0");
    }

    public PigiController(PigiService service) {
        this.service = service;
    }

    @PostMapping(UrlConstants.GET_PIGI_ANALYSIS_DATA)
    public ResponseEntity<Resource> getAnalysisData(@RequestBody final AnalysisRequest request, @RequestHeader("webaccesskey") String key)
            throws NoAnalysisDataException, PigiServiceException {

        logger.debug("Getting Analysis Data [Databases: {}] [SampleIds: {}] [Analysis Names: {}] [Analysis Categories {}]",
                request.getDatabases(), request.getSampleIds(), request.getAnalysisNames(), request.getAnalysisNames());

        request.setAuthkey(key);
        if (CollectionUtils.isEmpty(request.getDatabases())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "There are no searchable databases in the request");
        }

        if (CollectionUtils.isEmpty(request.getAnalysisNames()) || CollectionUtils.isEmpty(request.getSampleIds())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "There is missing criteria in the request");
        }
        ByteArrayOutputStream baos = service.createPigiFile(request);

        ByteArrayResource resource = new ByteArrayResource(baos.toByteArray());

        return ResponseEntity.ok()
                .headers(HEADERS)
                .contentLength(baos.size())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }
}
