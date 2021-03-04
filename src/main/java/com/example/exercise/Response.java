package com.example.exercise;

public class Response<T> {

    private Status status;

    private T data;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Response(T data, Status status) {
        this.data = data;
        this.status = status;
    }

    public Response(Status status) {
        this.status = status;
    }
}


