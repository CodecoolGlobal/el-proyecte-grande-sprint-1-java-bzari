package com.codecool.service.implementation.continents.locations.wildlife;

import com.codecool.model.infopage.location.wildlife.Wildlife;
import com.codecool.service.dao.WildLifeCreatorDao;
import com.codecool.service.dao.WildLifeStorageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WildLifeStorageMem implements WildLifeStorageDao {
    private List<Wildlife> allWildlife;
    private WildLifeCreatorDao wildlifeCreator;

    @Autowired
    public WildLifeStorageMem(WildLifeCreatorDao wildLifeCreator) {
        allWildlife = new ArrayList<>();
        this.wildlifeCreator = wildLifeCreator;
//        addWildlife(wildlifeCreator.createWildlife());
        setAllWildLife(wildLifeCreator.createAllWildlife());
    }

    private void setAllWildLife(List<Wildlife> allWildlife) {
        this.allWildlife = allWildlife;
    }


    @Override
    public List<Wildlife> getWildlifeByLocationId(int locationId){
        List<Wildlife> result = new ArrayList<>();
//        for (Wildlife wildlife : allWildlife) {
//            if(wildlife.getLocationId() == locationId){
//                result.add(wildlife);
//            }
//        }
        return result;
    }
}
