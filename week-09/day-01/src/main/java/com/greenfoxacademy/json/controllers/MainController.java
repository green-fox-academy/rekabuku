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
    public Doubling doublingMethod(@RequestParam("input") Long input) {
       Doubling doubling = new Doubling();
       if (input == null){
           doubling.setError("Please provide an input!");
       return doubling;
       }
       doubling.setReceived(input);
       doubling.setResult(input*2);
       return doubling;
    }

}
