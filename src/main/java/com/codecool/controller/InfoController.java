package com.codecool.controller;

import com.codecool.model.DTO.MapDTO;
import com.codecool.model.infopage.Continent;
import com.codecool.model.infopage.location.Location;
import com.codecool.service.implementation.continents.ContinentStorageMem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Component
@Controller
@RequestMapping("/api")
public class InfoController {

    @Autowired
    private ContinentStorageMem continentStorage;


    @GetMapping(value = "/allContinents")
    @ResponseBody
    public List<MapDTO> getContinentsName(){
        return continentStorage.getAllContinentName();

    }

    @GetMapping(value = "/{continentName}")
    @ResponseBody
    public List<MapDTO> getContinentsLocations(Model model, @PathVariable String continentName){
        Continent continent = continentStorage.getContinentByName(continentName);
        return continent.getAllLocationDTO();
    }

    @GetMapping(value = "/{continentName}/locations")
    @ResponseBody
    public List<Location> getAllLocationsByContinentName(@PathVariable String continentName){
        return continentStorage.getContinentByName(continentName).getLocations();
    }

    //TODO: Refactor broken method calls.
    @GetMapping(value = "/{continentName}/{locationName}")
    @ResponseBody
    public Location getLocationInfo(Model model, @PathVariable String continentName, @PathVariable String locationName){

        return continentStorage.getContinentByName(continentName).getLocationByName(locationName);
    }

}
