package com.gjc.explain.entity;

import java.util.Stack;

public class Calculator {

    public int calculate(String expression) {
        Stack<Expression> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            String value = expression.substring(i, i + 1);
            switch (value) {
                case "加":
                    stack.push(new Add(stack.pop(), new Number(expression.substring(++i, ++i))));
                    break;
                case "减":
                    stack.push(new Sub(stack.pop(), new Number(expression.substring(++i, ++i))));
                    break;
                default:
                    stack.push(new Number(value));
                    break;

            }
        }
        return stack.pop().intercept();

    }

}
