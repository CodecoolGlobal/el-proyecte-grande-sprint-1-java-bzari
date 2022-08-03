package com.codecool.service.repositories;

import com.codecool.model.DTO.MapDTO;
import com.codecool.model.infopage.Continent;

import java.util.List;

public interface ContinentStorageDao {
    List<Continent> getAllContinents();
    Continent getContinentByName(String continentName);
    List<MapDTO> getAllContinentName();
}
