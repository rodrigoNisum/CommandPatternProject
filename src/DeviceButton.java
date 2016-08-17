import com.nisum.interfaces.Command;

public class DeviceButton {

    private Command command;

    public DeviceButton(Command newCommand) {
        command = newCommand;
    }

    public void press(){
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }

}
