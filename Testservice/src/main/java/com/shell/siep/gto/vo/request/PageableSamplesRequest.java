package com.shell.siep.gto.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageableSamplesRequest extends PageableRequest {
    @ApiModelProperty(notes = "Countries")
    private List<String> countries;

    @ApiModelProperty(notes = "Well Ids")
    private List<String> wellIds;

    @ApiModelProperty(notes = "Sample Ids")
    private List<String> sampleIds;

    @ApiModelProperty(notes = "Sample Types")
    private List<String> sampleTypes;

    @Override
    public String toString() {
        return "PageableSamplesRequest {" +
                "[Countries: " + countries + "] " +
                "[WellIds: " + wellIds + "] " +
                "[SampleIds: " + sampleIds + "] " +
                "[SampleTypes :" + sampleTypes + "]} " +
                super.toString();
    }
}
