package Main.Java.Org.Shubham.BehaviourPatterns.MediaterPattern;

public class User {
    private String name;

    User( String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
    public void receiveMessage(String msg , User sender){
        System.out.println("Received message from "+sender.name + " to User: "+ this.name + " and the message received is : "+ msg);
    }

    public void sendMessage(String msg , ChatRoomService chatroom){
        System.out.println("Sending message by " +this.name + " and the message sent is : "+ msg);
        chatroom.sendmessage(msg , this);
    }
}
