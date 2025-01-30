package Main.Java.Org.Shubham.StructuralPatterns.FacadePattern;

public class Main {
    public static void main(String[] args) {

        APIGateway gateway = new APIGateway();
        gateway.getAlldetails("Order-1", "User-1");



    }
}
