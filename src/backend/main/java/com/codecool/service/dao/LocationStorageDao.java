package com.codecool.service.dao;

import com.codecool.model.infopage.location.Location;

import java.util.List;

public interface LocationStorageDao {
    List<Location> getLocationsByContinentId(int continentId);
    List<Location> getAllLocations();
}
