package com.practice.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest predicateTest = new PredicateTest();
        predicateTest.filter1(integers, e -> e > 8);
        System.out.println("------------------------------");
        predicateTest.filter2(integers, e -> e > 5, e -> e % 2 == 0);
        System.out.println("------------------------------");
        System.out.println(predicateTest.filter3("test").test("aaa"));
    }

    public void filter1(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public void filter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate1.and(predicate2).test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public Predicate<String> filter3(Object object) {
        return Predicate.isEqual(object);
    }
}
