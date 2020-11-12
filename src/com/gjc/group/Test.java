package com.gjc.group;

import com.gjc.group.entity.Component;
import com.gjc.group.entity.Employee;
import com.gjc.group.entity.Manager;

public class Test {

    public static void main(String[] args) {

        Component HR = new Employee("人力资源", "找人");
        Component PM = new Employee("产品经理", "设计原型");
        Component program = new Employee("程序员", "写代码");
        Component boss = new Manager("老板", "画饼");

        boss.addComponent(program);
        boss.addComponent(HR);
        boss.check();
        boss.removeComponent(program);
        boss.check();
    }

}
