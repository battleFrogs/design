package com.gjc.state.entity;

public class Context {

    // 当前状态
    public State currentState;
    public int value;


    public Context(State currentState, int value) {
        this.currentState = currentState;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void handle() {
        currentState.currentHandle(this);
    }
}
