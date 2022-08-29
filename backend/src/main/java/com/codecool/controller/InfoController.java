package com.codecool.controller;

import com.codecool.model.DTO.MapDTO;
import com.codecool.model.infopage.Continent;
import com.codecool.model.infopage.Location;
import com.codecool.service.infopage.ContinentService;
import com.codecool.service.infopage.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Component
@Controller
@RequestMapping("/api")
public class InfoController {

    private final LocationService locationService;
    private final ContinentService continentService;

    @Autowired
    public InfoController(LocationService locationService, ContinentService continentService) {
        this.locationService = locationService;
        this.continentService = continentService;
    }

    @GetMapping(value = "/continent/allContinents")
    @ResponseBody
    public List<Continent> getContinentsName(){
        return continentService.getAllContinent();
    }

    @GetMapping(value = "/continent/{continentName}")
    @ResponseBody
    public Collection<MapDTO> getContinentsLocations(Model model, @PathVariable String continentName){
        return locationService.getLocationsByContinentName(continentName);
    }

    @GetMapping(value = "/location/{locationId}")
    @ResponseBody
    public Optional<Location> getLocation(@PathVariable Long locationId){
        return locationService.getLocationById(locationId);
    }

    @GetMapping(value = "/continent/location/{locationName}")
    @ResponseBody
    public Optional<Location> getLocation(@PathVariable String locationName){
        return locationService.getLocationByName(locationName);
    }

    @GetMapping(value = "/locations")
    @ResponseBody
    public Collection<MapDTO> getAllLocations(){
        return locationService.getAllLocations();
    }
}
