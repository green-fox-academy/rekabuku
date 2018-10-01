package com.greenfoxacademy.json.model;

public class Doubling {
    private long received;
    private long result;
    private String error;


    public Doubling() {
        this.received = received;
        this.result = result;
        this.error = error;
    }

    public long getReceived() {
        return received;
    }

    public void setReceived(long received) {
        this.received = received;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
