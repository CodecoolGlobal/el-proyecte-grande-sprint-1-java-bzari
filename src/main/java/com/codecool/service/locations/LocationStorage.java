package com.codecool.service.locations;

import com.codecool.model.infopage.Continent;
import com.codecool.model.infopage.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationStorage {
    private List<Location> allLocations;
    @Autowired
    private LocationCreator locationCreator;

    public LocationStorage(LocationCreator locationCreator) {
        allLocations = new ArrayList<>();
        this.locationCreator = locationCreator;
        addLocation(locationCreator.createLocation());
    }

    public void addLocation(Location location){
        allLocations.add(location);
    }

    public List<Location> getAllLocations() {
        return allLocations;
    }

    public Location getLocationByName(String name) {
        for (Location location : allLocations) {
            if (location.getName().equals(name)){
                return location;
            }
        }
        return null;
    }
}
