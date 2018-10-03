package com.greenfoxacademy.p2pchat.services;

import com.greenfoxacademy.p2pchat.repositories.MessageRepository;
import com.greenfoxacademy.p2pchat.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {
    private MessageRepository messageRepository;
    private UserRepository userRepository;

    public ChatServiceImpl(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }
}
