package com.example.exercise.service;

import com.example.exercise.model.KeyValue;
import com.example.exercise.model.PrintResponse;
import com.example.exercise.model.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PrintService {

    ResponseEntity<Response<PrintResponse>> printData(List<KeyValue> data);
}
