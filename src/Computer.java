import com.nisum.interfaces.ElectronicDevice;

public class Computer implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void turnOn() {
        System.out.println("Computer is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer is off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume is "+volume++);
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume is "+volume--);
    }
}
