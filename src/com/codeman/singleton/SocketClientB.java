package com.codeman.singleton;

/**
 * 单例模式 - 多线程模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:40:00
 */
public class SocketClientB {

    private static SocketClientB socketClient = null;

    private SocketClientB(){
        //私有化构造，防止外部实例化
    }

    public static synchronized SocketClientB getInstance(){
        if (socketClient == null){
            synchronized (socketClient){
                if (socketClient == null){
                    socketClient = new SocketClientB();
                }
            }
        }
        return socketClient;
    }

    public Object readResolve(){
        return socketClient;
    }
}
