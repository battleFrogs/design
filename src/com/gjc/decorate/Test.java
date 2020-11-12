package com.gjc.decorate;

import com.gjc.decorate.entity.IBeauty;
import com.gjc.decorate.entity.Me;
import com.gjc.decorate.entity.RingDecortaor;

public class Test {

    public static void main(String[] args) {

        IBeauty me = new Me();
        System.out.println(me.getBeautyValue());
        IBeauty ringDecorator = new RingDecortaor(me);
        System.out.println(ringDecorator.getBeautyValue());

    }

}
