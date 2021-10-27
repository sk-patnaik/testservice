package com.shell.siep.gto.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CountriesRequest extends DatabaseRequest {
    @ApiModelProperty(notes = "Countries", required = true)
    private List<String> countries;
}
