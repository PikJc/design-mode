package com.codeman.protype;

import java.io.Serializable;

/**
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月21日 08:21:00
 */
public class Student implements Serializable {


    public Student() {
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    private Integer age;

    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
