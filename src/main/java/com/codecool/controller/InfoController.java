package com.codecool.controller;

import com.codecool.service.ContinentStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class InfoController {
    private static final ContinentStorage continentStorage = new ContinentStorage();


    @GetMapping(value = "info")
    public String getContinentsName(Model model){
        model.addAttribute("continents", continentStorage.getAllContinents());
        return "index";

    }

    @GetMapping(value = "info/{continentName}")
    public String getContinentsLocations(Model model, @PathVariable String continentName){
        model.addAttribute("locations", continentStorage.getContinentById(1).getLocationById(1));
        return "continent";
    }

    @GetMapping(value = "info/{continentName}/{locationName}")
    public String getLocationInfo(Model model, @PathVariable String locationName){
        model.addAttribute("wildlife", continentStorage.getContinentById(1).getLocationById(1).getWildlife());

        return "location";
    }

}
