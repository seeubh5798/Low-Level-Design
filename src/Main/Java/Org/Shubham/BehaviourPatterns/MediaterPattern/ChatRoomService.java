package Main.Java.Org.Shubham.BehaviourPatterns.MediaterPattern;


import java.util.ArrayList;
import java.util.List;

public class ChatRoomService implements MediaterInterface{
        String name ;
        List<User> users ;

    ChatRoomService(String name){
        this.users = new ArrayList<>();
        this.name = name;
    }

    void addUser2Chatroom(User user){
        this.users.add(user);
        System.out.println(user.getName()+" has been added to chatroom: "+this.name);
    }

    /**
     *
     */
    @Override
    public void sendmessage(String msg , User sender) {
        for(User user : this.users){
            if(!user.equals(sender)){
                user.receiveMessage(msg , sender);
            }
        }
    }




}


