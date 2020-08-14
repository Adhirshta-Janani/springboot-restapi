package com.demo.loginservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan("com.demo.loginservice")
@EnableAutoConfiguration
public class LoginserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginserviceApplication.class, args);
    }

}
