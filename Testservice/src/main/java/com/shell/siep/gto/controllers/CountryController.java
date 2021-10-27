package com.shell.siep.gto.controllers;

import com.shell.siep.gto.commons.UrlConstants;
import com.shell.siep.gto.services.CountryService;
import com.shell.siep.gto.vo.response.GenericAPIResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CountryController extends APIController {

	private final CountryService countryService;

	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}

	@GetMapping(UrlConstants.GET_ALL_COUNTRIES)
	@ApiOperation("Gets All Country Names")
	public GenericAPIResponse getCountryNames() {
		logger.debug("Returning country names");
			Map<String, List<String>> resultMap = countryService.getAllCountryNamesFromAllDatabases();
			return new GenericAPIResponse(HttpStatus.OK, resultMap);
	}

}
