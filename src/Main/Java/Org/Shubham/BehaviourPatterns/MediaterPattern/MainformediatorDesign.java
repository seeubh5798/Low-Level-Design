package Main.Java.Org.Shubham.BehaviourPatterns.MediaterPattern;

public class MainformediatorDesign {
    public static void main(String[] args) {
        ChatRoomService chatroom = new ChatRoomService("chatroom1");
        User u1 = new User("Shubham");
        chatroom.addUser2Chatroom(u1);
        User u2 = new User("Asif");
        chatroom.addUser2Chatroom(u2);
        User u3 = new User("Ashutosh");
        chatroom.addUser2Chatroom(u3);
        User u4 = new User("Pritush");
        chatroom.addUser2Chatroom(u4);
        User u5 = new User("Utkarsh");
        chatroom.addUser2Chatroom(u5);

        u1.sendMessage("Hello Guys, welcome to my class" , chatroom);

        System.out.println("--------------------------------------------");
        ChatRoomService chatroom2 = new ChatRoomService("chatroom 2");
        User shubham = new User("Shubham");
        User pm = new User("PM");
        User am = new User("AM");
        chatroom2.addUser2Chatroom(shubham);
        chatroom2.addUser2Chatroom(pm);
        chatroom2.addUser2Chatroom(am);
        shubham.sendMessage("Hey guys in chatroom 2" , chatroom2);
    }
}
