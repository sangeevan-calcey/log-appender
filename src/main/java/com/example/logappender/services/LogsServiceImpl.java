package com.example.logappender.services;

import com.example.logappender.dtos.Response;
import org.springframework.stereotype.Repository;

@Repository
public class LogsServiceImpl implements LogsService{

    @Override
    public Response indexOutOfBoundsException(){
        throw new IndexOutOfBoundsException("There is a IndexOutOfBoundsException");
    }
}
