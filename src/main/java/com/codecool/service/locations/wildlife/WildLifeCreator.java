package com.codecool.service.locations.wildlife;

import com.codecool.model.infopage.location.wildlife.ConservationStatus;
import com.codecool.model.infopage.location.wildlife.Wildlife;
import com.codecool.model.infopage.location.wildlife.WildlifeType;

public class WildLifeCreator {
    private int id;
    private int locationId;
    private String name;
    private String description;
    private double lifetime;
    private String lifetimeInterval;
    private ConservationStatus status;
    private String crisis;
    private WildlifeType type;

    public WildLifeCreator() {

    }

    public Wildlife createWildlife(){
        return new Wildlife(1, 1, "peacock mantis shrimp",
                "Peacock mantis shrimp is one of the larger, more colourful mantis shrimps commonly seen, ranging in size from 3–18 cm (1.2–7.1 in).[1] They are primarily green with orange legs and leopard-like spots on the anterior carapace.[1]\n" +
                        "\n" +
                        "Their ability to see circularly polarised light has led to studies to determine if the mechanisms by which their eyes operate can be replicated for use in reading CDs and similar optical storage devices."
                , 4.5, "year", ConservationStatus.LEAST_CONCERN, "too cute", WildlifeType.ANIMAL);
    }

}
