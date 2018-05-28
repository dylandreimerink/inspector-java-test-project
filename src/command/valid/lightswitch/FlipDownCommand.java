package command.valid.lightswitch;

/**
 * The Command for turning off the light - ConcreteCommand #2
 * Source: https://en.wikipedia.org/wiki/Command_pattern
 */
public class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(final Light light) {
        this.theLight = light;
    }

    @Override    // Command
    public void execute() {
        theLight.turnOff();
    }
}
