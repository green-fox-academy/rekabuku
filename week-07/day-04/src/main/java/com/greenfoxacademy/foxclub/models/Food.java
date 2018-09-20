package com.greenfoxacademy.foxclub.models;

public enum Food {
    SALAD ("salad"),
    BREAD ("bread"),
    PIZZA ("pizza");

    private final String value;

    Food(String value) {
        this.value = value;
    }
}
