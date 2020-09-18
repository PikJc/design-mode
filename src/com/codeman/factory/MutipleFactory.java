package com.codeman.factory;

/**
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:12:00
 */
public class MutipleFactory {

    Sender getFactoryA(){
        return new FactoryA();
    }

    Sender getFactoryB(){
        return new FactoryB();
    }

    public static Sender getStaticFactory(){
        return new FactoryStatic();
    }

}


class FactoryA implements Sender{

    @Override
    public void sendInfo() {
        System.out.println("A工厂发出");
    }
}

class FactoryB implements Sender{

    @Override
    public void sendInfo() {
        System.out.println("B工厂发出");
    }
}

class FactoryStatic implements Sender{

    @Override
    public void sendInfo() {
        System.out.println("静态工厂发出");
    }
}