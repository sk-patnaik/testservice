package com.shell.siep.gto.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SamplesRequest extends DatabaseRequest {
    @ApiModelProperty(notes = "Countries")
    private List<String> countries;

    @ApiModelProperty(notes = "Well Ids")
    private List<String> wellIds;

    @ApiModelProperty(notes = "Sample Ids")
    private List<String> sampleIds;

    @ApiModelProperty(notes = "Sample Types")
    private List<String> sampleTypes;
}
