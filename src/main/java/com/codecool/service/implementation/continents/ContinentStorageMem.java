package com.codecool.service.implementation.continents;

import com.codecool.model.infopage.Continent;
import com.codecool.service.dao.ContinentStorageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinentStorageMem implements ContinentStorageDao {
    private List<Continent> allContinents;
    private ContinentCreatorMem continentCreator;

    @Autowired
    public ContinentStorageMem(ContinentCreatorMem continentCreator) {
        allContinents = new ArrayList<>();
        this.continentCreator = continentCreator;
//        addContinent(continentCreator.createAllContinent());
        setContinent(continentCreator.createAllContinent());
    }

    private void setContinent(List<Continent> allContinent) {
        this.allContinents = allContinent;
    }

    public void addContinent(Continent continent){
        allContinents.add(continent);
    }

    @Override
    public List<Continent> getAllContinents(){
        return allContinents;
    }

    @Override
    public Continent getContinentByName(String continentName){
        for (Continent continent : allContinents) {
            if (continent.getName().equals(continentName)){
                return continent;
            }
        }
        return null;
    }


}
