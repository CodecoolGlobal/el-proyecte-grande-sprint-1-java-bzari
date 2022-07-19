package com.codecool.service.locations;

import com.codecool.model.infopage.location.Location;
import com.codecool.model.infopage.location.wildlife.Wildlife;
import com.codecool.service.locations.wildlife.WildLifeStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationCreator {
    private WildLifeStorage wildLifeStorage;
    private List<Wildlife> wildlife;

    public LocationCreator(WildLifeStorage wildLifeStorage) {
        this.wildLifeStorage = wildLifeStorage;
    }

    public Location createLocation(){
        getAllWildlife();
        return new Location(1, 1, "Indo-Pacific", "The Indo-Pacific, sometimes known as the Indo-West Pacific or Indo-Pacific Asia, is a biogeographic region of Earth's seas, comprising the tropical waters of the Indian Ocean, the western and central Pacific Ocean, and the seas connecting the two in the general area of Indonesia.",
                wildlife, "not available", "not available", "exists", "everything");
    }
    public List<Location> createAllLocations(){
        List<Location> allLocation = new ArrayList<>();
        getAllWildlife();
        allLocation.add(new Location(1, 1, "Indo-Pacific", "The Indo-Pacific, sometimes known as the Indo-West Pacific or Indo-Pacific Asia, is a biogeographic region of Earth's seas, comprising the tropical waters of the Indian Ocean, the western and central Pacific Ocean, and the seas connecting the two in the general area of Indonesia.",
                wildlife, "not available", "not available", "exists", "everything"));
        return allLocation;
    }

    private void getAllWildlife(){
        wildlife = wildLifeStorage.getWildlifeByLocationId(1);

    }
}
