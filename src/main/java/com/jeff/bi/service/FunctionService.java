package com.jeff.bi.service;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello Spring Boot " + word;
    }
}
