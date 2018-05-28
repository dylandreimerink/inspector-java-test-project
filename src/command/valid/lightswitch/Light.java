package command.valid.lightswitch;

/**
 * The Receiver class
 * Source: https://en.wikipedia.org/wiki/Command_pattern
 */
public class Light {

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}
