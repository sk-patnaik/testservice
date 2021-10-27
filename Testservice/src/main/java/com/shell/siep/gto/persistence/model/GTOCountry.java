package com.shell.siep.gto.persistence.model;

public interface GTOCountry extends GTODatabaseObject {
	String getCountryName();
	void setCountryName(String countryName);
	Integer getCountryId();
	void setCountryId(Integer countryId);
	String getEsriCountryName();
	void setEsriCountryName(String esriCountryName);
	Double getCountryLongitudeDec();
	void setCountryLongitudeDec(Double countryLongitudeDec);
	Double getCountryLatitudeDec();
	void setCountryLatitudeDec(Double countryLatitudeDec);
	String getShellEpRegionId();
	void setShellEpRegionId(String shellEpRegionId);
}
