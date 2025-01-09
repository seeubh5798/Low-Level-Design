package Main.Java.Org.Shubham.BehaviourPatterns.TemplateMethodPattern;

public class MainClass {
    public static void main(String[] args) {

        BeverageMaker tea = new Teamaker() ;

        tea.makeBeverage();

        BeverageMaker coffee = new CoffeeMaker();
        coffee.makeBeverage();
    }
}
