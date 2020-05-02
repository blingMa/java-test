package com.practice.jdk8.lambda;

import java.util.function.Function;

/**
 * @author shihao.ma
 * @since 2020/4/29
 */
public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 functionTest = new FunctionTest2();
        System.out.println(functionTest.computer(2, e -> e * 3, e -> e * e));
        System.out.println(functionTest.computer2(2, e -> e * 3, e -> e * e));
    }

    //使用compose和andThen可以实现多个function的串联，并且可以指定先后关系

    public Integer computer(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        //compose先执行参数中的function，后执行自身的function  结果12
        return function1.compose(function2).apply(a);
    }

    public Integer computer2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function12) {
        //andThen先执行自身的function，后执行参数的function  结果36
        return function1.andThen(function12).apply(a);
    }
}
