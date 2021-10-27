package com.shell.siep.gto.commons.enums;

public enum ErrorCodes {
	OK(0, "ok"),

	INPUT_MISSING(1000, "Input missing or invalid","api.INPUT_MISSING"),

	INTERNAL_ERROR(2000, "Internal error","api.INTERNAL_ERROR"),
	API_DEPRECATED(2001, "Unsupported version","api.API_DEPRECATED"),
	MAINTENANCE_MODE(2002, "System under maintenance","api.MAINTENANCE_MODE"),
	
	AUTHENTICATION_ERROR(3000, "Authentication error","api.AUTHENTICATION_ERROR"),
	INVALID_TOKEN(3001, "Invalid Token","api.INVALID_TOKEN"),
	INACTIVE_USER(3006, "Inactive User","api.INACTIVE_USER"),
	USER_NOT_FOUND(3007, "No user found","api.USER_NOT_FOUND"), 
	DUPLICATE_LOGIN_ERROR(3008,"User already loggedin from other device","api.DUPLICATE_LOGIN_ERROR"),
	DEVICE_NOT_FOUND(3009,"Either user logged from other device or inactive token","api.DEVICE_NOT_FOUND"),
	TOKEN_MISMATCH_FOUND(3010, "Token mismatch found","api.TOKEN_MISMATCH_FOUND"),
	SEARCH_RETURN_NO_DATA(4009, " Search returned no data ","api.SEARCH_RETURN_NO_DATA"), 
	TOKEN_REMOVED(1009, "Token is removed due to concurrent logins","api.INVALID_TOKEN")
;	
	private int errorcode = 0;
	private String message = "";
	private String defaultMessageKey = "NOT_IMPLEMENTED";
	private boolean isError = true;
	private ErrorCodes(int errorCode, String message, String defaultMessage) {
		this.errorcode = errorCode;
		this.message = message;
		this.defaultMessageKey = defaultMessage;
		this.isError = true;
	}
	private ErrorCodes(int errorCode, String message) {
		this.errorcode = errorCode;
		this.message = message;
		this.defaultMessageKey = "NOT_IMPLEMENTED";
		this.isError = true;
	}

	public int getErrorcode() {
		return errorcode;
	}
	
	void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	
	public boolean isError() {
		return isError;
	}
	void setError(boolean isError) {
		this.isError = isError;
	}
	public String getDefaultMessageKey() {
		return defaultMessageKey;
	}
	void setDefaultMessageKey(String defaultMessageKey) {
		this.defaultMessageKey = defaultMessageKey;
	}
	public String getMessage() {
		return message;
	}
}
