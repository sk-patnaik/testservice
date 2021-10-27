package com.shell.siep.gto.user.preferences.controllers;

import com.shell.siep.gto.commons.UrlConstants;
import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;
import com.shell.siep.gto.controllers.APIController;
import com.shell.siep.gto.security.interfaces.ActiveUser;
import com.shell.siep.gto.security.pojos.ApplicationUser;
import com.shell.siep.gto.user.preferences.pojo.UserPreferences;
import com.shell.siep.gto.user.preferences.services.UserPreferenceService;
import com.shell.siep.gto.vo.request.UserPreferenceRequest;
import com.shell.siep.gto.vo.response.GenericAPIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserPreferenceController extends APIController {

    @Autowired
    private UserPreferenceService userPreferenceService;

    @GetMapping(UrlConstants.GET_USER_PREFERENCES)
    public GenericAPIResponse getUserPreferences(@ActiveUser ApplicationUser user) {

        UserPreferences preferences;
        GenericAPIResponse apiResponse;

        try {
            preferences = userPreferenceService.getUserPreferences(user.getWebaccesskey());

            if (preferences == null) {
                throw new IllegalStateException("Fetched preferences cannot be empty. A default user preference must be returned.");
            } else {
                apiResponse = new GenericAPIResponse(HttpStatus.OK, preferences);
            }

        } catch (Exception e) {
            apiResponse = handleException(e, user);
        }

        return apiResponse;
    }

    @PostMapping(UrlConstants.SAVE_USER_PREFERENCES)
    public GenericAPIResponse savePreferences(@RequestBody UserPreferenceRequest preferenceRequest, @ActiveUser ApplicationUser user) {

        boolean flag = false;
        GenericAPIResponse apiResponse;
        String statusString = "Record created.";
        Map<String, String> status = new HashMap<>();
        UserPreferences preferences = new UserPreferences(preferenceRequest);

        try {
            flag = userPreferenceService.saveUserPreferences(preferences);

            if (!flag) {
                throw new DataAccessException("Cannot save the preferences.") {
                    @Override
                    public String getMessage() {
                        return "Cannot save the preferences.";
                    }
                };
            }

            status.put("status", statusString);
            apiResponse = new GenericAPIResponse(HttpStatus.OK, status);

        } catch (Exception e) {
            apiResponse = handleException(e, user);
        }

        return apiResponse;
    }

    public GenericAPIResponse handleException (Exception e, ApplicationUser user) {
        GenericAPIResponse apiResponse;

        if (e instanceof IllegalStateException) {
            logger.info(" IllegalStateException while saving user preferences for user: " + user.getUsername() + ". " + e.getMessage() );
            apiResponse = new GenericAPIResponse(HttpStatus.INTERNAL_SERVER_ERROR, WEBErrorCodeEnum.INTERNAL_SERVER_EXCEPTION, e.getMessage());
        } else if (e instanceof DataAccessException) {
            logger.info(" DataAccessException while saving user preferences for user: " + user.getUsername() + ". " + e.getMessage() );
            apiResponse = new GenericAPIResponse(HttpStatus.SERVICE_UNAVAILABLE, WEBErrorCodeEnum.DATA_ACCESS_ERROR, e);
        } else  {
            logger.info(" Exception while saving user preferences for user: " + user.getUsername() + ". " + e.getMessage() );
            apiResponse = new GenericAPIResponse(HttpStatus.INTERNAL_SERVER_ERROR, WEBErrorCodeEnum.INTERNAL_SERVER_EXCEPTION, e.getMessage());
        }

        return apiResponse;
    }
}
