package com.greenfoxacademy.p2pchat.dtos;

public class Client {
    private String id;

    public Client(String id) {
        this.id = id;
    }

    public Client(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
