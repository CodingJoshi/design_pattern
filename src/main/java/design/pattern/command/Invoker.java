package design.pattern.command;

import design_patterns.command.commands.Command;
import design_patterns.command.commands.NoCommand;

///  Remote Control
public class Invoker {
    Command[][] commands;
    Command prevCmd;

    public Invoker(int size) {
        commands = new Command[size][2];
        Command noCommand = new NoCommand();
        for (int i = 0; i < size; i++) {
            commands[i][0] = noCommand; // off commands
            commands[i][1] = noCommand; // on commands
        }
    }

    public void setCommand(int i, Command onCommand, Command offCommand) {
        commands[i][0] = offCommand;
        commands[i][1] = onCommand;
    }

    public void onButtonPress(int i) {
        commands[i][1].execute();
        prevCmd = commands[i][1];
    }

    public void offButtonPressed(int i) {
        commands[i][0].execute();
        prevCmd = commands[i][0];
    }

    public void undo() {
        prevCmd.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control -------\n");
        for (int i = 0; i < commands.length; i++) {
            sb.append("[slot " + i + "] " + commands[i][1].getClass().getName()
                    + " " + commands[i][0].getClass().getName() + "\n");
        }
        return sb.toString();
    }


}
