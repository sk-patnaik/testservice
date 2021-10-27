package com.shell.siep.gto.user.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.security.pojos.ApplicationUser;

@Repository
public interface UserRepository extends MongoRepository<ApplicationUser, String>, UserRepositoryOperations {
	@Override
	@Query("{ 'username': ?0, 'password': ?1}")
	Optional<ApplicationUser> login(String username, String encodedPassword);

	@Override
	@Query("{'webaccesskey': ?0}")
	Optional<ApplicationUser> findByToken(String token);

	@Override
	@Query("{'username': ?0}")
	Optional<ApplicationUser> findByUserName(String username);
}
