package com.company;

public class Main {

    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
