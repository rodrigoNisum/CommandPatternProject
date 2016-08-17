import com.nisum.comands.TurnDown;
import com.nisum.comands.TurnOff;
import com.nisum.comands.TurnOn;
import com.nisum.comands.TurnUp;
import com.nisum.interfaces.Command;
import com.nisum.interfaces.ElectronicDevice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ElectronicDevice television = new Television();

        List<Command> commands = new ArrayList<Command>();
        commands.add(new TurnDown(television));
        commands.add(new TurnOff(television));
        commands.add(new TurnUp(television));
        commands.add(new TurnOn(television));

        for(Command c : commands){
            c.execute();
        }
    }
}
