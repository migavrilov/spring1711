package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BadLettersException extends ResponseStatusException {
    public BadLettersException() {
        super(HttpStatus.BAD_REQUEST, "You are  allowed to use only latin letters in username");
    }
}
