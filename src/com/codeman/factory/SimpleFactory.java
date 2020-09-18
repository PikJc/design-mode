package com.codeman.factory;

/**
 * 简单工厂模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 08:48:00
 */
public class SimpleFactory {

    Sender getSender(String type){
        if (type.equals("A")){
            return new SenderImplA();
        }else if (type.equals("B")){
            return new SenderImplB();
        }else {
            System.out.println("指令发送错误");
            return null;
        }
    }
}
