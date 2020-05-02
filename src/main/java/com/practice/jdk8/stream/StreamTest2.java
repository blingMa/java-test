package com.practice.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
public class StreamTest2 {
    public static void main(String[] args) {
//            List<String> list = new ArrayList<>(5000000);
//            for (int i = 0; i < 5000000; i++) {
//                list.add(UUID.randomUUID().toString());
//            }
//            long startTime = System.currentTimeMillis();
//            //串行流
////        list.stream().sorted().count();
//            //并行流
//            list.parallelStream().sorted().count();
//            long endTime = System.currentTimeMillis();
//            System.out.println(endTime - startTime);

//        //将列表中长度为5的第一个单词打印出来，并把长度也打印出来
//        List<String> list1 = Arrays.asList("hello", "wordd", "hello word");
//        list1.stream().mapToInt(item -> {
//            System.out.println(item);
//            return item.length();
//        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);

        //将列表中的字符串中的单词去重之后并输出
        List<String> strings = Arrays.asList("hello world", "hello welcome", "world welcome");
        strings.stream().map(string -> string.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
    }
}
