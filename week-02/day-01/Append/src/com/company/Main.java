package com.company;

public class Main {

    public static void main(String[] args) {
        //  Create the usual class wrapper and main method on your own.
        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        String typo = "Chinchill";
        String xy = addA(typo);
        System.out.println(xy);
    }


    public static String addA(String input) {
        return input + "a";
    }
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`
}
