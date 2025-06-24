package design.pattern.behavioural.state_pattern.states;

import design.pattern.behavioural.state_pattern.MusicPlayerContext;

public class PausedState implements MusicPlayerState {

    public void pressPlay(MusicPlayerContext context) {
        System.out.println("Resuming the song.");
        context.setState(context.getPlayingState());
    }

    public void pressPause(MusicPlayerContext context) {
        System.out.println("Already paused.");
    }

    public void pressStop(MusicPlayerContext context) {
        System.out.println("Stopping the song.");
        context.setState(context.getStoppedState());
    }
}