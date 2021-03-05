package com.example.exercise.service;

import com.example.exercise.model.KeyValue;
import com.example.exercise.model.PrintResponse;
import com.example.exercise.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

        var result = new Response<>(resp);
        WriteResult(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    private void WriteResult(Response<PrintResponse> result){
        ObjectMapper mapper = new ObjectMapper();
        try{
            String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
            LocalDateTime now = LocalDateTime.now();
            FileOutputStream outputStream = new FileOutputStream(dtf.format(now)+".txt");
            byte[] strBytes = jsonStr.getBytes(StandardCharsets.UTF_8);
            outputStream.write(strBytes);

            outputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
