package com.practice.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
public class StreamTest {
    public static void main(String[] args) {
//        //将一个集合中的数，乘以二倍并求和
//        List<Integer> integers = Arrays.asList(1, 2, 3);
//        System.out.println(integers.stream().map(integer -> integer * 2).reduce(0, Integer::sum));

        //将一个流转换成数组
        Stream<String> stream = Stream.of("zhangsan", "lisi", "wanger");
//        String[] strings1 = stream.toArray(length -> new String[length]);
//        Arrays.asList(strings1).forEach(System.out::println);
//        String[] strings2 = stream.toArray(String[]::new);
//        Arrays.asList(strings2).forEach(System.out::println);
//
//        //将列表中的数据筛选之后放入TreeSet、ArrayList等之中
//        stream.collect(Collectors.toCollection(TreeSet::new));
//        stream.collect(Collectors.toCollection(ArrayList::new));
//
//        //字符串拼接
//        System.out.println(stream.collect(Collectors.joining()).toString());
//        System.out.println(stream.collect(Collectors.joining(",")).toString());

//        stream.map(String::toUpperCase).forEach(System.out::println);

        //flatMap
//        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
//        lists.stream().flatMap(list -> list.stream()).map(e -> e * e).forEach(System.out::println);

//        Stream.iterate(1, e -> e + 2).limit(6).forEach(System.out::println);
        // Stream.iterate(1, e -> e + 2).limit(6)
        // 找出该流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前两个元素，( skip(2) )
        // 然后在取出流中的前两个元素( limit(2) )，最后求出流中元素的总和
        System.out.println(Stream.iterate(1, e -> e + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());
        //返回最小值
        Stream.iterate(1, e -> e + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).min().ifPresent(System.out::println);
        //求最大值 最小值 总和
        IntSummaryStatistics intSummaryStatistics = Stream.iterate(1, e -> e + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getSum());

    }
}
