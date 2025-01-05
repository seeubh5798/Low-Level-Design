package Main.Java.Org.Shubham.BehaviourPatterns.MememtoPattern;

public class MementoMain {

    public static void main ( String[] args){
        System.out.println("from memento runner");

        CareTaker ct = new CareTaker();
        TextEditor editor = new TextEditor();

        editor.setContent("Hello world");
        ct.save(editor);
        editor.setContent("this is second");
        ct.save(editor);

        editor.setContent("last in stack");
        ct.save(editor);

        System.out.println(editor.getContent());

        ct.undo(editor);
        System.out.println(editor.getContent());
        ct.undo(editor);
        System.out.println(editor.getContent());

        ct.undo(editor);
        System.out.println(editor.getContent());

    }
}
