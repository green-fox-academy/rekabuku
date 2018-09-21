package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.stereotype.Controller;

@Controller
public class TrickController {
    private FoxService foxService;

    public TrickController(FoxService foxService) {
        this.foxService = foxService;
    }
}
