package Main.Java.Org.Shubham.CreationalPattern.AbstractFactoryPattern;

public class Application {
    ButtonInterface btn;
    ScrollInterface scrl;

    Application(FactoryInterface factory){
        btn = factory.createbtn();
        scrl = factory.createscroll();
    }

    void render(){
        btn.render();
        scrl.scroll();
    }

    public static void main(String[] args) {

        Application app = new Application(new WindowsFactory());
        app.render();
    }
}
