package Main.Java.Org.Shubham.CreationalPattern.BuilderPattern;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("pakkahouse" , "concrete structure")
                                .setGarage(true)
                                .setGarden(false)
                                .setPool(true)
                                .build();

        house.tostring();

    }
}
