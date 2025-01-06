package Main.Java.Org.Shubham.BehaviourPatterns.ObserverPattern;

public class ObserverMain {

    public static void main(String[] args) {
        ObserverInterface mobileObserver = new MobileObserver();
        ObserverInterface bigobserver = new BigObserver();

        Publisher pubs = new Publisher(100);
        pubs.subscribe(mobileObserver);
        pubs.subscribe(bigobserver);
//    publisher.updateTemp(200);

        pubs.updateTemp(200);

        pubs.updateTemp(2000);
    }



}
