package com.greenfoxacademy.hellobean.controllers;

import com.greenfoxacademy.hellobean.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Utility {
    UtilityService utilityService = new UtilityService();

    public Utility(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String utilitiesOptions() {
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String randomBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @RequestMapping("/useful/email")
    public String validateEmail(@RequestParam(value = "email") String emailAddress, Model model) {
        model.addAttribute("email", utilityService.isValid(emailAddress));
        model.addAttribute("emailAddress", emailAddress);
        return "email";
    }


}
