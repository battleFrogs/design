package com.gjc.observate;

import com.gjc.observate.entity.CriminalObservable;
import com.gjc.observate.entity.PoliceObserver;

public class Test {

    public static void main(String[] args) {

        CriminalObservable zhangsan = new CriminalObservable();
        PoliceObserver police1 = new PoliceObserver();
        PoliceObserver police2 = new PoliceObserver();
        PoliceObserver police3 = new PoliceObserver();

        zhangsan.addObserver(police1);
        zhangsan.addObserver(police2);
        zhangsan.addObserver(police3);
        zhangsan.crime("放狗咬人");
    }


}
