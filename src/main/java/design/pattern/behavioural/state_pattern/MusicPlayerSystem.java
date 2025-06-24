package design.pattern.behavioural.state_pattern;

public class MusicPlayerSystem {
    public static void main(String[] args) {
        MusicPlayerContext player = new MusicPlayerContext();

        player.pressPlay();  // Starting the song from the beginning.
        player.pressPause(); // Pausing the song.
        player.pressPlay();  // Resuming the song.
        player.pressStop();  // Stopping the song.
        player.pressPlay();  // Starting the song from the beginning.
    }
}
