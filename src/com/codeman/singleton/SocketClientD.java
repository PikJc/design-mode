package com.codeman.singleton;

/**
 * 单例模式 - 创建和实例分开
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:40:00
 */
public class SocketClientD {

    private static SocketClientD instance = null;

    private SocketClientD(){
        //私有化构造，防止外部实例化
    }

    //实例
    private static synchronized void syncInit(){
        if (instance==null){
            instance = new SocketClientD();
        }
    }

    //创建
   public static SocketClientD getInstance(){
        if (instance == null){
            syncInit();
        }
        return instance;
   }

    public Object readResolve(){
        return getInstance();
    }
}
