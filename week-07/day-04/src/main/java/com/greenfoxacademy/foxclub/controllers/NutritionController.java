package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NutritionController {
    private FoxService foxService;

    public NutritionController(FoxService foxService) {
        this.foxService = foxService;
    }

}
