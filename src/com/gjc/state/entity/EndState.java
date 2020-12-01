package com.gjc.state.entity;

public class EndState extends State {


    @Override
    public void currentHandle(Context context) {
        System.out.println("endState开始处理");
        if (context.getValue() > 80) {
            System.out.println("处理完毕");
        } else {
            nextHandle(context, null);
        }
    }

    @Override
    public void nextHandle(Context context, State state) {
        System.out.println("实在无法处理");
    }
}
