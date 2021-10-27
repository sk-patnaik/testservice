package com.shell.siep.gto.user.preferences.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.shell.siep.gto.vo.request.UserPreferenceRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Document(collection = "preferences")
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class UserPreferences implements Serializable {

	private static final long serialVersionUID = 6754382604753832512L;
	@Id
	private String userName;
	private String[] defaultDatabases;
	private String defaultLengthUnit;
	private String defaultPressureUnit;
	private String defaultTemperatureUnit;
	private Date createdOn;
	private Date updatedOn;

    public UserPreferences(UserPreferenceRequest preferenceRequest) {
		this.userName = preferenceRequest.getUserName();
		this.defaultDatabases = preferenceRequest.getDefaultDatabases();
		this.defaultLengthUnit = preferenceRequest.getDefaultLengthUnit();
		this.defaultPressureUnit = preferenceRequest.getDefaultPressureUnit();
		this.defaultTemperatureUnit = preferenceRequest.getDefaultTemperatureUnit();
	}

    public void assignDBData(UserPreferences dbValue) {
		setCreatedOn(dbValue.getCreatedOn());
		setDefaultDatabases(dbValue.getDefaultDatabases());
		setDefaultLengthUnit(dbValue.getDefaultLengthUnit());
		setDefaultPressureUnit(dbValue.getDefaultPressureUnit());
		setDefaultTemperatureUnit(dbValue.getDefaultTemperatureUnit());
		setUpdatedOn(dbValue.getUpdatedOn());
		setUserName(dbValue.getUserName());
	}

}
