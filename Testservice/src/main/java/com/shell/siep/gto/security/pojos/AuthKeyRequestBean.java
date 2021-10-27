package com.shell.siep.gto.security.pojos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AuthKeyRequestBean implements Serializable {

	private static final long serialVersionUID = 8652296929638171941L;
	@JsonProperty("webaccesskey")
	String authkey;
	@JsonIgnore
	String serverdetails;
}
