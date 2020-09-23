package com.codeman.template;

/**
 * 模板方法模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月23日 08:33:00
 */
public class Template {


    public static void main(String[] args) {
        AbstractTemplate plus = new Plus();
        System.out.println(plus.calculate("6+9+5", "\\+"));
    }

}


abstract class AbstractTemplate{

     private int[] split(String exp,String opt){
        String[] split = exp.split(opt);
        int[] result = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }
        return result;
    }

    final int calculate(String exp,String opt){
        int[] split = split(exp, opt);
        return calculate(split);
    }

    abstract int calculate(int[] result);


}

class Plus extends AbstractTemplate{

    @Override
    int calculate(int[] result) {
        System.out.println("正在执行模板方法");
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += result[i];
        }
        return sum;
    }
}

class Less extends AbstractTemplate{

    @Override
    int calculate(int[] result) {
        int sum = result[0];
        for (int i = 1; i < result.length; i++) {
            sum -= result[i];
        }
        return sum;
    }
}