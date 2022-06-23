package com.codecool.service.locations.wildlife;

import com.codecool.model.infopage.location.Location;
import com.codecool.model.infopage.location.wildlife.Wildlife;

import java.util.ArrayList;
import java.util.List;

public class WildLifeStorage {
    private List<Wildlife> allWildlife;
    private static final WildLifeCreator wildlifeCreator = new WildLifeCreator();

    public WildLifeStorage() {
        allWildlife = new ArrayList<>();
        addWildlife(wildlifeCreator.createWildlife());
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
