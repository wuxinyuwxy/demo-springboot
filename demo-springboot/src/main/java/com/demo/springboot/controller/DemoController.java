package com.demo.springboot.controller;

import com.demo.springboot.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${hello.name}")
    String  HelloName;

    @Autowired
    private Demo demo;

    @RequestMapping("hello")
    public Object hello(){
        return "Hello "+HelloName;
    }

}
