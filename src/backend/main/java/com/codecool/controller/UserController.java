package com.codecool.controller;

import com.codecool.model.DTO.ApplicationUserDTO;
import com.codecool.model.user.ApplicationUser;
import com.codecool.service.users.ApplicationUserService;
import com.codecool.service.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
@RequestMapping("/user")
public class UserController {

    private final ApplicationUserService userService;

    @Autowired
    public UserController(ApplicationUserService userService) {
        this.userService = userService;
    }

    @PostMapping ("/registration")
    public String newUserRegistration(@RequestBody ApplicationUser user) {
        userService.addNewRegisteredUser(user);
        return "index";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody ApplicationUserDTO user){
//        megkapja a usert akkor kellene nekünk ezt átadni valahova
        return "index";
    }
}
