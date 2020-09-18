package com.codeman.singleton;

/**
 * 单例模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:40:00
 */
public class SocketClientC {

    private static SocketClientC socketClient = null;

    private SocketClientC(){
        //私有化构造，防止外部实例化
    }

    private static class SocketClientFactory{
        private static SocketClientC instance = new SocketClientC();
    }

   public static SocketClientC getInstance(){
        return SocketClientFactory.instance;
   }

    public Object readResolve(){
        return socketClient;
    }
}
