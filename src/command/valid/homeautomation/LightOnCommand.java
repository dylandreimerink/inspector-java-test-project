package command.valid.homeautomation;

/**
 * Concrete Command
 * Source: https://dzone.com/articles/design-patterns-command
 */
public class LightOnCommand implements Command{
    //reference to the light
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOn();
    }
}
