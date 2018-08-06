package com.company;

public class Main {

    public static void main(String[] args) {
        // - Create a function called `printParams`

        printParams("first");
        printParams("first", "second");
        printParams("first", "second", "third", "fourh");

    }

    public static void printParams (String...xyz) { 
        for (String arg : xyz) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

}
