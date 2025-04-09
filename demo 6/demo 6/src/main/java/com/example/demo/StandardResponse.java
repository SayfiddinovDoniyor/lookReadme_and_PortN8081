package com.example.demo;

import java.time.LocalDateTime;

public class StandardResponse {
    private LocalDateTime timestamp;
    private ResponseDTO response;

    public StandardResponse(ResponseDTO response) {
        this.timestamp = LocalDateTime.now();
        this.response = response;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public ResponseDTO getResponse() {
        return response;
    }

    public void setResponse(ResponseDTO response) {
        this.response = response;
    }
}
