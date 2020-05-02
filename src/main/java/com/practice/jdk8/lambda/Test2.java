package com.practice.jdk8.lambda;

/**
 * @author shihao.ma
 * @since 2020/4/28
 */
@FunctionalInterface
interface MyInterface{
    void test();
    String toString(); //因为toString为Object类的公有方法，所以@FunctionalInterface注解没有报错
}

public class Test2 {

    public void function(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        //jdk1.7写法
        test2.function(new MyInterface() {
            @Override
            public void test() {
                System.out.println("test2");
            }
        });
        System.out.println("----------");
        //jdk1.8写法
        test2.function(() -> System.out.println("test2"));
        //将lambda表达式赋值给一个对象的引用
        MyInterface myInterface = () -> System.out.println("test2");
        System.out.println(myInterface.getClass()); //lambda表达式的类型
        System.out.println(myInterface.getClass().getSuperclass()); //父类型
        System.out.println(myInterface.getClass().getInterfaces()[0]); //实现的接口
    }
}
