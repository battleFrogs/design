package com.gjc.template.entity;

public class MyLeaveRequest extends LeaveRequest {

    @Override
    String name() {
        return "小明";
    }

    @Override
    String reason() {
        return "生病";
    }

    @Override
    String duration() {
        return "0.5";
    }
}
