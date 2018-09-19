package com.greenfoxacademy.hellobean.services;

import com.greenfoxacademy.hellobean.services.MyColor;

public class RedColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("It is red in color...");
    }
}
