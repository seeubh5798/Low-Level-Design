package Main.Java.Org.Shubham.BehaviourPatterns.StatePattern_MediaPlayer;

// The PlayingState class represents the playing state of the Media Player.


public class PlayingState implements State {

    @Override
    public void pressPlay() {
        System.out.println("Starting playback");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping playback");
    }

    @Override
    public void pressPause() {
        System.out.println("Pausing playback");
    }

    @Override
    public void display() {
        System.out.println("Current State: Playing");
    }
}