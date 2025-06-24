package design.pattern.behavioural.command.Reciever;

public class Light {
    public void onAction() {
        System.out.println("Light On");
    }

    public void offAction() {
        System.out.println("Light Off");
    }
}