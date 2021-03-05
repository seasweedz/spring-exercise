package com.example.exercise.model;

import com.example.exercise.model.KeyValue;

import java.util.List;

public class PrintRequest {

    public void setData(List<KeyValue> data) {
        this.Data = data;
    }

    public List<KeyValue> getData() {
        return Data;
    }

    private List<KeyValue> Data ;

}

