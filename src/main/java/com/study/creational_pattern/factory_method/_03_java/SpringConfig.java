package com.study.creational_pattern.factory_method._03_java;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public String hello() {
        return "hello wonpyol";
    }
}
