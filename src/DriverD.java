package Driver;

import Transport.Bus;

public class DriverD extends Driver <Bus> {

    public DriverD (String fullName, int drivingExperience, Bus car) {
        super (fullName, "D", drivingExperience, car);
    }
}