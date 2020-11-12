package com.gjc.command;

public class DoorCommand implements ICommand {

    private Door door;

    public DoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.openDoor();
    }

    @Override
    public void undo() {
        door.closeDoor();
    }
}
