package com.codecool.service;

import com.codecool.model.infopage.Continent;
import com.codecool.model.infopage.location.Location;
import com.codecool.service.locations.LocationStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinentCreator {
    private List<Continent> continents;

    @Autowired
    private LocationStorage locationStorage;

//
//    public Continent createContinent(){
//        return new Continent(1, "Australia_and_Oceania", locations);
//    }
    public List<Continent> createAllContinent(){
        List<Continent> allContinent = new ArrayList<>();
        allContinent.add(new Continent(1, "Australia_and_Oceania", locationStorage.getLocationsByContinentId(1)));
        allContinent.add(new Continent(2, "Europe", locationStorage.getLocationsByContinentId(2)));
        allContinent.add(new Continent(3, "North_America", locationStorage.getLocationsByContinentId(3)));
        allContinent.add(new Continent(4, "South_America", locationStorage.getLocationsByContinentId(4)));
        allContinent.add(new Continent(5, "Central_America", locationStorage.getLocationsByContinentId(5)));
        return allContinent;
    }

}
