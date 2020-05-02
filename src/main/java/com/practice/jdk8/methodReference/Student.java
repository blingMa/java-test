package com.practice.jdk8.methodReference;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Integer score;

    public int compareScore(Student student) {
        return this.score - student.score;
    }
}
