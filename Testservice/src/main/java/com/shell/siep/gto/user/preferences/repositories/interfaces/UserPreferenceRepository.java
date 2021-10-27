package com.shell.siep.gto.user.preferences.repositories.interfaces;

import com.shell.siep.gto.user.preferences.pojo.UserPreferences;

import java.util.Optional;

public interface UserPreferenceRepository {
	Optional<UserPreferences> findByToken(String token);

	Optional<UserPreferences> findByUserName(String username);

	UserPreferences save(UserPreferences prefs);

	Optional<UserPreferences> findById(String string);
}
