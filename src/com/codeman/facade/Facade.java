package com.codeman.facade;

/**
 * 外观模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月22日 08:04:00
 */
public class Facade {
    public static void main(String[] args) {
        A a = new A();
        a.fun1();
        a.fun2();
    }
}


class A{ //外观类
    private B b;
    private C c;
    A(){
        b =new B();
        c = new C();
    }

    void fun1(){
        b.fun1();
        c.fun1();
    }

    void fun2(){
        b.fun2();
        c.fun2();
    }

}

class B{
    void fun1(){
        System.out.println("B中的任务一执行");
    }

    void fun2(){
        System.out.println("B中的任务二执行");
    }
}

class C{
    void fun1(){
        System.out.println("C中的任务一执行");
    }

    void fun2(){
        System.out.println("C中的任务二执行");
    }
}