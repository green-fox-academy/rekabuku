package com.greenfoxacademy.p2pchat.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Entity
public class Message {
    @Id
    private long id;
    @NotNull
    private String text;
    @NotNull
    private LocalDateTime timestamp;
    @NotNull
    @Length(min = 1, max = 50)
    private String username;

    public Message() {
        this.timestamp = LocalDateTime.now(ZoneOffset.UTC);
        this.id = 1000000 + (long) (Math.random() * (9999999 - 1000000));
    }

    public Message(String text, String username) {
        this.text = text;
        this.username = username;
        this.timestamp = LocalDateTime.now(ZoneOffset.UTC);
        this.id = 1000000 + (long) (Math.random() * (9999999 - 1000000));
    }

    public Message(String text) {
        this.text = text;
        this.timestamp = LocalDateTime.now(ZoneOffset.UTC);
        this.id = 1000000 + (long) (Math.random() * (9999999 - 1000000));
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
