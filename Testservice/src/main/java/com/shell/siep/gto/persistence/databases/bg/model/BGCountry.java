package com.shell.siep.gto.persistence.databases.bg.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shell.siep.gto.persistence.model.GTOCountry;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="FPC_COUNTRIES")
public class BGCountry extends BGDatabaseObject implements GTOCountry, Serializable {

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Column(name = "SHELL_EP_REGION_ID")
	private String shellEpRegionId;

	@Id
	@Column(name = "COUNTRY_ID")
	private Integer countryId;

	@Column(name = "ESRI_COUNTRY_NAME")
	private String esriCountryName;

	@Transient
	private Double countryLongitudeDec;

	@Transient
	private Double countryLatitudeDec;

}
