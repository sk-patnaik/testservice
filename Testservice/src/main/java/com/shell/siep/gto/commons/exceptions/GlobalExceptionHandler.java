package com.shell.siep.gto.commons.exceptions;

import javax.servlet.ServletException;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingMatrixVariableException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingRequestCookieException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.util.NestedServletException;

import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;
import com.shell.siep.gto.vo.response.GenericAPIResponse;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE) 
public class GlobalExceptionHandler {
    
    @ExceptionHandler(NestedServletException.class)
	public GenericAPIResponse handleMissingParams(NestedServletException ex) {
	    String name = getInputName(ex);
	    return new GenericAPIResponse(HttpStatus.BAD_REQUEST, 
									WEBErrorCodeEnum.INPUT_VALIDATION_EXCEPTION,
									name + " is required" );
	}
    
    @ExceptionHandler(NullPointerException.class)
	public GenericAPIResponse handleNullPointerException(NullPointerException ne) { 
	    return new GenericAPIResponse(HttpStatus.INTERNAL_SERVER_ERROR, 
						    		WEBErrorCodeEnum.NULL_POINTER_EXCEPTION,
						    		ne);
	    
	}
    
    @ExceptionHandler(ServletException.class)
	public GenericAPIResponse handleNo(ServletException ne) { 
    	HttpStatus status;
    	if(ne instanceof HttpRequestMethodNotSupportedException || ne instanceof HttpMediaTypeNotSupportedException)
    		status = HttpStatus.BAD_REQUEST;
    	else if(ne instanceof NoHandlerFoundException)
    		status = HttpStatus.NOT_FOUND;
    	else
    		status = HttpStatus.BAD_REQUEST;
		return new GenericAPIResponse(status, WEBErrorCodeEnum.INVALID_API_REQUEST, ne);
	}
	
	@ExceptionHandler(value = {ReflectiveOperationException.class, ConversionFailedException.class})
	public GenericAPIResponse handle(Exception ex) {
		return new GenericAPIResponse(HttpStatus.BAD_REQUEST,
									WEBErrorCodeEnum.INVALID_API_REQUEST,
									ex);
	}
	
	@ExceptionHandler(DataAccessException.class)
	public GenericAPIResponse handleDataAccessException(DataAccessException ex) {
	    return new GenericAPIResponse(HttpStatus.SERVICE_UNAVAILABLE, 
									WEBErrorCodeEnum.DATA_ACCESS_ERROR,
									ex );
	}
    
	private String getInputName(NestedServletException ex) {
		String name = null;
		if(ex instanceof MissingRequestCookieException)
			name = ((MissingRequestCookieException) ex).getCookieName();
		else if(ex instanceof MissingRequestHeaderException)
			name = ((MissingRequestHeaderException) ex).getHeaderName();
		else if(ex instanceof MissingPathVariableException)
			name = ((MissingPathVariableException) ex).getVariableName();
		else if(ex instanceof MissingMatrixVariableException)
			name = ((MissingMatrixVariableException) ex).getVariableName();
		else if(ex instanceof MissingServletRequestParameterException)
			name = ((MissingServletRequestParameterException) ex).getParameterName();
    	return name;
	}
}
