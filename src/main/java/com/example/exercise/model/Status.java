package com.example.exercise.model;

public class Status {

    private int code;
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    public Status(){
        this.code = 1000;
        this.description = "success";
    }

    public Status(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
