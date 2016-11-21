package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.spring.domain.HelloWorld;
import com.spring.domain.impl.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {
 
    @Bean(name="helloWorldBean")
    @Description("This is a sample HelloWorld Bean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
 