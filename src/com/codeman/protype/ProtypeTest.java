package com.codeman.protype;

import java.io.*;

/**
 * 原型模式  clone
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 10:10:00
 */
public class ProtypeTest implements Cloneable,Serializable{

    private String str = "小米";

    private Student student;

    public ProtypeTest(String s,Student student){
        super();
        this.str = s;
        this.student = student;
    }

    //通过clone获取
    @Override
    public Object clone() throws CloneNotSupportedException {
        ProtypeTest protypeTest = (ProtypeTest)super.clone();
        return protypeTest;
    }

    //深拷贝和浅拷贝

    public Object deepClone() throws IOException, ClassNotFoundException, CloneNotSupportedException {
        super.clone();
        ByteArrayOutputStream opt = new ByteArrayOutputStream();
        ObjectOutputStream obj = new ObjectOutputStream(opt);
        obj.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(opt.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
        return ois.readObject();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "ProtypeTest{" +
                "str='" + str + '\'' +
                ", student=" + student +
                '}';
    }
}



