package design.pattern.behavioural.command.commands;

import design.pattern.behavioural.command.Reciever.Light;

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
