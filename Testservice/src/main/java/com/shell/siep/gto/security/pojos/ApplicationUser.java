package com.shell.siep.gto.security.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.shell.siep.gto.commons.enums.UserRoleEnum;

@JsonInclude(Include.NON_NULL)
@Document(collection = "users")
public class ApplicationUser implements Serializable {

	private static final long serialVersionUID = -3649943081625990410L;
	@Id
	private String username;
	private String password;
	private UserRoleEnum userrole;
	private String role;
	private String salt;
	// Meta info
	private Date firstLoggedIn;
	private Date updatedOn;
	private Date createdOn;

	private List<GrantedAuthority> authorities;

	@NotNull
	String webaccesskey;

	public ApplicationUser() {
		this.webaccesskey = "";
	}

	public ApplicationUser(String username, String password, String userrole) {
		this.username = username;
		this.password = password;
		this.userrole = UserRoleEnum.valueOf(userrole);
		this.webaccesskey = "";
		calculateGrantedAuthorities();
	}

	public ApplicationUser(String username, String password) {
		this.username = username;
		this.password = password;
		this.userrole = UserRoleEnum.ROLE_USER;
		this.webaccesskey = "";
		calculateGrantedAuthorities();
	}

	public void setUserrole(UserRoleEnum userrole) {
		this.userrole = userrole;
		calculateGrantedAuthorities();
	}

	public void setRole(String role) {
		this.role = role;
		this.userrole = UserRoleEnum.valueOf(this.role);
		calculateGrantedAuthorities();
	}

	private void calculateGrantedAuthorities() {
		this.authorities = new ArrayList<>();
		this.authorities.add(new SimpleGrantedAuthority(this.userrole.getRoleName()));
	}

	@JsonIgnore
	public String getPassword() {
		return this.password;
	}

	@JsonIgnore
	public UserRoleEnum getUserrole() {
		return userrole;
	}


	@JsonIgnore
	public String getRole() {
		return role;
	}

	@JsonIgnore
	public List<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Date getFirstLoggedIn() {
		return firstLoggedIn;
	}

	public void setFirstLoggedIn(Date firstLoggedIn) {
		this.firstLoggedIn = firstLoggedIn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public void setAuthorities(List<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public String getWebaccesskey() {
		return webaccesskey;
	}

	public void setWebaccesskey(String webaccesskey) {
		this.webaccesskey = webaccesskey;
	}
}
