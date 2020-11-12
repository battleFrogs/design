package com.gjc.agent.entity;

public class Person implements IPerson{

    @Override
    public void eat() {
        System.out.println("我再吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("我在睡觉");
    }
}
