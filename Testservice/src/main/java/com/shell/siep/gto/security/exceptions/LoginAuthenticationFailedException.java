package com.shell.siep.gto.security.exceptions;

public class LoginAuthenticationFailedException extends Exception {

	private static final long serialVersionUID = -5500743628349271577L;

	public LoginAuthenticationFailedException() {
		super();
	}
 
	public LoginAuthenticationFailedException(String message) {
		
		super("Invalid password for username: " + message);
	}
	

}
