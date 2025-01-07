package Main.Java.Org.Shubham.BehaviourPatterns.CommandPatternRemoteControlApplication;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        CommandI lightOnCommand = new LightCommands.LightOnCommands(light);
        CommandI lightOffCommand = new LightCommands.LightOffCommands(light);


        CommandI fanOnCommand = new FanCommands.FanOnCommands(fan);
        CommandI fanOffCommand = new FanCommands.FanOffCommands(fan);

        RemoteControl rc = new RemoteControl();
        rc.setfanOff(fanOffCommand);
        rc.setfanOn(fanOnCommand);
        rc.setLightoff(lightOffCommand);
        rc.setlightOn(lightOnCommand);

        rc.turnofffan();
        rc.turnonlight();


    }
}
