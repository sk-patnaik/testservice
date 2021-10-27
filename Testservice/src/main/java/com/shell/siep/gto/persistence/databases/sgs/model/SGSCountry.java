package com.shell.siep.gto.persistence.databases.sgs.model;

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
@Table(name="WTC_REF_COUNTRIES", schema="sgs_data")
public class SGSCountry extends SGSDatabaseObject implements GTOCountry, Serializable {

	@Column(name = "SHELL_EP_REGION_ID")
	private String shellEpRegionId;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Id
	@Column(name = "COUNTRY_ID")
	private Integer countryId;

	@Transient
	private String esriCountryName;

	@Transient
	private Double countryLongitudeDec;

	@Transient
	private Double countryLatitudeDec;
}
