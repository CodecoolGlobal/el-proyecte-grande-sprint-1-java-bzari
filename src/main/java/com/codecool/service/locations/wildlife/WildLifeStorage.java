package com.codecool.service.locations.wildlife;

import com.codecool.model.infopage.location.wildlife.Wildlife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WildLifeStorage {
    private List<Wildlife> allWildlife;
    private WildLifeCreator wildlifeCreator;

    @Autowired
    public WildLifeStorage(WildLifeCreator wildLifeCreator) {
        allWildlife = new ArrayList<>();
        this.wildlifeCreator = wildLifeCreator;
//        addWildlife(wildlifeCreator.createWildlife());
        setAllWildLife(wildLifeCreator.createAllWildlife());
    }

    private void setAllWildLife(List<Wildlife> allWildlife) {
        this.allWildlife = allWildlife;
    }

    public void addWildlife(Wildlife wildlife){
        allWildlife.add(wildlife);
    }

    public List<Wildlife> getWildlifeByLocationId(int locationId){
        List<Wildlife> result = new ArrayList<>();
        for (Wildlife wildlife : allWildlife) {
            if(wildlife.getLocationId() == locationId){
                result.add(wildlife);
            }
        }
        return result;
    }
}
