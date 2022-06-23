package com.codecool.controller;

import com.codecool.model.infopage.Continent;
import com.codecool.model.infopage.location.Location;
import com.codecool.model.infopage.location.wildlife.Wildlife;
import com.codecool.service.ContinentStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class InfoController {
    private static final ContinentStorage continentStorage = new ContinentStorage();


    @GetMapping(value = "api/info")
    @ResponseBody
    public List<Continent> getContinentsName(Model model){
        model.addAttribute("continents", continentStorage.getAllContinents());
        return continentStorage.getAllContinents();

    }

    @GetMapping(value = "info/{continentName}")
    @ResponseBody
    public Continent getContinentsLocations(Model model, @PathVariable String continentName){
        model.addAttribute("continent", continentStorage.getContinentByName(continentName));
        Continent continent = continentStorage.getContinentByName(continentName);
        return continent;
    }

    @GetMapping(value = "info/{continentName}/{locationName}")
    @ResponseBody
    public Location getLocationInfo(Model model, @PathVariable String continentName, @PathVariable String locationName){
        model.addAttribute("location", continentStorage.getContinentByName(continentName).getLocations().getLocationByName(locationName));

        return continentStorage.getContinentByName(continentName).getLocations().getLocationByName(locationName);
    }

}
