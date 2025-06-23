package design.pattern.command.commands;

import design.pattern.command.Reciever.Light;

public class LightOffCmd implements Command {
    /// Receiver, which is decoupled from invoker (remote) using this command
    Light light;

    public LightOffCmd(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.offAction();
    }

    @Override
    public void undo() {
        light.onAction();
    }
}
