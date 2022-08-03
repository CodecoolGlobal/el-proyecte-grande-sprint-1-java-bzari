package com.codecool.service.implementation.continents.locations;

import com.codecool.model.infopage.location.Location;
import com.codecool.model.infopage.location.wildlife.Wildlife;
import com.codecool.service.dao.LocationCreatorDao;
import com.codecool.service.dao.WildLifeStorageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationCreatorMem implements LocationCreatorDao {
    private WildLifeStorageDao wildLifeStorage;
    private List<Wildlife> wildlife;

    @Autowired
    public LocationCreatorMem(WildLifeStorageDao wildLifeStorage) {
        this.wildLifeStorage = wildLifeStorage;
    }

//    public Location createLocation(){
//        getAllWildlife();
//        return new Location(1, 1, "Indo-Pacific", "The Indo-Pacific, sometimes known as the Indo-West Pacific or Indo-Pacific Asia, is a biogeographic region of Earth's seas, comprising the tropical waters of the Indian Ocean, the western and central Pacific Ocean, and the seas connecting the two in the general area of Indonesia.",
//                wildLifeStorage.getWildlifeByLocationId(1), "not available", "not available", "exists", "everything");
//    }
    public List<Location> createAllLocations(){
        List<Location> allLocation = new ArrayList<>();
        getAllWildlife();
//
//        //Australia_and_Oceania
//        allLocation.add(new Location(1, 1, "Indo-Pacific", "The Indo-Pacific, sometimes known as the Indo-West Pacific or Indo-Pacific Asia, is a biogeographic region of Earth's seas, comprising the tropical waters of the Indian Ocean, the western and central Pacific Ocean, and the seas connecting the two in the general area of Indonesia.",
//                wildLifeStorage.getWildlifeByLocationId(1), "not available", "not available", "exists", "everything"));
//
//        allLocation.add(new Location(2, 1, "Tasmania", "Homeland of the Tasmanian devil.", wildLifeStorage.getWildlifeByLocationId(2), "not available", "not available", "exists", "everything"));
//        allLocation.add(new Location(3, 1, "Bendigo", "Gotta get me cube", wildLifeStorage.getWildlifeByLocationId(3), "not available", "not available", "exists", "everything"));
//
//        //Europe
//        allLocation.add(new Location(4, 2, "Transylvania", "Magyar föld!!! Drakula", wildLifeStorage.getWildlifeByLocationId(4), "not available", "not available", "exists", "everything"));
//        allLocation.add(new Location(5, 2, "Ural", "Syka Blyat", wildLifeStorage.getWildlifeByLocationId(5), "not available", "not available", "exists", "everything"));
//        allLocation.add(new Location(6, 2, "Balaton", "Víz :)", wildLifeStorage.getWildlifeByLocationId(6), "not available", "not available", "exists", "everything"));
//
//        //North_America
//        allLocation.add(new Location(7, 3, "Yellowstone", "The largest active super vulcano in the world!", wildLifeStorage.getWildlifeByLocationId(7), "not available", "not available", "exists", "everything"));
//        allLocation.add(new Location(8, 3, "Florida", "Florida man", wildLifeStorage.getWildlifeByLocationId(8), "not available", "not available", "exists", "everything"));
//        allLocation.add(new Location(9, 3, "California", "Description of California", wildLifeStorage.getWildlifeByLocationId(9), "not available", "not available", "exists", "everything"));
//
//        //South_America
//        allLocation.add(new Location(10, 4, "Amazon", "The largest rainforest in the world", wildLifeStorage.getWildlifeByLocationId(10), "not available", "not available", "exists", "everything"));
//        allLocation.add(new Location(11, 4, "Kilimanjaro", "The tallest mountain in SA", wildLifeStorage.getWildlifeByLocationId(11), "not available", "not available", "exists", "everything"));
//        allLocation.add(new Location(12, 4, "Amazonas", "The widest river in the world", wildLifeStorage.getWildlifeByLocationId(12), "not available", "not available", "exists", "everything"));
//
//        //Central_America
//        allLocation.add(new Location(13, 5, "Aztec ruins", "The forgotten world of the aztecs", wildLifeStorage.getWildlifeByLocationId(13), "not available", "not available", "exists", "everything"));
//        allLocation.add(new Location(14, 5, "Green wilderness", "Escobars cocaine plants", wildLifeStorage.getWildlifeByLocationId(14), "not available", "not available", "exists", "everything"));
//        allLocation.add(new Location(15, 5, "Caribbean sea", "Cuba, Venezuela, etc.", wildLifeStorage.getWildlifeByLocationId(15), "not available", "not available", "exists", "everything"));

        return allLocation;
    }

    private void getAllWildlife(){
        wildlife = wildLifeStorage.getWildlifeByLocationId(1);

    }
}
