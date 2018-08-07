package com.company;

public class Main {

    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        StringBuilder my = new StringBuilder(todoText);
        my.insert(0, "My todo:\n");
        my.insert(21, " - Download games\n");
        my.insert(39, "\t - Diablo");
        todoText = my.toString();
        System.out.println(todoText);
    }
}
