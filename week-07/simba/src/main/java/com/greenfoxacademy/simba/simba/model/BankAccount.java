package com.greenfoxacademy.simba.simba.model;

public class BankAccount {
    private String name;
    private int balance;
    private String currency;
    private String animalType;

    public BankAccount(String name, int balance, String currency, String animalType) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
