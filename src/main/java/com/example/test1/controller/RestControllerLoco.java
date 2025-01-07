package com.example.test1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("task1/api/v1")
public class RestControllerLoco {

    private static final String mensaje = "Hola Mundo";

    @GetMapping
    public String getTask1() {
        return mensaje;
    }
}
