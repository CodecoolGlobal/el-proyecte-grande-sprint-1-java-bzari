package com.codecool.service;

import com.codecool.model.infopage.Continent;
import com.codecool.model.infopage.location.Location;
import com.codecool.service.locations.LocationStorage;

import java.util.List;

public class ContinentCreator {
    private int id;
    private String name;
    private List<Location> locations;
    private static final LocationStorage locationStorage = new LocationStorage();


    public Continent createContinent(){
        return new Continent(1, "Australia and Oceania", locationStorage.getAllLocations());
    }
}
