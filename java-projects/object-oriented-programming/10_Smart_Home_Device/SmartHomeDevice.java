abstract class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    abstract void turnOn();
    abstract void turnOff();

    public void showStatus() {
        System.out.println("Device: " + deviceName);
    }
}
class SmartLight extends SmartDevice {
    public SmartLight(String devicename) {
        super(devicename);
    }

    @Override
    void turnOn() {
        System.out.println("Light is now ON");
    }
    @Override
    void turnOff() {
        System.out.println("Light is now OFF");
    }
}
class SmartSpeaker extends SmartDevice {
    public SmartSpeaker(String devicename) {
        super(devicename);
    }

    @Override
    void turnOn() {
        System.out.println("Speaker is now playing music");
    }
    @Override
    void turnOff() {
        System.out.println("Speaker in now OFF");
    }
}
class SmartThermostat extends SmartDevice {
    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    @Override
    void turnOn() {
        System.out.println("Thermostat is now set to 22°C");
    }
    @Override
    void turnOff() {
        System.out.println("Thermostat is turned off");
    }
}
public class home {
    public static void main(String[] args) {
        // Creating objects of SmartLight and SmartSpeaker
        SmartLight light = new SmartLight("Smart Light");
        SmartSpeaker speaker = new SmartSpeaker("Smart Speaker");
        SmartThermostat thermostat = new SmartThermostat("Smart Thermostat");

        // Testing SmartLight
        System.out.println("\nSmart Light:");
        light.turnOn();
        light.showStatus();
        light.turnOff();

        // Testing SmartSpeaker
        System.out.println("\nSmart Speaker:");
        speaker.turnOn();
        speaker.showStatus();
        speaker.turnOff();

        // Testing SmartThermostat (Bonus)
        System.out.println("\nSmart Thermostat:");
        thermostat.turnOn();
        thermostat.showStatus();
        thermostat.turnOff();
    }
}
