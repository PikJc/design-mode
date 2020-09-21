package com.codeman.protype;

import java.io.IOException;

/**
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月21日 08:10:00
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Student student = new Student(92,"小张");
        ProtypeTest protypeTest = new ProtypeTest("xxxxx",student);
        ProtypeTest o = (ProtypeTest) protypeTest.clone();
        ProtypeTest o1 = (ProtypeTest) protypeTest.deepClone();
//        o.getStudent().setAge(5);
        o1.getStudent().setAge(5);

        System.out.println(protypeTest);
        System.out.println(o);
        System.out.println(o1);
    }
}
