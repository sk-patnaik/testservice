package com.shell.siep.gto.security.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.shell.siep.gto.commons.UrlConstants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;
import com.shell.siep.gto.controllers.APIController;
import com.shell.siep.gto.security.exceptions.LoginAuthenticationFailedException;
import com.shell.siep.gto.security.pojos.ApplicationUser;
import com.shell.siep.gto.user.services.UserService;
import com.shell.siep.gto.validators.LoginRequestBeanValidator;
import com.shell.siep.gto.vo.request.LoginRequest;
import com.shell.siep.gto.vo.response.GenericAPIResponse;

@RestController
public class DeviceLoginController extends APIController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private LoginRequestBeanValidator loginValidator;
	
	@PostMapping(UrlConstants.LOGIN_URL)
	public GenericAPIResponse doLogin(@RequestBody @Valid LoginRequest loginRequest, BindingResult result, HttpServletRequest request){
		String tokenParam = Optional
								.ofNullable(request.getHeader("webaccesskey"))
								.orElse(request.getParameter("webaccesskey"));
		
		if(StringUtils.isNotBlank(tokenParam)) {
			boolean valid = false;
			valid = userService.checkTokenValidity(tokenParam);
			if(valid)
				return new GenericAPIResponse(HttpStatus.BAD_REQUEST,
											  WEBErrorCodeEnum.INVALID_LOGIN_REQUEST,
											  "Token already issued.");
		}
		
		loginValidator.validate(loginRequest, result);
		
		if(result.hasErrors()){  
			return new GenericAPIResponse(HttpStatus.BAD_REQUEST,
					WEBErrorCodeEnum.INPUT_VALIDATION_EXCEPTION, result.getFieldErrors());
		}
		
		GenericAPIResponse apiResponse = null; 
		
		try {
			ApplicationUser user = userService.authenticateUser(loginRequest);
			if(user == null)
				throw new LoginAuthenticationFailedException(loginRequest.getUsername());
			else
				apiResponse = new GenericAPIResponse(HttpStatus.OK, user);
			
		} catch (LoginAuthenticationFailedException e) { 
			logger.info(" Authentication failed for user " + loginRequest.getUsername() + ", invalid credentials. " + e.getMessage() );
			apiResponse = new GenericAPIResponse(HttpStatus.UNAUTHORIZED, WEBErrorCodeEnum.AUTHENTICATION_FALIED_EXCEPTION, e.getMessage());
		} catch(UsernameNotFoundException e){
			logger.info(" UsernameNotFoundException for user " + loginRequest.getUsername() + ", user not found. " + e.getMessage() );
			apiResponse = new GenericAPIResponse(HttpStatus.UNAUTHORIZED, WEBErrorCodeEnum.USER_NOT_FOUND,e.getMessage());
		} catch (DataAccessException e) {
			logger.info(" The database is down. " + e.getMessage() );
			apiResponse = new GenericAPIResponse(HttpStatus.SERVICE_UNAVAILABLE, WEBErrorCodeEnum.DATA_ACCESS_ERROR, e.getMessage());
		}
		catch (Exception e) { 
			logger.error(" Authentication failed for user " + loginRequest.getUsername() + ". " + e.getMessage() );
			apiResponse = new GenericAPIResponse(HttpStatus.INTERNAL_SERVER_ERROR, WEBErrorCodeEnum.INTERNAL_SERVER_EXCEPTION, e);
		}
				
		return apiResponse;
	}
}
