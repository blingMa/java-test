package com.practice.jdk8.optional;

import java.util.List;

/**
 * @author shihao.ma
 * @since 2020/4/30
 */
public class Company {
    private String name;
    private List<Employee> employeeList;

    public Company(String name, List<Employee> employeeList) {
        this.name = name;
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
