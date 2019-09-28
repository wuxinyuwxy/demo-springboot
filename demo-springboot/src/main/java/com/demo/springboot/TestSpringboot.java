package com.demo.springboot;

import com.demo.springboot.entity.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestSpringboot {

    public static void main(String[] args){
        SpringApplication.run(TestSpringboot.class,args);
    }

    @Bean
    public Demo demo(){
        return  new Demo();
    }
}
