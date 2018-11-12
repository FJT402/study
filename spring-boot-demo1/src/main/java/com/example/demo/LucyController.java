package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: 将配置文件的属性赋给实体类 之后通过请求获取
 * @author: FengJiantao
 * @create: 2018-11-01 16:13
 **/
@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LucyController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/lucy")
    public String lucy() {
        return configBean.getGreeting() + "-" + configBean.getName() + "-" + configBean.getAge()
                + "-" + configBean.getNumber() + "-" + configBean.getUuid() + "-" + configBean.getMax() + "-" + configBean.getValue();
    }

    @Autowired
    User user;

    @RequestMapping("/user")
    public String getUser() {
        return user.getName() + "-" + user.getAge();
    }
}
