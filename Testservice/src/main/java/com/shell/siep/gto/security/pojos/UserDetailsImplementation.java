package com.shell.siep.gto.security.pojos;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UserDetailsImplementation extends User {
	private static final long serialVersionUID = 342542690939817424L;
	private ApplicationUser user;

	public UserDetailsImplementation(ApplicationUser appUser, Collection<? extends GrantedAuthority> authorities) {
		super(appUser.getUsername(), appUser.getPassword(), authorities);
		this.user = appUser;
	}

	public UserDetailsImplementation(ApplicationUser appUser) {
		super(appUser.getUsername(), appUser.getPassword(), appUser.getAuthorities());
		this.user = appUser;

	}

	public ApplicationUser getUser() {
		return user;
	}

	public void setUser(ApplicationUser user) {
		this.user = user;
	}

}
