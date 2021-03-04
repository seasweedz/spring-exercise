package com.example.exercise;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {

    @PostMapping("/exercise-1/print")
    public ResponseEntity<PrintResponse> Print(@RequestBody PrintRequest data){
        try{
            Status status = new Status(1000, "success");
            PrintResponse res = new PrintResponse(data.getData());
            return new ResponseEntity(new Response<PrintResponse>(res, status), HttpStatus.OK);
        }catch(Exception e){
            Status status = new Status(1999, "an error has occurs");
            return new ResponseEntity(new Response(status), HttpStatus.BAD_GATEWAY);
        }
    }
}
