package com.nisum.comands;

import com.nisum.interfaces.Command;
import com.nisum.interfaces.ElectronicDevice;

public class TurnUp implements Command {

    ElectronicDevice device;

    public TurnUp(ElectronicDevice newDevice) {
        device = newDevice;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
