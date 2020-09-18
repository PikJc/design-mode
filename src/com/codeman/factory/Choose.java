package com.codeman.factory;

/**
 * 用来调用第一个接口的接口
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:18:00
 */
public interface Choose {

    /**
     * 执行第一个接口的实现类
     */
    Sender getSender();
}
