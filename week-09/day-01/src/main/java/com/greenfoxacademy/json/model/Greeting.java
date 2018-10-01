package com.greenfoxacademy.json.model;

public class Greeting {
    private String welcome_message;
    private String error;

    public Greeting(String welcome_message, String error) {
        this.welcome_message = welcome_message;
        this.error = error;
    }

    public Greeting(String welcome_message) {
        this.welcome_message = welcome_message;
        this.error = error;

    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
