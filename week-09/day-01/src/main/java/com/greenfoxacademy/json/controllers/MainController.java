package com.greenfoxacademy.json.controllers;

import com.greenfoxacademy.json.model.Doubling;
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
    public Doubling doublingMethod(@RequestParam("input") long input) {
       Doubling doubling = new Doubling();
       doubling.setReceived(input);
       doubling.setResult(input*2);
       return doubling;
    }

}
