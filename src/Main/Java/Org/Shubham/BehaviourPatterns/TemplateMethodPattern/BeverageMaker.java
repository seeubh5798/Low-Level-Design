package Main.Java.Org.Shubham.BehaviourPatterns.TemplateMethodPattern;

abstract class BeverageMaker {

    void pourWater(int ml){
        System.out.println("Pouring water as step1: "+ ml +" ml water");
    }

    void boilwater(){
        System.out.println("Boiling the same water in step 2");
    }


    abstract void brew();
    abstract void addCondiments();

    void makeBeverage(){
        pourWater(100);
        boilwater();
        brew();
        addCondiments();
    }
}
