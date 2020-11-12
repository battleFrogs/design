package com.gjc.group.entity;

public class Employee extends Component {

    public Employee(String position, String job) {
        super(position, job);
    }

    @Override
    public void addComponent(Component component) {
        System.out.println("职员没有管理权限");
    }

    @Override
    public void removeComponent(Component component) {
        System.out.println("职员没有管理权限");
    }

    @Override
    public void check() {
        work();
    }
}
