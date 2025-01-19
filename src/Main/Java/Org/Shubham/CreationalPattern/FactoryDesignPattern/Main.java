package Main.Java.Org.Shubham.CreationalPattern.FactoryDesignPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//            TransportFactory fac = new TransportFactory();
        Scanner sc = new Scanner(System.in);
        Transport obj = TransportFactory.createObj(sc.nextLine());
        obj.deliver();
    }
}
