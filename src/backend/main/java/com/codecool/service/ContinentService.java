package com.codecool.service;

import com.codecool.model.infopage.Continent;
import com.codecool.service.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {
    @Autowired
    private ContinentRepository continentRepository;

    public List<Continent> getAllContinent(){
        return continentRepository.findAll();
    }

}
