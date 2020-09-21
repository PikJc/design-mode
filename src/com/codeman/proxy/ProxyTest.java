package com.codeman.proxy;

/**
 * 代理模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月21日 09:37:00
 */
public class ProxyTest {

    public static void main(String[] args) {
        ProxyA proxyA = new ProxyImpl();
        ProxyB proxyB = new ProxyB(proxyA);
        proxyB.method();
    }

}

interface ProxyA {

    void method();

}

class ProxyImpl implements ProxyA{

    @Override
    public void method() {
        System.out.println("代理模式执行...");
    }
}

class ProxyB implements ProxyA {

    private ProxyA proxyA;

    public ProxyB(ProxyA proxyA){
        this.proxyA = proxyA;
    }

    @Override
    public void method() {
        before();
        proxyA.method();
        after();
    }

    private void before(){
        System.out.println("代理之前");
    }

    private void after(){
        System.out.println("代理之后");
    }
}
