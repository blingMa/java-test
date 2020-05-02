package com.practice.jdk8.lambda;

/**
 * @author shihao.ma
 * @since 2020/4/29
 */
public class Person {
    private String username;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String username, Integer age) {
        this.username = username;
        this.age = age;
    }
}
