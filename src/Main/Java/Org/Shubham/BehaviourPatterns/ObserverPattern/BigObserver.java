package Main.Java.Org.Shubham.BehaviourPatterns.ObserverPattern;

public class BigObserver implements ObserverInterface{
    /**
     * @param data
     */
    @Override
    public void update(float data) {
        System.out.println("from big observer data is:" + data);
    }
}
