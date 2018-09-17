package com.greenfoxacademy.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping("/greet")
    public Greeting greeting() {
        return new Greeting(1, "Hello World");
    }


}
