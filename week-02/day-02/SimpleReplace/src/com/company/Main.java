package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String... args){

        /*ArrayList<String> example = new ArrayList<>();
        example.addAll(Arrays.asList("In ", "a ", "dishwasher ", "far ", "far ", "away"));
        example.set(2, "galaxy ");
        System.out.println(example); */

        String example = "In a dishwasher far far away";
        System.out.println(example.replace("dishwasher", "galaxy" ));
    }
}