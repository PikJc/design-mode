package com.codeman.factory;

/**
 * 抽象工厂
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:26:00
 */
public class ChooseFactory {

    public static void main(String[] args) {
        Choose choose = new ChooseImplA();
        Sender sender = choose.getSender();
        sender.sendInfo();
    }


}

//工厂1
class ChooseImplA implements Choose{

    @Override
    public Sender getSender() {
        return new SenderImplA();
    }
}

//工厂2
class ChooseImplB implements Choose{

    @Override
    public Sender getSender() {
        return new SenderImplB();
    }
}