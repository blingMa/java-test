package com.practice.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author shihao.ma
 * @since 2020/4/28
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        //1.for循环
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
        System.out.println("----------");
        //2.增强for循环
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println("----------");
        //3.forEach
        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("-----lambda-----");
        //4.forEach使用lambda写法
        integers.forEach(e -> System.out.println(e)); //通过lambda表达式，创建函数式接口的实例
        System.out.println("----------------");
        integers.forEach(System.out::println); //通过方法引用的形式，创建函数式接口的实例
    }

}
