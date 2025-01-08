package com.example.test1.controller;

import com.example.test1.service.ServiceOne;
import com.example.test1.service.ServiceTwo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("task1/api/v1")
public class RestControllerLoco {

    private final ServiceOne serviceOne;
    private final ServiceTwo serviceTwo;

    public RestControllerLoco(ServiceOne serviceOne, ServiceTwo serviceTwo) {
        this.serviceOne = serviceOne;
        this.serviceTwo = serviceTwo;
    }

    @GetMapping
    public String getTask1() {
        return serviceOne.getMessageTask1();
    }

    @GetMapping("/service2")
    public String getService2() {
        return serviceTwo.getServiceTwo();
    }
}
