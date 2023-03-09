package com.study.pattern.singleton;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public String hello() {
        return "hello";
    }

    static class Test {
        public static void main(String[] args) {
            ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
            String hello = ac.getBean("hello", String.class);
            String hello2 = ac.getBean("hello", String.class);
            System.out.println(hello2 == hello);
        }
    }

}
