package command.valid.homeautomation;

/**
 * Receiver
 * Source: https://dzone.com/articles/design-patterns-command
 */
public class Light{
    private boolean on;
    public void switchOn(){
        on = true;
    }
    public void switchOff(){
        on = false;
    }
}
