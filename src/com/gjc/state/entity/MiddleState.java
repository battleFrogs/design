package com.gjc.state.entity;

public class MiddleState extends State {


    @Override
    public void currentHandle(Context context) {
        System.out.println("middleState 处理中");
        if (context.getValue() >= 40 && context.getValue() <= 80) {
            System.out.println("处理完毕");
        } else {
            nextHandle(context);
        }

    }

    @Override
    public void nextHandle(Context context) {
        context.setCurrentState(new EndState());
        context.handle();
    }
}
