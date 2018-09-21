package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    private FoxService foxService;

    public LoginController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String getName(@RequestParam ("name") String name){
        if(name.isEmpty()){
            return "login";
        }else foxService.addFox(name);

        return "redirect:/index?name=" + name;
    }
}