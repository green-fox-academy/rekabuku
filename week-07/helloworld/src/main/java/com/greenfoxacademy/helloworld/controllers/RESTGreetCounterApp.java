package com.greenfoxacademy.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RESTGreetCounterApp {
    AtomicLong id = new AtomicLong(0);
    @RequestMapping("/greetig")
    public Greeting greeting(@RequestParam("name") String name){
        return new Greeting( id.incrementAndGet(), name);
    }
}
