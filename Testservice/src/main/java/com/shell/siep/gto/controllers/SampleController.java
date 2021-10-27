package com.shell.siep.gto.controllers;

import com.shell.siep.gto.commons.UrlConstants;
import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;
import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.properties.SearchVariableProperties;
import com.shell.siep.gto.services.SampleService;
import com.shell.siep.gto.services.paginated.PaginatedRecordWrapper;
import com.shell.siep.gto.services.paginated.PaginatedSampleSearch;
import com.shell.siep.gto.vo.request.*;
import com.shell.siep.gto.vo.response.GenericAPIResponse;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class SampleController extends APIController {
	private static final Logger _logger = LoggerFactory.getLogger(SampleController.class);

	private final SampleService sampleService;
	private final PaginatedSampleSearch paginatedSampleService;
	private final SearchVariableProperties searchVariableProperties;

	public SampleController(SampleService sampleService, SearchVariableProperties properties,
							PaginatedSampleSearch paginatedSampleService) {
		this.sampleService = sampleService;
		this.searchVariableProperties = properties;
		this.paginatedSampleService = paginatedSampleService;
	}

	@PostMapping(UrlConstants.GET_EXISTING_SAMPLE_IDS)
	@ApiOperation("Gets existing sampleIds that match the sampleIds passed in")
	public GenericAPIResponse getSampleIdsFromSampleIds(@RequestBody final SamplesRequest request) {
		_logger.debug("Getting Existing SampleIds [Databases: {}] [Countries: {}] [WellIds: {}] [SampleIds: {}]", request.getDatabases(),
				request.getCountries(), request.getWellIds(), request.getSampleIds());
		List<String> existingSampleIds = sampleService.getExistingSampleIds(request.getDatabases(), request.getCountries(),
				request.getWellIds(), request.getSampleIds());

		return new GenericAPIResponse(HttpStatus.OK, existingSampleIds);
	}

	@GetMapping(UrlConstants.GET_SAMPLE_DB_ID)
	@ApiOperation(value = "Gets the sample from the database passed")
	public GenericAPIResponse getSample(@PathVariable(value="sampleId") final String sampleId,
                               @PathVariable(value="db") final String db) {
		GenericAPIResponse responseObj;
		try {
			GTOSample sampleDetails = sampleService.getSample(sampleId, db);
			responseObj = new GenericAPIResponse(HttpStatus.OK, sampleDetails);
		} catch (NotFoundException e) {
			_logger.debug("Sample Not Found. [Database: {}] [SampleId: {}]", db, sampleId);
			responseObj = new GenericAPIResponse(HttpStatus.OK, WEBErrorCodeEnum.NO_DATA_FOUND);
		}
		return responseObj;
	}

	@PostMapping(UrlConstants.GET_MATCHING_SAMPLE_IDS)
	@ApiOperation("Gets all sampleIds that match the partial sampleId passed in")
	public GenericAPIResponse getSampleIdsFromPartialSampleId(@RequestBody final SearchRequest request) {
		_logger.debug("Getting SampleIds [Databases: {}] [SampleId: {}]", request.getDatabases(),
				request.getSearchString());

		List<String> matchingSampleIdList = sampleService.getSampleIdsFromPartialSampleId(request.getSearchString(),
					request.getDatabases());

		return new GenericAPIResponse(HttpStatus.OK, matchingSampleIdList);
	}

	@PostMapping(UrlConstants.GET_SAMPLES_FROM_REQUEST)
	@ApiOperation(value = "Gets Samples from the request")
	public GenericAPIResponse getSamples(@RequestBody final PageableSamplesRequest pageableRequest) {
		_logger.debug("Getting samples [Databases: {}] [Countries: {}] [Wells: {}] [Samples: {}]",
				pageableRequest.getDatabases(), pageableRequest.getCountries(), pageableRequest.getWellIds(), pageableRequest.getSampleIds());

		PaginatedRecordWrapper paginatedSamples = paginatedSampleService.getSamples(pageableRequest);

		return new GenericAPIResponse(HttpStatus.OK, paginatedSamples);
	}

	@PostMapping(UrlConstants.GET_SAMPLES_CODES_FROM_COUNTRIES)
	@ApiOperation(value = "Gets all sample code from countries")
	public GenericAPIResponse getSampleIdsFromCountries(@RequestBody final CountriesRequest request) {
		_logger.debug("Getting SampleIds [Databases: {}] [Countries: {}] ", request.getDatabases(),
				request.getCountries());

		List<String> sampleIdList = sampleService.getSamplesIdsFromCountries(request.getDatabases(), request.getCountries());
		return new GenericAPIResponse(HttpStatus.OK, sampleIdList);
	}

	@PostMapping(UrlConstants.GET_SAMPLE_CODES_FROM_WELLS)
	@ApiOperation(value = "Gets all sample codes from the well ids")
	public GenericAPIResponse getSampleIdsFromWellIds(@RequestBody final WellIdsRequest request) {
		_logger.debug("Getting SampleIds [Databases: {}] [Wells: {}] ", request.getDatabases(), request.getWellIds());

		List<String> sampleIdList = sampleService.getSampleIdsFromWellIds(request.getDatabases(), request.getWellIds());
		return new GenericAPIResponse(HttpStatus.OK, sampleIdList);
	}

	@GetMapping(UrlConstants.GET_SAMPLE_TYPES)
	@ApiOperation("Gets All Sample Types")
	public GenericAPIResponse getSampleTypes() {
		_logger.debug("Return Sample Types");
		Map<String, List<String>> resultMap = sampleService.getSamplesTypes();
		return new GenericAPIResponse(HttpStatus.OK, resultMap);
	}

	@GetMapping(UrlConstants.GET_SEARCH_VARS)
	@ApiOperation("Gets Search Variables")
	public GenericAPIResponse getSearchVariables() {
		logger.debug("Returning search variables");
		return new GenericAPIResponse(HttpStatus.OK, searchVariableProperties.getVariables());
	}

}
