package com.shell.siep.gto.user.services;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shell.siep.gto.security.pojos.ApplicationUser;
import com.shell.siep.gto.user.repositories.UserRepository;
import com.shell.siep.gto.utils.ApplicationUtility;
import com.shell.siep.gto.vo.request.LoginRequest;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ApplicationUtility geoToolsUtil;

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	public static final String INVALID_USER = "invalid_user";

	public ApplicationUser authenticate(String username, String encodedPassword) {
		String token;
		ApplicationUser user = null;
		Optional<ApplicationUser> userOptional = userRepository.login(username, encodedPassword);

		if(userOptional.isPresent()) {
			token = geoToolsUtil.getAuthKey(username, encodedPassword);
			user = userOptional.get();
			user.setWebaccesskey(token);
			user.setUpdatedOn(Date.from(Instant.now()));
			userRepository.save(user);
		}

		return user;
	}

	public ApplicationUser getUserDetails(String username) {
		return userRepository
							.findByUserName(username)
							.orElse(null);
	}

    public Optional<ApplicationUser> findByToken(String token) {
        return  Optional.ofNullable(userRepository.findByToken(token))
        				.orElse(Optional.empty());
    }


    public boolean addUser(ApplicationUser user) {
    	boolean flag = false;

    	if(!userRepository.existsById(user.getUsername())) {
    		user.setUpdatedOn(new Date());
    		ApplicationUser u = userRepository.insert(user);

    		if(u.getUsername().equals(user.getUsername()))
    			flag = true;
    	}

    	return flag;
    }

	public ApplicationUser authenticateUser(LoginRequest loginRequest) {

		if(userRepository.existsById(loginRequest.getUsername())) {
			return authenticate(loginRequest.getUsername(), loginRequest.getPassword());
		}

		throw new UsernameNotFoundException("There is no record of this user. [User: " + loginRequest.getUsername() + "]");
	}

	public Boolean checkTokenValidity(String token) {
		//Needs work
		boolean valid = true;
		Optional<ApplicationUser> userOpt = userRepository.findByToken(token);

		if(userOpt.isPresent()) {
			ApplicationUser user = userOpt.get();

			if(StringUtils.isBlank(user.getWebaccesskey()))
				valid = false;
		}

		return valid;
	}

	public boolean isValidUser(String username) {
		logger.debug("Validating User. [User: {}]", username);

		if(username == null || username.equals("")) {
			return false;
		}

		return userRepository.existsById(username);
	}
}
