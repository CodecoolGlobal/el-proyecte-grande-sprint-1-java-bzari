package com.codecool.controller;

import com.codecool.service.dao.ContinentStorageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ContinentStorageDao continentStorage;

    @GetMapping
    public String index(Model model){
        model.addAttribute("continents", continentStorage.getAllContinents());
        return "index";
    }
}
