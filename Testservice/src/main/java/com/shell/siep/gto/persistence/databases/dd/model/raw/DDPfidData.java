package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.raw.GTOPfidData;
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
@Table(name="FPC_PFID_DATA")
public class DDPfidData extends DDDatabaseObject implements GTOPfidData, Serializable {

	@Id
	@Column(name = "JOB_ID")
	private String pfidDataJobId;

	@Column(name = "PFID_HYDRO_CBN_WT")
	private Double pfidDataHydroCbnWt;

	@Column(name = "PFID_TEMPERATURE")
	private Integer pfidDataTemperature;

}
