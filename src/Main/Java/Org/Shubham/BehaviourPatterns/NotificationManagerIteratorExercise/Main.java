package Main.Java.Org.Shubham.BehaviourPatterns.NotificationManagerIteratorExercise;

public class Main {
    public static void main(String[] args) {
        NotificationManager nm = new NotificationManager();
//        NotificationCollection sms = new SMSNotification();
//        NotificationCollection email = new EmailNotification();

        nm.addemailNotification("Email -1");
        nm.addemailNotification("Email-2");
        nm.addSMSNotifications("SMS-1");
        nm.addSMSNotifications("SMS-2");
        nm.addemailNotification("email-3 last");
        nm.printAllNotification();

    }
}
