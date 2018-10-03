package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.services.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {
    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/")
    public String displayMain(){
        return "index";
    }

    @GetMapping("/register")
    public String registerUser (){
        return "register";
    }

    @PostMapping("/register")
    public String saveUser (String username){
        if (username.isEmpty()){
            return "register";
        }
        User newUser = new User();
        newUser.setUsername(username);
        chatService.save(newUser);
        return "redirect:/";

    }



}
