package com.gjc.adapt.entity;

public class Adapter {

    // 适配输出
    int convert(int homeVolt) {
        return homeVolt - 215; //适配为5v
    }

}
