package com.practice.jdk8.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */

class Reference1 {
    public static int method1(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public static int method2(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }
}

class Reference2 {
    public int method1(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int method2(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }
}

public class MethodReferenceDemo {
    public String getString1(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String string, Function<String, String> function) {
        return function.apply(string);
    }

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 82);
        Student student2 = new Student("lisi", 80);
        Student student3 = new Student("wanger", 88);
        List<Student> students = Arrays.asList(student1, student2, student3);
        //lambda表达式
        students.sort((stu1, stu2) -> Reference1.method1(stu1, stu2));
        students.forEach(e -> System.out.println(e.getName()));
        System.out.println("--------------------------");
        //类名::静态方法名
        students.sort(Reference1::method1);
        students.forEach(e -> System.out.println(e.getName()));
        System.out.println("--------------------------");
        //引用名::实例方法名
        Reference2 reference2 = new Reference2();
        students.sort(reference2::method1);
        students.forEach(e -> System.out.println(e.getName()));
        System.out.println("--------------------------");
        //类名::实例方法名
        students.sort(Student::compareScore);
        students.forEach(e -> System.out.println(e.getName()));
        System.out.println("--------------------------");
        List<String> strings = Arrays.asList("qingdao", "henai", "alabo");
        Collections.sort(strings, String::compareToIgnoreCase);
        strings.forEach(e -> System.out.println(e));
        System.out.println("--------------------------");
        //构造方法引用：类名::new
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        System.out.println(methodReferenceDemo.getString1(String::new));
        System.out.println(methodReferenceDemo.getString2("hello", String::new));
    }
}
