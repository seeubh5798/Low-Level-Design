package Main.Java.Org.Shubham.BehaviourPatterns.MememtoPattern;

import java.util.Stack;

public class CareTaker {

    private Stack<Memento> history = new Stack<>();

    public void save(TextEditor editor){
        history.push(editor.save());
    }

    public void undo( TextEditor editor){
        if(!history.isEmpty()){
            history.pop();
            if(history.size() >0){
                editor.restore(history.peek());
            }
            else{
//                System.out.println("allready in base state, nothing to undo");
                editor.restore(new Memento("base"));
            }

        }
        else{
            System.out.println("allready in base state, nothing to undo");
        }
    }
}
