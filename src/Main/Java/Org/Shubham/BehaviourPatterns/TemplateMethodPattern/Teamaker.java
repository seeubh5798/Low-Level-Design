package Main.Java.Org.Shubham.BehaviourPatterns.TemplateMethodPattern;

 class Teamaker extends BeverageMaker{

    void brew(){
        System.out.println("Adding sugar and lemon in next steps of tea");
    }
    void addCondiments(){
        System.out.println("adding lemon in last");
    }
}
