package com.example.fakerestapi.exceptions;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Error {
    private String message;
    private String exception;
}
