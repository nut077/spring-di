package com.nutfreedom.di.service.impl;

import com.nutfreedom.di.repository.GreetingRepository;
import com.nutfreedom.di.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("th")
public class GreetingSerivceTh implements GreetingService {

    private GreetingRepository greetingRepository;

    public GreetingSerivceTh(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGreetingTha();
    }
}
