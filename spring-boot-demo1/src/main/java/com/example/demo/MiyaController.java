package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: 自定义属性 - 读取配置文件application.yml中的属性
 * @author: FengJiantao
 * @create: 2018-11-01 16:02
 **/
@RestController
public class MiyaController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/miya")
    public String miya() {
        return name + ":" + age;
    }
}
