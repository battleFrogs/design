package com.gjc.prototype.entity;

// 原型模式
public class MilkTea implements Cloneable{

    public String type;
    public boolean ice;

    // 只能实现浅拷贝，无法使用非基本类型对象，需手动修改实现
    @Override
    protected MilkTea clone() throws CloneNotSupportedException {
        return (MilkTea)super.clone();
    }
}
