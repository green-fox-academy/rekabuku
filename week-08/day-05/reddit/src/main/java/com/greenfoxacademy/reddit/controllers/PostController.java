package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class PostController {
    private PostServiceImpl postServiceImpl;

    public PostController(PostServiceImpl postServiceImpl) {
        this.postServiceImpl = postServiceImpl;
    }

    @GetMapping("/reddit")
    public String list(Model model) {
        model.addAttribute("posts", postServiceImpl.list());
        return "main";
    }
}
