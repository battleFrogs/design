package com.gjc.command;

import java.util.Stack;

// 通过命令模式 ，使得每个命令具有对象属性，执行和撤销功能
public class Test {

    public static void main(String[] args) {

        Stack<ICommand> stack = new Stack<>();
        Door door = new Door();
        Light light = new Light();

        DoorCommand doorCommand = new DoorCommand(door);
        doorCommand.execute();
        stack.push(doorCommand);

        LightCommand lightCommand = new LightCommand(light);
        lightCommand.execute();
        stack.push(lightCommand);

        ICommand pop = stack.pop();
        pop.undo();
        ICommand popagain = stack.pop();
        popagain.undo();

    }

}
