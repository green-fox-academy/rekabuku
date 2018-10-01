package com.greenfoxacademy.json.model;

import java.lang.reflect.Array;
import java.util.List;

public class ArrayResult {
    private int result;
    private String error;
    private List<Integer> numbers;

    public ArrayResult(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayResult(int result) {
        this.result = result;
    }

    public ArrayResult(String error){
        this.error = error;
    }
}
