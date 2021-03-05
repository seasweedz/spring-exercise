package com.example.exercise.service;

import com.example.exercise.model.KeyValue;
import com.example.exercise.model.PrintResponse;
import com.example.exercise.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrintServiceImpl  implements   PrintService{

    @Override
    public ResponseEntity<Response<PrintResponse>> printData(List<KeyValue> inputs) {
        PrintResponse resp = new PrintResponse();
        resp.setNumberOfInput(inputs.size());

        List<String> formattedList = new ArrayList<>();
        for (KeyValue input: inputs) {
            formattedList.add(input.getKey() + " is " + input.getValue());
        }

        resp.setFormattedResult(formattedList);

        return new ResponseEntity<>(new Response<>(resp), HttpStatus.OK);
    }


}
