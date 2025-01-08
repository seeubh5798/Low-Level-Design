package Main.Java.Org.Shubham.BehaviourPatterns.CommandPattern;

public class ItalicsCommand implements CommandInterface{

    TextEditor editor ;
    /**
     *
     */

    ItalicsCommand(TextEditor editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
        this.editor.italics();
    }
}
