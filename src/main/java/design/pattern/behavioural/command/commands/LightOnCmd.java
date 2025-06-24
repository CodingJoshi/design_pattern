package design.pattern.behavioural.command.commands;

import design.pattern.behavioural.command.Reciever.Light;

public class LightOnCmd implements Command {
    /// Receiver, which is decoupled from invoker (remote) using this command
    Light light;

    public LightOnCmd(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.onAction();
    }

    @Override
    public void undo() {
        light.offAction();
    }
}
