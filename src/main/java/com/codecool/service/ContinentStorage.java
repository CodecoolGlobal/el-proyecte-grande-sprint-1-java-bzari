package com.codecool.service;

import com.codecool.model.infopage.Continent;

import java.util.ArrayList;
import java.util.List;

public class ContinentStorage {
    private List<Continent> allContinents;
    private static final ContinentCreator continentCreator = new ContinentCreator();

    public ContinentStorage() {
        allContinents = new ArrayList<>();
        addContinent(continentCreator.createContinent());
    }

    public void addContinent(Continent continent){
        allContinents.add(continent);
    }
    
    public List<Continent> getAllContinents(){
        return allContinents;
    }

    public Continent getContinentById(int id){
        for (Continent continent : allContinents) {
            if (continent.getId() == id){
                return continent;
            }
        }
        return null;
    }


}
