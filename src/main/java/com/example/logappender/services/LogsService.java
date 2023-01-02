package com.example.logappender.services;

import com.example.logappender.dtos.Response;
import org.springframework.stereotype.Service;

@Service
public interface LogsService {
    Response indexOutOfBoundsException();
}
