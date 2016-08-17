package com.nisum.comands;


import com.nisum.interfaces.Command;
import com.nisum.interfaces.ElectronicDevice;

public class TurnOff implements Command {
    ElectronicDevice device;

    public TurnOff(ElectronicDevice newDevice) {
        device = newDevice;
    }

    @Override
    public void execute() {
        device.turnOff();
    }

    @Override
    public void undo() {
        device.turnOn();
    }
}
