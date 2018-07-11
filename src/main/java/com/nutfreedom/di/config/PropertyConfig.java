package com.nutfreedom.di.config;

import com.nutfreedom.di.examplebean.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${nutfreedom.user}")
    private String user;
    @Value("${nutfreedom.password}")
    private String password;
    @Value("${nutfreedom.url}")
    private String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        return new FakeDataSource(user, password, url);
    }

}
