package com.nisum.comands;


import com.nisum.interfaces.Command;
import com.nisum.interfaces.ElectronicDevice;

public class TurnOn implements Command {

    private ElectronicDevice device;

    public TurnOn(ElectronicDevice newTelevision) {
        device = newTelevision;
    }

    @Override
    public void execute() {
        device.turnOn();

    }

    @Override
    public void undo() {
        device.turnOff();
    }
}
