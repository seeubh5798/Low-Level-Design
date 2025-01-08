package Main.Java.Org.Shubham.BehaviourPatterns.CommandPattern;

public class CommandMain {


    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        Button boldbtn = new Button(new BoldCommand(editor));

        Button italicsbtn = new Button(new ItalicsCommand(editor));
        italicsbtn.invoke();
        boldbtn.invoke();;
    }


}
