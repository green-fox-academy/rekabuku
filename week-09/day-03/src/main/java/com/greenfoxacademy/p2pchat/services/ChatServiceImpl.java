package com.greenfoxacademy.p2pchat.services;

import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.repositories.MessageRepository;
import com.greenfoxacademy.p2pchat.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChatServiceImpl implements ChatService {
    private MessageRepository messageRepository;
    private UserRepository userRepository;

    public ChatServiceImpl(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(String username) {
        User user = userRepository.findById(1L).orElseThrow(IllegalArgumentException::new);
        user.setUsername(username);
        userRepository.save(user);
    }

    @Override
    public Optional<User> checkIfExists() {
        return userRepository.findById(1L);
    }

    @Override
    public String getName() {
        User user = userRepository.findById(1L).orElseThrow(IllegalArgumentException::new);
       return user.getUsername();
    }

}
