package command.valid.lightswitch;

/**
 * The Command for turning on the light - ConcreteCommand #1
 * Source: https://en.wikipedia.org/wiki/Command_pattern
 */
public class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(final Light light) {
        this.theLight = light;
    }

    @Override    // Command
    public void execute() {
        theLight.turnOn();
    }
}
