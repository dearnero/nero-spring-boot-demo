package com.nero.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * date : 2018/2/1
 * time : 16:54
 * </p>
 *
 * @author Nero
 */
@ConfigurationProperties(prefix = "x")
public class Xu {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
