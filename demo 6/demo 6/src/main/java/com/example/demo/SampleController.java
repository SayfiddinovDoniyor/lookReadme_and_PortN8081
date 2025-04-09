package com.example.demo;

import com.example.demo.ResponseDTO;
import com.example.demo.StandardResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SampleController {

    @GetMapping("/api/example")
    public StandardResponse getExample() {
        List<String> sampleData = Arrays.asList("Jonibek", "Farxod_bo'la", "Burya");

        ResponseDTO responseDTO = new ResponseDTO("Request successful", 200, sampleData);
        return new StandardResponse(responseDTO);
    }
}
