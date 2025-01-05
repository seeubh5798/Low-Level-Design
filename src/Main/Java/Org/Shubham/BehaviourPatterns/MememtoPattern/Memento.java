package Main.Java.Org.Shubham.BehaviourPatterns.MememtoPattern;

public class Memento {


    private final String toMemento;

    public Memento(String content) {
        this.toMemento = content;
    }

    public String getContenttoMemento(){
        return this.toMemento;
    }
}
