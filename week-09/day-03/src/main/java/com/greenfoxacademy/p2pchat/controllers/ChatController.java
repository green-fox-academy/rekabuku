package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.services.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    



}
