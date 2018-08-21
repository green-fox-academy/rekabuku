package com.company;

public class Person {
    String name;
    int age;
    String gender;

    private Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private void introduce(String name, int age, String gender) {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
    }

    private void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

}
