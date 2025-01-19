package Main.Java.Org.Shubham.CreationalPattern.AbstractFactoryPattern;

public class WindowsFactory implements  FactoryInterface{

    /**
     * @return
     */
    @Override
    public ButtonInterface createbtn() {
        return new WindownBtn();
    }

    /**
     * @return
     */
    @Override
    public ScrollInterface createscroll() {
        return new WindowScroll();
    }
}
