package com.greenfoxacademy.helloworld.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldWebApp {

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "greeting";
    }
}
