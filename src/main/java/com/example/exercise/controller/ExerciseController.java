package com.example.exercise.controller;


import com.example.exercise.model.*;
import com.example.exercise.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseController {

    @Autowired
    private PrintService printService;

    @PostMapping("/exercise-1/print")
    public ResponseEntity<Response<PrintResponse>> Print(@RequestBody PrintRequest req){
        return printService.printData(req.getData());
    }
}
