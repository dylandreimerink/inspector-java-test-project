package command.valid.homeautomation;

/**
 * Invoker
 * Source: https://dzone.com/articles/design-patterns-command
 */
public class RemoteControl{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
