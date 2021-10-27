package com.shell.siep.gto.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WellLatLongRequest extends DatabaseRequest {
    @ApiModelProperty(notes = "List of Countries")
    private List<String> countries;

    @ApiModelProperty(notes = "List of Well Codes")
    private List<String> wellIds;

    @ApiModelProperty(notes = "List of Sample Codes")
    private List<String> sampleIds;

    @ApiModelProperty(notes = "List of Sample Types")
    private List<String> sampleTypes;
}
