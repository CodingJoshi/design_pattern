package design.pattern.state_pattern.states;

import design.pattern.state_pattern.MusicPlayerContext;

public class StoppedState implements MusicPlayerState{

    public void pressPlay(MusicPlayerContext context) {
        System.out.println("Starting the song from the beginning.");
        context.setState(context.getPlayingState());
    }

    public void pressPause(MusicPlayerContext context) {
        System.out.println("Can't pause, the song is stopped.");
    }

    public void pressStop(MusicPlayerContext context) {
        System.out.println("Already stopped.");
    }
}