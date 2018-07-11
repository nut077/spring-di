package com.nutfreedom.di.examplebean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FakeDataSource {
    private String user;
    private String password;
    private String url;
}
