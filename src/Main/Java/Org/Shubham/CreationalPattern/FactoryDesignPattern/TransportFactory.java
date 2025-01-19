package Main.Java.Org.Shubham.CreationalPattern.FactoryDesignPattern;

public class TransportFactory {

    public static Transport createObj(String type){
        switch (type.toLowerCase()){
            case "bus":
                return new Bus();

            case "train":
                return new Train();

            case "car":
                return new Car();

            default:
                System.out.println("Invalid argument ,please pass authentic args");
        }
        return null;
    }
}
