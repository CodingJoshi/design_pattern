package design.pattern.command.Reciever;

public class Stereo {
    public void on() {
        System.out.println("Stereo On");
    }

    public void setCd() {
        System.out.println("CD inserted");
    }

    public void setVolume(int v) {
        System.out.println("Setting volume to " + v);
    }

    public void off() {
        System.out.println("Shutting off stereo");
    }
}
