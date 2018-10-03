package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.services.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {
    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/")
    public String displayMain(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("error", error);

        if (chatService.checkIfExists().isPresent()) {
            model.addAttribute("username", chatService.getName());
            return "index";

        } else
            return "redirect:/register";
    }

    @PostMapping("/")
    public String updateUser(@RequestParam("username") String username) {
        if (username.isEmpty()) {
            return "redirect:/?error=The username is empty!";
        }
        
        chatService.update(username);
        return "redirect:/";
    }

    @GetMapping("/register")
    public String registerUser(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("error", error);
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(String username) {
        if (username.isEmpty()) {
            return "redirect:/register?error=The username is empty!";
        }

        User newUser = new User();
        newUser.setUsername(username);
        chatService.save(newUser);
        return "redirect:/";

    }


}

