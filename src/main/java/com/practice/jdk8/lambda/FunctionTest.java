package com.practice.jdk8.lambda;

import java.util.function.Function;

/**
 * @author shihao.ma
 * @since 2020/4/29
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        //lambda表达式 传递行为
        System.out.println(functionTest.computer(5, e -> {
            return e * 2;
        }));
        System.out.println(functionTest.computer(2, e -> e + 2));
        System.out.println(functionTest.convers(2, e -> String.valueOf(e + "dsada")));

        //当方法体中的代码量很多的时候 可以先单独定义function 然后在执行
        Function<Integer, Integer> function = e -> e - 1;
        System.out.println(functionTest.computer(8, function));
    }

    public Integer computer(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    public String convers(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
