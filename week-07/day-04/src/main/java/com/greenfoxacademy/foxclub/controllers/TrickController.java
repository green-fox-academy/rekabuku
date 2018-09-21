package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrickController {
    private FoxService foxService;

    public TrickController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping("/trick")
    public String trick(){
        return "trick";
    }
}
