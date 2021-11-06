package com.niit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/greet")
    public ResponseEntity<String> sayGood()
    {
        return new ResponseEntity<String>("Good day to you", HttpStatus.ACCEPTED);
    }
}
