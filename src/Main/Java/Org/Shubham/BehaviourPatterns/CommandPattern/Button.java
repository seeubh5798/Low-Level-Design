package Main.Java.Org.Shubham.BehaviourPatterns.CommandPattern;

public class Button {

    CommandInterface command;

    Button(CommandInterface command){
        this.command = command;
    }

    public void invoke(){
        this.command.execute();
    }
}
