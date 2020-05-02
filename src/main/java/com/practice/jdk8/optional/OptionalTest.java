package com.practice.jdk8.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
public class OptionalTest {
    public static void main(String[] args) {
        Employee zhangsan = new Employee("zhangsan", 22);
        Employee lisi = new Employee("lisi", 19);
        Employee zhaolei = new Employee("zhaolei", 22);
        Company company = new Company("大农大", Arrays.asList(zhangsan, lisi, zhaolei));
        //jdk8之前的写法
        if(null != company.getEmployeeList()){
            System.out.println(company.getEmployeeList());
        }else{
            System.out.println(new ArrayList<Employee>());
        }
        //函数式编程思想
        Optional<Company> optionalCompany = Optional.ofNullable(company);
        System.out.println(optionalCompany.map(company1 -> company1.getEmployeeList()).orElse(Collections.emptyList()));
    }
}
