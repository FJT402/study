package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: 简单测试web功能
 * @author: FengJiantao
 * @create: 2018-11-01 15:27
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from the Spring Boot!";
    }
}
