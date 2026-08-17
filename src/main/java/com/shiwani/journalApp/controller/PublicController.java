package com.shiwani.journalApp.controller;

import com.shiwani.journalApp.controller.entity.User;
import com.shiwani.journalApp.controller.entity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Public")
public class PublicController {

    @Autowired
    private UserService userService;

    @GetMapping("/health-check")
    public String healthCheck(){
        return "OK";
    }

    @PostMapping("/create-user")
    public void crateUser(@RequestBody User user){
        userService.saveEntry(user);
    }
}
