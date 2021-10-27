package com.shell.siep.gto.vo.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class LoginRequest implements Serializable {
	
	private static final long serialVersionUID = -6233295253509737716L;

	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	private String serverdetails;
	
	@Null
	private String webaccesskey;
	
	public LoginRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginRequest [");
		if (username != null) {
			builder.append("username=");
			builder.append(username);
			builder.append(", ");
		}
		if (password != null) {
			builder.append("password=");
			builder.append(password);
			builder.append(", ");
		}
		if (serverdetails != null) {
			builder.append("serverdetails=");
			builder.append(serverdetails);
		}
		builder.append("]");
		return builder.toString();
	}

}
