package Main.Java.Org.Shubham.SystemDesignLLDProjects.RideSharingApp;

public class Driver {

    String name;
    Location currentlocation;

    Vehicle vehicle;

    public Driver(String name, Location currentlocation,Vehicle vehicle) {
        this.name = name;
        this.currentlocation = currentlocation;
        this.vehicle = vehicle;
    }

    public void setCurrentlocation(Location currentlocation) {
        this.currentlocation = currentlocation;
    }

    public String getName() {
        return name;
    }

    public Location getCurrentlocation() {
        return currentlocation;
    }
}
