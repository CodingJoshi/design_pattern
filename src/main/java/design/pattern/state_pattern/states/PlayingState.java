package design.pattern.state_pattern.states;

import design.pattern.state_pattern.MusicPlayerContext;

public class PlayingState implements MusicPlayerState{

    public void pressPlay(MusicPlayerContext context) {
        System.out.println("Already playing the song.");
    }
    public void pressPause(MusicPlayerContext context) {
        System.out.println("Pausing the song.");
        context.setState(context.getPausedState());
    }

    public void pressStop(MusicPlayerContext context) {
        System.out.println("Stopping the song.");
        context.setState(context.getStoppedState());
    }
}