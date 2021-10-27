package com.shell.siep.gto.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DatabaseRequest {
    @ApiModelProperty(notes = "The databases to search in (FPC, BG, DD, BG)", required = true)
    private List<String> databases;

    @Override
    public String toString() {
        return "DatabaseRequest{" +
                "[Databases: " + databases + "]" +
                '}';
    }
}
