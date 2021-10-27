package com.shell.siep.gto.security.exceptions;

import org.springframework.security.core.AuthenticationException;

import com.shell.siep.gto.commons.enums.ErrorCodes;

public class InvalidTokenException extends AuthenticationException {

	private static final long serialVersionUID = 809733285415144928L;
	private final ErrorCodes errorCodes;
	
	public InvalidTokenException(ErrorCodes errorCodes){
		super(errorCodes.getMessage());
		this.errorCodes = errorCodes;
	}
	public InvalidTokenException(String message, ErrorCodes errorCodes){
		super(message);
		this.errorCodes = errorCodes;
	}
	 
	public ErrorCodes getErrorCodes() {
		return errorCodes;
	}

	@Override
	public String toString() {
		return "TokenNotValidException [errorCodes=" + errorCodes + "]"; 
	}
}
