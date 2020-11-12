package com.gjc.explain;

import com.gjc.explain.entity.Calculator;

/**
 * 解释器模式 ，最小单元
 */
public class Test {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        String expression = "一加一";
        System.out.println(expression + "等于" + calculator.calculate(expression));

    }

}
