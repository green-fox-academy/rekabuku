package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
       /* ArrayList<String> matched = new ArrayList();
        matching(matched);
        System.out.println(matched);*/
        System.out.println(girls.size());
        System.out.println(boys.size());

    }

   /* public static void matching(ArrayList<String> inputA, ArrayList<String> inputB) {
        ArrayList<String> matched = new ArrayList<String>();
        int length = girls.size();
        if (length != boys.size())
            for (int i = 0; i < length; i++) {
                matched.add(girls.get(i) + " " + boys.get(i));
                return matched;
            }

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
*/

    }

