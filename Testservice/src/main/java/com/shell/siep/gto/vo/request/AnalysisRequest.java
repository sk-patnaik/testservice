package com.shell.siep.gto.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AnalysisRequest extends DatabaseRequest {
    @ApiModelProperty(notes = "SampleIds")
    private List<String> sampleIds;

    @ApiModelProperty(notes = "Analysis Names")
    private List<String> analysisNames;

    @ApiModelProperty(notes = "Analysis Categories")
    private List<String> analysisCategories;
}
