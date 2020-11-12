package com.gjc.state.entity;

public abstract class State {

    public abstract void currentHandle(Context context);

    public abstract void nextHandle(Context context);


}
