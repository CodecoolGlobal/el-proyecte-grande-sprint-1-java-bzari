package com.codecool.service.implementation.continents;

import com.codecool.model.infopage.Continent;
import com.codecool.service.dao.ContinentCreatorDao;
import com.codecool.service.implementation.continents.locations.LocationStorageMem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinentCreatorMem implements ContinentCreatorDao {
    private List<Continent> continents;

    @Autowired
    private LocationStorageMem locationStorage;

//
//    public Continent createContinent(){
//        return new Continent(1, "Australia_and_Oceania", locations);
//    }
    @Override
    public List<Continent> createAllContinent(){
        List<Continent> allContinent = new ArrayList<>();
        allContinent.add(new Continent(1, "Australia_and_Oceania", locationStorage.getLocationsByContinentId(1)));

        return allContinent;
    }

}
