package com.codeman.protype;

import java.io.Closeable;

/**
 * 原型模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 10:10:00
 */
public class ProtypeTest implements Cloneable {

    //通过clone获取
    @Override
    public Object clone() throws CloneNotSupportedException {
        ProtypeTest protypeTest = (ProtypeTest)super.clone();
        return protypeTest;
    }

    //深拷贝和浅拷贝




}



