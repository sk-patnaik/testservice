package com.shell.siep.gto.pigi.properties;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PigiProperty {
    @JsonIgnore
    private String gto;

    @JsonProperty("FileProperty")
    private String fileProperty;

    @JsonProperty("PropertyGuid")
    private String propertyGuid;

    @JsonProperty("UomGuid")
    private String uomGuid;

    @JsonProperty("Indicator")
    private Integer indicator;

    @JsonProperty("RatioFormat")
    private String ratioFormat;

    @JsonProperty("IsIncluded")
    private Boolean included;

    @JsonProperty("Type")
    private Integer type;

    @JsonIgnore
    private String unitSymbol;

    public String getGto() {
        return gto;
    }

    public void setGto(String gto) {
        this.gto = gto;
    }

    public String getFileProperty() {
        return fileProperty;
    }

    public void setFileProperty(String fileProperty) {
        this.fileProperty = fileProperty;
    }

    public String getPropertyGuid() {
        return propertyGuid;
    }

    public void setPropertyGuid(String propertyGuid) {
        this.propertyGuid = propertyGuid;
    }

    public String getUomGuid() {
        return uomGuid;
    }

    public void setUomGuid(String uomGuid) {
        this.uomGuid = uomGuid;
    }

    public Integer getIndicator() {
        return indicator;
    }

    public void setIndicator(Integer indicator) {
        this.indicator = indicator;
    }

    public String getRatioFormat() {
        return ratioFormat;
    }

    public void setRatioFormat(String ratioFormat) {
        this.ratioFormat = ratioFormat;
    }

    public Boolean getIncluded() {
        return included;
    }

    public void setIncluded(Boolean included) {
        this.included = included;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUnitSymbol() {
        return unitSymbol;
    }

    public void setUnitSymbol(String unitSymbol) {
        this.unitSymbol = unitSymbol;
    }
}
