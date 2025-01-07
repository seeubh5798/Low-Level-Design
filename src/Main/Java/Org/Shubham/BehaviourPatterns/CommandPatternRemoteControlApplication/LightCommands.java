package Main.Java.Org.Shubham.BehaviourPatterns.CommandPatternRemoteControlApplication;

public class LightCommands {

    public static LightOffCommands LightOnCommands;

    public static class LightOnCommands implements CommandI{

        Light light;

        LightOnCommands(Light light){
            this.light = light;
        }
        /**
         *
         */
        @Override
        public void execute() {
            this.light.turnOn();
        }
    }

    public static class LightOffCommands implements CommandI{

        Light light;

        LightOffCommands(Light light){
            this.light = light;
        }
        /**
         *
         */
        @Override
        public void execute() {
            this.light.turnOff();
        }
    }
}
