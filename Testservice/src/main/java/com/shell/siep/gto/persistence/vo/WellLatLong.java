package com.shell.siep.gto.persistence.vo;


public class WellLatLong {

    private final String db;
    private final String wellId;
    private final Double latitude;
    private final Double longitude;

    public WellLatLong(String db, String wellId, Double latitude, Double longitude) {
        this.wellId = wellId;
        this.db = db;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getDb() {
        return db;
    }

    public String getWellId() {
        return wellId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
