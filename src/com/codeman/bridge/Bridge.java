package com.codeman.bridge;

/**
 * 桥接模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月22日 08:10:00
 */
public class Bridge {

    private I i;

    void method01(){
        i.method01();
    }

    public I getI() {
        return i;
    }

    public void setI(I i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        IM im = new IM();
        bridge.setI(im);
        bridge.method01();

        IN in = new IN();
        bridge.setI(in);
        bridge.method01();
    }
}

interface I{
    void method01();
}


class IM implements I{

    @Override
    public void method01() {
        System.out.println("IM 运行method");
    }
}

class IN implements I{

    @Override
    public void method01() {
        System.out.println("IN 运行method");
    }
}
