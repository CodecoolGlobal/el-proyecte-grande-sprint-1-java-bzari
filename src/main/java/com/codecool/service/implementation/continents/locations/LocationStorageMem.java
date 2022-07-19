package com.codecool.service.implementation.continents.locations;

import com.codecool.model.infopage.location.Location;
import com.codecool.service.dao.LocationStorageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationStorageMem implements LocationStorageDao {
    private List<Location> allLocations;
    private LocationCreatorMem locationCreator;

    @Autowired
    public LocationStorageMem(LocationCreatorMem locationCreator) {
        allLocations = new ArrayList<>();
        this.locationCreator = locationCreator;
//        addLocation(locationCreator.createLocation());
        setAllLocations(locationCreator.createAllLocations());
    }

    private void setAllLocations(List<Location> allLocations) {
        this.allLocations = allLocations;
    }

//    public void addLocation(Location location){
//        allLocations.add(location);
//    }

    @Override
    public List<Location> getAllLocations() {
        return allLocations;
    }

    @Override
    public List<Location> getLocationsByContinentId(int continentId){
        List<Location> result = new ArrayList<>();
        for(Location location: allLocations){
            if(location.getContinentId() == continentId){
                result.add(location);
            }
        }
        return result;
    }
}
