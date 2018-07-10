package com.nutfreedom.di.controller;

import com.nutfreedom.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;
    private GreetingService greetingServiceWedding;

    @Autowired
    public MyController(GreetingService greetingService,
                        @Qualifier("greetingServiceWeddingImpl") GreetingService greetingServiceWedding) {
        this.greetingService = greetingService;
        this.greetingServiceWedding = greetingServiceWedding;
    }

    public String normal() {
        return greetingService.sayGreeting();
    }

    public String wedding() {
        return greetingServiceWedding.sayGreeting();
    }
}
