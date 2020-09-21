package com.codeman.adpter;

/**
 * 类的适配器
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月21日 08:38:00
 */
public class AdpterClass {



    public static void main(String[] args) {
        A a = new Adpter();
        a.method01();
        a.method02();
    }
}


class Adpter extends B implements A {

    @Override
    public void method02() {
        System.out.println("这是A的实现类method02");
    }
}

class B{
    public void method01(){
        System.out.println("这是B的method01方法");
    }
}

interface A{
    public void method01();
    public void method02();
}
