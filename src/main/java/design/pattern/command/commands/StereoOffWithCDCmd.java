package design.pattern.command.commands;

import design_patterns.command.Reciever.Stereo;

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
