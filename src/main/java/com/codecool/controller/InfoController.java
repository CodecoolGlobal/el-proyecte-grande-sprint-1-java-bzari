package com.codecool.controller;

import com.codecool.model.infopage.Continent;
import com.codecool.model.infopage.location.Location;
import com.codecool.model.infopage.location.wildlife.Wildlife;
import com.codecool.service.ContinentStorage;
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
@RequestMapping("/")
public class InfoController {

    @Autowired
    private ContinentStorage continentStorage;


    @GetMapping(value = "api/allContinents")
    @ResponseBody
    public List<Continent> getContinentsName(Model model){
        model.addAttribute("continents", continentStorage.getAllContinents());
        return continentStorage.getAllContinents();

    }

    @GetMapping(value = "api/{continentName}")
    @ResponseBody
    public Continent getContinentsLocations(Model model, @PathVariable String continentName){
        model.addAttribute("continent", continentStorage.getContinentByName(continentName));
        Continent continent = continentStorage.getContinentByName(continentName);
        return continent;
    }

    @GetMapping(value="/")
    public String index(){
        return "index";
    }

    //TODO: Refactor broken method calls.
//    @GetMapping(value = "api/{continentName}/{locationName}")
//    @ResponseBody
//    public Location getLocationInfo(Model model, @PathVariable String continentName, @PathVariable String locationName){
//        model.addAttribute("location", continentStorage.getContinentByName(continentName).getLocations().getLocationByName(locationName));
//
//        return continentStorage.getContinentByName(continentName).getLocations().getLocationByName(locationName);
//    }

}
