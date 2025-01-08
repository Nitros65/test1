package com.example.test1.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceOne {

    private static final String mensaje = "Hola Mundo";

    public String getMessageTask1() {
        return mensaje;
    }
}
