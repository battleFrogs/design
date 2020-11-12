package com.gjc.bridge.service.impl;

import com.gjc.bridge.service.IColor;
import com.gjc.bridge.service.IShape;

public class Round implements IShape {

    private IColor color;

    public IColor getColor() {
        return color;
    }

    public void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("绘制" + color.getColor() + "圆形");
    }
}
