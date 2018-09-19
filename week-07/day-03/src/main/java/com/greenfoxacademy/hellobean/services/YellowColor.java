package com.greenfoxacademy.hellobean.services;

import com.greenfoxacademy.hellobean.services.MyColor;

public class YellowColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("It is yellow in color...");
    }
}
