package com.codecool.model.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

public class MapDTO {
    String name;
    Long id;
    Long continentId;
    BigDecimal altitude;
    BigDecimal longitude;

    public MapDTO(String name, Long id, Long continentId, BigDecimal altitude, BigDecimal longitude) {
        this.name = name;
        this.id = id;
        this.continentId = continentId;
        this.altitude = altitude;
        this.longitude = longitude;
    }

    public MapDTO(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAltitude() {
        return altitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public Long getContinentId() {
        return continentId;
    }
}
