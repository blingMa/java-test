package com.practice.jdk8.lambda;

import java.util.function.Supplier;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
class Student {
    private String name = "lilei";
    private Integer age = 12;

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

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Student> supplier1 = () -> new Student();
        System.out.println(supplier1.get().getName());
        System.out.println("------------------------");
        //构造方法引用
        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());
    }
}
