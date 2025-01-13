package Main.Java.Org.Shubham.BehaviourPatterns.NotificationManagerIteratorExercise;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SMSNotification implements NotificationCollection{

    List<Notification> smsList ;
    SMSNotification(){
        this.smsList = new ArrayList<>();
    }

    /**
     * @return
     */
    @Override
    public Iterator<Notification> createIterator() {
        return new SMSIterator();
    }
    public void addNotification(Notification notification){
        this.smsList.add(notification);
    }

    private class SMSIterator implements Iterator<Notification> {
        Iterator<Notification> iterator ;
        SMSIterator(){
            this.iterator = (Iterator<Notification>) smsList.iterator();
        }

        /**
         * @return
         */
        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        /**
         * @return
         */
        @Override
        public Notification next() {
            return iterator.next();
        }
    }

}
