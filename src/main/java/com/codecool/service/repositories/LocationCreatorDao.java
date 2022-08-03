package com.codecool.service.repositories;

import com.codecool.model.infopage.location.Location;

import java.util.List;

public interface LocationCreatorDao {
    List<Location> createAllLocations();
}
