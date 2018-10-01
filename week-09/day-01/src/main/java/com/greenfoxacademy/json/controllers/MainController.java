package com.greenfoxacademy.json.controllers;

import com.greenfoxacademy.json.model.Doubling;
import com.greenfoxacademy.json.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String displayMain() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Doubling doublingMethod(@RequestParam("input") Long input) {
        Doubling doubling = new Doubling();
        if (input == null) {
            doubling.setError("Please provide an input!");
            return doubling;
        }
        doubling.setReceived(input);
        doubling.setResult(input * 2);
        return doubling;
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greeting greetingMethod(@RequestParam("name") String name, @RequestParam("title") String title) {
        if (name.isEmpty() && title.isEmpty()) {
            return new Greeting("null", "Please provide a name and a title!");
        }
            if (name.isEmpty()) {
                return new Greeting("null", "Please provide a name!");
        }
        if (title.isEmpty()) {
            return new Greeting("null", "Please provide a title!");
        }
        return new Greeting("Oh, hi there " + name + ", my dear " + title);
    }
}
