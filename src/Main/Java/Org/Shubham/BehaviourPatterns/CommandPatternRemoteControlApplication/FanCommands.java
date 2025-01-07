package Main.Java.Org.Shubham.BehaviourPatterns.CommandPatternRemoteControlApplication;

public class FanCommands {

    public static class FanOnCommands implements CommandI{

        Fan fan;

        FanOnCommands(Fan fan){
            this.fan = fan;
        }
        /**
         *
         */
        @Override
        public void execute() {
            this.fan.turnOn();
        }
    }

    public static class FanOffCommands implements CommandI{

        Fan fan;

        FanOffCommands(Fan fan){
            this.fan = fan;
        }
        /**
         *
         */
        @Override
        public void execute() {
            this.fan.turnOff();
        }
    }
}
