package com.codeman.singleton;

import java.util.Vector;

/**
 * 单例模式 - 影子创建单例模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:40:00
 */
public class SocketClientE {

    private static SocketClientE instance = null;

    private Vector properties = null;

    public Vector getProperties(){

        return properties;
    }

    private SocketClientE(){
        //私有化构造，防止外部实例化
    }

    //实例
    private static synchronized void syncInit(){
        if (instance==null){
            instance = new SocketClientE();
        }
    }

    //创建
   public static SocketClientE getInstance(){
        if (instance == null){
            syncInit();
        }
        return instance;
   }

   public void updateProperties(){
       SocketClientE socketClientE = new SocketClientE();
       properties = socketClientE.getProperties();
   }

    public Object readResolve(){
        return getInstance();
    }
}
