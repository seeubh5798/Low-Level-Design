package Main.Java.Org.Shubham.SystemDesignLLDProjects.RideSharingApp;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RideSharingappService {


//    basically matching service

    private List<Driver> driverslist = new ArrayList<>();
    private List<Passenger> passengerlist = new ArrayList<>();


//    methods to add drivers anmd passengers

    public void addDriver(Driver d){
        driverslist.add(d);
    }

    public void addPassenger(Passenger p){
        passengerlist.add(p);
    }

//    booking ride

    public void bookride(Passenger p , double distance){

//        corner case
        if(driverslist.isEmpty()){
            System.out.println("No drivers available, pls try later");
            return;
        }

//        find nearest driver otherwise
        double minDistance = Double.MAX_VALUE;
        Driver assigned = null;

        for(Driver d : driverslist){
            double currDistance = calculateDistance(p.location , d.currentlocation);
            if(currDistance < minDistance ){
                minDistance = currDistance;
                assigned = d;
            }
        }

//        fare calculation

        double fare = getfare(assigned.vehicle , minDistance);

        System.out.println("Ride booked for "+ p.name +" for Rs. "+fare+ ": driver is: " + assigned.getName()+": " +
                assigned.vehicle.number +":  "+assigned.vehicle.type.name());


    }

    private double calculateDistance(Location one , Location two){
        double dx = one.getLatitude() - two.getLatitude();
        double dy = one.getLongitude() - two.getLongitude();

        double dist = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
        return dist;
    }

    private double getfare(Vehicle v, double dist){

        if(v.type.equals(VehicleType.twoWheeler)){
            return 5 * dist;
        }
        if(v.type.equals(VehicleType.threeWheeler)){
            return 12*dist;
        }
        return 20*dist;
    }

}
