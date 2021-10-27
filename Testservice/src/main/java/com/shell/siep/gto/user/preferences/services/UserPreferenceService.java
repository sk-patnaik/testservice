package com.shell.siep.gto.user.preferences.services;

import com.shell.siep.gto.user.preferences.pojo.UserPreferences;

public interface UserPreferenceService {

	Boolean saveUserPreferences(UserPreferences prefs);

	UserPreferences getUserPreferences(String authKey);
	
}
