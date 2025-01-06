package Main.Java.Org.Shubham.BehaviourPatterns.ObserverPattern;

public class MobileObserver implements ObserverInterface{
    /**
     * @param data
     */
    @Override
    public void update(float data) {
        System.out.println("from mobile observer data is:" + data);
    }
}
