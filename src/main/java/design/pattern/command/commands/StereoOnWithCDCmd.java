package design.pattern.command.commands;

import design.pattern.command.Reciever.Stereo;

public class StereoOnWithCDCmd implements Command {
    Stereo stereo;

    public StereoOnWithCDCmd(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
