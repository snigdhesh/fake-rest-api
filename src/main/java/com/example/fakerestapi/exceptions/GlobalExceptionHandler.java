package com.example.fakerestapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {HttpMessageNotReadableException.class})
    public ResponseEntity<?> handleHttpMessageNotReadableException(Exception ex) {
        Error error = new Error();
        String errorMessage = ex.getMessage();
        int index1 = errorMessage.indexOf(":") + 1;
        int index2 = errorMessage.indexOf("(");
        error.setMessage(ex.getMessage().substring(index1, index2));
        error.setException(ex.getClass().getSimpleName());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
