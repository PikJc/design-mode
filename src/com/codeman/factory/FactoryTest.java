package com.codeman.factory;

/**
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 08:46:00
 */
public class FactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Sender a = simpleFactory.getSender("A");
        a.sendInfo();
        Sender b = simpleFactory.getSender("B");
        b.sendInfo();


        MutipleFactory mutipleFactory = new MutipleFactory();
        mutipleFactory.getFactoryA().sendInfo();
        mutipleFactory.getFactoryB().sendInfo();


        MutipleFactory.getStaticFactory().sendInfo();

        /**
         * 抽象工厂： 多个接口或两个接口的方式来扩展工厂模式
         * 目的： 实现更好的扩展，在扩展中需要对工厂更多改动
         */

    }
}
