package com.codeman.decoractor;

/**
 * 装饰器模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月21日 09:30:00
 */
public class DecoractorTest {

    public static void main(String[] args) {
        DecoractorA decoractorA = new DecoractorAImpl();
        DecoractorA a = new DecoractorB(decoractorA);
        a.method();
    }
}


interface DecoractorA {

    void method();
}

class DecoractorAImpl implements DecoractorA{

    @Override
    public void method() {
        System.out.println("你好，中国！");
    }
}

class DecoractorB implements DecoractorA{

    private DecoractorA a;

    public DecoractorB(DecoractorA a){
        this.a = a;
    }

    @Override
    public void method(){
        System.out.println("执行前");
        a.method();
        System.out.println("执行后");
    }
}
