package com.shell.siep.gto.security.configuration.providers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shell.siep.gto.commons.enums.ErrorCodes;
import com.shell.siep.gto.security.exceptions.InvalidTokenException;
import com.shell.siep.gto.security.pojos.ApplicationUser;
import com.shell.siep.gto.security.pojos.UserDetailsImplementation;
import com.shell.siep.gto.user.services.UserService;

@Service("tokenAuthProvider")
public class TokenAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

	@Autowired
	private UserService userService;

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) {
		UserDetails userDet = null;
		boolean valid = false;
		Object token = authentication.getCredentials();
		ApplicationUser user = Optional.ofNullable(token)
				.map(String::valueOf)
				.flatMap(userService::findByToken)
				.orElseThrow(
						() -> new UsernameNotFoundException("Cannot find user with authentication token=" + token)
				);
		valid = userService.checkTokenValidity(String.valueOf(token));

		if (valid)
			userDet = new UserDetailsImplementation(user);
		else
			throw new InvalidTokenException("Token is invalid", ErrorCodes.TOKEN_MISMATCH_FOUND);
		return userDet;
	}

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
												  UsernamePasswordAuthenticationToken authentication) {
		//No additional auth checks are required
	}

}
