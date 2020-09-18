package com.codeman.singleton;

/**
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:44:00
 */
public class SingleTonTest {

    public static void main(String[] args) {
        SocketClient instance = SocketClient.getInstance();
        System.out.println(instance);
        SocketClient instance2 = SocketClient.getInstance();
        System.out.println(instance2);
        SocketClient instance3 = SocketClient.getInstance();
        System.out.println(instance3);

    }
}
