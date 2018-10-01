package com.greenfoxacademy.json.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/")
    public String displayMain() {
        return "index";
    }
}
