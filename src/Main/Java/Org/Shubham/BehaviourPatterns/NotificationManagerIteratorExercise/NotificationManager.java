package Main.Java.Org.Shubham.BehaviourPatterns.NotificationManagerIteratorExercise;


import javax.swing.undo.CannotUndoException;
import java.util.Iterator;

public class NotificationManager {

    private NotificationCollection smsNotification;
    private  NotificationCollection emailNotification;
    NotificationManager(){
        this.smsNotification = new SMSNotification();
        this.emailNotification = new EmailNotification();
    }
    void addSMSNotifications(String message){
        (this.smsNotification).addNotification(new Notification(message));
    }

    void addemailNotification(String message){
        (this.emailNotification).addNotification(new Notification(message));
    }

    void printAllNotification(){
        Iterator<Notification> smsItr = this.smsNotification.createIterator();
        printAll(smsItr , "SMS");
        Iterator<Notification> emailItr = this.emailNotification.createIterator();
        printAll(emailItr ,"E-Mail");
    }

    void printAll(Iterator<Notification> itr, String message){
        System.out.println("Notification type: " + message);
        while(itr.hasNext()){
            System.out.println(itr.next().getMessage());
        }
    }
}
