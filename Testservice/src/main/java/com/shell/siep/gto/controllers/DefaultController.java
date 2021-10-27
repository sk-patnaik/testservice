package com.shell.siep.gto.controllers;

import java.util.Map;
import java.util.stream.Collectors;

import com.shell.siep.gto.commons.UrlConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.vo.response.GenericAPIResponse;

import io.swagger.annotations.ApiOperation;

@RestController
public class DefaultController extends APIController {

	@GetMapping(UrlConstants.HEALTH)
	@ApiOperation(value = "Check health of services")
	public String health() {
		return "success";
	}

 	@GetMapping(UrlConstants.ACTIVE_DBS)
	@ApiOperation(value = "Returns Active Databases")
	public GenericAPIResponse getActiveDatabases() {

		Map<String, String> dbs = Database.getActiveDatabases().stream()
				.collect(Collectors.toMap(Database::getCode, Database::getName));

		return new GenericAPIResponse(HttpStatus.OK, dbs);
	}
}
