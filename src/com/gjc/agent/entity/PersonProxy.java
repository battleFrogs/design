package com.gjc.agent.entity;

/**
 * 代理模式
 */
public class PersonProxy implements IPerson {

    private final Person person;

    public PersonProxy() {
        this.person = new Person();
    }

    @Override
    public void eat() {
        person.eat();
    }

    @Override
    public void sleep() {
        person.sleep();
    }
}
