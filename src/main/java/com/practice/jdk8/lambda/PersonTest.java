package com.practice.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shihao.ma
 * @since 2020/4/29
 */
public class PersonTest {
    public static void main(String[] args) {
        Person zhangsan = new Person("zhangsan", 22);
        Person lilei = new Person("lilei", 20);
        Person wanger = new Person("wanger", 18);

        List<Person> people = Arrays.asList(zhangsan, lilei, wanger);

        //stream的使用
        List<Person> collect = people.stream().filter(person -> person.getAge() >= 20).collect(Collectors.toList());
        collect.forEach(person -> System.out.println(person.getUsername()));
    }
}
