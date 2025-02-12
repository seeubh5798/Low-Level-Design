package Main.Java.Org.Shubham.SystemDesignLLDProjects.RideSharingApp;

public class Main {

    public static void main(String[] args) {
        Location rider = new Location(1.1, 5.2);
        Location d1 = new Location(1.1, 2.2);
        Location d2 = new Location(1, 2);
        Location d3 = new Location(3.8, 4.2);

        Driver dr1 = new Driver("driver1", d1, new Vehicle("123" , VehicleType.twoWheeler));
        Driver dr2 = new Driver("driver2", d2, new Vehicle("123" , VehicleType.Car));
        Driver dr3 = new Driver("driver3", d3, new Vehicle("123" , VehicleType.threeWheeler));
        Passenger p1 = new Passenger("passenger1" , rider);
        RideSharingappService app = new RideSharingappService();
        app.addDriver(dr1);
        app.addDriver(dr2);
        app.addDriver(dr3);

        app.bookride(p1, 4.7);



    }
}
