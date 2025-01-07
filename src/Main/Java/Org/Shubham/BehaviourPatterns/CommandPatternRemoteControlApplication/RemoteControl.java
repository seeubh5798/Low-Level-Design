package Main.Java.Org.Shubham.BehaviourPatterns.CommandPatternRemoteControlApplication;

public class RemoteControl {

    CommandI fanoff;
    CommandI fanon;
    CommandI lightoff;
    CommandI lighton;

    void setfanOn(CommandI fanOn){
        this.fanon = fanOn;
    }

    void setfanOff(CommandI fanOff){
        this.fanoff = fanOff;
    }

    void setlightOn(CommandI lighton){
        this.lighton = lighton;
    }

    void setLightoff(CommandI lightoff){
        this.lightoff = lightoff;
    }

    void turnonfan(){
        this.fanon.execute();
    }

    void turnofffan(){
        this.fanoff.execute();
    }

    void turnonlight(){
        this.lighton.execute();
    }

    void turnofflight(){
        this.lightoff.execute();
    }

}
