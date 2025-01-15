package Main.Java.Org.Shubham.BehaviourPatterns.StatePattern_MediaPlayer;

// The State interface defines the methods for different states of the Media Player.

public interface State {
    void pressPlay();
    void pressStop();
    void pressPause();
    void display();
}
