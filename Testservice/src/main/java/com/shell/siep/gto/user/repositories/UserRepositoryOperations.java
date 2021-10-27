package com.shell.siep.gto.user.repositories;

import java.util.Optional;

import com.shell.siep.gto.security.pojos.ApplicationUser;

public interface UserRepositoryOperations {
	Optional<ApplicationUser> login(String username, String encodedPassword);

	Optional<ApplicationUser> findByToken(String token);

	Optional<ApplicationUser> findByUserName(String username);
}
