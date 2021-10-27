package com.shell.siep.gto.controllers;

import com.shell.siep.gto.commons.UrlConstants;
import com.shell.siep.gto.persistence.vo.WellLatLong;
import com.shell.siep.gto.vo.request.CountriesRequest;
import com.shell.siep.gto.vo.request.SearchRequest;
import com.shell.siep.gto.vo.request.WellICountryRequest;
import com.shell.siep.gto.vo.request.WellLatLongRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;
import com.shell.siep.gto.persistence.model.GTOWell;
import com.shell.siep.gto.services.WellService;
import com.shell.siep.gto.vo.response.GenericAPIResponse;

import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;

import java.util.List;

@RestController
public class WellController extends APIController {
    private static final Logger _logger = LoggerFactory.getLogger(WellController.class);

	private final WellService wellService;

	public WellController(WellService wellService) {
		this.wellService = wellService;
	}


	@PostMapping(UrlConstants.GET_EXISTING_WELL_IDS)
	@ApiOperation("Gets existing wellIds that match the wellIds passed in")
	public GenericAPIResponse getWellIdsFromWellIds(@RequestBody final WellICountryRequest request) {
		_logger.debug("Getting Existing WellsId [Databases: {}] [WellId: {}]", request.getDatabases(),
				request.getWellIds());

		List<String> existingWellIds = wellService.getExistingWellIds(request.getDatabases(), request.getCountries(),
				request.getWellIds());

		return new GenericAPIResponse(HttpStatus.OK, existingWellIds);
	}

	@GetMapping(UrlConstants.GET_WELL_DB_ID)
	@ApiOperation(value = "Gets the well for database passed that match the wellId")
	public GenericAPIResponse getWell(@PathVariable(value="wellId") final String wellId,
						   @PathVariable(value="db") final String db) {
	    _logger.debug("Getting Well [Database: {}] [WellId: {}]", db, wellId);
		GenericAPIResponse responseObj;
		try {
			GTOWell wellDetails = wellService.getWell(wellId, db);
			responseObj = new GenericAPIResponse(HttpStatus.OK, wellDetails);
		} catch (NotFoundException e) {
			_logger.debug(e.getMessage());
			responseObj = new GenericAPIResponse(HttpStatus.OK, WEBErrorCodeEnum.NO_DATA_FOUND);
		}
		catch (Exception e) {
			_logger.error("Exception getting Well [Database: {}] [WellId: {}]", db, wellId, e);
			responseObj = new GenericAPIResponse(HttpStatus.INTERNAL_SERVER_ERROR,
					WEBErrorCodeEnum.SERVICE_LAYER_EXCEPTION, e);
		}
		return responseObj;
	}

	@PostMapping(UrlConstants.GET_MATCHING_WELL_IDS)
	@ApiOperation("Gets all wellIds that match the partial wellId passed in")
	public GenericAPIResponse getWellIdsFromPartialWellId(@RequestBody final SearchRequest request) {
		_logger.debug("Getting WellsId [Databases: {}] [WellId: {}]", request.getDatabases(),
				request.getSearchString());

		List<String> wellIdList = wellService.getWellIdsFromPartialWellId(request.getSearchString(), request.getDatabases());
		return new GenericAPIResponse(HttpStatus.OK, wellIdList);
	}

	@PostMapping(UrlConstants.GET_WELL_IDS_FROM_COUNTRIES)
	@ApiOperation(value = "Gets all wellIds from the countries")
	public GenericAPIResponse getWellIdsFromCountries(@RequestBody final CountriesRequest request) {
		_logger.debug("Getting WellIds [Databases: {}] [Countries: {}]", request.getDatabases(), request.getCountries());

		List<String> wellIdList = wellService.getWellIdsFromCountries(request.getDatabases(), request.getCountries());
		return new GenericAPIResponse(HttpStatus.OK, wellIdList);
	}

	@PostMapping(UrlConstants.GET_WELL_LAT_LONG)
	@ApiOperation("Gets all wellIds with lat and long")
	public GenericAPIResponse getWellIdsWithLatLong(@RequestBody final WellLatLongRequest request) {
		_logger.debug("Getting WellsId [Databases: {}] [Countries: {}] [WellIds: {}] [SampleIds: {}] [Sample Types: {}]",
				request.getDatabases(), request.getCountries(), request.getWellIds(), request.getSampleIds(), request.getSampleTypes());

		List<WellLatLong> wellIdList = wellService.getWellIdsWithLatLong(request.getDatabases(), request.getCountries(),
					request.getWellIds(), request.getSampleIds(), request.getSampleTypes());

		return new GenericAPIResponse(HttpStatus.OK, wellIdList);
	}
}
