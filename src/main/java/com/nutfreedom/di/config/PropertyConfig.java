package com.nutfreedom.di.config;

import com.nutfreedom.di.examplebean.FakeDataSource;
import com.nutfreedom.di.examplebean.OtherDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:other.properties")
})
public class PropertyConfig {

    @Value("${nutfreedom.user}")
    private String user;
    @Value("${nutfreedom.password}")
    private String password;
    @Value("${nutfreedom.url}")
    private String url;

    @Value("${nutfreedom.other.user}")
    private String userOther;
    @Value("${nutfreedom.other.password}")
    private String passwordOther;
    @Value("${nutfreedom.other.url}")
    private String urlOther;

    @Bean
    public FakeDataSource fakeDataSource() {
        return new FakeDataSource(user, password, url);
    }

    @Bean
    public OtherDataSource otherDataSource() {
        return new OtherDataSource(userOther, passwordOther, urlOther);
    }

}
