package com.shell.siep.gto.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequest extends DatabaseRequest {
    @ApiModelProperty(notes = "Partial Id", required = true)
    private String searchString;
}
