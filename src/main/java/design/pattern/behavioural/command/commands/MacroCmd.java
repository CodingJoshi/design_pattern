package design.pattern.behavioural.command.commands;

public class MacroCmd implements Command {
    Command[] commands;

    public MacroCmd(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands)
            command.execute();
    }

    @Override
    public void undo() {
        for (Command command : commands)
            command.undo();
    }
}
