package Main.Java.Org.Shubham.BehaviourPatterns.NotificationManagerIteratorExercise;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class EmailNotification implements NotificationCollection{
    Queue<Notification> emailq ;



    EmailNotification(){
        this.emailq = new LinkedList<>();
    }

    /**
     * @return
     */
    @Override
    public Iterator<Notification> createIterator() {
        return new QIterator();
    }

    public void addNotification(Notification notification){
        this.emailq.add(notification);
    }

    private class QIterator implements Iterator<Notification>{
        Iterator<Notification> iterator ;
        QIterator(){
            this.iterator = (Iterator<Notification>) emailq.iterator();
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
