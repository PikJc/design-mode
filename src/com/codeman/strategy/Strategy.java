package com.codeman.strategy;

import java.util.Arrays;

/**
 * 策略模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月23日 08:15:00
 */
public class Strategy {

    public static void main(String[] args) {
        I plus = new Plus();
        int calculate = plus.calculate("5+9+4");
        System.out.println(calculate);

        I less = new Less();
        int calculate1 = less.calculate("5-9-8");
        System.out.println(calculate1);
    }

}

interface I{
    public int calculate(String exp);
}

abstract class AbstractStrategy implements I{


     int[] split(String exp,String opt){
        String[] split = exp.split(opt);
        int[] result = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }
        return result;
    }

}

class Plus extends AbstractStrategy{

    @Override
    public int calculate(String exp) {
        int[] split = split(exp, "\\+");
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            sum += split[i];
        }
        return sum;
    }
}

class Less extends AbstractStrategy{

    @Override
    public int calculate(String exp) {
        int[] split = split(exp, "-");
        int sum = split[0];
        for (int i = 1; i < split.length; i++) {
            sum -= split[i];
        }
        return sum;
    }
}
