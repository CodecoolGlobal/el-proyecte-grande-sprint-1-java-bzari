package com.codecool.service.locations;

import com.codecool.model.infopage.location.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationStorage {
    private List<Location> allLocations;
    private static final LocationCreator locationCreator = new LocationCreator();

    public LocationStorage() {
        allLocations = new ArrayList<>();
        addLocation(locationCreator.createLocation());
    }

    public void addLocation(Location location){
        allLocations.add(location);
    }

    public List<Location> getAllLocations() {
        return allLocations;
    }
}
