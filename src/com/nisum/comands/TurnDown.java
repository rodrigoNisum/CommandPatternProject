package com.nisum.comands;


import com.nisum.interfaces.Command;
import com.nisum.interfaces.ElectronicDevice;

public class TurnDown implements Command {
    private ElectronicDevice device;

    public TurnDown(ElectronicDevice newDevice) {
        device = newDevice;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
