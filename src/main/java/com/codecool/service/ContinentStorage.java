package com.codecool.service;

import com.codecool.model.infopage.Continent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinentStorage {
    private List<Continent> allContinents;
    private ContinentCreator continentCreator;

    @Autowired
    public ContinentStorage(ContinentCreator continentCreator) {
        allContinents = new ArrayList<>();
        this.continentCreator = continentCreator;
        addContinent(continentCreator.createContinent());
    }

    public void addContinent(Continent continent){
        allContinents.add(continent);
    }
    
    public List<Continent> getAllContinents(){
        return allContinents;
    }

    public Continent getContinentByName(String continentName){
        for (Continent continent : allContinents) {
            if (continent.getName().equals(continentName)){
                return continent;
            }
        }
        return null;
    }


}
