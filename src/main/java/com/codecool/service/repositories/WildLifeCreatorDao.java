package com.codecool.service.repositories;

import com.codecool.model.infopage.location.wildlife.Wildlife;

import java.util.List;

public interface WildLifeCreatorDao {
    List<Wildlife> createAllWildlife();
}
