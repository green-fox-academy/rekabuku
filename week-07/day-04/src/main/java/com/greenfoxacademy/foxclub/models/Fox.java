package com.greenfoxacademy.foxclub.models;

public class Fox {
    private String name;
    private Drink drink;
    private Food food;
    private Trick trick;

    public String getName() {
        return name;
    }

    public Fox(String name) {
        this.name = name;
    }

    public Fox(String name, Drink drink, Food food, Trick trick) {
        this.name = name;
        this.drink = drink;
        this.food = food;
        this.trick = trick;
    }

}
