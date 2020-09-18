package com.codeman.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *  建造者模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月18日 09:36:00
 */
public class BuilderTest {

    private List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        BuilderTest builderTest = new BuilderTest();
        builderTest.buildA(20);
    }

    public void buildA(Integer num){
        for (int i = 0; i < num; i++) {
            list.add("A");
        }
    }

    public void buildB (Integer num){
        for (int i = 0; i < num; i++) {
            list.add("B");
        }
    }
}

