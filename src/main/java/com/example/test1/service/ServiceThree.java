package com.example.test1.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceThree {

    private static final String mensaje = "Servicio 3";

    public String getServiceThree() {
        return mensaje;
    }
}
