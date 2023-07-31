package com.lottery.lotoapi.exception;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
    private HttpStatus httpStatusCode;
    private String message;



    public ErrorMessage(HttpStatus httpStatusCode, String message) {
        this.setHttpStatusCode(httpStatusCode);;
        this.setMessage(message);;
    }
    public HttpStatus getHttpStatusCode() {
        return httpStatusCode;
    }
    public void setHttpStatusCode(HttpStatus httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
 
}
