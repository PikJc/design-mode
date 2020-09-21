package com.codeman.adpter;

/**
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月21日 09:12:00
 */
public class AdpterInterface {

    public static void main(String[] args) {
        Adpter03 adpter03 = new Adpter03();
        adpter03.method02();
    }
}



interface A01{
    void method01();
    void method02();
    void method03();
    void method04();
    void method05();
}

abstract class B01 implements A01{

    @Override
    public void method01(){}
    @Override
    public void method02(){}
    @Override
    public void method03(){}
    @Override
    public void method04(){}
    @Override
    public void method05(){}
}

class Adpter03 extends B01{

    @Override
    public void method02() {
        System.out.println("适配器继承方法");
    }
}





