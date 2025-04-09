package com.example.demo;

import com.example.demo.RequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class ControllerForReq {

    @PostMapping("/submit")
    public ResponseEntity<String> submitData(@Valid @RequestBody RequestDTO requestDTO) {
        return ResponseEntity.ok("Data received successfully");
    }
}
