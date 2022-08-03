package com.codecool.service.implementation.continents;

import com.codecool.model.DTO.MapDTO;
import com.codecool.model.infopage.Continent;
import com.codecool.service.repositories.ContinentCreatorDao;
import com.codecool.service.repositories.ContinentStorageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContinentStorageMem implements ContinentStorageDao {
    private List<Continent> allContinents;
    private ContinentCreatorDao continentCreator;

    @Autowired
    public ContinentStorageMem(ContinentCreatorDao continentCreator) {
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

    @Override
    public List<MapDTO> getAllContinentName() {
        List<MapDTO> allCont = new ArrayList<>();
        for (Continent continent : allContinents) {
            allCont.add(new MapDTO(continent.getName(), continent.getId()));
        }
        return allCont;
    }


}
