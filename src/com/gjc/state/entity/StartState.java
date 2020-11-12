package com.gjc.state.entity;

public class StartState extends State {


    @Override
    public void currentHandle(Context context) {
        System.out.println("startState处理中");
        if (context.getValue() < 40) {
            System.out.println("处理完毕");
        }else{
            nextHandle(context);
        }

    }


    @Override
    public void nextHandle(Context context) {
        context.setCurrentState(new MiddleState());
        context.handle();
    }
}
