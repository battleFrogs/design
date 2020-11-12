package com.gjc.appearance.entity;

import com.gjc.appearance.entity.Browser;
import com.gjc.appearance.entity.IDE;

/**
 * 外观模式，整合所有的操作一起
 */
public class Facade {

    public static void open() {
        Browser.open();
        IDE.open();
    }

    public static void close() {
        Browser.close();
        IDE.close();
    }

}
