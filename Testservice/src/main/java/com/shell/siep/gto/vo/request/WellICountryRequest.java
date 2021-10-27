package com.shell.siep.gto.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WellICountryRequest extends CountriesRequest {
    @ApiModelProperty(notes = "WellIds", required = true)
    private List<String> wellIds;
}
