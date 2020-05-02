package com.practice.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
public class FlatMapTest {
    public static void main(String[] args) {
        //flatMap
        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        lists.stream().flatMap(list -> list.stream()).map(e -> e * e).forEach(System.out::println);

        //将列表中的字符串中的单词去重之后并输出
        List<String> strings = Arrays.asList("hello world", "hello welcome", "world welcome");
        strings.stream().map(string -> string.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);

        //将两个列表中的String进行组合
        List<String> list1 = Arrays.asList("hi", "hello", "welcome");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wanger");
        list1.stream().flatMap(e1 -> list2.stream().map(e2 -> e1 + " " + e2)).forEach(System.out::println);
    }
}
