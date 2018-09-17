package com.greenfoxacademy.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTGreetCounterApp {
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam("name") String name){
        return new Greeting(1, name);
    }
}
