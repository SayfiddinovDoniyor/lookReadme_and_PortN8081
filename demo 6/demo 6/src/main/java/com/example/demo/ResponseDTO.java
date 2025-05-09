package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDTO {

    @JsonProperty("response_message")
    private String message;

    @JsonProperty("http_status")
    private int status;

    private Object data;

    public ResponseDTO(String message, int status, Object data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
