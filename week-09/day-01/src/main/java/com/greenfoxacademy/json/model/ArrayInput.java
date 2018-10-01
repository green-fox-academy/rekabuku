package com.greenfoxacademy.json.model;

import java.util.List;

public class ArrayInput {
    private String what;
    private List<Integer> numbers;

    public ArrayInput(String what, List<Integer> numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public ArrayInput(String what) {
        this.numbers = numbers;
    }

    public ArrayInput(List<Integer> numbers) {
        this.what = what;
    }

    public ArrayInput() {
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}


