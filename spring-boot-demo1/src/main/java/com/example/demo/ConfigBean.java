package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description: 将配置文件的属性赋给实体类
 * @author: FengJiantao
 * @create: 2018-11-01 16:10
 **/
@ConfigurationProperties(prefix = "my")
@Component
@Data
public class ConfigBean {
    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;
}
