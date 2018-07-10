package com.nutfreedom.di.service.impl;

import com.nutfreedom.di.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceWeddingImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Say congratulations";
    }
}
