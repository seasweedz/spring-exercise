package com.example.exercise.model;

import com.example.exercise.model.KeyValue;

import java.util.ArrayList;
import java.util.List;

public class PrintResponse {

    private List<String> FormattedResult;
    private Integer NumberOfInput;


    public Integer getNumberOfInput() {
        return NumberOfInput;
    }

    public void setNumberOfInput(Integer numberOfInput) {
        NumberOfInput = numberOfInput;
    }

    public List<String> getFormattedResult() {
        return FormattedResult;
    }

    public void setFormattedResult(List<String> formattedResult) {
        FormattedResult = formattedResult;
    }
}
