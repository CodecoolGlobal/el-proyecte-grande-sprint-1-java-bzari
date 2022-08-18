package com.codecool.model.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class MapDTO {
    String name;
    Long id;

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
