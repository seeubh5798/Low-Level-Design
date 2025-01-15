package Main.Java.Org.Shubham.BehaviourPatterns.StatePattern_MediaPlayer;// The Exercise class demonstrates the State Design Pattern for a Media Player.


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        MediaPlayer mediaPlayer = new MediaPlayer();
        Scanner sc = new Scanner(System.in);

        String choice = sc.next();

        switch (choice) {
            case "Play":
                mediaPlayer.play();
                break;
            case "Pause":
                // TODO: Set the Media Player state to PausedState

                mediaPlayer.setState(new PausedState());
                mediaPlayer.pause();
                break;
            case "Stop":
                // TODO: Set the Media Player state to StoppedState
                mediaPlayer.setState(new StoppedState());

                mediaPlayer.stop();
                break;
            default:
                System.out.println("Invalid choice");
        }

        // TODO: Display the current state of the Media Player
        mediaPlayer.displayState();

//        sc.close();
    }
}