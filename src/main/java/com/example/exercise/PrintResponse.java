package com.example.exercise;

import java.util.ArrayList;
import java.util.List;

public class PrintResponse {

    private List<KeyValue> kv;

    public Integer getNumberOfInput() {
        return this.kv.size();
    }

    public List<String> getFormattedResult() {
        for (KeyValue v: this.kv) {
            this.FormattedResult.add(v.getKey() + " is " + v.getValue());
        }
        return FormattedResult;
    }

    private Integer NumberOfInput;
    private List<String> FormattedResult;
    public PrintResponse(List<KeyValue> kv) {
        this.FormattedResult = new ArrayList<String>();
        this.kv = kv;
    }

}
