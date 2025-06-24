package design.pattern.behavioural.state_pattern.states;

import design.pattern.behavioural.state_pattern.MusicPlayerContext;

//State
public interface MusicPlayerState {
    // State has actions
    void pressPlay(MusicPlayerContext context);

    void pressPause(MusicPlayerContext context);

    void pressStop(MusicPlayerContext context);
}
