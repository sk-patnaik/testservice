package com.shell.siep.gto.persistence.databases.fpc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shell.siep.gto.persistence.model.GTOCountry;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="FPC_COUNTRIES", schema="gfs")
public class FpcCountry extends FpcDatabaseObject implements GTOCountry, Serializable {

	@Column(name = "LONGITUDE_DEC")
	private Double countryLongitudeDec;

	@Column(name = "ESRI_COUNTRY_NAME")
	private String esriCountryName;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Column(name = "SHELL_EP_REGION_ID")
	private String shellEpRegionId;

	@Id
	@Column(name = "COUNTRY_ID")
	private Integer countryId;

	@Column(name = "LATITUDE_DEC")
	private Double countryLatitudeDec;

}
