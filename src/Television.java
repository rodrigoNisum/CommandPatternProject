import com.nisum.interfaces.ElectronicDevice;

public class Television implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void turnOn() {
        System.out.println("TV is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turn off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume in "+ volume++);
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume in "+ volume--);
    }
}
