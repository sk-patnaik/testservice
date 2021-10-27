package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.raw.GTOPfidData;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="FPC_PFID_DATA", schema="gfs")
public class FpcPfidData extends FpcDatabaseObject implements GTOPfidData, Serializable {

	@Id
	@Column(name = "JOB_ID")
	private String pfidDataJobId;

	@Column(name = "PFID_HYDRO_CBN_WT")
	private Double pfidDataHydroCbnWt;

	@Column(name = "PFID_TEMPERATURE")
	private Integer pfidDataTemperature;

}
