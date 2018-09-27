package com.greenfox.error.controller;

import com.greenfox.error.model.User;
import com.greenfox.error.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller

public class AppController {
    UserService userService;

    public AppController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(Model model, User user) {
        model.addAttribute("user", user);
        model.addAttribute("yolo", userService.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(User user) {
        userService.save(user);
        return "redirect:/";
    }
}