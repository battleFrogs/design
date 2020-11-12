package com.gjc.command;

public class LightCommand implements ICommand {

    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.openLight();
    }

    @Override
    public void undo() {
        light.closeLight();
    }
}
