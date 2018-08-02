package com.company;

public class Main {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int remainingHours = 59 - currentHours;
        int remainingMinutes = 59 - currentMinutes;
        int remainingSeconds = 60 - currentSeconds;
        int remaining = remainingSeconds + (remainingMinutes * 60) + (remainingHours * 60 * 60);
        System.out.println(remaining);

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}
