package com.greenfoxacademy.p2pchat.dtos;

public class JsonResponseDto {
    private String status;
    private String error;

    public JsonResponseDto(String status, String error) {
        this.status = status;
        this.error = error;
    }

    public JsonResponseDto(String status) {
        this.status = status;
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
