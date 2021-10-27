package com.shell.siep.gto.security.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.AuthenticationException;

import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenNotValidException extends AuthenticationException {

	private static final long serialVersionUID = 924884088837993447L;
	private final WEBErrorCodeEnum errorCode;
	private final List<String> args = new ArrayList<>();
	
 	public TokenNotValidException(String message, WEBErrorCodeEnum errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

 	public void addArgs(String arg) {
		this.args.add(arg);
	}

	@Override
	public String toString() {
		return "TokenNotValidException [errorCodes=" + errorCode + ", args=" + args + "]"; 
	}
}
