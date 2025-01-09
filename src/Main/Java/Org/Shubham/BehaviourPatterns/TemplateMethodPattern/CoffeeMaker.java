package Main.Java.Org.Shubham.BehaviourPatterns.TemplateMethodPattern;

public class CoffeeMaker extends BeverageMaker{

    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
