package com.codecool.service.implementation.continents.locations.wildlife;

import com.codecool.model.infopage.location.wildlife.ConservationStatus;
import com.codecool.model.infopage.location.wildlife.Wildlife;
import com.codecool.model.infopage.location.wildlife.WildlifeType;
import com.codecool.service.dao.WildLifeCreatorDao;

import java.util.ArrayList;
import java.util.List;

public class WildLifeCreatorMem implements WildLifeCreatorDao {
    private int id;
    private int locationId;
    private String name;
    private String description;
    private double lifetime;
    private String lifetimeInterval;
    private ConservationStatus status;
    private String crisis;
    private WildlifeType type;

//    @Autowired
//    public WildLifeCreatorMem() {
//
//    }
//    public Wildlife createWildlife(int id, int locationId, String name, String description, double lifetime, String lifetimeInterval, ConservationStatus conservationStatus, String crisis, WildlifeType wildlifeType){
//        return new Wildlife(id, locationId, name, description, lifetime, lifetimeInterval, conservationStatus, crisis, wildlifeType);
//    }

    @Override
    public List<Wildlife> createAllWildlife(){
        List<Wildlife> allWildlife = new ArrayList<>();
//        allWildlife.add(createWildlife(
//                1, 1,
//                "peacock mantis shrimp", "Peacock mantis shrimp is one of the larger, more colourful mantis shrimps commonly seen, ranging in size from 3–18 cm (1.2–7.1 in).[1] They are primarily green with orange legs and leopard-like spots on the anterior carapace.[1]\n\nTheir ability to see circularly polarised light has led to studies to determine if the mechanisms by which their eyes operate can be replicated for use in reading CDs and similar optical storage devices.",
//                4.5, "year", ConservationStatus.LEAST_CONCERN, "too cute", WildlifeType.ANIMAL));

        return allWildlife;
    }

}
