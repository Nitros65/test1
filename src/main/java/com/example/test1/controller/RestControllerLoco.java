package com.example.test1.controller;

import com.example.test1.service.ServiceOne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("task1/api/v1")
public class RestControllerLoco {

    private final ServiceOne serviceOne;

    public RestControllerLoco(ServiceOne serviceOne) {
        this.serviceOne = serviceOne;
    }

    @GetMapping
    public String getTask1() {
        return serviceOne.getMessageTask1();
    }
}
