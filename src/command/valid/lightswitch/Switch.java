package command.valid.lightswitch;

import java.util.ArrayList;
import java.util.List;

/**
 * The Invoker class
 * Source: https://en.wikipedia.org/wiki/Command_pattern
 */
public class Switch {
    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(final Command cmd) {
        this.history.add(cmd); // optional
        cmd.execute();
    }
}
