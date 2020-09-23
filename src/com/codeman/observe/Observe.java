package com.codeman.observe;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 观察者模式
 *
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月23日 08:52:00
 */
public class Observe {

    public static void main(String[] args) {
        Subject subject = new MySubject();
        ObserveObject a = new ObserveA();
        ObserveObject b = new ObserveB();
        subject.add(a);
        subject.add(b);
        subject.operation("科比去世了!");
        subject.remove(a);
    }

}

interface ObserveObject {

    void update(String info);

}

class ObserveA implements ObserveObject {

    @Override
    public void update(String info) {
        System.out.println("观察者A " + info);
    }
}

class ObserveB implements ObserveObject {

    @Override
    public void update(String info) {
        System.out.println("观察者B " + info);
    }
}

interface Subject {

    public void add(ObserveObject observe);

    public void remove(ObserveObject observe);

    public void notifyAllObserve(String info);

    public void operation(String info);

}

abstract class AbstractSubject implements Subject {

    private Vector<ObserveObject> vector = new Vector<>();

    @Override
    public void add(ObserveObject observe) {
        vector.add(observe);
    }

    @Override
    public void remove(ObserveObject observe) {
        vector.remove(observe);
    }

    @Override
    public void notifyAllObserve(String info) {
        Enumeration<ObserveObject> elements = vector.elements();
        while (elements.hasMoreElements()) {
            ObserveObject observe = elements.nextElement();
            observe.update(info);
        }
    }

}

class MySubject extends AbstractSubject{

    @Override
    public void operation(String info) {
        notifyAllObserve(info);
    }
}