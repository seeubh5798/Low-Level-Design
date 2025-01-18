package Main.Java.Org.Shubham.CreationalPattern.Singelton;

public class MainSingleton {
    public static void main(String[] args) {

        SingletonClass o1 = SingletonClass.getSingleton();
        System.out.println(o1.api);


    }
}
