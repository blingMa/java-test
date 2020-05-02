package com.practice.jdk8.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        System.out.println(BinaryOperatorTest.compute(5, 6, (a, b) -> a + b));
        System.out.println(BinaryOperatorTest.compute(5, 6, (a, b) -> a * b));
        System.out.println("--------------------");
        System.out.println(BinaryOperatorTest.getShort("dbc", "bcdef", (a, b) -> a.length() - b.length()));
        System.out.println(BinaryOperatorTest.getShort("dbc", "bcdef", (a, b) -> a.charAt(0) - b.charAt(0)));
    }

    public static int compute(Integer a, Integer b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }
    //minBy返回a、b 中小的值，具体的小的定义规则，由用户来指定，同理还有maxBy
    public static String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
