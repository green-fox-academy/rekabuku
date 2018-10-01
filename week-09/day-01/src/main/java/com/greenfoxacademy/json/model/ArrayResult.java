package com.greenfoxacademy.json.model;

import java.lang.reflect.Array;

public class ArrayResult {
    private int result;
    private String error;

    public ArrayResult(int result) {
        this.result = result;
    }

    public ArrayResult(String error){
        this.error = error;
    }
}
