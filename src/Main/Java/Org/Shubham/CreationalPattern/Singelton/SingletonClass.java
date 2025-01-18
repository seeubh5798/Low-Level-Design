package Main.Java.Org.Shubham.CreationalPattern.Singelton;

public class SingletonClass {
    String api ="gotoGym";
    private SingletonClass(){

    }

    public static class Singleton{
        private static final SingletonClass obj = new SingletonClass();
    }

    public static SingletonClass getSingleton(){
        return Singleton.obj;
    }
}
