package com.shell.siep.gto.persistence.databases.fpc.model.pigi;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="FPC_COUNTRIES", schema="gfs")
public class FpcPigiCountry {

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Id
	@Column(name = "COUNTRY_ID")
	private Integer countryId;
}
