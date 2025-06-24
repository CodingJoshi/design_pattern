package design.pattern.behavioural.command;

import design.pattern.behavioural.command.Reciever.Light;
import design.pattern.behavioural.command.Reciever.Stereo;
import design.pattern.behavioural.command.commands.*;
import design.pattern.command.commands.*;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(3);

        LightOnCmd lightOnCmd = new LightOnCmd(new Light());
        LightOffCmd lightOffCmd = new LightOffCmd(new Light());

        StereoOnWithCDCmd stereoOnWithCDCmd = new StereoOnWithCDCmd(new Stereo());
        StereoOffWithCDCmd stereoOffWithCDCmd = new StereoOffWithCDCmd(new Stereo());

        MacroCmd macroOnCmd = new MacroCmd(new Command[]{lightOnCmd, stereoOnWithCDCmd});
        MacroCmd macroOffCmd = new MacroCmd(new Command[]{lightOffCmd, stereoOffWithCDCmd});

        invoker.setCommand(0, lightOnCmd, lightOffCmd);
        invoker.setCommand(1, stereoOnWithCDCmd, stereoOffWithCDCmd);
        invoker.setCommand(2, macroOnCmd, macroOffCmd);


        invoker.onButtonPress(1);
        invoker.onButtonPress(0);
        invoker.onButtonPress(2);
        invoker.offButtonPressed(0);
        invoker.undo();

    }
}
