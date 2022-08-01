package com.codecool.service.implementation.continents;

import com.codecool.model.infopage.Continent;
import com.codecool.service.dao.ContinentCreatorDao;
import com.codecool.service.dao.LocationStorageDao;
import com.codecool.service.implementation.continents.locations.LocationStorageMem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinentCreatorMem implements ContinentCreatorDao {
    private List<Continent> continents;

    private LocationStorageDao locationStorage;

    @Autowired
    public ContinentCreatorMem(LocationStorageDao locationStorage) {
        this.locationStorage = locationStorage;
    }

    @Override
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
