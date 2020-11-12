package com.gjc.template.entity;

public abstract class LeaveRequest {

    public void request() {
        System.out.println("本人");
        System.out.println(name());
        System.out.println("因");
        System.out.println(reason());
        System.out.println("需请假");
        System.out.println(duration());
        System.out.println("天，望批准");
    }

    abstract String name();

    abstract String reason();

    abstract String duration();

}
