package com.gjc.appearance;

import com.gjc.appearance.entity.Browser;
import com.gjc.appearance.entity.Facade;
import com.gjc.appearance.entity.IDE;

public class Test {

    public static void main(String[] args) {

        Browser.open();
        IDE.open();
        IDE.close();
        Browser.close();
        System.out.println("-----------------------");

        Facade.open();
        Facade.close();
    }

}
