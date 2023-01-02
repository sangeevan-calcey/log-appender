package com.example.logappender.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LogsController {
    @GetMapping("/test")
    public String testLogs(){
        return ("Welcome to Log Appender");
    }

    @GetMapping("/indexOutOfBoundsException")
    public ResponseEntity indexOutOfBoundsException() throws IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException();
    }
}
