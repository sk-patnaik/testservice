package com.shell.siep.gto.persistence.databases.bg.model;


import com.shell.siep.gto.persistence.model.GTOSampleType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="FPC_REF_SAMPLE_TYPE")
public class BGSampleType extends BGDatabaseObject implements GTOSampleType, Serializable {

    @Column(name = "SAMPLE_TYPE")
    private String sampleType;

    @Id
    @Column(name = "TYPE_ID")
    private Integer typeId;

    @Column(name = "TYPE_LEVEL")
    private Integer typeLevel;

    @Column(name = "PARENT")
    private String parent;

    @Column(name = "AVAIL")
    private Boolean avail;

}
