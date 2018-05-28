package command.valid.lambdacommands;

/**
 * The Command functional interface.
 * Source: https://en.wikipedia.org/wiki/Command_pattern
 */
@FunctionalInterface
public interface Command {
    public void apply();
}
