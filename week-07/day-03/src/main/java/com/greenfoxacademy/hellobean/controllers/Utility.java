package com.greenfoxacademy.hellobean.controllers;

import com.greenfoxacademy.hellobean.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Utility {
    UtilityService utilityService = new UtilityService();

    @RequestMapping("/useful")
    public String utilitiesOptions() {
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String randomBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }



}
