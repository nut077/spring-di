package com.nutfreedom.di.service.impl;

import com.nutfreedom.di.repository.GreetingRepository;
import com.nutfreedom.di.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class GreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public GreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGreetingEng();
    }
}
