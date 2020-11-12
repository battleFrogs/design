package com.gjc.state;

import com.gjc.state.entity.Context;
import com.gjc.state.entity.StartState;

/**
 * 状态模式
 */
public class Test {


    public static void main(String[] args) {

        Context context1 = new Context(new StartState(),30);
        context1.handle();
        System.out.println("--------------------");
        Context context2 = new Context(new StartState(),50);
        context2.handle();
        System.out.println("--------------------");
        Context context3 = new Context(new StartState(),90);
        context3.handle();
        System.out.println("--------------------");

    }

}
