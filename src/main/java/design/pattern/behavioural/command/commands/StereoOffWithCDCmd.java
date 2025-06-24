package design.pattern.behavioural.command.commands;

import design.pattern.behavioural.command.Reciever.Stereo;

public class StereoOffWithCDCmd implements Command {
    Stereo stereo;

    public StereoOffWithCDCmd(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
