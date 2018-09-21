package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private Drink drink;
    private Food food;
    private List<Trick> trickList;

    public String getName() {
        return name;
    }

    public Fox(String name) {
        this.name = name;
    }

    public Fox(String name, Drink drink, Food food, List ArrayList) {
        this.name = name;
        this.drink = drink;
        this.food = food;
        this.trickList = new ArrayList<>();
    }

}
