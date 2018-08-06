package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 4;
        int fact = factorio(num);
        System.out.println(fact);
    }
    public static int factorio (int a) {

        int fact1 = 1;
        for (int i = 1; i <= a; i++)

            fact1 = fact1 * i;
        return fact1;

        }
    }