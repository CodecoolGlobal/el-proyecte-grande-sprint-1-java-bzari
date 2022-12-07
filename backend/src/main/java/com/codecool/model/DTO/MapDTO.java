package com.codecool.model.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
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

}
