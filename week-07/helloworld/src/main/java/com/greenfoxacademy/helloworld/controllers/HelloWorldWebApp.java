package com.greenfoxacademy.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldWebApp {

    @RequestMapping("/web/greting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "greting";
    }
}
