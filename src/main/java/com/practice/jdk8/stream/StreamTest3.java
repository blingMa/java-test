package com.practice.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
public class StreamTest3 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 22);
        Student student2= new Student("lisi", 90, 22);
        Student student3 = new Student("wanger", 70, 22);
        Student student4 = new Student("zhangsan", 80, 22);
        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        //按照学生名字分组
//        Map<String, List<Student>> collect = students.stream().collect(Collectors.groupingBy(Student::getName));
        //按照学生名字分组,并返回每组的个数
//        students.stream().collect(Collectors.groupingBy(student ->student.getName()), Collectors.counting());
//        //按照学生名字分组,并返回每组成绩平均值
//        students.stream().collect(Collectors.groupingBy(Student::getName), Collectors.averagingDouble(Student::getScore));
        //按照学生成绩分区 分区只有两个去 true和false
        Map<Boolean, List<Student>> collect = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 90));
        System.out.println(collect.get(true));
    }
}
