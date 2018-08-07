package com.company;

import java.util.ArrayList;
import java.util.Arrays;

import static sun.security.jca.ProviderList.newList;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        System.out.println(ammended(planetList));

    }

    public static ArrayList ammended(ArrayList planetList) {
        planetList.add(7, "Saturn");

        return planetList;


    }
    // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
}

