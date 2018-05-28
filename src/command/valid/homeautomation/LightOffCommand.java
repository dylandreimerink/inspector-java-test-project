package command.valid.homeautomation;

/**
 * Concrete Command
 * Source: https://dzone.com/articles/design-patterns-command
 */
public class LightOffCommand implements Command{
    //reference to the light
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOff();
    }
}
