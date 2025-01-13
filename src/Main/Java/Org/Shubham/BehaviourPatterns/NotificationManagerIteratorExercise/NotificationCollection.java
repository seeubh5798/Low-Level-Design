package Main.Java.Org.Shubham.BehaviourPatterns.NotificationManagerIteratorExercise;


import java.util.Iterator;

public interface NotificationCollection {
     Iterator<Notification> createIterator();

    void addNotification(Notification notification);
}
