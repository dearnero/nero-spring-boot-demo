package com.nero.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * date : 2018/1/31
 * time : 10:52
 * </p>
 *
 * @author Nero
 */
@RestController
@EnableConfigurationProperties(Xu.class)
@Slf4j
public class Example {

    @Value("${x.name}")
    private String name;

    @Value("${x.age}")
    private Integer age;

    @Value("${x.level}")
    private Integer level;

    @Autowired
    private Xu xu;

    @RequestMapping("/")
    String home() {

        log.info("info....");
        log.error("error....");
        return name + "Hello World!";
    }
}
