package com.gjc.group.entity;

public abstract class Component {

    private String position;
    private String job;

    public Component(String position, String job) {
        this.position = position;
        this.job = job;
    }

    public void work() {
        System.out.println("我是" + position + ", 正在" + job);
    }

    public abstract void addComponent(Component component);

    public abstract void removeComponent(Component component);

    public abstract void check();


}
