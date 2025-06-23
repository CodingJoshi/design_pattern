package design.pattern.state_pattern;

import design.pattern.state_pattern.states.MusicPlayerState;
import design.pattern.state_pattern.states.PausedState;
import design.pattern.state_pattern.states.PlayingState;
import design.pattern.state_pattern.states.StoppedState;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicPlayerContext {
    private MusicPlayerState playingState;
    private MusicPlayerState pausedState;
    private MusicPlayerState stoppedState;
    private MusicPlayerState currentState;

    private MusicPlayerState state;

    public MusicPlayerContext() {
        playingState = new PlayingState();
        pausedState = new PausedState();
        stoppedState = new StoppedState();
        currentState = stoppedState; // Initial state
    }

    public void pressPlay() {
        currentState.pressPlay(this);
    }

    public void pressPause() {
        currentState.pressPause(this);
    }

    public void pressStop() {
        currentState.pressStop(this);
    }
}
