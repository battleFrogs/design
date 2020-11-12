package com.gjc.bridge;

import com.gjc.bridge.service.IColor;
import com.gjc.bridge.service.IShape;
import com.gjc.bridge.service.impl.Rectangle;
import com.gjc.bridge.service.impl.Red;

public class Test {

    public static void main(String[] args) {

        IColor red = new Red();
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(red);
        rectangle.draw();

    }

}
