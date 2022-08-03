package com.codecool.service.implementation.continents.locations;

import com.codecool.model.infopage.location.Location;
import com.codecool.service.repositories.LocationCreatorDao;
import com.codecool.service.repositories.LocationStorageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LocationStorageMem implements LocationStorageDao {
    private List<Location> allLocations;
    private LocationCreatorDao locationCreator;

    @Autowired
    public LocationStorageMem(LocationCreatorDao locationCreator) {
        allLocations = new ArrayList<>();
        this.locationCreator = locationCreator;
//        addLocation(locationCreator.createLocation());
        setAllLocations(locationCreator.createAllLocations());
    }

    private void setAllLocations(List<Location> allLocations) {
        this.allLocations = allLocations;
    }


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
