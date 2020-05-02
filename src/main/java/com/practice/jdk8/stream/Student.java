package com.practice.jdk8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shihao.ma
 * @since 2020/5/1
 */
@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Integer score;
    private Integer age;
}
