package com.shell.siep.gto.vo.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class UserPreferenceRequest {
    private String userName;
    private String[] defaultDatabases;
    private String defaultLengthUnit;
    private String defaultPressureUnit;
    private String defaultTemperatureUnit;
}
