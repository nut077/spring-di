package com.nutfreedom.di;

import com.nutfreedom.di.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");
        System.out.println(controller.normal());
        System.out.println(controller.wedding());
    }
}
