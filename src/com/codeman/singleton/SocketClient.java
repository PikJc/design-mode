package com.codeman.singleton;

import java.util.Objects;

/**
 * 单例模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:40:00
 */
public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){
        //私有化构造，防止外部实例化
    }

    public static SocketClient getInstance(){
        if (socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public Object readResolve(){
        return socketClient;
    }
}
