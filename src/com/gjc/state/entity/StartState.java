package com.gjc.state.entity;

public class StartState extends State {


    @Override
    public void currentHandle(Context context) {
        System.out.println("startState处理中");
        context.setValue(context.getValue() - 10);
        if (context.getValue() > 20) {
            nextHandle(context, new MiddleState());
        }else{
            nextHandle(context, new EndState());
        }

    }


    @Override
    public void nextHandle(Context context, State state) {
        context.setCurrentState(state);
        context.handle();
    }
}
