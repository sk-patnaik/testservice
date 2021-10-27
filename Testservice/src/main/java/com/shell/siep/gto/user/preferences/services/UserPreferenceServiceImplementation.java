package com.shell.siep.gto.user.preferences.services;

import com.shell.siep.gto.user.preferences.pojo.UserPreferences;
import com.shell.siep.gto.user.preferences.repositories.interfaces.UserPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userPreferenceService")
public class UserPreferenceServiceImplementation implements UserPreferenceService {

	@Autowired
	private UserPreferenceRepository userPreferenceRepository;

	//Need more work
	@Override
	public Boolean saveUserPreferences(UserPreferences prefs) {
		userPreferenceRepository.save(prefs);
		return true;
	}

	@Override
	public UserPreferences getUserPreferences(String authKey) {
		UserPreferences prefs = new UserPreferences();
		userPreferenceRepository.findByToken(authKey)
								.ifPresentOrElse(prefs::assignDBData,
												() -> prefs.assignDBData(userPreferenceRepository.findById("default").get()));
		return prefs;
	}
	
}
