package Driver;

import Transport.Truck;

public class DriverC extends Driver <Truck> {

    public DriverC (String fullName, int drivingExperience, Truck car) {
        super (fullName, "C", drivingExperience, car);
    }
}