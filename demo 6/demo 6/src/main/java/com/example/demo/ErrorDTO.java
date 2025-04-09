package com.example.demo;

import java.time.LocalDateTime;

public class ErrorDTO {
    private String errorCode;
    private String message;
    private LocalDateTime timestamp;

    public ErrorDTO(String errorCode, String message, LocalDateTime timestamp) {
        this.errorCode = errorCode;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
