package com.greenfoxacademy.foxclub.models;

public enum Trick {
    JUMP ("able to jump trough the loop"),
    TURNAROUND ("able to turn around");

    private final String value;

    Trick(String value) {
        this.value = value;
    }
}
