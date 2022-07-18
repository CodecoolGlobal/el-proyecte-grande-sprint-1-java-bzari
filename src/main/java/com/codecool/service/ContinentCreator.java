package com.codecool.service;

import com.codecool.model.infopage.Continent;
import com.codecool.model.infopage.location.Location;
import com.codecool.service.locations.LocationStorage;

import java.util.List;

public class ContinentCreator {
    private static final LocationStorage locationStorage = new LocationStorage();


    public Continent createContinent(){
        return new Continent(1, "Australia_and_Oceania", locationStorage);
    }
}
