package com.shell.siep.gto.pigi.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shell.siep.gto.pigi.properties.PigiProperty;

import java.util.ArrayList;
import java.util.List;

public class PigiLnk {
    @JsonProperty("ProjectProperties")
    private List<String> projectProperties = new ArrayList<>();

    @JsonProperty("PropertyLinks")
    private List<PigiProperty> properLinks;

    @JsonProperty("CreationAuthor")
    private String creationAuthor;

    @JsonProperty("CreationDate")
    private String creationDate;

    @JsonProperty("LastEditAuthor")
    private String lastEditAuthor;

    @JsonProperty("LastEditDate")
    private String lastEdit;

    @JsonProperty("Comments")
    private String comments;

    @JsonProperty("NumberOfTemplateProperties")
    private Integer numberOfTemplateProperties;

    @JsonProperty("version")
    private String version;

    public List<String> getProjectProperties() {
        return projectProperties;
    }

    public void setProjectProperties(List<String> projectProperties) {
        this.projectProperties = projectProperties;
    }

    public List<PigiProperty> getProperLinks() {
        return properLinks;
    }

    public void setProperLinks(List<PigiProperty> properLinks) {
        this.properLinks = properLinks;
    }

    public String getCreationAuthor() {
        return creationAuthor;
    }

    public void setCreationAuthor(String creationAuthor) {
        this.creationAuthor = creationAuthor;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastEditAuthor() {
        return lastEditAuthor;
    }

    public void setLastEditAuthor(String lastEditAuthor) {
        this.lastEditAuthor = lastEditAuthor;
    }

    public String getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(String lastEdit) {
        this.lastEdit = lastEdit;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getNumberOfTemplateProperties() {
        return numberOfTemplateProperties;
    }

    public void setNumberOfTemplateProperties(Integer numberOfTemplateProperties) {
        this.numberOfTemplateProperties = numberOfTemplateProperties;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
