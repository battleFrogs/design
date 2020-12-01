package com.gjc.state.entity;

public class MiddleState extends State {


    @Override
    public void currentHandle(Context context) {
        System.out.println("middleState 处理中");
        if (context.getValue() >= 40 && context.getValue() <= 80) {
            System.out.println("处理完毕");
        } else {
            nextHandle(context, new EndState());
        }

    }

    @Override
    public void nextHandle(Context context, State state) {
        context.setCurrentState(state);
        context.handle();
    }
}
