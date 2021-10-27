package com.shell.siep.gto.controllers;

import com.shell.siep.gto.commons.UrlConstants;
import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;
import com.shell.siep.gto.properties.DataCategoryProperties;
import com.shell.siep.gto.services.AnalysisService;
import com.shell.siep.gto.vo.request.AnalysisRequest;
import com.shell.siep.gto.vo.response.GenericAPIResponse;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class AnalysisController extends APIController {

	private static final Logger _logger = LoggerFactory.getLogger(AnalysisController.class);
	private final DataCategoryProperties dataCategoryProperties;
	private final AnalysisService analysisService;

    public AnalysisController(DataCategoryProperties dataCategoryProperties, AnalysisService analysisService) {
    	this.dataCategoryProperties = dataCategoryProperties;
    	this.analysisService = analysisService;
	}

	@GetMapping(UrlConstants.GET_DATA_CATEGORIES)
	@ApiOperation("Gets All Analysis Categories")
	public GenericAPIResponse getDataCategories() {
		logger.debug("Returning data categories");
		return new GenericAPIResponse(HttpStatus.OK, dataCategoryProperties.getCategories());
	}

	@PostMapping(UrlConstants.GET_ANALYSIS_DATA)
	@ApiOperation("Get Analysis Data")
	public GenericAPIResponse getAnalysisData(@RequestBody final AnalysisRequest request) {
		_logger.debug("Getting Analysis Data [Databases: {}] [SampleIds: {}] [Analysis Names: {}] [Analysis Categories {}]",
				request.getDatabases(), request.getSampleIds(), request.getAnalysisNames(), request.getAnalysisCategories());


		checkDatabases(request);

		if(CollectionUtils.isEmpty(request.getDatabases())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "There are no searchable databases in the request");
		}

		if(CollectionUtils.isEmpty(request.getAnalysisNames()) || CollectionUtils.isEmpty(request.getSampleIds())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "There is missing criteria in the request");
		}

		List<Object> analysisResponses = analysisService.getAnalysisData(request);

		if(CollectionUtils.isEmpty(analysisResponses)) {
			return new GenericAPIResponse(HttpStatus.OK, WEBErrorCodeEnum.NO_DATA_FOUND);
		}

		return new GenericAPIResponse(HttpStatus.OK, analysisResponses);
	}

}
