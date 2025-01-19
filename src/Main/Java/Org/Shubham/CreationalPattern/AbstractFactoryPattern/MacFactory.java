package Main.Java.Org.Shubham.CreationalPattern.AbstractFactoryPattern;

public class MacFactory implements FactoryInterface{

    /**
     * @return
     */
    @Override
    public ButtonInterface createbtn() {
        return new MacButton();
    }

    /**
     * @return
     */
    @Override
    public ScrollInterface createscroll() {
        return new MacScroll();
    }
}
