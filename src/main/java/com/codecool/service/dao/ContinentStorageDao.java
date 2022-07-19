package com.codecool.service.dao;

import com.codecool.model.infopage.Continent;

import java.util.List;

public interface ContinentStorageDao {
    List<Continent> getAllContinents();
    Continent getContinentByName(String continentName);
}
