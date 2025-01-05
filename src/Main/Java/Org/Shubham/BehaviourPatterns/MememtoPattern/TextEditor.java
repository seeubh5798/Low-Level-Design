package Main.Java.Org.Shubham.BehaviourPatterns.MememtoPattern;

public class TextEditor {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public Memento save(){
        return new Memento(this.content);
    }

    public void restore(Memento memento){
        this.content = memento.getContenttoMemento();
    }

}
