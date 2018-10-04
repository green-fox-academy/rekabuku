package com.greenfoxacademy.p2pchat.dtos;

import com.greenfoxacademy.p2pchat.models.Message;

import javax.validation.Valid;

public class MessageReceiveDto {
    @Valid
    private Message message;

    @Valid
    private Client client;

    public MessageReceiveDto(Message message, Client client) {
        this.message = message;
        this.client = client;
    }

    public MessageReceiveDto(){

    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
