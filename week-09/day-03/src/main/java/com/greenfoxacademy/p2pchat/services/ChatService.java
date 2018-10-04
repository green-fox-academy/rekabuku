package com.greenfoxacademy.p2pchat.services;

import com.greenfoxacademy.p2pchat.models.Message;
import com.greenfoxacademy.p2pchat.models.User;

import java.util.Optional;

public interface ChatService {

    public void save (User user);

    public void update(String username);

    public Optional<User> checkIfExists();

    public String getName ();

    public void saveMessage (Message message);

    public Iterable<Message> findAllMessages();


}
