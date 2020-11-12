package com.gjc.explain.entity;

public class Sub extends Operator {


    public Sub(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int intercept() {
        return left.intercept() - right.intercept();
    }
}
