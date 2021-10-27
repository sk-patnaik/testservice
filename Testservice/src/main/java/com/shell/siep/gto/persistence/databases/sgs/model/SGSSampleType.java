package com.shell.siep.gto.persistence.databases.sgs.model;

import com.shell.siep.gto.persistence.model.GTOSampleType;

import java.io.Serializable;

public class SGSSampleType extends SGSDatabaseObject implements GTOSampleType, Serializable {

    private String sampleType;
    private Integer typeLevel;
    private Integer typeId;
    private String parent;
    private Boolean avail;

    @Override
    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    @Override
    public Integer getTypeLevel() {
        return typeLevel;
    }

    public void setTypeLevel(Integer typeLevel) {
        this.typeLevel = typeLevel;
    }

    @Override
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public Boolean getAvail() {
        return avail;
    }

    public void setAvail(Boolean avail) {
        this.avail = avail;
    }
}
