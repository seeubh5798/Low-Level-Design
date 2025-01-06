package Main.Java.Org.Shubham.BehaviourPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private float tempdata ;
    List<ObserverInterface> observers ;
    public Publisher(float data){
        this.tempdata = data;
        this.observers = new ArrayList<>();
    }

    public void subscribe(ObserverInterface obs){
        observers.add(obs);
    }
    public void updateTemp(float newdata){
        this.tempdata = newdata;
        notifyObs();
    }
    public void notifyObs(){
        for(ObserverInterface obs : observers){
            obs.update(this.tempdata);
        }
    }
}
