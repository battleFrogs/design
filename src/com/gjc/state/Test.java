package com.gjc.state;

import com.gjc.state.entity.Context;
import com.gjc.state.entity.StartState;

public class Test {


    public static void main(String[] args) {

        Context context = new Context();
        context.setCurrentState(new StartState());

    }

}
