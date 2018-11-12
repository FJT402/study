package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: demo
 * @description: 自定义配置文件 - 读取test.properties配置文件中的属性
 * @author: FengJiantao
 * @create: 2018-11-01 16:44
 **/
@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.fjt")
@Data
public class User {
    private String name;
    private int age;
}
