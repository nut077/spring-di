package com.nutfreedom.di.service.impl;

import com.nutfreedom.di.repository.GreetingRepository;
import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getGreetingEng() {
        return "Congratulations";
    }

    @Override
    public String getGreetingTha() {
        return "ยินดีด้วย";
    }
}
