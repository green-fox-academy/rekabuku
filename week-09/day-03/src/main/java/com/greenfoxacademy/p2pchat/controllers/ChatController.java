package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.dtos.JsonResponseDto;
import com.greenfoxacademy.p2pchat.dtos.MessageReceiveDto;
import com.greenfoxacademy.p2pchat.models.Message;
import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.services.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
            model.addAttribute("messages", chatService.findAllMessages());
            return "index";

        } else
            return "redirect:/register";
    }

    @PostMapping("/update")
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
    public String saveUser(@RequestParam("username") String username){
        if(username.isEmpty()){
            return "redirect:/register?error=The username is empty!";
        }

        User user = new User();
        user.setUsername(username);
        chatService.save(user);

        return "redirect:/";
    }

    @PostMapping("/send")
    public String saveMessage(String text) {
        Message newMessage = new Message();
        newMessage.setText(text);
        chatService.saveMessage(newMessage);
        return "redirect:/";

    }

    @PostMapping("api/message/receive")
    @ResponseBody
    public JsonResponseDto receiveMessage (@Valid @RequestBody MessageReceiveDto messageReceiveDto){
        if (messageReceiveDto.getMessage() != null && messageReceiveDto.getClient() != null) {
            chatService.saveMessage(messageReceiveDto.getMessage());
            return new JsonResponseDto("ok");
        } else return new JsonResponseDto("error", "Missing field(s): message.timestamp, client.id");
    }
}

