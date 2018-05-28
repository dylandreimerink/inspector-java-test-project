package command.valid.homeautomation;

/**
 * Client
 * Source: https://dzone.com/articles/design-patterns-command
 */
public class Client{
    public static void main(String[] args)    {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
