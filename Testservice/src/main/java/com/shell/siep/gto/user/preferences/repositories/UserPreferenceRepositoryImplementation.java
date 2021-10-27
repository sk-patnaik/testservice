package com.shell.siep.gto.user.preferences.repositories;

import com.shell.siep.gto.user.preferences.pojo.UserPreferences;
import com.shell.siep.gto.user.preferences.repositories.interfaces.UserPreferenceRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("userPreferenceRepository")
public interface UserPreferenceRepositoryImplementation extends MongoRepository<UserPreferences, String>, UserPreferenceRepository{
	
	@Override
	@Query("{'token': ?0}")
    Optional<UserPreferences> findByToken(String token);
	
	@Override
	@Query("{'username': ?0}")
    Optional<UserPreferences> findByUserName(String username);

}
