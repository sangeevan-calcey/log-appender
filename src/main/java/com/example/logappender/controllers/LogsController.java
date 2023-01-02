package com.example.logappender.controllers;

import com.example.logappender.dtos.Response;
import com.example.logappender.services.LogsService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/api/logs")
public class LogsController {

    @Autowired
    private LogsService logsService;

    @GetMapping("/test")
    public String testLogs(){
        return ("Welcome to Log Appender");
    }

    @GetMapping("/indexOutOfBoundsException")
    public ResponseEntity<?> indexOutOfBoundsException() {
        try {
            logsService.indexOutOfBoundsException();
        } catch (Exception e){
            log.error(e.getMessage());
        }
        return ResponseEntity.ok(Response.builder().res("There is a error").build());
    }
}
