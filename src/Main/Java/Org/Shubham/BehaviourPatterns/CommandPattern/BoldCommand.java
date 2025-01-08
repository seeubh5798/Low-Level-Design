package Main.Java.Org.Shubham.BehaviourPatterns.CommandPattern;

public class BoldCommand implements CommandInterface{

    TextEditor editor ;
    /**
     *
     */

    BoldCommand(TextEditor editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
        this.editor.bold();
    }
}
