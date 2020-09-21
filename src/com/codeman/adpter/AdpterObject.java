package com.codeman.adpter;

/**
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月21日 08:43:00
 */
public class AdpterObject{

    public static void main(String[] args) {
        M m = new M();
        AdpterB adpterB = new AdpterB(m);
        adpterB.method01();
        adpterB.method02();
    }


}

class AdpterB implements N{

    private M m;

    public AdpterB(M m){
        this.m = m;
    }

    @Override
    public void method01() {
        m.method01();
    }

    @Override
    public void method02() {
        System.out.println("0002");
    }
}

class M{
    void method01(){
        System.out.println("001");
    }

}

interface N{
    void method01();
    void method02();
}