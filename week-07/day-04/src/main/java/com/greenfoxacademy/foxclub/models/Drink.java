package com.greenfoxacademy.foxclub.models;

public enum Drink {
    LEMONADE ("lemonade"),
    WATER ("water"),
    BIER ("bier");

    private final String value;

    Drink(String value) {
        this.value = value;
    }

    public String value(){
        return this.value;
    }
}
