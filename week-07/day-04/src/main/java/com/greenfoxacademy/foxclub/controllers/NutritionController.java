package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NutritionController {
    private FoxService foxService;

    public NutritionController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping("/nutritionstore")
    public String trick() {
        return "nutrition";
    }

    @PostMapping("/nutritionstore")
    public String getName(@RequestParam("name") String name) {
        foxService.addFox(name);
        return "redirect:/nutritionstore?name=" + name;
    }
}
